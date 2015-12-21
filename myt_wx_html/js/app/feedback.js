/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/feedback_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'async','Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll,async) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            submit: function (v) {

                var _self=this;
                api.feedback.add({
                    wxUserId:0,
                    fbkContent:_self.el.find('[name="fbkContent"]').val()
                },function(data){
                    if(data && data.data){
                        app.showAlert('提示','提交成功',function(){
                            app.go('info');
                        })
                    }

                })


            },
            init: function (_$container,val) {
                var _self = this;
                _self.super(_$container,val,true);
                return _self;
            },
            refresh: function (val) {
                var _self = this;
                _self.super();

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