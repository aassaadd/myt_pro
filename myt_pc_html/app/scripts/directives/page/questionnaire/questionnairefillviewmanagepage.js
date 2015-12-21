'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:questionnaireFillViewManagePage
 * @description
 * # questionnaireFillViewManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('questionnaireFillViewManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/questionnaire/questionnairefillviewmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          tableTitle: '问卷',
          modelConf: [],
          operationConf: [],
          defaultButton: false,
          doSubmit: function () {


          }
        };
        //
        if ($location.search().id) {
          apiMain.quf.getById.queryCallback({
            id: $location.search().id
          }, function (data) {
            if (data && data.data) {
              var json =JSON.parse(data.data.qufJson);
              if(json){
                for (var i in json) {
                  var j=json[i];
                  j.ope='view';
                  scope.conf.modelConf.push(j);

                }
              }
              scope.conf.modelConf.push({

                  labelName: '其他描述',
                  valName: 'qufDescription',
                  type: 'textarea',
                  default: '',//默认值
                  selValue: [],
                  value: data.data.qufDescription,
                  ope: 'view'

              });

            }
          })
        }
      }
    };
  });
