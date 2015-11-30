'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.global
 * @description
 * # global
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('global', function ($location) {
    // Public API here
    return {
      baseUrl:'http://'+$location.host()+':'+$location.port()+'/myt',
      currentMenu:{}
    };
  });
