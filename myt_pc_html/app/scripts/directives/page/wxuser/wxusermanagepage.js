'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:wxUserManagePage
 * @description
 * # wxUserManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('wxUserManagePage', function () {
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
              valName: 'role',
              width: '25%'
            }, {
              labelName: '年龄',
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
              labelName: '出生年月日',
              valName: 'lastLoginTime',
              width: '25%'
            }, {
              labelName: '手机号',
              valName: 'lastLoginTime',
              width: '25%'
            }, {
              labelName: '用户状态',
              valName: 'lastLoginTime',
              width: '25%'
            }, {
              labelName: '登陆地点',
              valName: 'lastLoginTime',
              width: '25%'
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
              labelName: '添加',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
              }//操作方法
            }, {
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
              labelName: '登陆用户名',
              queryName: 'userName@like',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          //defaultButton:false,
          multiSelect: true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.user.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {

                for(var i in data.data.content){
                  data.data.content[i].lastLoginTime = '加载中...';
                  data.data.content[i].role = '加载中...';
                  (function(val){
                    apiMain.loginLog.getByPage.queryCallback({userName: val.userName,page:1,pageSize:1}, function (data) {
                      if (data && data.data && data.data.content.length>0) {

                        val.lastLoginTime= $filter('date')(new Date(data.data.content[0].createDate), 'yyyy-MM-dd HH:mm:ss');
                      }else{
                        val.lastLoginTime= '无登陆信息';
                      }


                    });
                  })(data.data.content[i]);
                }
                self.pageSource = data.data;
              }
            });
          }
        };
      }
    };
  });
