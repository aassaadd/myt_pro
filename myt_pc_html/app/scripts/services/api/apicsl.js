'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiCsl
 * @description
 * # apiCsl
 * Factory in the mytPcHtmlApp.
 * 客服服务记录
 */
angular.module('mytPcHtmlApp')
  .factory('apiCsl', function (apiUtils,global) {
    // Service logic
    // ...

    // Public API here
    return {
      getByPage: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytCustomerServiceLog',
          params: params
        }
      }),
      getById: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytCustomerServiceLog/'+params.id,
          params: params
        }
      }),
      add: apiUtils.getQuery(function (params) {

        return {
          method: 'POST',
          url: global.baseUrl + '/api/manage/mytCustomerServiceLog',
          data: params
        }
      }),
      update: apiUtils.getQuery(function (params) {

        return {
          method: 'PUT',
          url: global.baseUrl + '/api/manage/mytCustomerServiceLog/'+params.id,
          data: params
        }
      }),
      delete: apiUtils.getQuery(function (params) {

        return {
          method: 'DELETE',
          url: global.baseUrl + '/api/manage/mytCustomerServiceLog/'+params.id,
          params: params
        }
      })
    };
  });
