'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:merchantManagePage
 * @description
 * # merchantManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('merchantManagePage', function (apiMain, $filter,$location) {
        return {
            templateUrl: 'views/page/merchant/merchantmanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {
                scope.conf = {
                    columnConf: [
                        {
                            labelName: '公司名称',
                            valName: 'mchName',
                            width: '12%'
                        }, {
                            labelName: '登陆用户名',
                            valName: 'userName',
                            width: '12%'
                        }, {
                            labelName: '状态',
                            valName: 'status',
                            width: '12%',
                            filter: function (val, otherVal) {
                                var r = '';
                                if (val == 1) {
                                    r = '有效';
                                } else {
                                    r = '失效';
                                }
                                return r;
                            }
                        }, {
                            labelName: '公司地址',
                            valName: 'mchAddress',
                            width: '12%'
                        }, {
                            labelName: '公司电话',
                            valName: 'mchCall',
                            width: '12%'
                        }, {
                            labelName: '公司对公账户',
                            valName: 'mchAccount',
                            width: '12%'
                        }, {
                            labelName: '主要负责人',
                            valName: 'mchPersonInCharge',
                            width: '12%'
                        }, {
                            labelName: '主要负责人电话',
                            valName: 'mchPersonInChargeCall',
                            width: '12%'
                        }


                    ],
                    operationConf: [
                        {
                            labelName: '修改',//操作名称
                            doFunc: function (val) {
                              $location.path('merchantAddManage').search({id:val.id});
                            }//操作方法
                        },
                      {
                        labelName: '冻结/解冻',//操作名称
                        doFunc: function (val,conf,cf) {
                          if(val.status=='1'){
                            if(confirm('确定要冻结吗?')){
                              apiMain.mch.delete.queryCallback({
                                id:val.id
                              },function(data){
                                if (data && data.data) {
                                  alert('冻结成功');
                                  conf.doSelect();
                                }
                              });
                            }
                          }else{
                            if(confirm('确定要解冻吗?')){
                              apiMain.mch.update.queryCallback({
                                id:val.id,
                                status:'1'
                              },function(data){
                                if (data && data.data) {
                                  alert('解冻成功');
                                  conf.doSelect();
                                }
                              });
                            }
                          }

                        }//操作方法
                      }
                    ],
                    globalOperationConf: [
                      {
                        labelName: '添加',//操作名称
                        doFunc: function (val,conf) {
                          $location.path('merchantAddManage');
                        }//操作方法
                      },
                      {
                        labelName: '批量解冻',//操作名称
                        doFunc: function (val,conf) {
                          if(confirm('确定要解冻吗?')){
                            var func=[];
                            for(var i in val){
                              func.push((function(v){
                                return function(call){
                                  apiMain.mch.update.queryCallback({
                                    id:v.id,
                                    status:'1'
                                  },function(data){
                                    if (data && data.data) {
                                      call(null,data.data);
                                    }else{
                                      call(data,null);
                                    }
                                  });
                                }

                              })(val[i]))
                            }
                            async.parallel(func,function(err,rest){
                              if(!err){
                                alert('解冻成功');
                                conf.doSelect();
                              }

                            });


                          }
                        }//操作方法
                      },
                      {
                        labelName: '批量冻结',//操作名称
                        doFunc: function (val,conf) {
                          if(confirm('确定要冻结吗?')){
                            var func=[];
                            for(var i in val){
                              func.push((function(v){
                                return function(call){
                                  apiMain.mch.delete.queryCallback({
                                    id:v.id
                                  },function(data){
                                    if (data && data.data) {
                                      call(null,data.data);
                                    }else{
                                      call(data,null);
                                    }
                                  });
                                }

                              })(val[i]))
                            }
                            async.parallel(func,function(err,rest){
                              if(!err){
                                alert('冻结成功');
                                conf.doSelect();
                              }

                            });


                          }
                        }//操作方法
                      }
                    ],
                    querys: [
                        {
                            labelName: '公司名称：',
                            queryName: 'mchName',
                            type: 'text',//text/select/date
                            default: '',//默认值
                            selValue: [],
                            value: ''
                        }
                    ],
                    defaultButton: true,
                    multiSelect:true,
                    doSelect: function () {
                        var self = this,
                            querys = self.super();
                        apiMain.mch.getByPage.queryCallback(querys, function (data) {
                            if (data && data.data) {
                                for (var i in data.data.content) {
                                    data.data.content[i].userName = '加载中...';
                                    (function (val) {
                                        apiMain.user.getByPage.queryCallback(
                                            {
                                                partentId: val.id,
                                                userClass: '1',
                                                usetType: '0',
                                                page: 1,
                                                pageSize: 1
                                            },
                                            function (data) {
                                                if (data && data.data && data.data.content.length > 0) {

                                                    val.userName = data.data.content[0].userName;
                                                } else {
                                                    val.userName = '无';
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
