import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    role: '',

    // TODO: Add websocket handling here later

  },
  getters: {
    isAuthenticated: (state) => {
      return state.role != '';
    },
    isHeadquarters: (state) => {
        return state.role == 'HEADQUARTER';
    },
    isClassicRepairShop: (state) => {
        return state.role == 'REPAIR_SHOP';
    }
  },
  mutations: {
    setRepairShopRole: (state, value) => {
      state.role = value;
    },

    // TODO: Add websocket handling here later
    
  },
  actions: {
  },
  modules: {
  }
})
