export default [
  {
    path: '/user',
    layout: false,
    routes: [
      {path: '/user/', component: './User/Login'},
      {path: '/user/register', component: './User/Register'},
    ],
  },
  {path: '/welcome', icon: 'smile', component: './Welcome', name: '欢迎页'},
  { path: '/', redirect: '/add_chart' },
  { path: '/add_chart', name: '智能分析', icon: 'barChart', component: './AddChart' },
  { path: '/my_chart', name: '我的图表', icon: 'pieChart', component: './MyChart' },
  {
    path: '/admin',
    icon: 'crown',
    name: '管理页',
    access: 'canAdmin',
    routes: [
      {path: '/admin', redirect: '/admin/user'},
      {icon: 'table', path: '/admin/user', component: './Admin/User', name: '用户管理'},
    ],
  },
  {path: '/', redirect: '/welcome'},
  {path: '*', layout: false, component: './404'},
];
