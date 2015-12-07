'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:OrdersmessageCtrl
 * @description
 * # OrdersmessageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('OrdersmanageCtrl', function (global) {
      global.currentMenu={
        no:'ordersManage',
        name:'订单管理',
        ico:'',
        path:'ordersManage'
      }
  });
