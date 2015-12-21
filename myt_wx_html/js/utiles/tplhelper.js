/**
 * Created by zhaohaochen on 15/12/11.
 */

(function () {
    define(['json','template'],function (JSON,template) {

        template.helper('dateFormat', function (date, format) {
            if(!date){

                return '';
            }

            date = new Date(date);

            var map = {
                "M": date.getMonth() + 1, //月份
                "d": date.getDate(), //日
                "h": date.getHours(), //小时
                "m": date.getMinutes(), //分
                "s": date.getSeconds(), //秒
                "q": Math.floor((date.getMonth() + 3) / 3), //季度
                "S": date.getMilliseconds() //毫秒
            };
            format = format.replace(/([yMdhmsqS])+/g, function (all, t) {
                var v = map[t];
                if (v !== undefined) {
                    if (all.length > 1) {
                        v = '0' + v;
                        v = v.substr(v.length - 2);
                    }
                    return v;
                }
                else if (t === 'y') {
                    return (date.getFullYear() + '').substr(4 - all.length);
                }
                return all;
            });
            return format;
        });
        template.helper('obj2json', function (val) {

            return JSON.stringify(val);
        });

        template.helper('file2img', function (val) {


            return window.location.protocol + '//' + window.location.host + '/myt_wx/api/manage/mytFile/'+val+'?postMethod=image&token='+window.localStorage.token;
        });

        template.helper('proOpenStateString', function (val) {
            //1：可申请使用，2：使用中，3：报告回收中，4：已结束
            var r='';
            switch (val){
                case '1':
                    r='免费申请';
                    break;
                case '2':
                    r='试用中';
                    break;
                case '3':
                    r='报告回收中';
                    break;
                case '4':
                    r='已结束';
                    break;
            }

            return r;
        });
        template.helper('proOpenStateCss', function (val) {
            //1：可申请使用，2：使用中，3：报告回收中，4：已结束
            var r='';
            switch (val){
                case '1':
                    r='u-btn-success';
                    break;
                case '2':
                    r='u-btn-disable';
                    break;
                case '3':
                    r='u-btn-disable';
                    break;
                case '4':
                    r='u-btn-disable';
                    break;
            }

            return r;
        });
        template.helper('proOpenStateButton', function (val) {
            //1：可申请使用，2：使用中，3：报告回收中，4：已结束
            var r='';
            switch (val){
                case '1':
                    r='免费申请';
                    break;
                case '2':
                    r='试用中';
                    break;
                case '3':
                    r='报告回收中';
                    break;
                case '4':
                    r='已结束';
                    break;
            }

            return r;
        });
        template.helper('payStateString', function (val) {
            //S(大写）提交试用单，0预订单，1订单支付成功，2微信返回订单失败，4转入退款，5关闭订单,6撤销订单',
            var r='';
            switch (val){
                case 'S':
                    r='待付款';
                    break;
                case '0':
                    r='预订单';
                    break;
                case '1':
                    r='订单支付成功';
                    break;
                case 'W':
                    r='待收货';
                case '2':
                    r='订单失败';
                    break;
                case '3':
                    r='确认收货';
                    break;
                case '4':
                    r='转入退款';
                    break;
                case '5':
                    r='关闭订单';
                    break;
                case '6':
                    r='撤销订单';
                    break;
                case 'E':
                    r='已完成';
                    break;
            }

            return r;
        });
        template.helper('orderStateButtonCss', function (val) {
            //'订单状态，S(大写）提交试用单，0预订单，1订单支付成功，2微信返回订单失败，3确认收货,4转入退款，5关闭订单,6撤销订单',
            var r='';
            switch (val){
                case 'S':
                case '0':
                case '1':
                case '3':
                case 'W':
                case 'E':
                    r='u-btn-success';
                    break;
                case '2':
                case '4':
                case '5':
                case '6':
                    r='u-btn-disable';
                    break;
            }

            return r;
        });
        template.helper('orderStateButtonString', function (val) {
            //'订单状态，S(大写）提交试用单，0预订单，1订单支付成功，2微信返回订单失败，3确认收货,4转入退款，5关闭订单,6撤销订单',
            var r='';
            switch (val){
                case 'S':
                    r='支付';
                    break;
                case '0':
                    r='支付';
                    break;
                case '1':
                case 'W':
                    r='确认收获';
                    break;
                case '3':
                    r='确认退回';
                    break;
                case '2':
                    r='返回';
                    break;
                case '4':
                    r='返回';
                    break;
                case '5':
                    r='返回';
                    break;
                case '6':
                    r='返回';
                    break;
                case 'E':
                    r='返回';
                    break;
            }

            return r;
        });
    });
})()