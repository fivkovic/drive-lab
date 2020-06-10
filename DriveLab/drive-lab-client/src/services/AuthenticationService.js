import Vue from 'vue';
import VueResource from 'vue-resource';

Vue.use(VueResource);

const baseUrl = '/api/authentication';

const authenticationService = {
    logIn: (data, success, error) => {
        return Vue.http.post(baseUrl, data).then(success, error);
    },

    logOut: (success, error) => {
        return Vue.http.put(baseUrl).then(success, error);
    }
}

export default authenticationService;