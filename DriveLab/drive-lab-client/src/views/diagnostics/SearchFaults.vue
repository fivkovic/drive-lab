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
                    <h3><b>Search Faults</b></h3>

                    <b-form @submit="searchFaults">
                        <b-form-group label="Problems">
                            <multiselect v-model="searchFaultsRequest.problems"
                                         placeholder="Select Problems"
                                         label="name"
                                         track-by="id"
                                         :options="problems"
                                         :multiple="true"
                                         :close-on-select="false">
                            </multiselect>
                        </b-form-group>
                        <b-form-group>
                            <b-row>
                                <b-col>
                                    <b-btn :disabled="!searchFaultsRequest.problems || searchFaultsRequest.problems.length == 0"
                                            type="submit"
                                            variant="info"
                                            :block="true">Submit
                                    </b-btn>
                                </b-col>
                                <b-col>
                                    <b-btn @click="resetSearchForm"
                                            variant="danger"
                                            :block="true">Reset
                                    </b-btn>
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

const PROBLEMS_URL = "/api/problems"

export default {
    data() {
        return {
            problems: [],

            searchFaultsRequest: {
                problems: []
            },

            fields: [
                {
                    key: 'fault.name',
                    label: 'Fault',
                    sortable: false
                },
                {
                    key: 'fault.description',
                    label: 'Description',
                    sortable: true
                },
                {
                    key: 'probability',
                    label: 'Related problems count',
                    sortable: true
                },
            ],
            items: [],
            isLoading: false
        }
    },
    created() {
        this.isLoading = true;

        DataService.findAll(PROBLEMS_URL, result => {
            this.problems = result.data;
            this.isLoading = false;
		}, error => {
            this.$swal.fire("Error", error.data.message, 'error');
            this.isLoading = false;
		});
    },
    methods: {
        searchFaults(e) {
          e.preventDefault();
          this.isLoading = true;
          
          SearchService.sendSearchFaultsRequest(this.searchFaultsRequest, result => {
              const data = result.data;
              this.items = data;
              this.isLoading = false;
              this.$swal.fire("Faults found",`Search returned ${data.length} results.`, 'success');
            }, error => {
              this.isLoading = false;
              this.$swal.fire("Error", error.data.message, 'error');
            }
          );
        },
        resetSearchForm() {
            this.searchFaultsRequest.problems = [];
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