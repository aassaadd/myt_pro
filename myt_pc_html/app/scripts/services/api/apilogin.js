'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiLogin
 * @description
 * # apiLogin
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiLogin', function (apiUtils,global) {
    // Service logic
    // ...

    // Public API here
    return {
        login: apiUtils.getQuery(function (params) {

        return {
          method: 'POST',
          url: global.baseUrl + '/api' + '/login',
          data: params
        }
      })
    };
  });
