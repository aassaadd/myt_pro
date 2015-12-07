'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:roleAddManagePage
 * @description
 * # roleAddManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('roleAddManagePage', function (apiMain, $filter, $location, $window) {
    return {
      templateUrl: 'views/page/role/roleaddmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var getAppIds = function (ss) {
          var r = [];
          for (var i in ss.appModels) {
            r.push(ss.appModels[i].appId);
          }
          return r;
        }
        var getAppModuleIds = function (ss) {
          var r = [];
          for (var i in ss.appModels) {
            r.push(ss.appModels[i].id);
          }
          return r;
        }
        var ope = 'edit',
          tableTitle = '添加';
        scope.source = {
          roleName: '',
          status: '1',
          appModules: []

        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '名称',
              valName: 'roleName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.roleName,
              ope: ope
            }, {
              labelName: '状态',
              valName: 'status',
              type: 'select',
              default: '1',//默认值
              selValue: [
                {
                  value: '1',
                  text: '有效'
                }, {
                  value: '0',
                  text: '失效'
                }

              ],
              value: scope.source.status,
              ope: ope
            }, {
              labelName: '权限',
              valName: 'appModels',
              type: 'other',
              directive: 'roleSelectTabDirective',
              default: '',//默认值
              selValue: [],
              value: scope.source.appModules,
              ope: ope
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
              if (m.valName != 'appModels') {
                source[m.valName] = m.value;
              }

            }
            if ($location.search().id) {
              source.id = $location.search().id;
              apiMain.role.update.queryCallback(source, function (data) {
                if (data && data.data) {
                  //保存权限----------------------
                  async.parallel([
                    function (callback) {
                      apiMain.role.updateApp.queryCallback({
                        id: data.data.id,
                        mytApps: getAppIds(scope.source)
                      }, function (da) {
                        if (da && da.data) {
                          callback(null, da);
                        } else {
                          callback(data);
                        }
                      });
                    },
                    function (callback) {
                      apiMain.role.updateAppModule.queryCallback({
                        id: data.data.id,
                        mytAppModules: getAppModuleIds(scope.source)
                      }, function (da) {
                        if (da && da.data) {
                          callback(null, da);
                        } else {
                          callback(data);
                        }
                      });
                    }
                  ], function (err, result) {
                    if (!err) {
                      alert('保存成功');
                      $window.history.back();
                    }

                  });


                }
              });
            } else {
              apiMain.role.add.queryCallback(source, function (data) {
                if (data && data.data) {
                  //保存权限----------------------
                  async.parallel([
                    function (callback) {
                      apiMain.role.updateApp.queryCallback({
                        id: data.data.id,
                        mytApps: getAppIds(scope.source)
                      }, function (da) {
                        if (da && da.data) {
                          callback(null, da);
                        } else {
                          callback(data);
                        }
                      });
                    },
                    function (callback) {
                      apiMain.role.updateAppModule.queryCallback({
                        id: data.data.id,
                        mytAppModules: getAppModuleIds(scope.source)
                      }, function (da) {
                        if (da && da.data) {
                          callback(null, da);
                        } else {
                          callback(data);
                        }
                      });
                    }
                  ], function (err, result) {
                    if (!err) {
                      alert('保存成功');
                      $window.history.back();
                    }

                  });
                }
              });
            }

          }
        };
        //
        if ($location.search().id) {
          scope.conf.tableTitle = '修改';
          apiMain.role.getById.queryCallback({
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
        }
      }
    };
  });
