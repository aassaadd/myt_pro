'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:OrdersmessageCtrl
 * @description
 * # OrdersmessageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('OrdersmessageCtrl', function (global) {
      global.currentMenu={
        no:'ordersMessage',
        name:'订单管理',
        ico:'',
        path:'ordersMessage'
      }
  });
