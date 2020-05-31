<template>
  <div id="app">
    <div id="nav">
      <b-navbar v-if="isAuthenticated()" toggleable="md" type="light" variant="light" fixed="top">
        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
        <b-navbar-brand to="/">DriveLab</b-navbar-brand>
        <b-collapse is-nav id="nav_collapse">

          <!-- TODO: Add routes for CRUD  primary, success, info, warning, danger, dark, or light-->

          <b-navbar-nav class="ml-auto">
            <b-nav-item v-if="isAuthenticated()" v-on:click="logOut()">Log Out</b-nav-item>
            <b-nav-item v-else to="/log-in">Log In</b-nav-item>
          </b-navbar-nav>

        </b-collapse>
      </b-navbar>
    </div>
    <div id="content">
      <b-container fluid>
        <router-view/>
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

        // TODO: Add websocket handling here later

        localStorage.clear();
        this.$router.push("/log-in");
      };
      
      AuthenticationService.logOut(callback, callback);
    }
  },
  created() {
    const authenticatedUser = localStorage.getItem("authenticated-user");

    if (!authenticatedUser) {
      if(this.$router.currentRoute.name != "LogIn") {
        this.$router.push("/log-in")
      }
    } else {
      this.$store.commit("setRepairShopRole", JSON.parse(authenticatedUser).repairShopRole);

      // TODO: Add websocket handling here later
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