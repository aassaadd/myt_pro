'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:fdkManagePage
 * @description
 * # fdkManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('fdkManagePage', function (apiMain,$filter) {
    return {
      templateUrl: 'views/page/feedback/fdkmanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '用户昵称',
              valName: 'wxUserName',
              width: '25%'
            }, {
              labelName: '手机号',
              valName: 'wxUserCall',
              width: '25%'
            }, {
              labelName: '反馈内容',
              valName: 'fbkContent',
              width: '25%',
              filter:function(val, otherVal){
                var r=val;
                if(val){
                  if(val.length>15){
                    r=val.substr(0,15)+'...';
                  }
                }
                return r
              }
            }, {
              labelName: '问题严重程度',
              valName: 'cslUserName',
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
              labelName: '上传时间',
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

          ],
          querys:[

          ],
          defaultButton:false,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.fdk.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                for (var i in data.data.content) {
                  data.data.content[i].wxUserName = '加载中...';
                  data.data.content[i].wxUserCall = '加载中...';
                  (function (val) {
                    apiMain.wxUser.getById.queryCallback(
                        {
                          id: val.wxUserId
                        },
                        function (data) {
                          if (data && data.data ) {

                            val.wxUserName = data.data.userNickname;
                            val.wxUserCall = data.data.userCall;
                          } else {
                            val.wxUserName = '无';
                            val.wxUserCall = '无';
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
