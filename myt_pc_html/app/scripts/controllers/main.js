'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('MainCtrl', function (global) {
      global.currentMenu={
        no:'main',
        name:'看板',
        ico:'fa-dashboard',
        path:'main'
      }
  });
