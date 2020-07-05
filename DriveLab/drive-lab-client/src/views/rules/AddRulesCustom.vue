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
    <h1><b>New Rule</b></h1>
    <br/>
    <b-form @submit="createNewRule">
      <b-form-group>
        <b-input-group prepend="Rule name" class="mb-2">
            <b-form-input type="text" aria-label="Rule name" v-model="rule.name" required placeholder="Enter rule name"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Rule body" class="mb-2">
            <b-form-textarea id="textarea" v-model="rule.body" placeholder="Enter rule body..." rows="10" max-rows="50"></b-form-textarea>
        </b-input-group>
      </b-form-group>

      <b-btn type="submit" variant="info" :disabled="!rule.name || !rule.body" :block="true">Create</b-btn>
    </b-form>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const RULES_URL = "/api/rules/custom"

export default {
    data() {
        return {
            rule: {
                name: "",
                body: ""
            },

            isLoading: false            
        };
    },
    created() {

    },
    methods: {
      createNewRule(e) {
        e.preventDefault();
        this.isLoading = true;

        DataService.create(RULES_URL, this.rule, result => {
          this.isLoading = false;
          const data = result.data;
          this.$swal.fire("Success",`Rule created successfully.`, 'success');

          this.$router.push("/");
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