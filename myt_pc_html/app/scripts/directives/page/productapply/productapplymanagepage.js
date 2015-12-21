'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:productApplyManagePage
 * @description
 * # productApplyManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('productApplyManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/productapply/productapplymanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '用户昵称',
              valName: 'userNickname',
              width: '25%'
            }
            , {
              labelName: '用户手机号码',
              valName: 'userCall',
              width: '25%',
              filter: function (val, otherVal) {
                return val / 100;
              }
            }, {
              labelName: '审核状态',
              valName: 'state',
              width: '25%',
              filter: function (val, otherVal) {
                //0提交，1审核通过，2审核失败
                var r = '';
                switch (val) {
                  case '0':
                    r = '未审核';
                    break;
                  case '1':
                    r = '审核通过';
                    break;
                  case '2':
                    r = '审核失败';
                    break;
                }
                return r;
              }

            }



          ],
          operationConf: [
            {
              labelName: '审核通过',//操作名称
              doFunc: function (val,conf) {
                if(confirm('确定要审核通过吗?')){
                  apiMain.productApply.update.queryCallback({
                    id:val.id,
                    state:'1'
                  },function(data){
                    conf.doSelect();

                  });
                }

              }//操作方法
            },
            {
              labelName: '用户申请问卷',//操作名称
              doFunc: function (val) {
                $location.path('questionnaireFillViewManage').search({id:val.qufId});
              }//操作方法
            }

          ],
          globalOperationConf:[

          ],
          querys:[

          ],
          defaultButton:true,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
              querys = self.super();
            apiMain.productApply.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                for (var i in data.data.content) {
                  data.data.content[i].userCall = '加载中...';
                  data.data.content[i].userNickname = '加载中...';
                  (function (val) {
                    apiMain.wxUser.getById.queryCallback(
                      {
                        id: val.wxUserId
                      },
                      function (data) {
                        if (data && data.data ) {

                          val.userNickname = data.data.userNickname;
                          val.userCall = data.data.userCall;

                        } else {
                          val.userNickname = '无';
                          val.userCall = '无';

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
