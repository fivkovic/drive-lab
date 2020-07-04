<template>
    <div id="content" class="vld-parent">
      <loading :active.sync="isLoading"
               :can-cancel="false"
               :is-full-page="true"
               :loader="'bars'"
               :height="128"
               :width="128"
               :color="'#00BADB'"
               :background-color="'#FFFFFF'">
      </loading>
        <b-row>
            <b-col id="content-left">
                <div>
                    <h3><b>Fault Diagnostics</b></h3>
                    <div v-if="isSelectVehicleDisabled">
                      <em>For Vehicle {{ this.selectVehicleLabel(this.diagnosticsRequest.vehicle) }}</em>
                      <br/>
                      <br/>
                    </div>
                    <b-form @submit="sendDiagnosticsRequest">

                        <b-form-group label="Vehicle">
                            <multiselect v-model="diagnosticsRequest.vehicle"
																					placeholder="Select vehicle"
																					:custom-label="selectVehicleLabel"
																					track-by="id"
																					:options="vehicles"
																					:multiple="false"
                                          :disabled="isSelectVehicleDisabled">
                            </multiselect>
                        </b-form-group>
                        
                        <b-form-group label="Problems">
                            <multiselect v-model="diagnosticsRequest.problems"
                                         placeholder="Select problems"
                                         label="name"
                                         track-by="id"
                                         :options="commonProblems"
                                         :multiple="true"
                                         :close-on-select="false">
                            </multiselect>
                        </b-form-group>

                        <b-form-group label="Current Vehicle Mileage">
                          <b-row>
                            <b-col>
                              <b-input-group append="km" class="mt-1">
                                <b-form-input type="number"
                                              v-model="diagnosticsRequest.currentVehicleMileage"
                                              required
                                              placeholder="Enter current vehicle mileage">
                                </b-form-input>
                              </b-input-group>
                            </b-col>
                            <b-col>
                              <div class="mt-2"></div>
                            </b-col>
                          </b-row>
                        </b-form-group>

                        <b-form-group label="Engine Oil Level">
                          <b-row>
                            <b-col>
                              <b-input-group prepend="0 %" append="100 %" class="mt-1">
                                <b-form-input type="range"
                                              min="0"
                                              max="100"
                                              v-model="diagnosticsRequest.engineOilLevelPercentage">
                                </b-form-input>
                              </b-input-group>
                            </b-col>
                            <b-col>
                              <div class="mt-2">Engine Oil Level: {{ diagnosticsRequest.engineOilLevelPercentage }} %</div>
                            </b-col>
                          </b-row>
                        </b-form-group>

                        <b-form-group>
                            <b-row>
                                <b-col>
                                    <b-btn :disabled="!diagnosticsRequest.vehicle || !diagnosticsRequest.currentVehicleMileage"
																						type="submit"
																						variant="info"
																						:block="true">Submit
                                    </b-btn>
                                </b-col>
                                <b-col>
                                    <b-btn @click="resetDiagnosticsForm"
																						variant="danger"
																						:block="true">Reset
                                    </b-btn>
                                </b-col>
                            </b-row>
                        </b-form-group>

                    </b-form>
                </div>
            </b-col>
        </b-row>
    </div>
</template>

<script>

import DataService from "../../services/DataService.js";
import DiagnosticsService from "../../services/DiagnosticsService.js"

const VEHICLES_URL = "/api/vehicles"
const PROBLEMS_URL = "/api/problems"

export default {
	data() {
		return {
			vehicles: [],
			commonProblems: [],

			diagnosticsRequest: {
        vehicle: null,
        problems: [],
        currentVehicleMileage: null,
        engineOilLevelPercentage: 80.0
      },
      sourceVehicleId: null,
      isSelectVehicleDisabled: false,
      isLoading: false
		}
	},
	created() {
    this.sourceVehicleId = this.$route.params["vehicleId"];
    this.isLoading = true;

		DataService.findAll(VEHICLES_URL, result => {
      this.vehicles = result.data;

      if(this.sourceVehicleId != null) {
        const resultVehicle = this.vehicles.filter(v => v.id == this.sourceVehicleId)[0];
        if (resultVehicle) { 
          this.diagnosticsRequest.vehicle = resultVehicle;
          this.isSelectVehicleDisabled = true;
        } else {
          this.diagnosticsRequest.vehicle = null;
          this.isSelectVehicleDisabled = false;
        }
      }
		}, error => {
			this.$swal.fire("Error", error.data.message, 'error');
    });
    
		DataService.findAll(PROBLEMS_URL, result => {
      this.commonProblems = result.data;
      this.isLoading = false;
		}, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });
	},
	methods: {
		sendDiagnosticsRequest(e) {
      e.preventDefault();
      this.isLoading = true;
      
      DiagnosticsService.sendDiagnosticsRequest(this.diagnosticsRequest, result => {
          const data = result.data;
          this.isLoading = false;
          this.$swal.fire("Fault found",`${data.fault.name} (${data.probability * 100}%) <br><br> <em>${data.fault.description}</em>`, 'success');
        }, error => {
          this.$swal.fire("Unable to find related fault", error.data.message, 'info');
          this.isLoading = false;
        }
      );
    },
    resetDiagnosticsForm() {
      this.diagnosticsRequest.vehicle = null;
      this.diagnosticsRequest.problems = [];
      this.diagnosticsRequest.engineOilLevelPercentage = 80.0;
		},
		selectVehicleLabel(vehicle) {
      return `${vehicle.manufacturer.name} ${vehicle.model} ${vehicle.year} (${vehicle.licensePlate})`;
    },
	}
}

</script>

<style scoped>
  #content {
    padding-left: 10%;
    padding-right: 10%;
  }
  #content-left {
    padding-right: 5%;
  }
  #content-right {
    padding-left: 5%;
  }
</style>
