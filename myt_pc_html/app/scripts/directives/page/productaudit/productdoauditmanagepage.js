'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:productDoAuditManagePage
 * @description
 * # productDoAuditManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('productDoAuditManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/productaudit/productdoauditmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'view',
          tableTitle = '审核产品';
        scope.source = {
          proNo: '',
          proName: '',
          proTryPrice: '',
          proCount: '',
          videoUrl:'',
          proOpenDate: '',
          proEndDate: '',
          proType: '',
          proExamineType: '',
          proDescription: '',
          proState: '0',
          imgId:'',
          proAuditAbout:''


        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '商品编号',
              valName: 'proNo',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.proNo,
              ope: ope
            }, {
              labelName: '商品标题',
              valName: 'proName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.proName,
              ope: ope
            }, {
              labelName: '价格',
              valName: 'proTryPrice',
              type: 'amount',
              default: '',//默认值
              selValue: [],
              value: scope.source.proTryPrice,
              ope: ope
            }, {
              labelName: '数量',
              valName: 'proCount',
              type: 'number',
              default: '',//默认值
              selValue: [],
              value: scope.source.proCount,
              ope: ope
            }, {
              labelName: '视频地址',
              valName: 'videoUrl',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.videoUrl,
              ope: ope
            }, {
              labelName: '申请开放日期',
              valName: 'proOpenDate',
              type: 'date',
              default: '',//默认值
              selValue: [],
              value: scope.source.proOpenDate,
              ope: ope
            }, {
              labelName: '申请截止日期',
              valName: 'proEndDate',
              type: 'date',
              default: '',//默认值
              selValue: [],
              value: scope.source.proEndDate,
              ope: ope
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
              value: scope.source.proType,
              ope: ope
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
              value: scope.source.proExamineType,
              ope: ope
            }, {
              labelName: '商品描述',
              valName: 'proDescription',
              type: 'kindeditor',
              default: '',//默认值
              selValue: [],
              value: scope.source.proDescription,
              ope: ope
            }, {
              labelName: '商户',
              valName: 'mchId',
              type: 'select',
              default: '',//默认值
              selValue: [],
              asyncSelValue: function (cak) {
                apiMain.mch.getByPage.queryCallback({}, function (data) {
                  if (data && data.data) {
                    var r = [];
                    for (var i in data.data) {
                      r.push({
                        value: data.data[i].id,
                        text: data.data[i].mchName
                      })

                    }
                    cak(r);
                  }
                });
              },
              value: scope.source.roleId,
              ope: ope
            }, {
              labelName: '分类',
              valName: 'procId',
              type: 'select',
              default: '',//默认值
              selValue: [],
              asyncSelValue: function (cak) {
                apiMain.class.getByPage.queryCallback({
                  status:'1'
                }, function (data) {
                  if (data && data.data) {
                    var r = [];
                    for (var i in data.data) {
                      r.push({
                        value: data.data[i].id,
                        text: data.data[i].procName
                      })

                    }
                    cak(r);
                  }
                });
              },
              value: scope.source.roleId,
              ope: ope
            }, {
              labelName: '首页图片',
              valName: 'imgId',
              type: 'imgUp',
              default: '',//默认值
              selValue: [],
              value: scope.source.imgId,
              ope: ope
            }, {
              labelName: '图片1',
              valName: 'img1Id',
              type: 'imgUp',
              default: '',//默认值
              selValue: [],
              value: scope.source.imgId,
              ope: ope
            }, {
              labelName: '图片2',
              valName: 'img2Id',
              type: 'imgUp',
              default: '',//默认值
              selValue: [],
              value: scope.source.imgId,
              ope: ope
            }, {
              labelName: '图片3',
              valName: 'img3Id',
              type: 'imgUp',
              default: '',//默认值
              selValue: [],
              value: scope.source.imgId,
              ope: ope
            }, {
              labelName: '图片4',
              valName: 'img4Id',
              type: 'imgUp',
              default: '',//默认值
              selValue: [],
              value: scope.source.imgId,
              ope: ope
            }, {
              labelName: '审核状态',
              valName: 'proState',
              type: 'select',
              default: '1',//默认值
              selValue: [
                {
                  text:'通过',
                  value:'1'
                },
                {
                  text:'未通过',
                  value:'2'
                }
              ],
              value: scope.source.proState,
              ope: 'edit'
            }, {
              labelName: '审核意见',
              valName: 'proAuditAbout',
              type: 'textarea',
              default: '',//默认值
              selValue: [
              ],
              value: scope.source.proAbout,
              ope: 'edit'
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
            var source = {};
            for (var i in scope.conf.modelConf) {
              var m = scope.conf.modelConf[i];
              scope.source[m.valName] = m.value;
              switch (m.valName) {
                case 'proState':
                case 'proAuditAbout':
                  source[m.valName] = m.value;
                  break;
              }

            }
            if ($location.search().id) {
              scope.source.id = $location.search().id;
              source.id = $location.search().id;
              apiMain.product.update.queryCallback(source, function (data) {
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
          scope.conf.tableTitle = '审核产品';
          apiMain.product.getById.queryCallback({
            id: $location.search().id
          }, function (data) {
            if (data && data.data) {
              scope.source = data.data;
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];

                switch (m.valName) {
                  case 'proOpenDate':

                    m.value = $filter('date')(new Date(scope.source[m.valName]), 'yyyy-MM-dd');
                    break;
                  case 'proEndDate':
                    m.value = $filter('date')(new Date(scope.source[m.valName]), 'yyyy-MM-dd');
                    break;
                  default :
                    m.value = scope.source[m.valName];
                    break;
                }

              }
            }
          })
        }

        //
      }
    };
  });
