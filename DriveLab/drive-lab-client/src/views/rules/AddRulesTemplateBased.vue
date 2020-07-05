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
            <b-form-input type="text" aria-label="Rule name" v-model="rule.ruleName" required placeholder="Enter rule name"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Problems Count" class="mb-2">
            <b-form-input type="number" aria-label="Problems count" v-model="rule.problemsCount" placeholder="Enter problems count"></b-form-input>
        </b-input-group>
      </b-form-group>

      <b-form-group>
        <b-input-group prepend="Fault Group" class="mb-2">
            <b-form-select v-model="rule.faultGroup" required placeholder="Select Fault Group" :options="faultGroups"></b-form-select>
        </b-input-group>
      </b-form-group>

      <b-btn type="submit" variant="info" :disabled="!rule.ruleName || !rule.problemsCount || !rule.faultGroup" :block="true">Create</b-btn>
    </b-form>
  </div>
</template>

<script>

import DataService from "../../services/DataService.js";

const RULES_URL = "/api/rules"

export default {
    data() {
        return {
            rule: {
                ruleName: "",
                problemsCount: 0,
                faultGroup: null
            },
            faultGroups: [
              { value: "CAR_BODY", text: 'Car Body' },
              { value: "DOORS", text: 'Doors' },
              { value: "WINDOWS", text: 'Windows' },
              { value: "ELECTRONICS", text: 'Electronics' },
              { value: "GAUGES", text: 'Gauges' },
              { value: "IGNITION_SYSTEM", text: 'Ignition System' },
              { value: "LIGHTING_SYSTEM", text: 'Lighting System' },
              { value: "SENSORS", text: 'Sensors' },
              { value: "INTERIOR", text: 'Interior' },
              { value: "BRAKING_SYSTEM", text: 'Braking System' },
              { value: "POWERTRAIN_COMPONENTS", text: 'Powertrain Components' },
              { value: "ENGINE", text: 'Engine' },
              { value: "ENGINE_COOLING_SYSTEM", text: 'Engine Cooling System' },
              { value: "ENGINE_OIL_SYSTEM", text: 'Engine Oil System' },
              { value: "EXHAUST_SYSTEM", text: 'Exhaust System' },
              { value: "FUEL_SUPPLY_SYSTEM", text: 'Fuel Supply System' },
              { value: "SUSPENSION_AND_STEERING_SYSTEM", text: 'Suspension and Steering System' },
              { value: "TRANSMISSION_SYSTEM", text: 'Transmission System' },
              { value: "AIR_CONDITIONING", text: 'Air Conditioning' },
              { value: "OTHER", text: 'Other' }
            ],
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