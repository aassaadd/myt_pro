'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:merchantAddManagePage
 * @description
 * # merchantAddManagePage
 */
angular.module('mytPcHtmlApp')
  .directive('merchantAddManagePage', function (apiMain, $filter, $location, $window, areaCtrlFactory) {
    return {
      templateUrl: 'views/page/merchant/merchantaddmanagepageview.html',
      restrict: 'AE',
      scope: {},
      link: function postLink(scope, element, attrs) {
        var ope = 'edit',
          tableTitle = '添加供应商';
        scope.source = {
          userName: '',
          userPassword: '',
          mchName: '',
          mchAddress: {
            province: '',
            city: '',
            area: '',
            address: ''
          },
          mchCall: '',
          mchAccountBank: '',
          mchAccountName: '',
          mchAccount: '',
          mchPersonInCharge: '',
          mchPersonInChargeCall: ''


        };
        scope.conf = {
          tableTitle: tableTitle,
          modelConf: [
            {
              labelName: '用户名',
              valName: 'userName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.userName,
              ope: $location.search().id ? 'view' : 'edit'
            }, {
              labelName: '密码',
              valName: 'userPassword',
              type: $location.search().id ? 'password' : 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.userPassword,
              ope: $location.search().id ? 'view' : 'edit'
            }, {
              labelName: '公司名称',
              valName: 'mchName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchName,
              ope: ope
            }, {
              labelName: '公司地址',
              valName: 'mchAddress',
              type: 'other',
              directive: 'merchatAddressDirective',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchAddress,
              ope: ope
            }, {
              labelName: '公司电话',
              valName: 'mchCall',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchCall,
              ope: ope
            }, {
              labelName: '对公账户开户行',
              valName: 'mchAccountBank',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchAccountBank,
              ope: ope
            }, {
              labelName: '对公账户开户名称',
              valName: 'mchAccountName',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchAccountName,
              ope: ope
            }, {
              labelName: '公司对公账户',
              valName: 'mchAccount',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchAccount,
              ope: ope
            }, {
              labelName: '主要负责人姓名',
              valName: 'mchPersonInCharge',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchPersonInCharge,
              ope: ope
            }, {
              labelName: '主要负责人电话',
              valName: 'mchPersonInChargeCall',
              type: 'text',
              default: '',//默认值
              selValue: [],
              value: scope.source.mchPersonInChargeCall,
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
            var userSourc = {
              userClass: '1',//商户
              userType: '0'
            };
            for (var i in scope.conf.modelConf) {
              var m = scope.conf.modelConf[i];
              scope.source[m.valName] = m.value;
              switch (m.valName) {
                case 'mchAddress':
                  source.province = m.value.province;
                  source.city = m.value.city;
                  source.area = m.value.area;
                  source.address = m.value.address;
                  source.mchAddress = areaCtrlFactory[source.province][0] + ',' + areaCtrlFactory[source.city][0] + ',' + areaCtrlFactory[source.area][0] + ',' + source.address;
                  break;
                case 'userName':
                  userSourc.userName = m.value;
                  break;
                case 'userPassword':
                  userSourc.userPassword = m.value;
                  break;
                default :
                  source[m.valName] = m.value;
                  break;
              }

            }
            if ($location.search().id) {
              source.id = $location.search().id;
              apiMain.mch.update.queryCallback(source, function (data) {
                if (data && data.data) {
                  alert('保存成功');
                  $window.history.back();
                }
              });
            } else {
              async.waterfall([
                function (callback) {
                  apiMain.mch.add.queryCallback(source, function (data) {
                    if (data && data.data) {
                      callback(null, data.data);

                    } else {
                      callback(data);
                    }
                  });

                },
                function (arg1, callback) {
                  //--------------------
                  userSourc.partentId=arg1.id;
                  apiMain.user.add.queryCallback(userSourc, function (data) {
                    if (data && data.data) {
                      callback(null, data.data);

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

          }
        };
        //
        if ($location.search().id) {
          scope.conf.tableTitle = '修改供应商';
          apiMain.user.getByPage.queryCallback({
            partentId:$location.search().id
          },function(data){
            if(data && data.data && data.data.length>0){
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];
                switch (m.valName) {
                  case 'userName':
                    scope.source.userName = data.data[0].userName;
                    m.value = data.data[0].userName;
                    break;
                  case 'userPassword':
                    scope.source.userPassword = data.data[0].userPassword;
                    m.value = data.data[0].userPassword;
                    break;
                }

              }
            }

          });
          apiMain.mch.getById.queryCallback({
            id: $location.search().id
          }, function (data) {
            if (data && data.data) {
              scope.source = data.data;
              for (var i in scope.conf.modelConf) {
                var m = scope.conf.modelConf[i];
                switch (m.valName) {
                  case 'mchAddress':
                    scope.source.mchAddress = {
                      province: scope.source.province,
                      city: scope.source.city,
                      area: scope.source.area,
                      address: scope.source.address
                    };
                    m.value = {
                      province: scope.source.province,
                      city: scope.source.city,
                      area: scope.source.area,
                      address: scope.source.address
                    };
                    break;
                  default :
                    m.value = scope.source[m.valName];
                    break;
                }

              }
              apiMain.user.getByPage.queryCallback({
                partentId:$location.search().id
              },function(data){
                if(data && data.data && data.data.length>0){
                  for (var i in scope.conf.modelConf) {
                    var m = scope.conf.modelConf[i];
                    switch (m.valName) {
                      case 'userName':
                        scope.source.userName = data.data[0].userName;
                        m.value = data.data[0].userName;
                        break;
                      case 'userPassword':
                        scope.source.userPassword = data.data[0].userPassword;
                        m.value = data.data[0].userPassword;
                        break;
                    }

                  }
                }

              });
            }
          })
        }

        //
      }
    };
  });
