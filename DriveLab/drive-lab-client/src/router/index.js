import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import LogIn from '../views/LogIn.vue'
import CarDiagnostics from '../views/diagnostics/CarDiagnostics.vue'
import SearchFaults from '../views/diagnostics/SearchFaults.vue'
import SearchProblems from '../views/diagnostics/SearchProblems.vue'
import NewCustomer from '../views/customers/NewCustomer.vue'
import SearchCustomers from '../views/customers/SearchCustomers.vue'
import CustomerDetails from '../views/customers/CustomerDetails.vue'
import NewVehicle from '../views/vehicles/NewVehicle.vue'
import SearchVehicles from '../views/vehicles/SearchVehicles.vue'
import VehicleDetails from '../views/vehicles/VehicleDetails.vue'
import NewRepair from '../views/repairs/NewRepair.vue'
import ServiceBook from '../views/repairs/ServiceBook.vue'
import RepairDetails from '../views/repairs/RepairDetails.vue'
import FinancialReport from '../views/reports/FinancialReport.vue'
import CustomerReport from '../views/reports/CustomerReport.vue'
import VehicleReport from '../views/reports/VehicleReport.vue'
import Notifications from '../views/notifications/Notifications.vue'
import AddRulesTemplateBased from '../views/rules/AddRulesTemplateBased.vue'
import AddRulesCustom from '../views/rules/AddRulesCustom.vue'

Vue.use(VueRouter)

const getRepairShopRole = () => {
  const authenticatedUser = localStorage.getItem("authenticated-user");
  if (authenticatedUser) {
      return JSON.parse(authenticatedUser).repairShopRole;
  }
  return '';
}

const routes = [
  {
    path: '/log-in',
    name: 'LogIn',
    component: LogIn,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() != 'REPAIR_SHOP' && getRepairShopRole() != 'HEADQUARTER');
    }
  },
  {
    path: '/',
    name: 'Home',
    component: Home,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP' || getRepairShopRole() == 'HEADQUARTER');
    }
  },
  {
    path: '/car-diagnostics/',
    name: 'Car Diagnostics',
    component: CarDiagnostics,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/car-diagnostics/:vehicleId',
    name: 'Car Diagnostics',
    component: CarDiagnostics,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/search-faults',
    name: 'Search Faults',
    component: SearchFaults,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/search-problems',
    name: 'Search Problems',
    component: SearchProblems,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/new-customer',
    name: 'New Customer',
    component: NewCustomer,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/search-customers',
    name: 'Search Customers',
    component: SearchCustomers,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/customer-details/:id',
    name: 'Customer Details',
    component: CustomerDetails,
    beforeEnter: (to, from, next) => {
        next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/new-vehicle/:customerId',
    name: 'New Vehicle',
    component: NewVehicle,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/search-vehicles',
    name: 'Search Vehicles',
    component: SearchVehicles,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/vehicle-details/:id',
    name: 'Vehicle Details',
    component: VehicleDetails,
    beforeEnter: (to, from, next) => {
        next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/new-repair/',
    name: 'New Repair',
    component: NewRepair,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/new-repair/:vehicleId',
    name: 'New Repair',
    component: NewRepair,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/service-book',
    name: 'Service Book',
    component: ServiceBook,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/repair-details/:id',
    name: 'Repair Details',
    component: RepairDetails,
    beforeEnter: (to, from, next) => {
        next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/financial-report',
    name: 'Financial Report',
    component: FinancialReport,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/customer-report',
    name: 'Customer Report',
    component: CustomerReport,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/vehicle-report',
    name: 'Vehicle Report',
    component: VehicleReport,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/notifications',
    name: 'Notifications',
    component: Notifications,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP' || getRepairShopRole() == 'HEADQUARTER');
    }
  },
  {
    path: '/add-rules-template-based',
    name: 'Add Rules Template Based',
    component: AddRulesTemplateBased,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'HEADQUARTER');
    }
  },
  {
    path: '/add-rules-custom',
    name: 'Add Rules Custom',
    component: AddRulesCustom,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'HEADQUARTER');
    }
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
