'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:productAddManagePage
 * @description
 * # productAddManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('productAddManagePage', function (apiMain, $filter, $location) {
        return {
            templateUrl: 'views/page/product/productaddmanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {
                scope.source = {
                    proNo: '',
                    proName: '',
                    proTryPrice: '',
                    proCount: '',
                    proOpenDate: '',
                    proEndDate: '',
                    proType: '',
                    proExamineType: '',
                    proDescription:''

                };
                scope.conf = {
                    tableTitle:'添加产品',
                    modelConf: [
                        {
                            labelName: '商品编号',
                            valName: 'proNo',
                            type: 'text',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proNo
                        }, {
                            labelName: '商品标题',
                            valName: 'proName',
                            type: 'text',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proName
                        }, {
                            labelName: '价格',
                            valName: 'proTryPrice',
                            type: 'amount',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proTryPrice
                        }, {
                            labelName: '数量',
                            valName: 'proCount',
                            type: 'number',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proCount
                        }, {
                            labelName: '申请开放日期',
                            valName: 'proOpenDate',
                            type: 'date',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proOpenDate
                        }, {
                            labelName: '申请截止日期',
                            valName: 'proEndDate',
                            type: 'date',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proEndDate
                        }, {
                            labelName: '可重复申请',
                            valName: 'proType',
                            type: 'radio',//text/select/date/amount/date/checkbox/radio
                            default: '',//默认值
                            selValue: [
                                {
                                    value: '1',
                                    text: '是'
                                }, {
                                    value: '0',
                                    text: '否'
                                }

                            ],
                            value:scope.source.proType
                        }, {
                            labelName: '是否审核用户申请',
                            valName: 'proExamineType',
                            type: 'radio',//text/select/date/amount/date/checkbox/radio
                            default: '',//默认值
                            selValue: [
                                {
                                    value: '1',
                                    text: '是'
                                }, {
                                    value: '0',
                                    text: '否'
                                }

                            ],
                            value:scope.source.proExamineType
                        }, {
                            labelName: '商品描述',
                            valName: 'proDescription',
                            type: 'kindeditor',
                            default: '',//默认值
                            selValue: [],
                            value:scope.source.proDescription
                        }
                        //, {
                        //    labelName: '组织图标',
                        //    valName: 'thumbnailUrl',
                        //    type: 'ico',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
                        //}, {
                        //    labelName: '联系人',
                        //    valName: 'linkMan',
                        //    type: 'text',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
                        //}, {
                        //    labelName: '联系电话',
                        //    valName: 'tel',
                        //    type: 'text',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
                        //}, {
                        //    labelName: '联系邮箱',
                        //    valName: 'email',
                        //    type: 'text',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
                        //}, {
                        //    labelName: '组织介绍',
                        //    valName: 'description',
                        //    type: 'textarea',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
                        //}, {
                        //    labelName: '组织网页',
                        //    valName: 'orgUrl',
                        //    type: 'text',//text/select/date/label
                        //    default: '',//默认值
                        //    selValue: []
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
                    doSubmit:function(){
                        for(var i in scope.conf.modelConf){
                            var m = scope.conf.modelConf[i];
                            scope.source[m.valName] = m.value;
                        }
                        alert(JSON.stringify(scope.source));
                    }
                };
                (function () {
                    //if ($location.search().id) {
                    //    apiMain.product.getById.queryCallback(
                    //        {
                    //            id: $location.search().id
                    //        },
                    //        function (data) {
                    //            if (data && data.data) {
                    //
                    //                scope.conf.pageSource=data.data;
                    //            }
                    //
                    //        });
                    //}

                })()
            }
        };
    });
