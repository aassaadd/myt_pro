/**
 * index
 * Created by zhaohaochen on 15/12/10.
 */
(function (window, location, document) {
    define(['text!tpl/info_tpl.html', 'utiles/page', 'api/api', 'app/main', 'utiles/refresh', 'utiles/scroll', 'Swipe', 'Zepto', 'utiles/tplhelper'], function (tpl, page, api, app, refresh, scroll) {
        var $ = Zepto;
        var _index = page.extend({
            tplHtml: tpl,
            scroll: undefined,
            init: function (_$container) {
                var _self = this;
                _self.super(_$container);
                $('#footer ul li').removeClass('current');
                $('#footer_info').addClass('current');

                return _self;
            },
            refresh: function () {
                var _self = this;
                _self.super();



                return _self;
            }
        });

        return _index;
    });
})(window, location, document)