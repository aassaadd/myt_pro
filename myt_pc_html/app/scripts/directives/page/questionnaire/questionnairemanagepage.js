'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:questionnaireManagePage
 * @description
 * # questionnaireManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('questionnaireManagePage', function (apiMain, $filter, $location) {
    return {
      templateUrl: 'views/page/questionnaire/questionnairemanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.conf = {
          columnConf: [
            {
              labelName: '问卷名称',
              valName: 'quName',
              width: '12%'
            }, {
              labelName: '问卷类型',
              valName: 'quType',
              width: '12%',
              filter: function (val, otherVal) {
                var r = '';
                if (val == 1) {
                  r = '试用申请问卷';
                } else {
                  r = '反馈问卷';
                }
                return r;
              }
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
              labelName: '关联商品',
              valName: 'proName',
              width: '12%'
            }, {
              labelName: '商品状态',
              valName: 'proOpenState',
              width: '25%',
              filter:function(val, otherVal){
                //产品状态：1：可申请使用，2：使用中，3：报告回收中，4：已结束
                var r='';
                switch (val){
                  case '1':
                    r='可申请试用';
                    break;
                  case '2':
                    r='试用中';
                    break;
                  case '3':
                    r='报告回收中';
                    break;
                  case '4':
                    r='已结束';
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
                $location.path('questionnaireAddManage').search({id: val.id});
              }//操作方法
            },
            {
              labelName: '删除/恢复',//操作名称
              doFunc: function (val, conf, cf) {
                if (val.status == '1') {
                  if (confirm('确定要删除吗?')) {
                    apiMain.qu.delete.queryCallback({
                      id: val.id
                    }, function (data) {
                      if (data && data.data) {
                        alert('删除成功');
                        conf.doSelect();
                      }
                    });
                  }
                } else {
                  if (confirm('确定要恢复吗?')) {
                    apiMain.qu.update.queryCallback({
                      id: val.id,
                      status: '1'
                    }, function (data) {
                      if (data && data.data) {
                        alert('恢复成功');
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
              doFunc: function (val, conf) {
                $location.path('questionnaireAddManage');
              }//操作方法
            },
            {
              labelName: '批量删除',//操作名称
              doFunc: function (val, conf) {
                if (confirm('确定要删除吗?')) {
                  var func = [];
                  for (var i in val) {
                    func.push((function (v) {
                      return function (call) {
                        apiMain.qu.delete.queryCallback({
                          id: v.id
                        }, function (data) {
                          if (data && data.data) {
                            call(null, data.data);
                          } else {
                            call(data, null);
                          }
                        });
                      }

                    })(val[i]))
                  }
                  async.parallel(func, function (err, rest) {
                    if (!err) {
                      alert('删除成功');
                      conf.doSelect();
                    }

                  });


                }
              }//操作方法
            },
            {
              labelName: '批量恢复',//操作名称
              doFunc: function (val, conf) {
                if (confirm('确定要恢复吗?')) {
                  var func = [];
                  for (var i in val) {
                    func.push((function (v) {
                      return function (call) {
                        apiMain.qu.update.queryCallback({
                          id: v.id,
                          status: '1'
                        }, function (data) {
                          if (data && data.data) {
                            call(null, data.data);
                          } else {
                            call(data, null);
                          }
                        });
                      }

                    })(val[i]))
                  }
                  async.parallel(func, function (err, rest) {
                    if (!err) {
                      alert('恢复成功');
                      conf.doSelect();
                    }

                  });


                }
              }//操作方法
            }
          ],
          querys: [
            {
              labelName: '问卷名称：',
              queryName: 'quName',
              type: 'text',//text/select/date
              default: '',//默认值
              selValue: [],
              value: ''
            }
          ],
          defaultButton: true,
          multiSelect: true,
          doSelect: function () {
            var self = this,
              querys = self.super();
            apiMain.qu.getByPage.queryCallback(querys, function (data) {
              if (data && data.data) {
                for (var i in data.data.content) {
                  data.data.content[i].proName = '加载中...';
                  data.data.content[i].proOpenState = '加载中...';
                  (function (val) {
                    apiMain.product.getById.queryCallback(
                      {
                        id: val.proId
                      },
                      function (data) {
                        if (data && data.data ) {

                          val.proOpenState = data.data.proOpenState;
                          val.proName = data.data.proName;
                        } else {
                          val.proOpenState = '无';
                          val.proName = '无';
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
