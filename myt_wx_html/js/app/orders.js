/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/orders_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            page: 1,
            pageSize: 3,
            last: false,
            vStatus:undefined,
            top: function (v) {
                app.go('orders');
                console.log(v);
            },
            goPay:function(v){
                app.go('pay',{
                    id:v
                });
            },
            clickStatus:function(v){
                var _self=this;
                _self.el.find('.m-header-menu ul li').removeClass("current");
                if(v && v=='E'){
                    _self.el.find('#clickStatusE').addClass("current");
                    _self.vStatus='E';
                }else{
                    _self.el.find('#clickStatus').addClass("current");
                    _self.vStatus=undefined;
                }
                _self.select();
                _self.scroll.refresh();
            },
            init: function (_$container,val) {
                var _self = this;
                _self.super(_$container);
                //if (!_self.initStatus) {
                //
                //    _self.initStatus = true;
                //}
                $('#footer ul li').removeClass('current');
                $('#footer_orders').addClass('current');

                return _self;
            },
            select:function(){
                var _self=this,
                    ops={
                        wxUserId:0,
                        status: 1,
                        page: 1,
                        pageSize: _self.pageSize
                    };
                if(_self.vStatus && _self.vStatus=='E'){
                    ops.orderStatus='E';
                }else{
                    ops['orderStatus@not']='E';
                }
                api.orders.getByPage(ops, function (data) {
                    if (data && data.data) {
                        var _d = {
                            list: []
                        };
                        for (var i in data.data.content) {
                            _d.list.push(data.data.content[i]);
                        }
                        _self.scope.list.html(_d)

                        if (_self.scroll) {
                            _self.scroll.destroy();
                            _self.page = 1;
                        }
                        _self.scroll = refresh(_self.el[0], 'pullUp', function () {
                            api.orders.getByPage({
                                wxUserId:0,
                                status: 1,
                                page: _self.page,
                                pageSize: _self.pageSize
                            }, function (d) {
                                if (d && d.data) {
                                    var _d = {
                                        list: []
                                    };
                                    for (var i in d.data.content) {
                                        _d.list.push(d.data.content[i]);
                                    }
                                    _self.scope.list.append(_d);
                                    if (d.data.last) {
                                        _self.scroll.end();
                                    } else {
                                        _self.page += 1;
                                    }
                                    _self.scroll.refresh();
                                }
                            });
                        });
                        if (data.data.last) {
                            if(_self.scroll){
                                _self.scroll.end();
                            }

                        } else {
                            _self.page += 1;
                        }

                    }
                });
            },
            refresh: function (_$container) {
                var _self = this;
                _self.super(_$container);

                api.adv.getByPage({
                    status: 1
                }, function (data) {
                    if (data && data.data) {
                        var _d = {
                            list: []
                        };
                        for (var i in data.data) {
                            _d.list.push(data.data[i]);
                        }
                        _self.scope.topList.html(_d)
                        _self.swipe = new Swipe(_self.el.find('#mfs-id')[0], {
                            speed: 300,
                            auto: 3000,
                            callback: function (index, elem) {
                                var lis = _self.el.find('#mfs-id ol').children();
                                lis.removeClass("on").eq(index).addClass("on");
                            }
                        });

                    }
                });
                _self.select();
                return _self;
            }
        });

        return _index;
    });
})(window, location, document)