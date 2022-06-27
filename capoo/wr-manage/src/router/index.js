import Vue from 'vue'
import VueRouter from 'vue-router'
import store from '../store/index'
import HomeView from '../views/Manage.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Manage',
    component: () => import(/* webpackChunkName: "about" */ '../views/Manage.vue'),
    redirect:"home",
    children: [
      {path:'user', name:'用户管理', component: () => import(/* webpackChunkName: "about" */ '../views/User.vue'),},
      {path:'home', name:'主页', component: () => import(/* webpackChunkName: "about" */ '../views/Home.vue'),},
      {path:'person', name:'个人信息', component: () => import(/* webpackChunkName: "about" */ '../views/Person.vue'),},
    ]
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/login',
    name: 'Login',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Login.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

router.beforeEach((to,from,next) => {
  localStorage.setItem("currentPathName", to.name)
  store.commit('setPath')
  next()
})

export default router
