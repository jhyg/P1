
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AManager from "./components/listers/ACards"
import ADetail from "./components/listers/ADetail"

import A2Manager from "./components/listers/A2Cards"
import A2Detail from "./components/listers/A2Detail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/as',
                name: 'AManager',
                component: AManager
            },
            {
                path: '/as/:id',
                name: 'ADetail',
                component: ADetail
            },

            {
                path: '/a2s',
                name: 'A2Manager',
                component: A2Manager
            },
            {
                path: '/a2s/:id',
                name: 'A2Detail',
                component: A2Detail
            },



    ]
})
