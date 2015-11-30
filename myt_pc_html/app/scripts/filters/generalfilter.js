'use strict';

/**
 * @ngdoc filter
 * @name mytPcHtmlApp.filter:generalFilter
 * @function
 * @description
 * # generalFilter
 * Filter in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
  .filter('generalFilter', function () {
    return function (input,valFnc,otherVal) {
        return valFnc(input,otherVal);
    };
  });
