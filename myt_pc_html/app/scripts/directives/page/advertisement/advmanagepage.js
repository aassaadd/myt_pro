'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:advManagePage
 * @description
 * # advManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('advManagePage', function (apiMain,$filter) {
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
              labelName: '查看',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
              }//操作方法
            }
          ],
          globalOperationConf:[
            {
              labelName: '添加',//操作名称
              doFunc: function (val) {
                alert(JSON.stringify(val));
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
