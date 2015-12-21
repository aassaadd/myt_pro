'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:classAddManagePage
 * @description
 * # classAddManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('classAddManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/class/classaddmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'edit',
          tableTitle = '添加分类';
        scope.source = {
          procName: '',
          procDescription: ''


        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '分类名称',
              valName: 'procName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.procName,
              ope: $location.search().id ? 'view' : 'edit'
            }, {
              labelName: '分类描述',
              valName: 'procDescription',
              type: 'textarea',
              maxlength: 50,
              default: '',//默认值
              selValue: [],
              value: scope.source.procDescription,
              ope: $location.search().id ? 'view' : 'edit'
            }],
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
              scope.source.id=$location.search().id;
              apiMain.class.update.queryCallback(scope.source, function (data) {
                if (data && data.data) {
                  alert('保存成功');
                  $window.history.back();
                }
              });
            }else{
              apiMain.class.add.queryCallback(scope.source, function (data) {
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
          scope.conf.tableTitle='修改分类';
          apiMain.class.getById.queryCallback({
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
