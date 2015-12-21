'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:classManagePage
 * @description
 * # classManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('classManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/class/classmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '分类',
              valName: 'procName',
              width: '25%'
            }, {
              labelName: '状态',
              valName: 'status',
              width: '25%',
              filter: function (val, otherVal) {
                var r = '';
                if (val == 1) {
                  r = '有效';
                } else {
                  r = '无效';
                }
                return r;
              }
            }, {
              labelName: '创建事件',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }


          ],
          operationConf: [
          ],
          globalOperationConf:[
            {
                labelName: '添加分类',//操作名称
                doFunc: function (val) {
                  $location.path('classAddManage');
                }//操作方法
            }
          ],
          querys:[

          ],
          defaultButton:false,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.class.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {

                self.pageSource = data.data;
              }
            });
          }
        };
      }
    };
  });
