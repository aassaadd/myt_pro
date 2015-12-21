'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:modelWidgetDirective
 * @description
 * # modelWidgetDirective
 */
angular.module('mytPcHtmlApp')
  .directive('modelWidgetDirective', function ($timeout,$compile,global) {
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
            //type: 'date',//text/select/date/amount/date/checkbox/radio/other
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
            //asyncSelValue:function(callback){}//callback:function(val){}讲返回值传回,
            //directive:''//指令名称

          }
        }
        //select 过滤器
        //generalFilter
        scope.selectFilter=function(val,otherVal){
          var r='';
          for(var i in otherVal){
            if(val==otherVal[i].value){
              r=otherVal[i].text;
              if(r==''){
                r=otherVal[i].value;
              }
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
                scope.conf.value='';
                element.find('input').val('');
                //element.find('input').val(val.match(rr)[0]);
              }
            });
          });

        };
        if(scope.conf.type=='amount'){

          //延时绑定
          $timeout(function() {
            scope.conf.value=scope.conf.value/100;
            element.find('input').on('keyup',function(){
              //
              var r=/^(([1-9]\d{0,9})|0)(\.\d{1,2})?$/,
                  rr=/(([1-9]\d{0,9})|0)(\.\d{1,2})?/,
                  val=element.find('input').val();
              if(!rr.test(val)){
                //element.find('input').val(val.match(rr)[0]);
                scope.conf.value='';
                element.find('input').val('');
              }
            });
          });

        };
        if(scope.conf.ope=='view' && scope.conf.type=='imgUp'){
          scope.url=''
            scope.$watch(function () {
              return scope.conf.value;

            }, function () {
              if (scope.conf.value && scope.conf.value != '') {
                scope.url = global.baseUrl + '/api/manage/mytFile/' + scope.conf.value + '?postMethod=image&token=' + global.getToken();
              } else {
                scope.url = global.baseUrl + '/api/manage/mytFile/0?postMethod=image&token=' + global.getToken();
              }

            });
        }
        if(scope.conf.ope=='view' && scope.conf.type=='kindeditor'){

          scope.$watch(function () {
            return scope.conf.value;

          }, function () {
            element.find('iframe'). contents().find('body').html(scope.conf.value);
          });
        }

        if(scope.conf.type=='other'){
          $timeout(function() {
            var d = scope.conf.directive.replace(/([A-Z])/g, "-$1").toLowerCase(),
                el = $('<div ' + d + '="" conf="conf"></div>');

            element.find('.typeOther').append($compile(el)(scope));
          });
        }

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
