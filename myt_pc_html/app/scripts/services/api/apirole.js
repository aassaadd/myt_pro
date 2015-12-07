'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiRole
 * @description
 * # apiRole
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiRole', function (apiUtils,global) {
      // Service logic
      // ...

      // Public API here
      return {
        getAppsByPage: apiUtils.getQuery(function (params) {
          var id=params.id;
          delete  params.id;

          return {
            method: 'GET',
            url: global.baseUrl + '/api/manage/mytRole/'+id+'/mytApp',
            params: params
          }
        }),
        getAppModulesByPage: apiUtils.getQuery(function (params) {
          var id=params.id;
          delete  params.id;
          return {
            method: 'GET',
            url: global.baseUrl + '/api/manage/mytRole/'+id+'/mytAppModule',
            params: params
          }
        }),
        getByPage: apiUtils.getQuery(function (params) {

          return {
            method: 'GET',
            url: global.baseUrl + '/api/manage/mytRole',
            params: params
          }
        }),
        getById: apiUtils.getQuery(function (params) {

          return {
            method: 'GET',
            url: global.baseUrl + '/api/manage/mytRole/'+params.id,
            params: params
          }
        }),
        add: apiUtils.getQuery(function (params) {

          return {
            method: 'POST',
            url: global.baseUrl + '/api/manage/mytRole',
            data: params
          }
        }),
        update: apiUtils.getQuery(function (params) {

          return {
            method: 'PUT',
            url: global.baseUrl + '/api/manage/mytRole/'+params.id,
            data: params
          }
        }),
        updateApp: apiUtils.getQuery(function (params) {
          var id=params.id;
          var array=params.mytApps;
          return {
            method: 'PUT',
            url: global.baseUrl + '/api/manage/mytRole/'+id+'/mytApp',
            data: array
          }
        }),
        updateAppModule: apiUtils.getQuery(function (params) {
          var id=params.id;
          var array=params.mytAppModules;
          return {
            method: 'PUT',
            url: global.baseUrl + '/api/manage/mytRole/'+id+'/mytAppModule',
            data: array
          }
        }),
        delete: apiUtils.getQuery(function (params) {

          return {
            method: 'DELETE',
            url: global.baseUrl + '/api/manage/mytRole/'+params.id,
            params: params
          }
        })
      };
  });
