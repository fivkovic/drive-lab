import Vue from 'vue';
import VueResource from 'vue-resource';

Vue.use(VueResource);

const baseUrl = '/api/diagnostics';

const diagnosticsService = {
    sendDiagnosticsRequest: (data, success, error) => {
        return Vue.http.post(baseUrl, data).then(success, error);
    }
}

export default diagnosticsService;