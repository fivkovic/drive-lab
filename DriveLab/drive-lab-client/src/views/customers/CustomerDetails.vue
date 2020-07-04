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
    <h1><b>Customer Details</b></h1>
    <br/>
    <b-form @submit="updateCustomerDetails">
      <b-form-group>
        <b-input-group prepend="First and Last name" class="mb-2">
            <b-form-input type="text" aria-label="First name" v-model="customer.firstName" required placeholder="Enter first name"></b-form-input>
            <b-form-input type="text" aria-label="Last name" v-model="customer.lastName" required placeholder="Enter last name"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Phone" class="mb-2">
            <b-form-input type="text" aria-label="Phone" v-model="customer.phoneNumber" placeholder="Enter phone number"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="e-Mail" class="mb-2">
            <b-form-input type="email" aria-label="e-Mail" v-model="customer.email" required placeholder="example@domain.com"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-row>
          <b-col class="mr-5">
            <b-btn @click="showDeleteConfirmationDialog" variant="danger" :block="true">Delete Customer</b-btn>
          </b-col>
          <b-col>
            <b-btn type="submit" variant="info" :disabled="!customer.firstName || !customer.lastName || !customer.email" :block="true">Update Customer Info</b-btn>
          </b-col>
        </b-row>
      </b-form-group>
       
    </b-form>
    <br/>
    <h3><b>Owned Vehicles</b></h3>
    <br/>

    <b-form-group horizontal>
      <b-input-group>
        <b-form-input v-model="searchFilter" placeholder="Type to search..." autofocus/>
        <b-input-group-append>
            <b-btn :disabled="!searchFilter" @click="searchFilter = ''">Reset</b-btn>
        </b-input-group-append>
      </b-input-group>
    </b-form-group>

    <b-table striped hover fixed :items="customer.ownedVehicles" :fields="fields" :filter="searchFilter" @filtered="onSearch" @row-clicked="showVehicleDetails" :current-page="currentPage" :per-page="pageSize"></b-table>
    <b-btn variant="info" class="mb-2" :block="true" @click="addNewVehicle">Add New Vehicle</b-btn>
    <b-pagination pills :total-rows="customer.ownedVehicles.length" :per-page="pageSize" v-model="currentPage" class="my-0" align="center" />

    <b-modal ref="deleteConfirmationDialog" centered title="Delete customer" @ok="deleteCustomer">
      <div class="d-block text-center">
        Are you sure you want to remove the customer from your system?
      </div>
    </b-modal>

  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const CUSTOMERS_URL = "/api/customers"

export default {
    data() {
        return {
            customer: {
                id: "",
                firstName: "",
                lastName: "",
                phoneNumber: "",
                email: "",
                ownedVehicles: []
            },

            searchFilter: null,
            currentPage: 1,
            pageSize: 5,
            fields: [
              {
                key: "manufacturer.name",
                label: "Manufacturer"
              },
              {
                key: "model",
                label: "Model"
              },
              {
                key: "year",
                label: "Year"
              },
              {
                key: "licensePlate",
                label: "License Plate"
              },
            ],
            isLoading: false
        }
    },
    created() {
        this.id = this.$route.params["id"];
        this.isLoading = true;

        DataService.findById(CUSTOMERS_URL, this.id, result => {
            this.customer = result.data;
            this.isLoading = false;
        }, error => {
            this.$swal.fire("Error", error.data.message, 'error');
            this.isLoading = false;
        });
    },
    methods: {
      updateCustomerDetails(e) {
        e.preventDefault();
        this.isLoading = true;

        DataService.update(CUSTOMERS_URL, this.id, this.customer, result => {
            const data = result.data;
            this.isLoading = false;
            this.$swal.fire("Success",`Customer ${data.firstName} ${data.lastName} updated successfully.`, 'success');
        }, error => {
            this.$swal.fire("Error", error.data.message, 'error');
            this.isLoading = false;
        });
      },
      showDeleteConfirmationDialog() {
        this.$refs.deleteConfirmationDialog.show();
      },
      deleteCustomer() {
        this.isLoading = true;
        DataService.delete(CUSTOMERS_URL, this.id, result => {
          const data = result.data;
          this.isLoading = false;
          this.$swal.fire("Success",`Customer ${data.firstName} ${data.lastName} deleted successfully.`, 'success');
          
          this.$router.push("/search-customers");
        }, error => {
          this.$swal.fire("Error", error.data.message, 'error');
          this.isLoading = false;
        });
      },
      onSearch(filteredItems) {
        this.totalRows = filteredItems.length;
        this.currentPage = 1;
      },
      addNewVehicle() {
        this.$router.push(`/new-vehicle/${this.customer.id}`);
      },
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
    padding-left: 25%;
    padding-right: 25%;
  }
</style>