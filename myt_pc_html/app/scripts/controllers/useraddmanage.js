'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:UseraddmanageCtrl
 * @description
 * # UseraddmanageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('UseraddmanageCtrl', function (global) {
      global.currentMenu={
        no:'userMessage',
        name:'查询用户',
        ico:'',
        path:'userMessage'
      }
  });
