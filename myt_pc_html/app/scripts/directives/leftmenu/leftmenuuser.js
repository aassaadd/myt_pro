'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:leftMenuUser
 * @description
 * # leftMenuUser
 */
angular.module('mytPcHtmlApp')
    .directive('leftMenuUser', function (apiMain) {
        return {
            templateUrl: 'views/leftmenu/leftmenuuser.html',
            restrict: 'AE',
            replace: true,
            scope: {},
            link: function postLink(scope, element, attrs) {
                scope.user = {};
                scope.date=new Date();
                apiMain.user.getById.queryCallback({id:0}, function (data) {
                    if (data && data.data) {
                        scope.user = data.data;
                    }
                });
            }
        };
    });
