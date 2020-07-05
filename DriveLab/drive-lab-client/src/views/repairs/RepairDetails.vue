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
    <div v-if="!isLoading">
      <b-row>
        <b-col>
          <h1><b>Repair Details</b></h1>
        </b-col>
        <b-col>
        </b-col>
      </b-row>
      
      <em>Repair performed at {{this.repair.performedAt}} on {{new Date(this.repair.performedOn).toISOString().substring(0, 10)}}</em>
      <br/><br/>

      <b-row>
        <b-col>
          <h3><b>Vehicle</b></h3>
          <p>{{this.repair.vehicle.manufacturer.name}} {{this.repair.vehicle.model}} {{this.repair.vehicle.year}} ({{this.repair.vehicle.licensePlate}})</p>
          <p>Mileage: {{this.repair.vehicle.mileage}} km</p>
          <h3><b>Fault</b></h3>
          <p>{{this.repair.fault.name}} ({{this.repair.fault.faultGroup}})</p>
          <em>{{this.repair.fault.description}}</em>
          <br/><br/>
          <div>
            Was engine oil level low? <b>{{this.repair.fault.wasEngineOilLevelLow ? "Yes" : "No"}}</b>
          </div>
          <div>
            Has aftermarket parts fitted? <b>Yes</b>
          </div>
          <br/>
          <h5><b>Total Price: {{this.repair.totalPrice}} $</b></h5>
        </b-col>
        <b-col cols="7">
          <h3><b>Used Parts</b></h3>
          <b-table striped hover fixed :items="repair.usedParts" :fields="fields"></b-table>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const REPAIRS_URL = "/api/repairs"

export default {
  data() {
    return {
      repair: null,
      fields: [
        {
          key: "name",
          label: "Car Part Name"
        },
        // {
        //   key: "carPartType",
        //   label: "Type"
        // },
        // {
        //   key: "carPartGroup",
        //   label: "Group"
        // },
        {
          key: "salesPrice",
          label: "Price", 
          formatter: value => {
            return `${value} $`;
          }
        },
        {
          key: "count",
          label: "QTY"
        },
      ],
      isLoading: false
    }
  },
  created() {
    this.id = this.$route.params["id"];
    this.isLoading = true;

    DataService.findById(REPAIRS_URL, this.id, result => {
      this.repair = result.data;
      this.isLoading = false;
    }, error => {
      this.$swal.fire("Error", error.data.message, 'error');
      this.isLoading = false;
    });
  },
  methods: {

  }
}
</script>

<style scoped>
  #content {
    padding-left: 20%;
    padding-right: 20%;
  }
</style>