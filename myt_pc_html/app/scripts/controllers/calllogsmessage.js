'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:CalllogsmessageCtrl
 * @description
 * # CalllogsmessageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('CalllogsmessageCtrl', function (global) {
      global.currentMenu={
        no:'userMessage',
        name:'查询用户',
        ico:'',
        path:'userMessage'
      }
  });
