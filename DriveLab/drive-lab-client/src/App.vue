<template>
  <div id="app">
    <div id="nav">
      <b-navbar v-if="isAuthenticated()" toggleable="md" type="light" variant="light" fixed="top">
        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
        <b-navbar-brand to="/">
          <img src="https://i.ibb.co/56wVWGM/Screenshot-1.png" alt="Kitten" width="151" height="30" class="mb-1">
        </b-navbar-brand>
        <b-collapse is-nav id="nav_collapse">

          <b-navbar-nav>

            <b-nav-item-dropdown v-if="isClassicRepairShop()" text="Customers" left>
              <template v-slot:button-content>
                <b-icon icon="people" class="ml-1 mr-1"></b-icon>Customers
              </template> 
              <b-dropdown-item v-if="isClassicRepairShop()" to="/new-customer" class="mb-2">New Customer</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/search-customers" class="mb-2">Search Customers</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/customer-details" class="mb-2" disabled>Customer Details</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isClassicRepairShop()" text="Vehicles" left>
              <template v-slot:button-content>
                <b-icon icon="truck" class="ml-1 mr-1"></b-icon>Vehicles
              </template>               
              <b-dropdown-item v-if="isClassicRepairShop()" to="/new-vehicle" class="mb-2" disabled>New Vehicle</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/search-vehicles" class="mb-2">Search Vehicles</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/vehicle-details" class="mb-2" disabled>Vehicle Details</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isClassicRepairShop()" text="Diagnostics" left>
              <template v-slot:button-content>
                <b-icon icon="clipboard-data" class="ml-2 mr-1"></b-icon>Diagnostics
              </template>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/car-diagnostics" class="mb-2">Car Diagnostics</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/search-faults" class="mb-2">Search Faults</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/search-problems" class="mb-2">Search Problems</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isClassicRepairShop()" text="Repairs" left>
              <template v-slot:button-content>
                <b-icon icon="wrench" class="ml-1 mr-1"></b-icon>Repairs
              </template> 
              <b-dropdown-item v-if="isClassicRepairShop()" to="/new-repair" class="mb-2">New Repair</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/service-book" class="mb-2">Service Book</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/repair-details" class="mb-2" disabled>Repair Details</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isClassicRepairShop()" text="Reports" left>
              <template v-slot:button-content>
                <b-icon icon="graph-up" class="ml-1 mr-2"></b-icon>Reports
              </template>               
              <b-dropdown-item v-if="isClassicRepairShop()" to="/financial-report" class="mb-2">Financial Report</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/customer-report" class="mb-2">Customer Report</b-dropdown-item>
              <b-dropdown-item v-if="isClassicRepairShop()" to="/vehicle-report" class="mb-2">Vehicle Report</b-dropdown-item>
            </b-nav-item-dropdown>

            


            <b-nav-item-dropdown v-if="isHeadquarters()" text="Add Rules" left>
              <template v-slot:button-content>
                <b-icon icon="gear" class="ml-2 mr-1"></b-icon>Add Rules
              </template> 
              <b-dropdown-item v-if="isHeadquarters()" to="/add-rules-template-based" class="mb-2">Template-based</b-dropdown-item>
              <b-dropdown-item v-if="isHeadquarters()" to="/add-rules-custom" class="mb-2">Custom</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isHeadquarters()" text="Faults" left>
              <template v-slot:button-content>
                <b-icon icon="exclamation-triangle" class="ml-1 mr-1"></b-icon>Faults
              </template> 
              <b-dropdown-item v-if="isHeadquarters()" to="/add-fault" class="mb-2">Add Fault</b-dropdown-item>
            </b-nav-item-dropdown>
            
            <b-nav-item-dropdown v-if="isHeadquarters()" text="Problems" left>
              <template v-slot:button-content>
                <b-icon icon="clipboard-data" class="ml-1 mr-1"></b-icon>Problems
              </template> 
              <b-dropdown-item v-if="isHeadquarters()" to="/add-problem" class="mb-2">Add Problem</b-dropdown-item>
            </b-nav-item-dropdown>

            <b-nav-item-dropdown v-if="isHeadquarters()" text="Car Parts" left>
              <template v-slot:button-content>
                <b-icon icon="tools" class="ml-1 mr-1"></b-icon>Car Parts
              </template> 
              <b-dropdown-item v-if="isHeadquarters()" to="/car-parts" class="mb-2">Overview</b-dropdown-item>
              <b-dropdown-item v-if="isHeadquarters()" to="/add-car-part" class="mb-2">Add Car Part</b-dropdown-item>
              <b-dropdown-item v-if="isHeadquarters()" to="/car-part-details" class="mb-2">Car Part Details</b-dropdown-item>
            </b-nav-item-dropdown>

            
            <b-nav-item-dropdown v-if="isHeadquarters()" text="Repair Shops" left>
              <template v-slot:button-content>
                <b-icon icon="shop" class="ml-1 mr-2"></b-icon>Repair Shops
              </template> 
              <b-dropdown-item v-if="isHeadquarters()" to="/repair-shops" class="mb-2">Overview</b-dropdown-item>
              <b-dropdown-item v-if="isHeadquarters()" to="/add-new-repair-shop" class="mb-2">Add New Repair Shop</b-dropdown-item>
            </b-nav-item-dropdown>

          </b-navbar-nav>

          <b-navbar-nav class="ml-auto">
            <b-nav-item v-if="isAuthenticated()" to="/notifications" class="mt-2">
              <span>
                <b-icon icon="bell" class="ml-1 mr-2"></b-icon>Notifications
              </span>  
            </b-nav-item>
            
            <b-nav-item v-if="isAuthenticated()" v-on:click="logOut()">
              <b-button variant="outline-info">
                <b-icon icon="power" aria-hidden="true"></b-icon> Logout
              </b-button>
            </b-nav-item>
            
            <b-nav-item v-else to="/log-in">Log In</b-nav-item>
          </b-navbar-nav>

        </b-collapse>
      </b-navbar>
    </div>
    <div id="content">
      <b-container fluid>
        <router-view :key="$route.fullPath"/>
      </b-container>
    </div>
  </div>
