'use strict';

/**
 * @ngdoc function
 * @name mytPcHtmlApp.controller:AdvmanageCtrl
 * @description
 * # AdvmanageCtrl
 * Controller of the mytPcHtmlApp
 */
angular.module('mytPcHtmlApp')
  .controller('AdvmanageCtrl', function (global) {
      global.currentMenu={
        no:'advManage',
        name:'广告位管理',
        ico:'',
        path:'advManage'
      }
  });
