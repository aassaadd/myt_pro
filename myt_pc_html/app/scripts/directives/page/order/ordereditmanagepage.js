'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:orderEditManagePage
 * @description
 * # orderEditManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('orderEditManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/order/ordereditmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'view',
          tableTitle = '订单';
        scope.source = {
          orderNo: '',
          userNickname: '',
          userCall: '',
          proName: '',
          orderGoodsNum:'',
          proOneFee: '',
          orderRealityFee: '',
          mchName: '',
          createDate: '',
          orderStatus: ''

        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '订单号',
              valName: 'orderNo',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.orderNo,
              ope: ope
            }, {
              labelName: '用户昵称',
              valName: 'userNickname',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.userNickname,
              ope: ope
            }, {
              labelName: '手机号码',
              valName: 'userCall',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.userCall,
              ope: ope
            }, {
              labelName: '订单商品',
              valName: 'proName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.proName,
              ope: ope
            }, {
              labelName: '数量',
              valName: 'orderGoodsNum',
              type: 'number',
              default: '',//默认值
              selValue: [],
              value: scope.source.orderGoodsNum,
              ope: ope
            },  {
              labelName: '单价',
              valName: 'proOneFee',
              type: 'amount',
              default: '',//默认值
              selValue: [],
              value: scope.source.proOneFee,
              ope: ope
            },  {
              labelName: '总价',
              valName: 'orderRealityFee',
              type: 'amount',
              default: '',//默认值
              selValue: [],
              value: scope.source.orderRealityFee,
              ope: ope
            },{
              labelName: '供应厂商',
              valName: 'mchName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchName,
              ope: ope
            }, {
              labelName: '订单生成时间',
              valName: 'createDate',
              type: 'date',
              default: '',//默认值
              selValue: [],
              value: scope.source.createDate,
              ope: ope
            }, {
              labelName: '订单状态',
              valName: 'orderStatus',
              type: 'select',
              default: '',//默认值
              selValue: [
                {
                  text:'待付款',
                  value:'S'
                }, {
                  text:'预订单',
                  value:'0'
                }, {
                  text:'订单支付成功',
                  value:'1'
                }, {
                  text:'订单失败',
                  value:'2'
                }, {
                  text:'待收货',
                  value:'W'
                }, {
                  text:'确认收货',
                  value:'3'
                }, {
                  text:'转入退款',
                  value:'4'
                }, {
                  text:'关闭订单',
                  value:'5'
                }, {
                  text:'撤销订单',
                  value:'6'
                }, {
                  text:'已完成',
                  value:'E'
                }
              ],
              value: scope.source.orderStatus,
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
          defaultButton:false,
          doSubmit: function () {


          }
        };
        //
        if ($location.search().id) {
          apiMain.order.getById.queryCallback({
            id: $location.search().id
          }, function (data) {
            if (data && data.data) {
              //判断状态正价按钮
              if(data.data.orderStatus=='1'){
                //支付状态
                scope.conf.operationConf.push({
                    labelName: '确认发货',//操作名称
                    doFunc: function (conf) {
                      if (confirm('确定发货吗?')) {
                        apiMain.order.update.queryCallback({
                          id:scope.source.id,
                          orderStatus:'3'
                        },function(da){
                          if(da && da.data){
                            alert('操作成功');
                            $window.history.back();
                          }
                        });
                      }
                    }//操作方法
                });
              }
              if(data.data.orderStatus=='3'){
                //支付状态
                scope.conf.operationConf.push({
                  labelName: '确认退回',//操作名称
                  doFunc: function (conf) {
                    if (confirm('确定退回吗?')) {
                      apiMain.order.update.queryCallback({
                        id:scope.source.id,
                        orderStatus:'E'
                      },function(da){
                        if(da && da.data){
                          alert('操作成功');
                          $window.history.back();
                        }
                      });
                    }
                  }//操作方法
                });
              }
              if(data.data.orderStatus=='E') {
                scope.conf.operationConf.push({
                  labelName: '关闭订单',//操作名称
                  doFunc: function (conf) {
                    if (confirm('确定关闭吗?')) {
                      apiMain.order.update.queryCallback({
                        id: scope.source.id,
                        orderStatus: '5'
                      }, function (da) {
                        if (da && da.data) {
                          alert('操作成功');
                          $window.history.back();
                        }
                      });
                    }
                  }//操作方法
                });
              }
              //------
              scope.source = data.data;
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];

                switch (m.valName) {
                  case 'mchName':
                    (function(val,m){
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
                          m.value = val.mchName;
                        });
                    })(scope.source,m);

                    break;
                  case 'userNickname':
                    (function(val,m){
                      apiMain.wxUser.getById.queryCallback(
                        {
                          id: val.wxUserId
                        },
                        function (data) {
                          if (data && data.data ) {

                            val.userNickname = data.data.userNickname;
                          } else {
                            val.userNickname = '无';
                          }
                          m.value = val.userNickname;
                        });
                    })(scope.source,m);
                    break;
                  case 'userCall':
                    (function(val,m){
                      apiMain.wxUser.getById.queryCallback(
                        {
                          id: val.wxUserId
                        },
                        function (data) {
                          if (data && data.data ) {

                            val.userNickname = data.data.userNickname;
                          } else {
                            val.userNickname = '无';
                          }
                          m.value = val.userNickname;
                        });
                    })(scope.source,m);
                    break;
                  default :
                    m.value = scope.source[m.valName];
                    break;
                }

              };
              //
            }
          })
        }

      }
    };
  });
