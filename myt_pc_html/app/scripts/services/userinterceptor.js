'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.UserInterceptor
 * @description
 * # UserInterceptor
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
    .factory('UserInterceptor', function ($rootScope, $q) {


        return {
            request: function (config) {
                config.headers["token"] = window.localStorage.token;
                return config;
            },
            response: function (response) {
                var data = response.data;
                // 判断错误码，如果是未登录
                if (data["errorCode"] && data["errorCode"] == "101") {
                    // 清空用户本地token存储的信息，如果
                    window.localStorage.token = '';
                    // 全局事件，方便其他view获取该事件，并给以相应的提示或处理
                    window.location.href = 'login.html';
                    //$rootScope.$emit("userIntercepted", "notLogin", response);
                }
                //这里统一处理弹出错误提示(错误提示信息由后台确认
                if (data.code && !data.data) {
                    alert(data.message);
                }
                return response;
            },
            responseError: function (response) {
                var data = response.data;
                // 判断错误码，如果是未登录
                if (data["errorCode"] && data["errorCode"] == "101") {
                    // 清空用户本地token存储的信息，如果
                    window.localStorage.token = '';
                    // 全局事件，方便其他view获取该事件，并给以相应的提示或处理
                    window.location.href = 'login.html';
                    //$rootScope.$emit("userIntercepted", "notLogin", response);
                }
                return $q.reject(response);
            }
        };
    });
