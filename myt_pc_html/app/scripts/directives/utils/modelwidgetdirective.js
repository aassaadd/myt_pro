'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:modelWidgetDirective
 * @description
 * # modelWidgetDirective
 */
angular.module('mytPcHtmlApp')
  .directive('modelWidgetDirective', function ($timeout) {
    return {
      templateUrl: 'views/utils/modelwidgetview.html',
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
            //type: 'date',//text/select/date/amount/date/checkbox/radio
            //default: '2',//默认值,
            //placeholder:'',
            //selValue:[
            //  {
            //    text: '1',
            //    value: '1'
            //  }, {
            //    text: '2',
            //    value: '2'
            //  }
            //],
            //value: '',
            //    ope:'edit'//view显示/edit隐藏,
            //maxlength,
            //asyncSelValue:function(callback){}//callback:function(val){}讲返回值传回

          }
        }
        //select 过滤器
        //generalFilter
        scope.selectFilter=function(val,otherVal){
          var r='';
          for(var i in otherVal){
            if(val==otherVal[i].value){
              r=otherVal[i].text;
              break;
            }
          }
          return r;
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
        if(scope.conf.type=='amount'){
          //延时绑定
          $timeout(function() {
            element.find('input').on('keyup',function(){
              //
              var r=/^(([1-9]\d{0,9})|0)(\.\d{1,2})?$/,
                  rr=/(([1-9]\d{0,9})|0)(\.\d{1,2})?/,
                  val=element.find('input').val();
              if(!r.test(val)){
                element.find('input').val(val.match(rr)[0]);
              }
            });
          });

        };

        //启动异步加载
        if(scope.conf.asyncSelValue){
          scope.conf.asyncSelValue(function(val){
            scope.conf.selValue=val;
          });
        }
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
