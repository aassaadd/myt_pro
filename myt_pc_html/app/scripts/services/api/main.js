'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp./api/main
 * @description
 * # /api/main
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .factory('apiMain', function (apiLogin,apiUser,apiLoginLog) {
    // Service logic
    // ...

    // Public API here
    return {
      login: apiLogin,
      user:apiUser,
      loginLog:apiLoginLog
    };
  });
