import Vue from 'vue';
import VueResource from 'vue-resource';

Vue.use(VueResource);

const baseUrl = '/api/search';

const searchService = {
    sendSearchFaultsRequest: (data, success, error) => {
        return Vue.http.post(`${baseUrl}/by-problem`, data).then(success, error);
    },
    sendSearchProblemsRequest: (data, success, error) => {
        return Vue.http.post(`${baseUrl}/by-fault`, data).then(success, error);
    }
}

export default searchService;