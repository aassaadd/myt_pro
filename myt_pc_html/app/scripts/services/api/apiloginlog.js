'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiLoginLog
 * @description
 * # apiLoginLog
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiLoginLog', function (apiUtils,global) {
    // Service logic
    // ...


    // Public API here
    return {
      getByPage: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytLoginLog',
          params: params
        }
      })
    };
  });
