'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiApp
 * @description
 * # apiApp
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiApp', function (apiUtils,global) {
    // Service logic
    // ...



    // Public API here
    return {
      getByPage: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytApp',
          params: params
        }
      }),
      getById: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytApp/'+params.id,
          params: params
        }
      }),
      add: apiUtils.getQuery(function (params) {

        return {
          method: 'POST',
          url: global.baseUrl + '/api/manage/mytApp',
          data: params
        }
      }),
      update: apiUtils.getQuery(function (params) {

        return {
          method: 'PUT',
          url: global.baseUrl + '/api/manage/mytApp/'+params.id,
          data: params
        }
      }),
      delete: apiUtils.getQuery(function (params) {

        return {
          method: 'DELETE',
          url: global.baseUrl + '/api/manage/mytApp/'+params.id,
          params: params
        }
      })
    };
  });
