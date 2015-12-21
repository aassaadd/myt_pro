'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:roleSelectTabDirective
 * @description
 * # roleSelectTabDirective
 */
angular.module('mytPcHtmlApp')
  .directive('roleSelectTabDirective', function (apiMain, $location) {
    return {
      templateUrl: 'views/page/role/roleselecttabdirectiveview.html',
      restrict: 'AE',
      scope: {
        conf: '='
      },
      link: function postLink(scope, element, attrs) {
        scope.apps = []
        apiMain.app.getByPage.queryCallback({
          status: '1',
          appClass:'0'
        }, function (data) {
          if (data && data.data) {
            scope.apps = data.data;
            for (var i in scope.apps) {
              (function (val) {
                apiMain.appModule.getByPage.queryCallback({
                    status: '1',
                    appId: val.id
                  },
                  function (d) {
                    if (d && d.data) {
                      val.modules = d.data;

                    }
                  });
              })(scope.apps[i])
            }
            if ($location.search().id) {
              apiMain.role.getAppModulesByPage.queryCallback({
                id: $location.search().id
              }, function (da) {
                if (da && da.data) {
                  scope.conf.value = da.data;
                }
              });
            }
          }
        });


      }
    };
  });
