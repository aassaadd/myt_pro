'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:questionnaireJsonDirective
 * @description
 * # questionnaireJsonDirective
 */
angular.module('mytPcHtmlApp')
  .directive('questionnaireJsonDirective', function () {
    return {
      templateUrl: 'views/page/questionnaire/questionnairejsondirectiveview.html',
      restrict: 'AE',
      scope: {
        conf: '='
      },
      link: function postLink(scope, element, attrs) {
        //if(scope.conf.value)
        //scope.conf.value = [
        //
        //];
        scope.add=function(){
          scope.conf.value.push({
            labelName: '',
            valName: '',
            type: 'text',
            default: '',//默认值
            selValue: [
            //  {
            //  value:'',
            //  text:''
            //}
            ],
            value: '',
            isCheck: false
          });
        };
        scope.chilAdd=function(val){
          val.selValue.push({
            value:'',
            text:''
          });
        }
        scope.chilDelete=function(val){
          val.selValue.pop();
        }
        scope.delete=function(val){
          var arr=[];
         for(var i in scope.conf.value){
           if(val!=scope.conf.value[i]){
             arr.push(scope.conf.value[i]);

           }
         }
          scope.conf.value=arr;
        };
      }
    };
  });
