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
          params: params
        }
      }),
      getAppByPage: apiUtils.getQuery(function (params) {
        var id=params.id;
        delete  params.id;
        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser/'+id+'/mytApp',
          params: params
        }
      }),
      getAppModuleByPage: apiUtils.getQuery(function (params) {
        var id=params.id;
        delete  params.id;
        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser/'+id+'/mytAppModule',
          params: params
        }
      }),
      getAppModuleOnAppIdByPage: apiUtils.getQuery(function (params) {
        var id=params.id,
          appId=params.appId;
        delete  params.id;
        delete params.appId;
        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser/'+id+'/mytApp/'+appId+'/mytAppModule',
          params: params
        }
      }),
      getById: apiUtils.getQuery(function (params) {

        return {
          method: 'GET',
          url: global.baseUrl + '/api/manage/mytUser/'+params.id,
          params: params
        }
      }),
      add: apiUtils.getQuery(function (params) {

        return {
          method: 'POST',
          url: global.baseUrl + '/api/manage/mytUser',
          data: params
        }
      }),
      update: apiUtils.getQuery(function (params) {

        return {
          method: 'PUT',
          url: global.baseUrl + '/api/manage/mytUser/'+params.id,
          data: params
        }
      }),
      updatePassword: apiUtils.getQuery(function (params) {

        return {
          method: 'PUT',
          url: global.baseUrl + '/api/manage/mytUser/'+params.id+'/password',
          data: params
        }
      }),
      delete: apiUtils.getQuery(function (params) {

        return {
          method: 'DELETE',
          url: global.baseUrl + '/api/manage/mytUser/'+params.id,
          params: params
        }
      })
    };
  });