</template>

<script>

import AuthenticationService from "./services/AuthenticationService.js";

export default {
  methods: {
    isAuthenticated() {
      return this.$store.getters.isAuthenticated;
    },
    isHeadquarters() {
      return this.$store.getters.isHeadquarters;
    },
    isClassicRepairShop() {
      return this.$store.getters.isClassicRepairShop;
    },
    logOut() {
      const callback = () => {
        this.$store.commit("setRepairShopRole", "");
        this.$store.commit("disconnectWebSocket");
        localStorage.clear();
        this.$router.push("/log-in");
      };
      
      AuthenticationService.logOut(callback, callback);
    }
  },
  created() {
    const authenticatedUser = localStorage.getItem("authenticated-user");

    const Toast = this.$swal.mixin({
      toast: true,
      position: 'top',
      showConfirmButton: false,
      timer: 3000,
      timerProgressBar: true,
      onOpen: (toast) => {
        toast.addEventListener('mouseenter', this.$swal.stopTimer)
        toast.addEventListener('mouseleave', this.$swal.resumeTimer)
      },
    })
    
    if (!authenticatedUser) {
      if(this.$router.currentRoute.name != "LogIn") {
        this.$router.push("/log-in")
      }
    } else {
      this.$store.commit("setRepairShopRole", JSON.parse(authenticatedUser).repairShopRole);
      this.$store.commit("connectWebSocket", message => {
        Toast.fire({
          icon: 'warning',
          title: message
        })
      });
    }
  }
}

</script>

<style>
  #app {
    font-family: Roboto, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #2c3e50;
  }
  
  #content {
    margin-top: 150px;
  }
</style>