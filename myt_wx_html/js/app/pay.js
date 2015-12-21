/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/pay_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            data:undefined,
            submit:function(){
                var _self = this;
                api.orders.pay({
                    id:_self.data.id
                },function(data){
                    if(data && data.data){
                        app.showAlert('提示','支付成功',function(){
                            _self.refresh(_self.data);
                        });
                    }
                });
            },
            init: function (_$container,val) {
                var _self = this;
                _self.super(_$container,val,true);

                return _self;
            },
            refresh: function (val) {
                var _self = this;
                _self.super(val);
                api.orders.getById({
                    id:val.id
                },function(data){
                    if(data && data.data){
                        _self.data=data.data;
                        _self.scope.payTime.html(data.data);
                        _self.scope.payState.html(data.data);
                        _self.scope.payAddress.html(data.data);
                        _self.scope.order.html(data.data);
                        _self.scope.orderFee.html(data.data);
                        _self.scope.orderCount.html(data.data);
                        _self.scope.orderFeeCount.html(data.data);
                        _self.scope.orderFeeAll.html(data.data);
                        _self.scope.orderButton.html(data.data);
                        api.product.getById({
                            id:data.data.proId
                        },function(da){
                            if(da && da.data){
                                _self.scope.proImg.html(da.data);
                                _self.scope.proName.html(da.data);
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