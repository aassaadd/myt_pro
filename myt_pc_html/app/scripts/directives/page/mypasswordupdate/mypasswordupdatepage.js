'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:myPasswordUpdatePage
 * @description
 * # myPasswordUpdatePage
 */
angular.module('mytPcHtmlApp')
  .directive('myPasswordUpdatePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/mypasswordupdate/mypasswordupdatepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'edit',
          tableTitle = '修改密码';
        scope.source = {
          userPassword: '',
          newUserPassword:'',
          oldUserPassword:'',
        };

        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '旧密码',
              valName: 'oldUserPassword',
              type: 'password',
              default: '',//默认值
              selValue: [],
              value: scope.source.oldUserPassword,
              ope: ope
            }, {
              labelName: '新密码',
              valName: 'newUserPassword',
              type: 'password',
              default: '1',//默认值
              selValue: [],
              value: scope.source.newUserPassword,
              ope: ope
            }, {
              labelName: '验证新密码',
              valName: 'userPassword',
              type: 'password',
              default: '',//默认值
              selValue: [],
              value: scope.source.userPassword,
              ope: ope
            }
          ],
          operationConf: [
          ],
          doSubmit: function () {
            for (var i in scope.conf.modelConf) {
              var m = scope.conf.modelConf[i];
              scope.source[m.valName] = m.value;
            }
            apiMain.user.updatePassword.queryCallback({
              id:0,
              userPassword:scope.source.userPassword,
              newUserPassword:scope.source.newUserPassword,
              oldUserPassword:scope.source.oldUserPassword
            }, function (data) {
              if (data && data.data ) {
                scope.source.userPassword='';
                scope.source.newUserPassword='';
                scope.source.oldUserPassword='';
                for (var i in scope.conf.modelConf) {
                  var m = scope.conf.modelConf[i];
                  m.value = scope.source[m.valName];
                }
                alert('密码修改成功');
              }
            });
          }
        };
      }
    };
  });
