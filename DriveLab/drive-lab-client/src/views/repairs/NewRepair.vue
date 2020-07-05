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
          <h3><b>New Repair</b></h3>
              <div v-if="isSelectVehicleDisabled">
                <em>For Vehicle {{ this.selectVehicleLabel(this.vehicle) }}</em>
                <br/>
                <br/>
              </div>
              <b-form @submit="sendRepairRequest">

                  <b-form-group label="Vehicle">
                      <multiselect v-model="vehicle"
                                    placeholder="Select vehicle"
                                    :custom-label="selectVehicleLabel"
                                    track-by="id"
                                    :options="vehicles"
                                    :multiple="false"
                                    :disabled="isSelectVehicleDisabled">
                      </multiselect>
                  </b-form-group>

                  <b-form-group label="Fault">
                      <multiselect v-model="fault"
                                    placeholder="Select Fault"
                                    label="name"
                                    track-by="id"
                                    :options="faults"
                                    :multiple="false">
                      </multiselect>
                  </b-form-group>

                  <b-form-group label="Current Vehicle Mileage">
                    <b-row>
                      <b-col>
                        <b-input-group append="km" class="mt-1">
                          <b-form-input type="number"
                                        v-model="repairRequest.currentVehicleMileage"
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

                  <b-form-checkbox
                      v-model="repairRequest.wasEngineOilLevelLow"
                      name="checkbox-1">
                    Was the Engine Oil Level Low?
                  </b-form-checkbox>

                  <b-form-checkbox
                      v-model="repairRequest.hasAftermarketPartsFitted"
                      name="checkbox-2">
                    Has Aftermarket Parts Fitted?
                  </b-form-checkbox>

                  <b-form-group label="Problems">
                    <multiselect v-model="repairRequest.usedParts"
                                  placeholder="Select usedParts"
                                  label="name"
                                  track-by="id"
                                  :options="carParts"
                                  :multiple="true"
                                  :close-on-select="false">
                    </multiselect>
                </b-form-group>

                  <b-form-group>
                      <b-row>
                          <b-col>
                              <b-btn :disabled="!vehicle || !fault || !repairRequest.currentVehicleMileage"
                                      type="submit"
                                      variant="info"
                                      :block="true">Submit
                              </b-btn>
                          </b-col>
                          <b-col>
                              <b-btn @click="resetRepairForm"
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

const VEHICLES_URL = "/api/vehicles"
const FAULTS_URL = "/api/faults"
const REPAIRS_URL = "/api/repairs"
const CAR_PARTS_URL = "/api/car-parts"

export default {
  data() {
		return {
			vehicles: [],
      faults: [],
      carParts: [],

      vehicle: null,
      fault: null,

			repairRequest: {
        vehicleId: null,
        faultId: null,
        currentVehicleMileage: null,
        wasEngineOilLevelLow: false,
        hasAftermarketPartsFitted: false,
        usedParts: [],
        repairShopId: 2                     // TODO: Un-Mock
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
          this.repairRequest.vehicle = resultVehicle;
          this.isSelectVehicleDisabled = true;
        } else {
          this.repairRequest.vehicle = null;
          this.isSelectVehicleDisabled = false;
        }
      }
		}, error => {
			this.$swal.fire("Error", error.data.message, 'error');
    });

    DataService.findAll(FAULTS_URL, result => {
      this.faults = result.data;
      this.isLoading = false;
    }, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });

    DataService.findAll(CAR_PARTS_URL, result => {
      this.carParts = result.data;
      this.isLoading = false;
    }, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });
  },
	methods: {
		sendRepairRequest(e) {
      e.preventDefault();
      this.isLoading = true;

      // TODO: Fill before send
      this.repairRequest.vehicleId = this.vehicle.id;
      this.repairRequest.faultId = this.fault.id;
      
      DataService.create(REPAIRS_URL + "/new", this.repairRequest, result => {
          const data = result.data;
          this.isLoading = false;
          this.$swal.fire("Repair created",`Successfully created repair`, 'success');
        }, error => {
          this.$swal.fire("Unable to create repair", error.data.message, 'warning');
          this.isLoading = false;
        }
      );
    },
    resetRepairForm() {
      this.diagnosticsRequest.vehicle = null;
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
</style>
