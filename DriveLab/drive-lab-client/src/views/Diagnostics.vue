<template>
    <div id="content">
        <b-row>
            <b-col id="content-left">
                <div>
                    <h3>Fault Diagnostics</h3>

                    <b-form @submit="sendDiagnosticsRequest">
                        <b-form-group label="Vehicle">
                            <multiselect v-model="diagnosticsRequest.vehicle"
																					placeholder="Select vehicle"
																					:custom-label="selectVehicleLabel"
																					track-by="id"
																					:options="vehicles"
																					:multiple="false">
                            </multiselect>
                        </b-form-group>
                        <b-form-group label="Symptoms">
                            <multiselect v-model="diagnosticsRequest.symptoms"
                                         placeholder="Select symptoms"
                                         label="name"
                                         track-by="id"
                                         :options="commonSymptoms"
                                         :multiple="true">
                            </multiselect>
                        </b-form-group>
                        <b-form-group>
                            <b-row>
                                <b-col>
                                    <b-btn :disabled="!diagnosticsRequest.vehicle"
																						type="submit"
																						variant="primary"
																						:block="true">Submit</b-btn>
                                </b-col>
                                <b-col>
                                    <b-btn @click="resetDiagnosticsForm"
																						variant="secondary"
																						:block="true">Reset</b-btn>
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

import DataService from "../services/DataService.js";
import DiagnosticsService from "../services/DiagnosticsService.js"

const VEHICLES_URL = "/api/vehicles"
const COMMON_SYMPTOMS_URL = "/api/symptoms"			// TODO: Change path

export default {
	data() {
		return {
			vehicles: [],
			commonSymptoms: [],

			diagnosticsRequest: {
        vehicle: null,
        symptoms: []
      }
		}
	},
	created() {

		DataService.findAll(VEHICLES_URL, result => {
			this.vehicles = result.data;
		}, error => {
			this.$swal.fire("Error", error.data.message, 'error');
		});

		DataService.findAll(COMMON_SYMPTOMS_URL, result => {
			this.commonSymptoms = result.data;
		}, error => {
			this.$swal.fire("Error", error.data.message, 'error');
		});

	},
	methods: {
		sendDiagnosticsRequest(e) {

      e.preventDefault();
      DiagnosticsService.sendDiagnosticsRequest(this.diagnosticsRequest, result => {
          const data = result.data;
          this.$swal.fire("Fault found",`${data.fault.name} (${data.probability * 100}%)`, 'success');
        }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
        }
      );
    },
    resetDiagnosticsForm() {
      this.diagnosticsRequest.vehicle = null;
      this.diagnosticsRequest.symptoms = [];
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
