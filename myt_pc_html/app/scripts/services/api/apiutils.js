'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.apiUtils
 * @description
 * # apiUtils
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiUtils', function ($q,$http) {
    // Service logic
      function getQuery(httpFn) {

        return {
          query: function (params) {
            var deferred = $q.defer(); // 声明延后执行，表示要去监控后面的执行
            $http(httpFn(params)).
                success(function (data, status, headers, config) {
                  deferred.resolve(data);
                  //if (data.code == '200') {
                  //
                  //  deferred.resolve(data);  // 声明执行成功，即http请求数据成功，可以返回数据了
                  //} else {
                  //  deferred.resolve(data);
                  //}
                }).
                error(function (data, status, headers, config) {
                  deferred.reject(data);   // 声明执行失败，即服务器返回错误
                });
            return deferred.promise;   // 返回承诺，这里并不是最终数据，而是访问最终数据的API
          },
          queryCallback: function (params, callback) {
            this.query(params).then(function (data) {
              // 调用承诺API获取数据 .resolve
              callback(data);
            }, function (data) {  // 处理错误 .reject
              callback(data);
            });
          }
        }
      };
    // Public API here
    return {
      getQuery: getQuery
    };
  });
