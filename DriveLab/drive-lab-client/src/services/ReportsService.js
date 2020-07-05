import Vue from 'vue';
import VueResource from 'vue-resource';

Vue.use(VueResource);

const baseUrl = '/api/reports';

const reportsService = {
    sendFinancialReportRequest: (from, to, success, error) => {
        return Vue.http.get(`${baseUrl}/financial?from=${from}&to=${to}`).then(success, error);
    },
    sendCustomerReportRequest: (success, error) => {
        return Vue.http.get(`${baseUrl}/customer`).then(success, error);
    },
    sendVehicleReportRequest: (success, error) => {
        return Vue.http.get(`${baseUrl}/vehicle`).then(success, error);
    }
}

export default reportsService;