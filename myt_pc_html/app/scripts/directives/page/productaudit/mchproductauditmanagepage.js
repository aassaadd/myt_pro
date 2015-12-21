'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:mchProductAuditManagePage
 * @description
 * # mchProductAuditManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('mchProductAuditManagePage', function (apiMain,$filter,$location) {
    return {
      templateUrl: 'views/page/productaudit/productauditmanagepageview.html',
      restrict: 'AE',
      scope:{},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '商品名称',
              valName: 'proName',
              width: '25%'
            }
            , {
              labelName: '价格',
              valName: 'proTryPrice',
              width: '25%',
              filter:function(val, otherVal){
                return val/100;
              }
            }, {
              labelName: '销量',
              valName: 'proSoldCount',
              width: '25%',
              filter:function(val, otherVal){
                var r=0;
                if(val){
                  r=val;
                }
                return r;
              }
            }, {
              labelName: '库存',
              valName: 'proCount',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '分类',
              valName: '`procName`',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '发布厂商',
              valName: 'mchName',
              width: '25%',
              filter:function(val, otherVal){
                return val;
              }
            }, {
              labelName: '审核用户申请',
              valName: 'proExamineType',
              width: '25%',
              filter:function(val, otherVal){
                var r='无需审核';
                if(val=='1'){
                  r='需申请';
                }
                return r;
              }
            }, {
              labelName: '申请开始时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd');
              }
            }, {
              labelName: '申请结束时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd');
              }
            }, {
              labelName: '更新时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd');
              }
            }, {
              labelName: '审核状态',
              valName: 'proState',
              width: '25%',
              filter:function(val, otherVal){
                //产品状态：0提交，1上架（审核成功，2上架失败（审核失败），3下架
                var r='';
                switch (val){
                  case '0':
                    r='未审核';
                    break;
                  case '1':
                    r='已通过';
                    break;
                  case '2':
                    r='未通过';
                    break;
                  case '3':
                    r='下架';
                    break;
                }
                return r;
              }
            }


          ],
          operationConf: [
            {
              labelName: '审核',//操作名称
              doFunc: function (val) {
                $location.path('productDoAuditManage').search({id:val.id});
              }//操作方法
            }
          ],
          globalOperationConf:[

          ],
          querys:[
            {
              labelName: '审核状态：',
              queryName: 'proState',
              type: 'select',//text/select/date
              default: '',//默认值
              selValue: [
                {
                  text:'未审核',
                  value:'0'
                },
                {
                  text:'已通过',
                  value:'1'
                },
                {
                  text:'未通过',
                  value:'2'
                },
                {
                  text:'下架',
                  value:'3'
                }
              ],
              value: ''
            }
          ],
          defaultButton:true,
          //multiSelect:true,
          doSelect: function () {
            var self = this,
              querys = self.super();
            var sel=function(querys){
              apiMain.product.getByPage.queryCallback(querys, function (data) {
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
