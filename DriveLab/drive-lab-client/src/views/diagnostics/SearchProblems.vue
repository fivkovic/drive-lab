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
        <b-row>
            <b-col id="content-left">
                <div>
                    <h3><b>Search Problems</b></h3>

                    <b-form @submit="searchProblems">
                        <b-form-group label="Fault">
                            <multiselect v-model="searchProblemsRequest.fault"
                                         placeholder="Select Fault"
                                         label="name"
                                         track-by="id"
                                         :options="faults"
                                         :multiple="false">
                            </multiselect>
                        </b-form-group>
                        <b-form-group>
                            <b-row>
                                <b-col>
                                    <b-btn :disabled="!searchProblemsRequest.fault || searchProblemsRequest.fault == ''"
                                            type="submit"
                                            variant="info"
                                            :block="true">Submit</b-btn>
                                </b-col>
                                <b-col>
                                    <b-btn @click="resetSearchForm"
                                            variant="danger"
                                            :block="true">Reset</b-btn>
                                </b-col>
                            </b-row>
                        </b-form-group>
                    </b-form>
                    <br><br>
                    <div>
                        <h3><b>Results</b></h3>
                        <b-table fixed responsive hover head-variant="light" :items="items" :fields="fields"></b-table>
                    </div>
                </div>
            </b-col>
        </b-row>
    </div>
</template>

<script>

import DataService from "../../services/DataService.js";
import SearchService from "../../services/SearchService.js"

const FAULTS_URL = "/api/faults"

export default {
    data() {
        return {
            faults: [],

            searchProblemsRequest: {
                fault: ""
            },

            fields: [
                {
                    key: 'name',
                    label: 'Problem',
                    sortable: true
                },
                {
                    key: 'description',
                    label: 'Description',
                    sortable: true
                },
            ],
            items: [],
            isLoading: false
        }
    },
    created() {
        this.isLoading = true;

        DataService.findAll(FAULTS_URL, result => {
            this.faults = result.data;
            this.isLoading = false;
		}, error => {
            this.$swal.fire("Error", error.data.message, 'error');
            this.isLoading = false;
		});
    },
    methods: {
        searchProblems(e) {
          e.preventDefault();
          this.isLoading = true;

          var searchProblemsRequest = JSON.parse(`{ "fault" : "${this.searchProblemsRequest.fault.name}" }`);
          SearchService.sendSearchProblemsRequest(searchProblemsRequest, result => {
              const data = result.data;
              this.items = data;
              this.isLoading = false;
              this.$swal.fire("Problems found",`Search returned ${data.length} results.`, 'success');
            }, error => {
              this.isLoading = false;
              this.$swal.fire("Error", error.data.message, 'error');  
            }
          );
        },
        resetSearchForm() {
            this.searchProblemsRequest.fault = "";
            this.items = [];
        }
    }
}

</script>

<style scoped>
  #content {
    padding-left: 10%;
    padding-right: 10%;
  }
  #content-left {
    padding-right: 5%;
  }
  #content-right {
    padding-left: 5%;
  }
</style>