'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:userAddManagePage
 * @description
 * # userAddManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('userAddManagePage', function (apiMain, $filter, $location, $window) {
        return {
            templateUrl: 'views/page/user/useraddmanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {
                var ope = 'edit',
                    tableTitle = '添加后台编辑';
                scope.source = {
                    userName: '',
                    status: '1',
                    roleId: '',
                    useType: '1',//子账户
                    userClass: '0'//管理员

                };
                scope.conf = {
                    tableTitle: tableTitle,
                    modelConf: [
                        {
                            labelName: '登陆用户名',
                            valName: 'userName',
                            type: 'text',
                            default: '',//默认值
                            selValue: [],
                            value: scope.source.userName,
                            ope: ope
                        }, {
                            labelName: '权限分组',
                            valName: 'roleId',
                            type: 'select',
                            default: '',//默认值
                            selValue: [],
                            asyncSelValue:function(cak){
                                apiMain.role.getByPage.queryCallback({},function(data){
                                    if(data && data.data){

                                        for(var i in data.data){
                                            r.push({
                                                value:data.data[i].id,
                                                text:data.data[i].roleName
                                            })
                                            cak(r);
                                        }
                                    }
                                });
                            },
                            value: scope.source.roleId,
                            ope: ope
                        }, {
                            labelName: '账户状态',
                            valName: 'status',
                            type: 'select',
                            default: '1',//默认值
                            selValue: [
                                {
                                    value: '1',
                                    text: '有效'
                                },
                                {
                                    value: '0',
                                    text: '无效'
                                }
                            ],
                            value: scope.source.status,
                            ope: ope
                        }
                        //, {
                        //  labelName: '登陆密码',
                        //  valName: 'userPassword',
                        //  type: 'text',
                        //  default: '',//默认值
                        //  selValue: [],
                        //  value: scope.source.userPassword,
                        //  ope:ope
                        //}
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
                    doSubmit: function () {
                        for (var i in scope.conf.modelConf) {
                            var m = scope.conf.modelConf[i];
                            scope.source[m.valName] = m.value;
                        }
                        if ($location.search().id) {
                            apiMain.user.update.queryCallback(scope.source, function (data) {
                                if (data && data.data) {
                                    alert('保存成功');
                                    $window.history.back();
                                }
                            });
                        } else {
                            apiMain.user.add.queryCallback(scope.source, function (data) {
                                if (data && data.data) {
                                    alert('保存成功');
                                    $window.history.back();
                                }
                            });
                        }

                    }
                };
                //
                if ($location.search().id) {
                    scope.conf.tableTitle = '修改后台编辑';
                    scope.conf.operationConf.push(
                        {
                            labelName: '重置密码',//操作名称
                            doFunc: function (conf) {
                                alert(JSON.stringify(scope.source));
                            }//操作方法
                        }
                    );
                    apiMain.user.getById.queryCallback({
                        id: $location.search().id
                    }, function (data) {
                        if (data && data.data) {
                            scope.source = data.data;
                            for (var i in scope.conf.modelConf) {
                                var m = scope.conf.modelConf[i];
                                m.value = scope.source[m.valName];
                            }
                        }
                    })
                } else {
                    scope.source.userPassword = '',
                        scope.conf.modelConf.push({
                                labelName: '登陆密码',
                                valName: 'userPassword',
                                type: 'text',
                                default: '',//默认值
                                selValue: [],
                                value: scope.source.userPassword,
                                ope: ope
                            }
                        );
                }
            }
        };
    });
