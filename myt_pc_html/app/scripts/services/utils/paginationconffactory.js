'use strict';

/**
 * @ngdoc service
 * @name mytPcHtmlApp.paginationConfFactory
 * @description
 * # paginationConfFactory
 * Factory in the mytPcHtmlApp.
 */
angular.module('mytPcHtmlApp')
    .factory('paginationConfFactory', function (baseFactory) {
        // Service logic
        // ...

        //ColumnConf
        var columnConf = [
            //{
            //  labelName: '组织名称',
            //  valName: 'orgName',
            //  width: '20%',
            //  filter:function(val){
            //    var r='';
            //    if(val){
            //      r='是';
            //    }else{
            //      r='否';
            //    }
            //    return r ;
            //  }
            //},
            //{
            //  labelName: '联系人',
            //  valName: 'linkMan',
            //  width: '15%'
            //},
            //{
            //  labelName: '联系电话',
            //  valName: 'tel',
            //  width: '15%'
            //},
            //{
            //  labelName: '联系邮箱',
            //  valName: 'email',
            //  width: '15%'
            //},
            //{
            //  labelName: '创建时间',
            //  valName: 'createDate',
            //  width: '10%'
            //}
        ];
        //modelConf
        var modelConf = {
            //modelId: 'orgId',//数据id
            //modeTitle: 'orgName',//数据显示
            //models: [{
            //  labelName: '组织名称',
            //  valName: 'orgName',
            //  type: 'text',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '组织图标',
            //  valName: 'thumbnailUrl',
            //  type: 'ico',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '联系人',
            //  valName: 'linkMan',
            //  type: 'text',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '联系电话',
            //  valName: 'tel',
            //  type: 'text',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '联系邮箱',
            //  valName: 'email',
            //  type: 'text',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '组织介绍',
            //  valName: 'description',
            //  type: 'textarea',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}, {
            //  labelName: '组织网页',
            //  valName: 'orgUrl',
            //  type: 'text',//text/select/date/label
            //  default: '',//默认值
            //  selValue: []
            //}
            //]
        };
        //operationConf
        var operationConf = [
            //{
            //    labelName:'',//操作名称
            //    doFunc:function(val){}//操作方法
            //}
        ];//每条数据的附属功能

        //globalOperationConf
        var globalOperationConf = [
            //{
            //    labelName:'',//操作名称
            //    doFunc:function(val){}//操作方法
            //}
        ];//全局的功能
        //pageConf
        var page = 1;
        var pageSize = 10;
        //查询条件
        var querys = [
            //{
            //  labelName: '组织名称：',
            //  queryName: 'orgName',
            //  type: 'text',//text/select/date
            //  default: '',//默认值
            //  selValue: [],
            //  value: ''
            //},
            //{
            //  labelName: '联系人：',
            //  queryName: 'linkMan',
            //  type: 'text',//text/select/date
            //  default: '',//默认值
            //  selValue: [],
            //  value: ''
            //},
            //{
            //  labelName: '联系电话：',
            //  queryName: 'tel',
            //  type: 'text',//text/select/date
            //  default: '',//默认值
            //  selValue: [],
            //  value: ''
            //},
            //{
            //  labelName: '联系邮箱：',
            //  queryName: 'email',
            //  type: 'text',//text/select/date
            //  default: '',//默认值
            //  selValue: [],
            //  value: ''
            //}
        ];
        //数据
        var pageSource = {
            totalElements: 0,//所有数据的条目
            totalPages: 0,//设置分页的总页数,
            size: 0,//每一页的条目数,
            number: 0,//当前页号,
            content: [],//分页数据内容,
            sort: {},//排序,
            last: true,//末页,
            numberOfElements: 0,//当前页的数据条目数
            first: false//首页
        };
        //搜索
        var doSelect = function () {
            var querys = {};
            for (var i in this.querys) {
                if(this.querys[i].value && this.querys[i].value!=''){
                    querys[this.querys[i].queryName] = this.querys[i].value;
                }

            }
            querys.page = this.page;
            querys.pageSize = this.pageSize;
            return querys;
            //var querys = {};
            //for (var i in scope.querys) {
            //  querys[scope.querys[i].queryName] = scope.querys[i].value;
            //}
            //querys.page = scope.page;
            //querys.pageSize = scope.pageSize;
            ////if (!globalFactory.currentOrganization.orgCode == '0'){
            ////  querys.orgId = globalFactory.currentOrganization.orgCod ;
            ////}
            //apiFactory.organizations.getOrgs.queryCallback(querys, function (err, data) {
            //  if (data) {
            //    //for(var i=0;i<data.content.length;i++){
            //    //  (function (val) {//闭包
            //    //    apiFactory.organizations.getOrgCount(data.content[val].orgId,function(v){
            //    //      data.content[val].orgCode=v;
            //    //    });
            //    //  })(i);
            //    //}
            //    scope.pageSource = data;
            //  }
            //});
        };
        //查询条件重置
        var doReset = function () {
            for (var i in this.querys) {
                this.querys[i].value = this.querys[i].default;
            }
        };
        var conf = baseFactory.extend({
            tableTitle: '列表',
            defaultButton:true,//默认功能按钮查询和重置
            multiSelect:false,//是否显示多选按钮默认否
            columnConf: columnConf,
            globalOperationConf:globalOperationConf,
            modelConf: modelConf,
            operationConf:operationConf,
            page: page,
            pageSize: pageSize,
            querys: querys,
            pageSource: pageSource,
            doSelect: doSelect,
            doReset: doReset
        });

        // Public API here
        return conf;
    });
