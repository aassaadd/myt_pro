'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:/leftMenu/main
 * @description
 * # /leftMenu/main
 */
angular.module('mytPcHtmlApp')
  .directive('leftMenuMain', function ($location, global, apiMain) {
    return {
      templateUrl: 'views/leftmenu/main.html',
      restrict: 'AE',
      replace: true,
      scope: {},
      link: function postLink(scope, element, attrs) {
        scope.selectClick = function (val) {
          if (val.path) {
            global.currentMenu = val;
            $location.path(val.path);
          }

        };
        scope.menus = [
          {
            no: 'main',
            name: '看板',
            ico: 'fa-dashboard',
            path: 'main'
          }
          //,
          //{
          //  no:'',
          //  name:'用户管理',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'wxUserManage',
          //      name:'查询用户',
          //      ico:'',
          //      path:'wxUserManage'
          //    }
          //  ]
          //},
          //{
          //  no:'',
          //  name:'产品管理',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'classManage',
          //      name:'类目管理',
          //      ico:'',
          //      path:'classManage'
          //    },
          //    {
          //      no:'productAuditManage',
          //      name:'产品审核管理',
          //      ico:'',
          //      path:'productAuditManage'
          //    },
          //    {
          //      no:'productManage',
          //      name:'产品管理',
          //      ico:'',
          //      path:'productManage'
          //    },
          //    {
          //      no:'questionnaireManage',
          //      name:'问卷管理',
          //      ico:'',
          //      path:'questionnaireManage'
          //    }
          //  ]
          //},
          //{
          //  no:'',
          //  name:'订单管理',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'ordersManage',
          //      name:'订单管理',
          //      ico:'',
          //      path:'ordersManage'
          //    }
          //  ]
          //},
          //{
          //  no:'',
          //  name:'客服管理',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'fdkManage',
          //      name:'用户意见管理',
          //      ico:'',
          //      path:'fdkManage'
          //    },
          //    {
          //      no:'callLogsManage',
          //      name:'客服电话记录',
          //      ico:'',
          //      path:'callLogsManage'
          //    }
          //  ]
          //},
          //{
          //  no:'',
          //  name:'供应商管理',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'merchantManage',
          //      name:'供应商查询',
          //      ico:'',
          //      path:'merchantManage'
          //    }
          //  ]
          //},
          //{
          //  no:'',
          //  name:'系统设置',
          //  ico:'',
          //  childs:[
          //    {
          //      no:'userManage',
          //      name:'后台编辑管理',
          //      ico:'',
          //      path:'userManage'
          //    },
          //    {
          //      no:'advManage',
          //      name:'广告位管理',
          //      ico:'',
          //      path:'advManage'
          //    },
          //    {
          //      no:'roleManage',
          //      name:'角色管理',
          //      ico:'',
          //      path:'roleManage'
          //    },
          //    {
          //      no:'loginLogManage',
          //      name:'登陆日志管理',
          //      ico:'',
          //      path:'loginLogManage'
          //    }
        ]
        ;
        apiMain.user.getAppByPage.queryCallback({
          id: 0
        }, function (data) {
          if (data && data.data) {
            for (var i in data.data) {
              scope.menus.push({
                id: data.data[i].id,
                no: data.data[i].appNo,
                name: data.data[i].appName,
                ico: data.data[i].ico,
                childs: []
              });
            }
            for (var i in scope.menus) {
              if (scope.menus[i].id) {
                (function (val) {
                  apiMain.user.getAppModuleOnAppIdByPage.queryCallback({
                    id: 0,
                    appId: val.id
                  }, function (da) {
                    if (da && da.data) {
                      for (var i in da.data) {
                        val.childs.push({
                          no: da.data[i].modNo,
                          name: da.data[i].modName,
                          ico: da.data[i].ico,
                          path: da.data[i].modUrl
                        });
                      }
                    }
                  });
                })(scope.menus[i]);
              }

            }

          }
        });
        setTimeout(function () {
          element.metisMenu();
        }, 1000);

      }
    };
  });
