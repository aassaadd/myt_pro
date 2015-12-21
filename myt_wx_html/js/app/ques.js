/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/ques_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'async','Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll,async) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            page: 1,
            pageSize: 3,
            last: false,
            data:[],
            submit: function (v) {

                var _self=this,
                    _scope=[],
                    da=v;
                for(var i in _self.data){
                    _scope.push(_self.data[i]);
                }
                for(var i in _scope){
                    var _e= _self.el.find('[name="'+_scope[i].valName+'"]');
                    switch (_scope[i].type){
                        case 'text':
                        case 'textarea':
                        case 'select':
                            _scope[i].value=_e.val();
                            break;
                        case 'radio':
                            for(var x in _e){
                                if(_e[x].checked){
                                    _scope[i].value=$(_e[x]).val();
                                    break;
                                }
                            }
                            break;
                        case 'checkbox':
                            _scope[i].value=[];
                            for(var x in _e){
                                if(_e[x].checked){
                                    _scope[i].value.push($(_e[x]).val());

                                }
                            }
                            break;
                        case 'date':
                            _scope[i].value=new Date(_e.val());
                            break;

                    }
                    //校验
                    if(_scope[i].isCheck && (!_scope[i].value || _scope[i].value=='' ||  _scope[i].value.length==0)){
                        app.showAlert('提示',_scope[i].labelName+'必须填写');
                        return;
                    }
                }
                async.waterfall([
                    function(callback){
                        //提交问卷
                        api.quf.add({
                            quId:da.quId,
                            proId:da.proId,
                            qufJson:JSON.stringify(_scope),
                            qufDescription:_self.el.find('[name=qufDescription]').val()
                        },function(data){
                            if(data && data.data){
                                callback(null,data.data);
                            }else{
                                callback(data);
                            }
                        });
                    },
                    function(quf,callback){
                        //提交申请记录表
                        api.productApply.add({
                            wxUserId:0,
                            proId: v.proId,
                            qufId:quf.id
                        },function(data){
                            if(data && data.data){
                                callback(null,data.data);
                            }else{
                                callback(data);
                            }
                        });
                    }
                ], function(err, result){
                    if(!err){
                        app.showAlert('提示','提交成功,等待审核结果,返回首页',function(){
                            app.go('index');
                        })
                    }
                })





               //_self.el.find('[name="2"]').val()
            },
            init: function (_$container,val) {
                var _self = this;
                _self.super(_$container,val,true);
                return _self;
            },
            refresh: function (val) {
                var _self = this;
                _self.super();
                /*
                 * 1.判断是否有问卷
                 * 2.并且判断是否已提交
                 * 3.
                 * */
                api.qu.getByPage({
                    status: 1,
                    proId:val.proId,
                    quType:'1'//试用问卷
                }, function (data) {
                    if (data && data.data && data.data.length==1) {
                        _self.data=JSON.parse(data.data[0].quJson);
                        _self.scope.qus.html({
                            list:_self.data
                        });
                        _self.scope.button.html({
                            da:{
                                quId:data.data[0].id,
                                proId:data.data[0].proId
                            }

                        });

                    }else{
                        _self.data=[];
                        api.productApply.add({
                            wxUserId:0,
                            proId: val.proId
                        },function(data){
                            if(data && data.data){
                                app.showAlert('提示','提交成功,等待审核结果,返回首页',function(){
                                    app.go('index');
                                })
                            }
                        });

                    }
                });

                if (_self.scroll) {
                    _self.scroll.destroy();

                }

                _self.scroll = scroll(_self.el[0]);

                return _self;
            }
        });

        return _index;
    });
})(window, location, document)