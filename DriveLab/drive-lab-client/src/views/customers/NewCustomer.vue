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
    <h1><b>New Customer</b></h1>
    <br/>
    <b-form @submit="createNewCustomer">
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

      <b-btn type="submit" variant="info" :disabled="!customer.firstName || !customer.lastName || !customer.email" :block="true">Create</b-btn>
    </b-form>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const CUSTOMERS_URL = "/api/customers"

export default {
    data() {
        return {
            customer: {
                firstName: "",
                lastName: "",
                phoneNumber: "",
                email: ""
            },
            isLoading: false            
        };
    },
    created() {

    },
    methods: {
      createNewCustomer(e) {
        e.preventDefault();
        this.isLoading = true;

        DataService.create(CUSTOMERS_URL, this.customer, result => {
          this.isLoading = false;
          const data = result.data;
          this.$swal.fire("Success",`Customer ${data.firstName} ${data.lastName} created successfully.`, 'success');

          // TODO: Fixme
          // this.$router.push("/search-customers");
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