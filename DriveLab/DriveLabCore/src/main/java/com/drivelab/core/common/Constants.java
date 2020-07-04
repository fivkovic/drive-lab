package com.drivelab.core.common;

public class Constants {

    private Constants() { }

    public static class API {

        public static final String AUTHENTICATION_ENDPOINT = "/api/authentication";
        public static final String DIAGNOSTICS_ENDPOINT = "/api/diagnostics";

        public static final String VEHICLES_ENDPOINT = "/api/vehicles";
        public static final String VEHICLE_MANUFACTURERS_ENDPOINT = "/api/vehicle-manufacturers";
        public static final String CUSTOMERS_ENDPOINT = "/api/customers";
        public static final String PROBLEMS_ENDPOINT = "/api/problems";
        public static final String SEARCH_ENDPOINT = "/api/search";
        public static final String CAR_PARTS_ENDPOINT = "/api/car-parts";
        public static final String FAULTS_ENDPOINT = "/api/faults";
        public static final String REPAIRS_ENDPOINT = "/api/repairs";
        public static final String REPORTS_ENDPOINT = "/api/reports";

        public static final String BY_PROBLEM = "/by-problem";
        public static final String BY_FAULT = "/by-fault";

        public static final String FINANCIAL = "/financial";
        public static final String CUSTOMER = "/customer";
        public static final String VEHICLE = "/vehicle";

    }

    public static class Drools {

        public static final String SEARCH_BY_PROBLEMS_QUERY_NAME = "Get Faults By Problems Query";
        public static final String SEARCH_BY_FAULT_QUERY_NAME = "Get Problems By Fault Query";
    }
}
