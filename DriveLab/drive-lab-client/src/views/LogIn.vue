<template>
  <div id="content" class="text-center">
    <b-img src="https://i.ibb.co/2Zzx0PD/logo.png" fluid alt="Responsive image"></b-img>
    <h3 >Log In</h3>
    <br/>
    <b-form @submit="logIn">
      <b-form-group>
        <b-form-input type="text"
                      v-model="user.username"
                      required placeholder="Enter username"
                      autofocus>
        </b-form-input>
      </b-form-group>

      <b-form-group>
        <b-form-input type="password"
                      v-model="user.password"
                      required
                      placeholder="Enter password">
        </b-form-input>
      </b-form-group>

      <b-btn type="submit" variant="info" :block="true">Log In</b-btn>
    </b-form>
    <p class="mt-5 mb-3 text-muted">&copy; 2019-2020</p>
  </div>
</template>

<script>

import AuthenticationService from "../services/AuthenticationService.js";

export default {
  data() {
    return {
      user: {
        username: "",
        password: ""
      }
    };
  },
  methods: {
    logIn(e) {
      e.preventDefault();

      const Toast = this.$swal.mixin({
        toast: true,
        position: 'top',
        showConfirmButton: false,
        timer: 3000,
        timerProgressBar: true,
        onOpen: (toast) => {
          toast.addEventListener('mouseenter', this.$swal.stopTimer)
          toast.addEventListener('mouseleave', this.$swal.resumeTimer)
        }
      })

      AuthenticationService.logIn(this.user, result => {

        const authenticatedUser = result.data;
        localStorage.setItem("authenticated-user", JSON.stringify(authenticatedUser));
        this.$store.commit("setRepairShopRole", authenticatedUser.role);

        Toast.fire({
          icon: 'success',
          title: 'Logged in successfully'
        })

        // TODO: Handle different roles routing
        
        this.$router.push("/");

      }, 
      result => {
        Toast.fire({
          icon: 'error',
          title: result.data.message
        })
      });
    }
  }
};
</script>

<style scoped>
  #content {
    padding-left: 42%;
    padding-right: 42%;
  }
</style>
