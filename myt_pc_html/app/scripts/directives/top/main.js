'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:/top/main
 * @description
 * # /top/main
 */
angular.module('mytPcHtmlApp')
  .directive('topMain', function (global) {
    return {
      templateUrl: 'views/top/main.html',
      restrict: 'AE',
      replace:true,
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.fullScreenType=false;
        scope.currentMenu=global.currentMenu;
        //进入全屏
        scope.requestFullScreen=function () {

          if( scope.fullScreenType){
            var de = document;
            if (de.exitFullscreen) {
              de.exitFullscreen();
            } else if (de.mozCancelFullScreen) {
              de.mozCancelFullScreen();
            } else if (de.webkitCancelFullScreen) {
              de.webkitCancelFullScreen();
            }
            scope.fullScreenType=false;
          }else{
            var de = document.documentElement;
            if (de.requestFullscreen) {
              de.requestFullscreen();
            } else if (de.mozRequestFullScreen) {
              de.mozRequestFullScreen();
            } else if (de.webkitRequestFullScreen) {
              de.webkitRequestFullScreen();
            }
            scope.fullScreenType=true;
          }

        };

        var watch = scope.$watch(function () {
          return global.currentMenu;
        }, function (newValue, oldValue) {
          scope.currentMenu=newValue;
        });
      }
    };
  });
