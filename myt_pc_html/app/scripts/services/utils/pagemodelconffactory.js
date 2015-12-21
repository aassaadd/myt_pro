'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.pageModelConfFactory
 * @description
 * # pageModelConfFactory
 * Factory in the mytPcHtmlApp.
 * 查看,修改,删除页面模型
 */
angular.module('mytPcHtmlApp')
  .factory('pageModelConfFactory', function (baseFactory, $window) {
    // Service logic
    // ...
    //modelConf
    var modelConf = [
      //    {
      //    labelName: '组织名称',
      //    type: 'text',//text/select/date/label
      //    default: '',//默认值
      //    selValue: [],
      //    value:'',
      //    ope:'edit'//view显示/edit隐藏,
      //asyncSelValue:function(callback){}//callback:function(val){}讲返回值传回
      //}
    ];
    //operationConf
    var operationConf = [
      //{
      //    labelName:'',//操作名称
      //    doFunc:function(val){}//操作方法
      //}
    ];//每条数据的附属功能
    //默认的提交事件
    var doSubmit = function () {

    };
    var doClose = function () {
      $window.history.back();
    };
    //数据
    //var pageSource = {};
    var conf = baseFactory.extend({
      tableTitle: '列表',
      defaultButton: true,//默认功能按钮提交和返回
      modelConf: modelConf,
      operationConf: operationConf,
      //pageSource: pageSource,
      doClose: doClose,
      doSubmit: doSubmit
    });

    // Public API here
    return conf;
  });
