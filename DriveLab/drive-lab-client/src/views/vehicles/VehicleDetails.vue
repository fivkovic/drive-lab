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
      <b-col>
        <h1><b>Vehicle Details</b></h1>
      </b-col>
      <b-col cols="2">
        <b-btn variant="info" @click="goToDiagnostics">
            <b-icon icon="clipboard-data" class="ml-2 mr-2"></b-icon>Run Diagnostics
        </b-btn>
      </b-col>
    </b-row>
    
    <br/>
    <b-form @submit="updateVehicleDetails">
      <b-form-group>
        <b-input-group prepend="Manufacturer and model" class="mb-2">
            <b-form-select v-model="vehicle.manufacturer" required placeholder="Select manufacturer" :options="manufacturers" disabled></b-form-select>
            <b-form-input type="text" aria-label="Model" v-model="vehicle.model" required placeholder="Enter model name" disabled></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Year" class="mb-2">
            <b-form-input type="number" v-model="vehicle.year" required placeholder="Enter year" disabled></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Engine" class="mb-2">
            <b-form-select v-model="vehicle.engineType" required placeholder="Select engine type" :options="engineTypeOptions" disabled></b-form-select>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Mileage (km)" class="mb-2">
            <b-form-input type="number" v-model="vehicle.mileage" required placeholder="Enter mileage"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="License Plate" class="mb-2">
            <b-form-input type="text" aria-label="License Plate" v-model="vehicle.licensePlate" required placeholder="Enter License Plate number"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Traffic License Number" class="mb-2">
            <b-form-input type="text" aria-label="Traffic License Number" v-model="vehicle.trafficLicenseNumber" required placeholder="Enter Traffic License number"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-row>
          <b-col class="mr-5">
            <b-btn @click="showDeleteConfirmationDialog" variant="danger" :block="true">Delete Vehicle</b-btn>
          </b-col>
          <b-col>
            <b-btn type="submit" variant="info" :disabled="!vehicle.manufacturer || !vehicle.model || !vehicle.year || 
              !vehicle.mileage || !vehicle.engineType || !vehicle.licensePlate || !vehicle.trafficLicenseNumber" :block="true">
              Update Vehicle Info
            </b-btn>
          </b-col>
        </b-row>
      </b-form-group>
       
    </b-form>
    <br/>
    <h3><b>Service Book</b></h3>
    <em>Repairs are shown from newest to oldest.</em>
    <br/>
    <br/>

    <b-form-group horizontal>
      <b-input-group>
        <b-form-input v-model="searchFilter" placeholder="Type to search..." autofocus/>
        <b-input-group-append>
            <b-btn :disabled="!searchFilter" @click="searchFilter = ''">Reset</b-btn>
        </b-input-group-append>
      </b-input-group>
    </b-form-group>

    <b-table striped hover fixed :items="vehicle.repairs" :fields="fields" :filter="searchFilter" @filtered="onSearch" @row-clicked="showRepairDetails" :current-page="currentPage" :per-page="pageSize"></b-table>
    <b-btn variant="info" class="mb-2" :block="true" @click="addNewRepair">Add New Repair</b-btn>
    <b-pagination pills :total-rows="vehicle.repairs.length" :per-page="pageSize" v-model="currentPage" class="mb-6 mt-4" align="center" />

    <b-modal ref="deleteConfirmationDialog" centered title="Delete vehicle" @ok="deleteVehicle">
      <div class="d-block text-center">
        Are you sure you want to remove the vehicle from your system?
      </div>
    </b-modal>

  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const VEHICLES_URL = "/api/vehicles"
const VEHICLE_MANUFACTURERS_URL = "/api/vehicle-manufacturers"

export default {
    data() {
        return {
            vehicle: {
                manufacturer: "",
                model: "",
                year: "",
                mileage: "",
                engineType: "",
                licensePlate: "",
                trafficLicenseNumber: "",
                repairs: []
            },

            manufacturers: [],
            engineTypeOptions: [
              { value: "DIESEL", text: 'Diesel' },
              { value: "GASOLINE", text: 'Gasoline' },
              { value: "GAS", text: 'Gas' },
              { value: "HYBRID", text: 'Hybrid' },
              { value: "ELECTRIC", text: 'Electric' }
            ],

            searchFilter: null,
            currentPage: 1,
            pageSize: 5,
            fields: [
              {
                key: "performedOn",
                label: "Performed On",
                sortable: true,
                formatter: value => {
                  return new Date(value).toISOString().substring(0, 10);
                }
              },
              {
                key: "fault.name",
                label: "Fault"
              },
              {
                key: "hasAftermarketPartsFitted",
                label: "Aftermarket Parts",
                formatter: value => {
                  return value ? "Yes" : "No";
                }
              },
              {
                key: "wasEngineOilLevelLow",
                label: "Was Engine Oil Level Low",
                formatter: value => {
                  return value ? "Yes" : "No";
                }
              },
              {
                key: "totalPrice",
                label: "Total Price",
                formatter: value => {
                  return `${value} $`;
                }
              }, 
              {
                key: "performedAt",
                label: "DriveLab Location"
              },         
            ],
            isLoading: false
        }
    },
    created() {
      this.id = this.$route.params["id"];
      this.isLoading = true;

      DataService.findAll(VEHICLE_MANUFACTURERS_URL, result => {
        this.manufacturers = result.data.map(m => ({ value : m, text : m.name}) );
      }, error => {
        this.$swal.fire("Error", error.data.message, 'error');
      });

      DataService.findById(VEHICLES_URL, this.id, result => {
          this.vehicle = result.data;
          this.vehicle.repairs.sort((r1, r2) => r2.performedOn.localeCompare(r1.performedOn));
          this.isLoading = false;
      }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
          this.isLoading = false;
      });
    },
    methods: {
      updateVehicleDetails(e) {
        e.preventDefault();

        DataService.update(VEHICLES_URL, this.id, this.vehicle, result => {
          const data = result.data;
          this.$swal.fire("Success",`Vehicle updated successfully.`, 'success');
          this.$router.push(`/customer-details/${this.customer.id}`)
        }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
        });
      },
      showDeleteConfirmationDialog() {
          this.$refs.deleteConfirmationDialog.show();
      },
      deleteVehicle() {
        DataService.delete(VEHICLES_URL, this.id, result => {
          const data = result.data;
          this.$swal.fire("Success",`Vehicle deleted successfully.`, 'success');

          // this.$router.push("/search-customers");

        }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
        });
      },
      onSearch(filteredItems) {
        if (filteredItems != undefined) {
          this.totalRows = filteredItems.length;
          this.currentPage = 1;
        }
      },
      addNewRepair() {
        this.$router.push(`/new-repair/${this.vehicle.id}`);
      },
      showRepairDetails(row, index) {
        if (index > -1) {
          this.$router.push(`/repair-details/${row.id}`);
        }
      },
      goToDiagnostics(e) {
        e.preventDefault();

        this.$router.push(`/car-diagnostics/${this.vehicle.id}`);
      }        
    }
}
</script>

<style scoped>
  #content {
    padding-left: 20%;
    padding-right: 20%;
  }
</style>