'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:roleManagePage
 * @description
 * # roleManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('roleManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/role/rolemanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '名称',
              valName: 'roleName',
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
              labelName: '创建时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '更新时间',
              valName: 'optDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }


          ],
          operationConf: [
            {
                labelName: '修改',//操作名称
                doFunc: function (val) {
                  $location.path('roleAddManage').search({id:val.id});
                }//操作方法
            }
          ],
          globalOperationConf:[
            {
                labelName: '添加',//操作名称
                doFunc: function (val) {
                  $location.path('roleAddManage');
                }//操作方法
            }
          ],
          querys:[
            {
              labelName: '名称',
              queryName: 'roleName@like',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          //defaultButton:false,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.role.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                self.pageSource = data.data;
              }
            });
          }
        };
      }
    };
  });
