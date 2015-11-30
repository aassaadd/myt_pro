'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiUser
 * @description
 * # apiUser
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiUser', function (apiUtils,global) {
    // Service logic
    // ...

    // Public API here
    return {
      getByPage: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser',
          data: params
        }
      }),
      getById: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser/'+params.userId,
          data: params
        }
      })
    };
  });
