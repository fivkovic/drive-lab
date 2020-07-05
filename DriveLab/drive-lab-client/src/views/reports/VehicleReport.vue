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
    <h1><b>Vehicle Report</b></h1>
    <h4>Vehicles repaired at least 3 times in last 12 months, where the same fault occured 2 or more times.</h4>
    
    <em>Customers who have experienced chronic problems with their vehicles may 
      be experiencing a substantial product defect or condition and might be entitled to reimbursement.
      The car repair could be covered by a company product recall, a warranty or possibly a safety recall.
      The vehicles listed below are having a chronic and persistent problem, so advise customers to consider it.
    </em>
    <br><br>
      <b-row>
        <b-col>
          <b-form-group horizontal>
            <b-input-group>
              <b-form-input v-model="filter" placeholder="Type to search..." autofocus/>
              <b-input-group-append>
                <b-btn variant="danger" :disabled="!filter" @click="filter = ''">Reset</b-btn>
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
        </b-col>
      </b-row>
      <b-table responsive fixed hover head-variant="light" :items="vehicles" :fields="fields" :filter="filter" @row-clicked="showVehicleDetails">
    </b-table>
  </div>
</template>

<script>

import ReportsService from "../../services/ReportsService.js";

export default {
  data() {
    return {
      vehicles: [],
      filter: null,
      fields: [
          {
              key: "id",
              sortable: true
          },
          {
              key: "manufacturer.name",
              label: "Manufacturer",
              sortable: true
          },
          {
              key: "model",
              sortable: true
          },
          {
              key: "year",
              sortable: true
          },
          {
              key: "mileage",
              label: "Mileage (km)",
              sortable: true
          },
          {
              key: "engineType",
              label: "Engine Type",
              sortable: true
          },
          {
              key: "licensePlate",
              label: "License Plate",
              sortable: true
          },
          {
              key: "trafficLicenseNumber",
              label: "Traffic License Number",
              sortable: true
          }
      ],
      isLoading: false
    }
  },
  created() {
    this.isLoading = true;

    ReportsService.sendVehicleReportRequest(result => {
      this.vehicles = result.data;
      this.isLoading = false;
    }, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });
  },
  methods: {
    showVehicleDetails(row, index) {
      if (index > -1) {
        this.$router.push(`/vehicle-details/${row.id}`);
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