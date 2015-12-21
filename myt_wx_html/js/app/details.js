/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/details_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            data: undefined,
            last: false,
            clickIntroduces:function(){
                var _self=this;
                _self.el.find('.m-header-menu ul li').removeClass("current");
                _self.el.find('#clickIntroduces').addClass("current");
                _self.el.find('.m-content-body').show();
                _self.el.find('.m-module-1').show();
                _self.el.find('.m-avatar-list').hide();

                _self.scroll.refresh();
            },
            clickUsers:function(){
                var _self=this;
                _self.el.find('.m-header-menu ul li').removeClass("current");
                _self.el.find('#clickUsers').addClass("current");
                _self.el.find('.m-content-body').hide();
                _self.el.find('.m-module-1').hide();
                _self.el.find('.m-avatar-list').show().height( _self.el.find('.m-avatar-list ul').height());

                _self.scroll.refresh();
            },
            submit: function (id) {
                var _self=this;
                //2.判断是否可以重复申请
                if(_self.data.proType=='1'){
                    //可以重复申请
                    app.go('ques',{
                        proId: _self.data.id
                    });
                }else{
                    //不可以重复申请
                    //判断有没有订单
                    api.productApply.getByPage({
                        status:'1',
                        wxUserId:0
                    },function(data){
                        if(data && data.data && data.data.length>0 && _self.data.proType=='0'){
                            app.showAlert('提示','您不能重复申请');
                        }else{
                            app.go('ques',{
                                proId: _self.data.id
                            });
                        }

                    })
                }



            },
            init: function (_$container,val) {
                var _self = this;
                _self.super(_$container,val,true);
                return _self;
            },
            refresh: function (val) {
                var _self = this;
                _self.super();
                api.product.getById({
                    id:val.id
                },function(data){
                    if(data && data.data){
                        _self.data=data.data;
                        _self.scope.data.html(_self.data);
                        _self.scope.button.html(_self.data);
                        _self.scope.content.html($(_self.data.proDescription),true);
                        var _d={
                            list:[],
                            proSoldCount:_self.data.proSoldCount
                        };
                        _d.list.push(_self.data.imgId);
                        _d.list.push(_self.data.img1Id);
                        _d.list.push(_self.data.img2Id);
                        _d.list.push(_self.data.img3Id);
                        _d.list.push(_self.data.img4Id);
                        _self.scope.topList.html(_d);
                        _self.swipe = new Swipe(_self.el.find('#mfs-id')[0], {
                            speed: 300,
                            auto: 3000,
                            callback: function (index, elem) {
                                var lis = _self.el.find('#mfs-id ol').children();
                                lis.removeClass("on").eq(index).addClass("on");
                            }
                        });
                        if(_self.scroll ){
                            _self.scroll.refresh();
                        }
                    }
                });
                api.productApply.getByPage({
                    state:'1',
                    status:'1'
                },function(data){
                    if(data && data. data){
                        _self.scope.applyList.html({
                            list:data.data
                        });
                        if(_self.scroll ){
                            _self.scroll.refresh();
                        }
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