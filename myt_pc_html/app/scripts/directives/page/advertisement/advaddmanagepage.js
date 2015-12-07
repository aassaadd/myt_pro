'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:advAddManagePage
 * @description
 * # advAddManagePage
 */
angular.module('mytPcHtmlApp')
    .directive('advAddManagePage', function (apiMain, $filter, $location,$window) {
        return {
            templateUrl: 'views/page/advertisement/advaddmanagepageview.html',
            restrict: 'AE',
            scope: {},
            link: function postLink(scope, element, attrs) {
                var ope='edit',
                    tableTitle='添加广告';
                scope.source = {
                    advTitle: '',
                    advUrl: '',
                    advType: 'main',
                    advImgId: ''

                };
                scope.conf = {
                    tableTitle: tableTitle,
                    modelConf: [
                        {
                            labelName: '广告标题',
                            valName: 'advTitle',
                            type: 'text',
                            default: '',//默认值
                            selValue: [],
                            value: scope.source.advTitle,
                            ope:ope
                        }, {
                            labelName: '链接网站',
                            valName: 'advUrl',
                            type: 'text',
                            default: '',//默认值
                            selValue: [],
                            value: scope.source.advUrl,
                            ope:ope
                        }, {
                            labelName: '广告位置',
                            valName: 'advType',
                            type: 'select',
                            default: '',//默认值
                            selValue: [
                                {
                                    value: 'main',
                                    text: '一元购商城主页'
                                }
                            ],
                            value: scope.source.advType,
                            ope:ope
                        }, {
                            labelName: '广告图片',
                            valName: 'advImgId',
                            type: 'imgUp',
                            default: '',//默认值
                            selValue: [],
                            value: scope.source.advImgId,
                            ope:ope
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
                    doSubmit: function () {
                        for (var i in scope.conf.modelConf) {
                            var m = scope.conf.modelConf[i];
                            scope.source[m.valName] = m.value;
                        }
                        if($location.search().id){
                          scope.source.id=$location.search().id;
                            apiMain.adv.update.queryCallback(scope.source, function (data) {
                                if (data && data.data) {
                                    alert('保存成功');
                                    $window.history.back();
                                }
                            });
                        }else{
                            apiMain.adv.add.queryCallback(scope.source, function (data) {
                                if (data && data.data) {
                                    alert('保存成功');
                                    $window.history.back();
                                }
                            });
                        }

                    }
                };
                //
                if($location.search().id){
                    scope.conf.tableTitle='修改广告';
                    apiMain.adv.getById.queryCallback({
                        id:$location.search().id
                    },function(data){
                        if(data && data.data){
                            scope.source=data.data;
                            for (var i in scope.conf.modelConf) {
                                var m = scope.conf.modelConf[i];
                                m.value=scope.source[m.valName];
                            }
                        }
                    })
                }

                //
            }
        };
    });
