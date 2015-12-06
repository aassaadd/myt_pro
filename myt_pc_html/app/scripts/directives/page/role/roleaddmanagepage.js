'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:roleAddManagePage
 * @description
 * # roleAddManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('roleAddManagePage',function (apiMain, $filter, $location,$window) {
  return {
    templateUrl: 'views/page/role/roleaddmanagepageview.html',
    restrict: 'AE',
    scope: {},
      link: function postLink(scope, element, attrs) {
        var ope='edit',
            tableTitle='添加';
        scope.source = {
          roleName: '',
          status: '1',
          appModels:[]

        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '名称',
              valName: 'roleName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.roleName,
              ope:ope
            }, {
              labelName: '状态',
              valName: 'status',
              type: 'select',
              default: '1',//默认值
              selValue: [
                {
                  value: '1',
                  text: '有效'
                }, {
                  value: '0',
                  text: '失效'
                }

              ],
              value: scope.source.status,
              ope:ope
            }, {
              labelName: '权限',
              valName: 'appModels',
              type: 'other',
              directive:'roleSelectTabDirective',
              default: '',//默认值
              selValue: [],
              value: scope.source.appModels,
              ope:ope
            }
          ],
          operationConf: [
            //{
            //    labelName: '保存',//操作名称
            //    doFunc: function () {
            //        for(var i in scope.conf.modelConf){
            //            var m =scope.conf.modelConf[i];
            //            scope.source[m.valName]= m.value;
            //        }
            //        alert(JSON.stringify(scope.source));
            //    }//操作方法
            //}
          ],
          doSubmit: function () {

            for (var i in scope.conf.modelConf) {
              var m = scope.conf.modelConf[i];
              scope.source[m.valName] = m.value;
            }
            if($location.search().id){
              apiMain.role.update.queryCallback(scope.source, function (data) {
                if (data && data.data) {
                  alert('保存成功');
                  $window.history.back();
                }
              });
            }else{
              apiMain.role.add.queryCallback(scope.source, function (data) {
                if (data && data.data) {
                  alert('保存成功');
                  $window.history.back();
                }
              });
            }

          }
        };
        //
        if($location.search().id){
          scope.conf.tableTitle='修改';
          apiMain.role.getById.queryCallback({
            id:$location.search().id
          },function(data){
            if(data && data.data){
              scope.source=data.data;
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];
                m.value=scope.source[m.valName];
              }
            }
          })
        }
      }
    };
  });
