
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import SearchProductView from "./components/SearchProductView"
import SearchProductViewDetail from "./components/SearchProductViewDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/orders/searchProducts',
                name: 'SearchProductView',
                component: SearchProductView
            },
            {
                path: '/orders/searchProducts/:id',
                name: 'SearchProductViewDetail',
                component: SearchProductViewDetail
            },




    ]
})
