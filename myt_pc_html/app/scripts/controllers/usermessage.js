'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:UsermessageCtrl
 * @description
 * # UsermessageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('UsermessageCtrl', function (global) {
      global.currentMenu={
        no:'userMessage',
        name:'查询用户',
        ico:'',
        path:'userMessage'
      }
  });
