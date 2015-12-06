'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:wxUserManagePage
 * @description
 * # wxUserManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('wxUserManagePage', function (apiMain,$filter) {
    return {
      templateUrl: 'views/page/wxuser/wxusermanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '昵称',
              valName: 'userNickname`',
              width: '25%'
            }, {
              labelName: '性别',
              valName: 'userGender',
              width: '25%',
              filter:function(val, otherVal){
                //'性别（1男，2女）'
                var r = '';
                if (val == 1) {
                  r = '男';
                } else {
                  r = '女';
                }
                return r;
              }
            }, {
              labelName: '年龄',
              valName: 'userAge',
              width: '25%'
            }, {
              labelName: '出生年月日',
              valName: 'userBirth',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '手机号',
              valName: 'userCall',
              width: '25%'
            }, {
              labelName: '用户状态',
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
            }

          ],
          operationConf: [
            {
              labelName: '详细',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
              }//操作方法
            }
          ],
          globalOperationConf: [
            {
              labelName: '停用',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
              }//操作方法
            }, {
              labelName: '启动',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
              }//操作方法
            }
          ],
          querys: [
            {
              labelName: '昵称',
              queryName: 'userNickname@like',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          defaultButton:false,
          multiSelect: true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.wxUser.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                self.pageSource = data.data;
              }
            });
          }
        };
      }
    };
  });
