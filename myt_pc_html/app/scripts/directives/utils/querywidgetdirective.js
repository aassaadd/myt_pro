'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:queryWidgetDirective
 * @description
 * # queryWidgetDirective
 */
angular.module('mytPcHtmlApp')
  .directive('queryWidgetDirective', function ($timeout) {
    return {
      templateUrl: 'views/utils/querywidgetview.html',
      restrict: 'AE',
      replace:true,
      scope:{
        conf: '='
      },
      link: function postLink(scope, element, attrs) {
        if (!scope.conf) {
          scope.conf = {
            //labelName: '',
            //queryName: '',
            //type: 'date',//text/select/date
            //default: '2',//默认值
            //selValue:[
            //  {
            //    text: '1',
            //    value: '1'
            //  }, {
            //    text: '2',
            //    value: '2'
            //  }
            //],
            //value: ''

          }
        }
        //初始化
        if(scope.conf.type=='date'){
          //延时绑定
          $timeout(function() {
            scope.$emit('ngRepeatFinished');
          });

        }
        if(scope.conf.type=='number'){
          //延时绑定
          $timeout(function() {
            element.find('input').on('keyup',function(){
              //
              var r=/^[0-9]*$/,
                  rr=/[0-9]*/,
                  val=element.find('input').val();
              if(!r.test(val)){
                element.find('input').val(val.match(rr)[0]);
              }
            });
          });

        };
        //延时绑定
        scope.$on('ngRepeatFinished',function (ngRepeatFinishedEvent) {
          element.find('input').datetimepicker({
            minView: "month", //选择日期后，不会再跳转去选择时分秒
            format: "yyyy-mm-dd", //选择日期后，文本框显示的日期格式
            language: 'zh-CN', //汉化
            autoclose:true //选择日期后自动关闭
          });
        });
      }
    };
  });
