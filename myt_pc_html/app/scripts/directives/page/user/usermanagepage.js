'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:userManagePage
 * @description
 * # userManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('userManagePage', function (apiMain, $filter, $location) {
        return {
            templateUrl: 'views/page/user/usermanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {
                scope.conf = {
                    columnConf: [
                        {
                            labelName: '登陆用户名',
                            valName: 'userName',
                            width: '25%'
                        }, {
                            labelName: '权限分组',
                            valName: 'roleName',
                            width: '25%'
                        }, {
                            labelName: '账户状态',
                            valName: 'status',
                            width: '25%',
                            filter: function (val, otherVal) {
                                var r = '';
                                if (val == 1) {
                                    r = '有效';
                                } else {
                                    r = '无效';
                                }
                                return r;
                            }
                        }, {
                            labelName: '最后一次登陆时间',
                            valName: 'lastLoginTime',
                            width: '25%',
                            filter: function (val, otherVal) {
                                return $filter('date')(new Date(val), 'yyyy-MM-dd HH:mm:ss');
                            }
                        }


                    ],
                    operationConf: [
                        {
                            labelName: '修改',//操作名称
                            doFunc: function (val) {
                                $location.path('userAddManage').search({id: val.id});
                            }//操作方法
                        }
                    ],
                    globalOperationConf: [
                        {
                            labelName: '添加',//操作名称
                            doFunc: function (val) {
                                $location.path('userAddManage');
                            }//操作方法
                        }, {
                            labelName: '停用',//操作名称
                            doFunc: function (val) {
                                alert(JSON.stringify(val));
                            }//操作方法
                        }, {
                            labelName: '启动',//操作名称
                            doFunc: function (val) {
                                alert(JSON.stringify(val));
                            }//操作方法
                        }
                    ],
                    querys: [
                        {
                            labelName: '登陆用户名',
                            queryName: 'userName@like',
                            type: 'text',//text/select/date
                            default: '',//默认值
                            selValue: [],
                            value: ''
                        }
                    ],
                    //defaultButton:false,
                    multiSelect: true,
                    doSelect: function () {
                        var self = this,
                            querys = self.super();
                        apiMain.user.getByPage.queryCallback(querys, function (data) {
                            if (data && data.data) {

                                for (var i in data.data.content) {
                                    data.data.content[i].lastLoginTime = '加载中...';
                                    data.data.content[i].role = '加载中...';
                                    (function (val) {
                                        apiMain.loginLog.getByPage.queryCallback({
                                            userName: val.userName,
                                            page: 1,
                                            pageSize: 1
                                        }, function (data) {
                                            if (data && data.data && data.data.content.length > 0) {

                                                val.lastLoginTime = $filter('date')(new Date(data.data.content[0].createDate), 'yyyy-MM-dd HH:mm:ss');
                                            } else {
                                                val.lastLoginTime = '无登陆信息';
                                            }


                                        });
                                        apiMain.role.getById.queryCallback({
                                            id: val.roleId
                                        }, function (data) {
                                            if (data && data.data ) {

                                                val.roleName = data.data.roleName;
                                            } else {
                                                val.roleName = '无';
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
