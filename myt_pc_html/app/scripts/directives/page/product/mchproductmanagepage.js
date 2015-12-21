'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:mchProductManagePage
 * @description
 * # mchProductManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('mchProductManagePage', function (apiMain, $filter, $location) {
    return {
      templateUrl: 'views/page/product/productmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '商品名称',
              valName: 'proName',
              width: '25%'
            }, {
              labelName: '商品描述',
              valName: 'proDescription',
              width: '25%'
            }, {
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
                return val;
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
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '申请结束时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '更新时间',
              valName: 'createDate',
              width: '25%',
              filter:function(val, otherVal){
                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
              }
            }, {
              labelName: '商品状态',
              valName: 'proState',
              width: '25%',
              filter:function(val, otherVal){
                //产品状态：0提交，1上架（审核成功，2上架失败（审核失败），3下架
                var r='';
                switch (val){
                  case '0':
                    r='提交';
                    break;
                  case '1':
                    r='上架';
                    break;
                  case '2':
                    r='上架失败';
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
              labelName: '修改',//操作名称
              doFunc: function (val) {
                $location.path('productAddManage').search({id: val.id});
              }//操作方法
            }
          ],
          globalOperationConf: [
            {
              labelName: '添加',//操作名称
              doFunc: function (val) {
                $location.path('productAddManage');
              }//操作方法
            },
            {
              labelName: '用户申请列表',//操作名称
              doFunc: function (val) {
                if(val && val.length==1){
                  $location.path('productApplyManage');
                }else{
                  alert('请选择一个商品');
                }


              }//操作方法
            }
          ],
          querys: [],
          defaultButton: false,
          multiSelect: true,
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
                          if (data && data.data) {

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
                          if (data && data.data) {

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
            };
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
