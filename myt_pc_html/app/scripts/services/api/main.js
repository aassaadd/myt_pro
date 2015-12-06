'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp./api/main
 * @description
 * # /api/main
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
    .factory('apiMain', function (apiLogin, apiUser, apiLoginLog, apiRole, apiMch, apiCsl, apiAdv, apiFdk, apiWxUser,apiClass,apiOrder,apiProduct) {
        // Service logic
        // ...

        // Public API here
        return {
            login: apiLogin,
            user: apiUser,
            loginLog: apiLoginLog,
            role: apiRole,
            mch: apiMch,
            csl: apiCsl,
            adv: apiAdv,
            fdk: apiFdk,
            wxUser: apiWxUser,
            class:apiClass,
            order:apiOrder,
            product:apiProduct
        };
    });
