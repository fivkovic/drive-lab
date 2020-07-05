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
                    <h3><b>Service Book</b></h3>
                    <b-row>
                      <b-col>
                        <b-form-group label="Vehicle">
                          <multiselect v-model="selectedVehicle"
                                        placeholder="Select vehicle"
                                        :custom-label="selectVehicleLabel"
                                        @input="sendServiceBookRequest"
                                        track-by="id"
                                        :options="vehicles"
                                        :multiple="false">
                          </multiselect>
                        </b-form-group>
                      </b-col>
                      <b-col>
                      </b-col>
                    </b-row>
                    <b-row>
                      <b-col>
                        <b-form-group horizontal>
                          <b-input-group>
                            <b-form-input v-model="searchFilter" placeholder="Type to search..." autofocus/>
                            <b-input-group-append>
                              <b-btn :disabled="!searchFilter" @click="searchFilter = ''">Reset</b-btn>
                            </b-input-group-append>
                          </b-input-group>
                        </b-form-group>
                      </b-col>
                      <b-col>
                      </b-col>
                    </b-row>
                    <em>Repairs are shown from newest to oldest.</em>
                    <b-table striped hover fixed :items="repairs" :fields="fields" :filter="searchFilter" @filtered="onSearch" @row-clicked="showRepairDetails" :current-page="currentPage" :per-page="pageSize"></b-table>
                    <b-btn variant="info" class="mb-2" :block="true" @click="addNewRepair">Add New Repair</b-btn>
                    <b-pagination pills :total-rows="repairs.length" :per-page="pageSize" v-model="currentPage" class="mb-6 mt-4" align="center" />                    
                </div>
            </b-col>
        </b-row>
    </div>
</template>
    
<script>

import DataService from "../../services/DataService.js";

const VEHICLES_URL = "/api/vehicles"

export default {
	data() {
		return {
      selectedVehicle: null,

      vehicles: [],
      repairsOfAllVehicles: [],
      repairs: [],
      
      searchFilter: null,
      currentPage: 1,
      pageSize: 10,
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
    this.isLoading = true;

		DataService.findAll(VEHICLES_URL, result => {
      this.vehicles = result.data;

      for(const vehicle of this.vehicles) {
        for(const repair of vehicle.repairs) {
          this.repairsOfAllVehicles.push(repair);
        }
      }
      this.repairsOfAllVehicles.sort((r1, r2) => r2.performedOn.localeCompare(r1.performedOn));
      this.repairs = this.repairsOfAllVehicles;

      this.isLoading = false;
		}, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });
  },
  methods: {
		sendServiceBookRequest(e) {
      this.isLoading = true;

      if (this.selectedVehicle) {
        DataService.findById(VEHICLES_URL, this.selectedVehicle.id, result => {
            this.repairs = result.data.repairs;
            this.repairs.sort((r1, r2) => r2.performedOn.localeCompare(r1.performedOn));
            this.isLoading = false;
        }, error => {
            this.$swal.fire("Error", error.data.message, 'error');
            this.isLoading = false;
        });
      } else {
        this.repairs = [...this.repairsOfAllVehicles];
        this.isLoading = false;
      }
    },
    resetServiceBookForm() {
      this.selectedVehicle = null;
      this.repairs = [];
		},
		selectVehicleLabel(vehicle) {
      return `${vehicle.manufacturer.name} ${vehicle.model} ${vehicle.year} (${vehicle.licensePlate})`;
    },
    onSearch(filteredItems) {
      if (filteredItems != undefined) {
        this.totalRows = filteredItems.length;
        this.currentPage = 1;
      }
    },
    addNewRepair() {
      this.$router.push(`/new-repair/${this.selectedVehicle.id}`);
    },
    showRepairDetails(row, index) {
      if (index > -1) {
        this.$router.push(`/repair-details/${row.id}`);
      }
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