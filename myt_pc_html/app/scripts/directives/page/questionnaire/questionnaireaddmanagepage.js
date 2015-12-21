'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:questionnaireAddManagePage
 * @description
 * # questionnaireAddManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('questionnaireAddManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/questionnaire/questionnaireaddmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'edit',
          tableTitle = '添加问卷';
        scope.source = {
          quName: '',
          quType: '1',
          proId: '',
          proNo: '',
          quDescription: '',
          quJson: []
        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '问卷名称',
              valName: 'quName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.quName,
              ope: ope
            }, {
              labelName: '问卷类型',
              valName: 'quType',
              type: 'select',
              default: '1',//默认值
              selValue: [
                {
                  text: '试用申请问卷',
                  value: '1'
                },
                {
                  text: '反馈问卷',
                  value: '2'
                }
              ],
              value: scope.source.quType,
              ope: ope
            }, {
              labelName: '关联商品',
              valName: 'proNo',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.proNo,
              ope: ope
            }, {
              labelName: '描述',
              valName: 'quDescription',
              type: 'textarea',
              default: '',//默认值
              selValue: [],
              value: scope.source.quDescription,
              ope: ope
            }, {
              labelName: '问题配置',
              valName: 'quJson',
              type: 'other',
              directive: 'questionnaireJsonDirective',
              default: '',//默认值
              selValue: [],
              value: scope.source.quJson,
              ope: ope
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
            var source={};
            for (var i in scope.conf.modelConf) {
              var m = scope.conf.modelConf[i];
              scope.source[m.valName] = m.value;
              source[m.valName] = m.value;
            }
            if ($location.search().id) {
              source.id=$location.search().id;
              apiMain.product.getByPage.queryCallback({
                proNo: scope.source.proNo
              }, function (data) {
                if (data && data.data && data.data.length == 1) {
                  scope.source.proId = data.data[0].id
                  source.proId = data.data[0].id
                  scope.source.proNo=data.data[0].proNo;
                  source.proNo=data.data[0].proNo;

                }
                source.quJson=JSON.stringify(source.quJson);
                apiMain.qu.update.queryCallback(source, function (data) {
                  if (data && data.data) {
                    alert('保存成功');
                    $window.history.back();
                  }
                });
              });

            } else {
              apiMain.product.getByPage.queryCallback({
                proNo: scope.source.proNo
              }, function (data) {
                if (data && data.data && data.data.length == 1) {
                  scope.source.proId = data.data[0].id
                  source.proId = data.data[0].id
                  scope.source.proNo=data.data[0].proNo;
                  source.proNo=data.data[0].proNo;
                }
                source.quJson=JSON.stringify(source.quJson);
                apiMain.qu.add.queryCallback(source, function (data) {
                  if (data && data.data) {
                    alert('保存成功');
                    $window.history.back();
                  }
                });
              });

            }

          }
        };
        //
        if($location.search().id){
          scope.conf.tableTitle='修改问卷';
          apiMain.qu.getById.queryCallback({
            id:$location.search().id
          },function(data){
            if(data && data.data){
              scope.source=data.data;
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];
                if(m.valName=='quJson'){
                  scope.source[m.valName]=JSON.parse(scope.source[m.valName]);
                }
                m.value=scope.source[m.valName];
              }
            }
          })
        }

        //
      }
    };
  });
