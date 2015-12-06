'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:advManagePage
 * @description
 * # advManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('advManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/advertisement/advmanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '广告标题',
              valName: 'advTitle',
              width: '25%'
            }, {
              labelName: '广告提供商',
              valName: 'advMch',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '广告位置',
              valName: 'advType',
              width: '25%',
              filter: function (val, otherVal) {
                var r = '';
                if (val == 'main') {
                  r = '一元购主页';
                }
                return r;
              }
            }, {
              labelName: '广告上传时间',
              valName: 'createDate',
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
                $location.path('advAddManage').search({id:val.id});
              }//操作方法
            },
            {
              labelName: '删除',//操作名称
              doFunc: function (val,conf) {
               if(confirm('确定要删除吗?')){
                 apiMain.adv.delete.queryCallback({
                   id:val.id
                 },function(data){
                   if (data && data.data) {
                     alert('删除成功');
                     conf.doSelect();
                   }
                 });
               }
              }//操作方法
            }
          ],
          globalOperationConf:[
            {
              labelName: '添加',//操作名称
              doFunc: function (val) {
                $location.path('advAddManage');
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
            querys.status='1';//未删除
            apiMain.adv.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                self.pageSource = data.data;
              }
            });
          }
        };
      }
    };
  });
