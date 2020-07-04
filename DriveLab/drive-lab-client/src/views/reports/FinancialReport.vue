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
    <h1><b>Financial Report</b></h1>

    <b-form @submit="sendFinancialReportRequest">
      <b-form-group horizontal>
        
          <b-row>

            <b-col>
              <label for="from-date">From</label>
              <b-form-datepicker id="from-date" v-model="financialReportRequest.from" class="mb-2" :max="today"></b-form-datepicker>
            </b-col>

            <b-col>
              <label for="to-date">To (inclusive)</label>
              <b-input-group>
                <b-form-datepicker id="to-date" v-model="financialReportRequest.to" class="mb-2" :max="tomorrow"></b-form-datepicker>
                <b-input-group-append>
                    <b-btn class="mb-2" type="submit" variant="info" :disabled="!financialReportRequest.from || !financialReportRequest.to">View</b-btn>
                </b-input-group-append>
              </b-input-group>
            </b-col>

          </b-row>

      </b-form-group>
    </b-form>

    <div v-if="! (financialReport == null)">
      <br>
      <h4><b>Revenue</b></h4>
      <em>Income that the repair shop has from the sale of car parts and other services to customers.</em>
      <br><br>
      <h5 id="revenue">{{this.financialReport.revenue}} $</h5>
      <br>
      <h4><b>Expenses</b></h4>
      <em>Outflow of money that the repair shop has for the purchase of various car parts used in repairs.</em>
      <br><br>
      <h5 id="expenses">- {{this.financialReport.expenses}} $</h5>
      <br>
      <h4><b>Profit</b></h4>
      <em>The financial gain of the repair shop - especially the difference between the amount from income and the amount from expenses.</em>
      <br><br>
      <h5 id="profit">{{this.financialReport.profit}} $</h5>
    </div>
  </div>
</template>

<script>

import ReportsService from "../../services/ReportsService.js";

export default {
  data() {
    const now = new Date()
    const today = new Date(now.getFullYear(), now.getMonth(), now.getDate())
    const tomorrow = new Date(now.getFullYear(), now.getMonth(), now.getDate() + 1)

    return {
      financialReportRequest: {
        from: null,
        to: null,
      },
      
      financialReport: {
        revenue: 0,
        expenses: 0,
        profit: 0
      },

      today: today,
      tomorrow: tomorrow,
      isLoading: false
    }
  },
  created() {
 
  },
  methods: {
    sendFinancialReportRequest(e) {
      e.preventDefault();
      this.isLoading = true;

      ReportsService.sendFinancialReportRequest(this.financialReportRequest.from, this.financialReportRequest.to, result => {
        this.financialReport = result.data;
        this.isLoading = false;
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
    padding-left: 20%;
    padding-right: 20%;
  }
  #revenue {
    font-weight: bold;
    color: #287dec;
  }
  #expenses {
    font-weight: bold;
    color: rgb(206, 9, 9);
  }
  #profit {
    font-weight: bold;
    color: rgb(3, 201, 3);
  }
</style>