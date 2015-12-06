'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:orderManagePage
 * @description
 * # orderManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('orderManagePage', function (apiMain,$filter) {
    return {
      templateUrl: 'views/page/product/ordermanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '订单号',
              valName: 'proName',
              width: '25%'
            }, {
              labelName: '用户昵称',
              valName: 'proDescription',
              width: '25%'
            }, {
              labelName: '手机号码',
              valName: 'proTryPrice',
              width: '25%',
              filter:function(val, otherVal){
                return val/100;
              }
            }, {
              labelName: '数量',
              valName: 'proSoldCount',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '单价',
              valName: 'proCount',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '总价',
              valName: '`procName`',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '供应厂商',
              valName: 'mchName',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '订单生成时间',
              valName: 'proExamineType',
              width: '25%',
              filter:function(val, otherVal){
                var r='无需审核';
                if(val=='1'){
                  r='需申请';
                }
                return r;
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
            {
              labelName: '用户昵称',
              queryName: 'roleName@like',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          defaultButton:false,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
                querys = self.super();
            apiMain.fdk.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                for (var i in data.data.content) {
                  data.data.content[i].procName = '加载中...';
                  data.data.content[i].mchName = '加载中...';
                  (function (val) {
                    apiMain.class.getById.queryCallback(
                        {
                          id: val.procId
                        },
                        function (data) {
                          if (data && data.data ) {

                            val.procName = data.data.procName;

                          } else {
                            val.procName = '无';

                          }


                        });
                    apiMain.mch.getById.queryCallback(
                        {
                          id: val.mchId
                        },
                        function (data) {
                          if (data && data.data ) {

                            val.mchName = data.data.mchName;
                          } else {
                            val.mchName = '无';
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
