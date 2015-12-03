'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:loginLogMessagePage
 * @description
 * # loginLogMessagePage
 */
angular.module('mytPcHtmlApp')
    .directive('loginLogManagePage', function (apiMain, $filter) {
        return {
            templateUrl: 'views/page/loginlog/loginlogmanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {

                scope.conf = {
                    tableTitle: '列表',
                    columnConf: [
                        {
                            labelName: '帐号',
                            valName: 'userName',
                            width: '17%'
                        }, {
                            labelName: '登陆状态',
                            valName: 'type',
                            width: '17%',
                            filter: function (val, otherVal) {
                                var r = '';
                                if (val == 1) {
                                    r = '登陆成功';
                                } else {
                                    r = '登陆失败';
                                }
                                return r;
                            }
                        }, {
                            labelName: 'IP地址',
                            valName: 'clientIp',
                            width: '17%'
                        }, {
                            labelName: '浏览器名称',
                            valName: 'explorerName',
                            width: '17%'
                        }, {
                            labelName: '浏览器版本',
                            valName: 'explorerVer',
                            width: '17%'
                        }, {
                            labelName: '操作系统',
                            valName: 'osName',
                            width: '17%'
                        }, {
                            labelName: '登陆时间',
                            valName: 'createDate',
                            width: '17%',
                            filter: function (val) {
                                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
                            }
                        }


                    ],
                    operationConf: [
                        //{
                        //    labelName: '查看',//操作名称
                        //    doFunc: function (val) {
                        //        alert(JSON.stringify(val));
                        //    }//操作方法
                        //},
                    ],
                    globalOperationConf:[
                        //{
                        //    labelName: '测试',//操作名称
                        //    doFunc: function (val) {
                        //        alert(JSON.stringify(val));
                        //    }//操作方法
                        //}
                    ],
                    querys:[
                        //{
                        //  labelName: '帐号：',
                        //  queryName: 'userName',
                        //  type: 'text',//text/select/date
                        //  default: '',//默认值
                        //  selValue: [],
                        //  value: ''
                        //}
                    ],
                    defaultButton:false,
                    //multiSelect:true,
                    doSelect: function () {
                        var self = this,
                            querys = self.super();
                        apiMain.loginLog.getByPage.queryCallback(querys, function (data) {
                            if (data && data.data) {
                                self.pageSource = data.data;
                            }
                        });
                    }
                };
            }
        };
    });
