import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import LogIn from '../views/LogIn.vue'

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
    path: '/',
    name: 'Home',
    component: Home,
    beforeEnter: (to, from, next) => {
      next(getRepairShopRole() == 'REPAIR_SHOP');
    }
  },
  {
    path: '/log-in',
    name: 'LogIn',
    component: LogIn
  },


]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
