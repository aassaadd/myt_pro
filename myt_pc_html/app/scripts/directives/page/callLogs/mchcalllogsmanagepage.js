'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:mchCallLogsManagePage
 * @description
 * # mchCallLogsManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('mchCallLogsManagePage', function (apiMain,$filter,global) {
    return {
      templateUrl: 'views/page/callLogs/calllogsmanagepageview.html',
      restrict: 'AE',
      scope: {
      },
      link: function postLink(scope, element, attrs) {
        scope.user=undefined;
        scope.conf = {
          columnConf: [
            {
              labelName: '客服工号',
              valName: 'cslNo',
              width: '25%'
            }, {
              labelName: '接听时间',
              valName: 'upDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '问题严重程度',
              valName: 'cslClass',
              width: '25%',
              filter:function(val, otherVal){
                //1一般，2较小问题，3严重，4非常严重
                var r='';
                switch (val){
                  case '1':
                    r='一般'
                    break;
                  case '2':
                    r='较小问题';
                    break;
                  case '3':
                    r='严重';
                    break;
                  case '4':
                    r='非常严重';
                    break;
                };
                return r;
              }
            }, {
              labelName: '接听用户',
              valName: 'cslUserName',
              width: '25%'
            }, {
              labelName: '手机号',
              valName: 'cslUserCall',
              width: '25%'
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
            {
              labelName: '客服工号',
              queryName: 'cslNo',
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
            if(!scope.user){
              apiMain.user.getById.queryCallback({
                id:0
              },function(data){
                if(data && data.data){
                  scope.user=data.data;
                  querys.mchId=scope.user.partentId;
                  apiMain.csl.getByPage.queryCallback(querys, function (data) {
                    if (data && data.data) {
                      self.pageSource = data.data;
                    }
                  });
                }
              });
            }else{
              querys.mchId=scope.user.partentId;
              apiMain.csl.getByPage.queryCallback(querys, function (data) {
                if (data && data.data) {
                  self.pageSource = data.data;
                }
              });
            }


          }
        };
      }
    };
  });
