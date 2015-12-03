'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:merchantManagePage
 * @description
 * # merchantManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('merchantManagePage', function (apiMain, $filter) {
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
                            width: '12%',
                            filter: function (val) {
                                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
                            }
                        }, {
                            labelName: '主要负责人电话',
                            valName: 'mchPersonInChargeCall',
                            width: '12%',
                            filter: function (val) {
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
                    globalOperationConf: [
                        //{
                        //    labelName: '测试',//操作名称
                        //    doFunc: function (val) {
                        //        alert(JSON.stringify(val));
                        //    }//操作方法
                        //}
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
                    //multiSelect:true,
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
