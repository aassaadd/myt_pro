'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:mchOrderManagePage
 * @description
 * # mchOrderManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('mchOrderManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/order/ordermanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '订单号',
              valName: 'orderNo',
              width: '25%'
            }, {
              labelName: '用户昵称',
              valName: 'userNickname',
              width: '25%'
            }, {
              labelName: '手机号码',
              valName: 'userCall',
              width: '25%'
            }, {
              labelName: '订单商品',
              valName: 'proName',
              width: '25%'
            }, {
              labelName: '数量',
              valName: 'orderGoodsNum',
              width: '25%'
            }, {
              labelName: '单价',
              valName: 'proOneFee',
              width: '25%',
              filter:function(val, otherVal){
                return val/100;
              }
            }, {
              labelName: '总价',
              valName: 'orderRealityFee',
              width: '25%',
              filter:function(val, otherVal){
                return val/100;
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
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }

            }, {
              labelName: '订单状态',
              valName: 'orderStatus',
              width: '25%',
              filter:function(val, otherVal){
                var r='';
                switch (val){
                  case 'S':
                    r='待付款';
                    break;
                  case '0':
                    r='预订单';
                    break;
                  case '1':
                    r='订单支付成功';
                    break;
                  case '2':
                    r='订单失败';
                    break;
                  case 'W':
                    r='待收货';
                    break;
                  case '3':
                    r='确认收货';
                    break;
                  case '4':
                    r='转入退款';
                    break;
                  case '5':
                    r='关闭订单';
                    break;
                  case '6':
                    r='撤销订单';
                    break;
                  case 'E':
                    r='已完成';
                    break;
                }

                return r;
              }

            }


          ],
          operationConf: [
            {
              labelName: '操作',//操作名称
              doFunc: function (val) {
                $location.path('orderEditManage').search({id: val.id});;
              }//操作方法
            }
          ],
          globalOperationConf:[

          ],
          querys:[
            {
              labelName: '用户昵称',
              queryName: 'userNickname@like',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          defaultButton:true,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
              querys = self.super();
            var sel=function(querys){
              apiMain.order.getByPage.queryCallback(querys, function (data) {
                if (data && data.data) {
                  for (var i in data.data.content) {
                    data.data.content[i].mchName = '加载中...';
                    data.data.content[i].userNickname = '加载中...';
                    data.data.content[i].userCall = '加载中...';

                    (function (val) {
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
                      apiMain.wxUser.getById.queryCallback(
                        {
                          id: val.wxUserId
                        },
                        function (data) {
                          if (data && data.data ) {
                            val.userNickname = data.data.userNickname;
                            val.userCall=data.data.userCall;
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
            if (!scope.user) {
              apiMain.user.getById.queryCallback({
                id: 0
              }, function (data) {
                if (data && data.data) {
                  scope.user = data.data;
                  querys.mchId = scope.user.partentId;
                  sel(querys);
                }
              });
            } else {
              querys.mchId = scope.user.partentId;
              sel(querys);
            }

          }
        };
      }
    };
  });
