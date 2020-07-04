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
    <h1><b>New Vehicle</b></h1>
    <p>For Customer: {{this.customer.firstName}} {{this.customer.lastName}}</p>
    <br/>
    <b-form @submit="createNewVehicle">
      <b-form-group>
        <b-input-group prepend="Manufacturer and model" class="mb-2">
            <b-form-select v-model="vehicle.manufacturer" required placeholder="Select manufacturer" :options="manufacturers"></b-form-select>
            <b-form-input type="text" aria-label="Model" v-model="vehicle.model" required placeholder="Enter model name"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Year" class="mb-2">
            <b-form-input type="number" v-model="vehicle.year" required placeholder="Enter year"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Engine" class="mb-2">
            <b-form-select v-model="vehicle.engineType" required placeholder="Select engine type" :options="engineTypeOptions"></b-form-select>
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

      <b-btn type="submit" variant="info" :disabled="!vehicle.owner || !vehicle.manufacturer || !vehicle.model || !vehicle.year || 
        !vehicle.mileage || !vehicle.engineType || !vehicle.licensePlate || !vehicle.trafficLicenseNumber" :block="true">
        Create
      </b-btn>
    </b-form>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const VEHICLES_URL = "/api/vehicles"
const CUSTOMERS_URL = "/api/customers"
const VEHICLE_MANUFACTURERS_URL = "/api/vehicle-manufacturers"

export default {
    data() {
        return {
            vehicle: {
                owner: "",
                manufacturer: "",
                model: "",
                year: "",
                mileage: "",
                engineType: "",
                licensePlate: "",
                trafficLicenseNumber: ""
            },

            customer: {
              id: null
            },

            manufacturers: [],
            engineTypeOptions: [
              { value: "DIESEL", text: 'Diesel' },
              { value: "GASOLINE", text: 'Gasoline' },
              { value: "GAS", text: 'Gas' },
              { value: "HYBRID", text: 'Hybrid' },
              { value: "ELECTRIC", text: 'Electric' }
            ],
            isLoading: false
        };
    },
    created() {
      this.customer.id = this.$route.params["customerId"];
      this.isLoading = true;

      DataService.findById(CUSTOMERS_URL, this.customer.id, result => {
        this.customer = result.data;
        this.vehicle.owner = this.customer;
      }, error => {
        this.$swal.fire("Error", error.data.message, 'error');
      });

      DataService.findAll(VEHICLE_MANUFACTURERS_URL, result => {
        this.manufacturers = result.data.map(m => ({ value : m, text : m.name}) );
        this.isLoading = false;
      }, error => {
        this.$swal.fire("Error", error.data.message, 'error');
        this.isLoading = false;
      });
    },
    methods: {
      createNewVehicle(e) {
        e.preventDefault();
        this.isLoading = true;

        DataService.create(VEHICLES_URL, this.vehicle, result => {
          this.isLoading = false;
          const data = result.data;
          this.$swal.fire("Success",`Vehicle ${data.manufacturer.name} ${data.model} created successfully.`, 'success');
          
          this.$router.push(`/customer-details/${this.customer.id}`)
        }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
          this.isLoading = false;
        });
      }
    }
}
</script>

<style scoped>
  #content {
    padding-left: 30%;
    padding-right: 30%;
  }
</style>