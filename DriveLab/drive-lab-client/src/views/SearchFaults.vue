<template>
    <div id="content">
        <b-row>
            <b-col id="content-left">
                <div>
                    <h3>Search Faults</h3>

                    <b-form @submit="searchFaults">
                        <b-form-group label="Problems">
                            <multiselect v-model="searchFaultsRequest.problems"
                                         placeholder="Select Problems"
                                         label="name"
                                         track-by="id"
                                         :options="problems"
                                         :multiple="true">
                            </multiselect>
                        </b-form-group>
                        <b-form-group>
                            <b-row>
                                <b-col>
                                    <b-btn :disabled="!searchFaultsRequest.problems || searchFaultsRequest.problems.length == 0"
                                            type="submit"
                                            variant="primary"
                                            :block="true">Submit</b-btn>
                                </b-col>
                                <b-col>
                                    <b-btn @click="resetSearchForm"
                                            variant="secondary"
                                            :block="true">Reset</b-btn>
                                </b-col>
                            </b-row>
                        </b-form-group>
                    </b-form>
                </div>
            </b-col>
        </b-row>
    </div>
</template>

<script>

import DataService from "../services/DataService.js";
import SearchService from "../services/SearchService.js"

const PROBLEMS_URL = "/api/problems"			// TODO: Change path

export default {
    data() {
        return {
            problems: [],

            searchFaultsRequest: {
                problems: []
            }
        }
    },
    created() {
        DataService.findAll(PROBLEMS_URL, result => {
			this.problems = result.data;
		}, error => {
			this.$swal.fire("Error", error.data.message, 'error');
		});
    },
    methods: {
        searchFaults(e) {

          e.preventDefault();

          SearchService.sendSearchFaultsRequest(this.searchFaultsRequest, result => {
              const data = result.data;
              this.$swal.fire("Faults found",`${data.fault.name}`, 'success');
            }, error => {
              this.$swal.fire("Error", error.data.message, 'error');  
            }
          );
        },
        resetSearchForm() {
            this.searchFaultsRequest.problems = [];
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