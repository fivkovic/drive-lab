import Vue from 'vue'
import Vuex from 'vuex'

import SockJS from "sockjs-client";
import Stomp from "webstomp-client";

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    role: '',
    socket: {
      socketClient: null,
      stompClient: null
    }
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
    connectWebSocket: (state, callback) => {
      state.socket.socketClient = new SockJS("http://localhost:8080/api/notifications");
      state.socket.stompClient = Stomp.over(state.socket.socketClient);
      state.socket.stompClient.connect(
          {},
          () => {
              state.socket.stompClient.subscribe("/notifications", response => {
                callback(response.body);
              });
          },
          response => {
              console.log(response);
          }
      );
    },
    disconnectWebSocket: (state) => {
        if (state.socket.stompClient) {
            state.socket.stompClient.disconnect();
        }
        state.socket.socketClient = null;
        state.socket.stompClient = null;
    }
  },
  actions: {
  },
  modules: {
  }
})
