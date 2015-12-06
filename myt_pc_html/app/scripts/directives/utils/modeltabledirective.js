'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:modelTableDirective
 * @description
 * # modelTableDirective
 */
angular.module('mytPcHtmlApp')
  .directive('modelTableDirective', function (pageModelConfFactory) {
    return {
      templateUrl: 'views/utils/modeltableview.html',
      restrict: 'AE',
      replace:true,
      scope:{
        config:'='
      },
      link: function postLink(scope, element, attrs) {
        var conf=pageModelConfFactory.extend(scope.config);
        scope.conf = new conf();
      }
    };
  });
