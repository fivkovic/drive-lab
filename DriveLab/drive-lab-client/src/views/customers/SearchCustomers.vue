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
    <h1><b>Search Customers</b></h1>
    <br/>
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
    <b-table responsive fixed hover head-variant="light" :items="customers" :fields="fields" :filter="filter" @row-clicked="showDetails">
    </b-table>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const CUSTOMERS_URL = "/api/customers"

export default {
    data() {
        return {  
            customers: [],
            
            filter: null,
            fields: [
                {
                    key: "id",
                    sortable: true
                },
                {
                    key: "firstName",
                    sortable: true
                },
                {
                    key: "lastName",
                    sortable: true
                },
                {
                    key: "phoneNumber",
                    sortable: true
                },
                {
                    key: "email",
                    sortable: true
                }
            ],
            isLoading: false
        }
    },
    created() {
      this.isLoading = true;

      DataService.findAll(CUSTOMERS_URL, result => {
        this.customers = result.data;
        this.isLoading = false;
      }, error => {
        this.$swal.fire("Error", error.data.message, 'error');
        this.isLoading = false;
      });
    },
    methods: {
      showDetails(row, index) {
        if (index > -1) {
          this.$router.push(`/customer-details/${row.id}`);
        }
      }
    }
}
</script>


<style scoped>
  #content {
    padding-left: 15%;
    padding-right: 15%;
  }
</style>