'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:merchatAddressDirective
 * @description
 * # merchatAddressDirective
 */
angular.module('mytPcHtmlApp')
  .directive('merchatAddressDirective', function (areaCtrlFactory) {
    return {
      templateUrl: 'views/page/merchant/merchataddressdirectiveview.html',
      restrict: 'AE',
      scope: {
        conf: '='
      },
      link: function postLink(scope, element, attrs) {
        scope.start=0;//初始化状态
        if(!scope.conf.value){
          scope.conf.value = {
            province: '',
            city: '',
            area: '',
            address: ''
          };
        }

        scope.province = [];
        scope.city = [];
        scope.area = [];
        scope.selProvince=function(){
          scope.conf.value.city='';
          scope.conf.value.area='';
        }
        scope.selCity=function(){
          scope.conf.value.area='';
        }
        for (var key in areaCtrlFactory) {
          if (key.indexOf('0000') == 2) {
            scope.province.push(
              {
                value: key,
                text: areaCtrlFactory[key][0]
              });
          }
        }
        scope.$watch(function () {
          return scope.conf.value.province;
        }, function () {
          scope.city = [];
          scope.area = [];
          //scope.conf.value.city='';
          //scope.conf.value.area='';
          for (var key in areaCtrlFactory) {
            if (scope.conf.value.province == areaCtrlFactory[key][1]) {
              scope.city.push(
                {
                  value: key,
                  text: areaCtrlFactory[key][0]
                });
            }
          }

        });
        scope.$watch(function () {
          return scope.conf.value.city;
        }, function () {
          scope.area = [];
          //scope.conf.value.area='';
          for (var key in areaCtrlFactory) {
            if (scope.conf.value.city == areaCtrlFactory[key][1]) {
              scope.area.push(
                {
                  value: key,
                  text: areaCtrlFactory[key][0]
                });
            }
          }

        });
      }
    };
  });
