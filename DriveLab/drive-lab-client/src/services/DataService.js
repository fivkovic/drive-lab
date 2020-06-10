import Vue from 'vue';
import VueResource from 'vue-resource';

Vue.use(VueResource);

const dataService = {
    create: (url, data, success, error) => {
        return Vue.http.post(url, data).then(success, error);
    },

    findAll: (url, success, error) => {
        return Vue.http.get(url).then(success, error);
    },

    findById: (url, id, success, error) => {
        return Vue.http.get(`${url}/${id}`).then(success, error);
    },

    update: (url, id, data, success, error) => {
        return Vue.http.put(`${url}/${id}`, data).then(success, error);
    },

    delete: (url, id, success, error) => {
        return Vue.http.delete(`${url}/${id}`).then(success, error);
    }
}

export default dataService;
