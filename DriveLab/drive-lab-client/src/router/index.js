import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import LogIn from '../views/LogIn.vue'
import Diagnostics from '../views/Diagnostics.vue'
import SearchFaults from '../views/SearchFaults.vue'
import SearchProblems from '../views/SearchProblems.vue'

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
    component: LogIn
  },
  {
    path: '/',
    name: 'Home',
    component: Home,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/diagnostics',
    name: 'Diagnostics',
    component: Diagnostics,
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

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
