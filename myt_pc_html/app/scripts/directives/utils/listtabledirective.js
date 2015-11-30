'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:listTableDirective
 * @description
 * # listTableDirective
 */
angular.module('mytPcHtmlApp')
  .directive('listTableDirective', function (paginationConfFactory) {
    return {
      templateUrl: 'views/utils/listtableview.html',
      restrict: 'AE',
      replace:true,
      scope:{
        config:'='
      },
      link: function postLink(scope, element, attrs) {
        var conf=paginationConfFactory.extend(scope.config);
        scope.conf = new conf();
        scope.selectList=[];
        scope.$watch(function () {
          return scope.conf.page;

        }, function () {
          scope.conf.doSelect();
        });
        scope.$watch(function () {

          return scope.conf.pageSize;

        }, function () {
          scope.conf.page=1;
          scope.conf.doSelect();
        });
      }
    };
  });
