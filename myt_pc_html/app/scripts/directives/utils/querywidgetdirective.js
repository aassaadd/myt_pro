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
          element.find('input').daterangepicker({
                singleDatePicker: true,
                showDropdowns: true,
                locale: {
                  format: 'YYYY/MM/DD',
                  separator: ' - ',
                  applyLabel: '应用',
                  cancelLabel: '取消',
                  fromLabel: '从',
                  toLabel: '至',
                  customRangeLabel: '自定义',
                  daysOfWeek: ['周日', '周一', '周二', '周三', '周四', '周五','周六'],
                  monthNames: ['1月', '2曰', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
                }
              },
              function(start, end, label) {

              });
        });
      }
    };
  });
