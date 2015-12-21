/**
 * Created by bm_zhc on 2015/10/12.
 */
(function (window) {
    define(['json'], function (JSON) {
        var baseUrl=window.location.protocol + '//' + window.location.host + '/myt_wx';
        function getQuery(confFn) {

            return function (params, callback) {

                var c = confFn(params);
                if (window.localStorage && window.localStorage.token) {
                    if(!c.headers){
                        c.headers={};
                    }
                    c.headers.token = window.localStorage.token;
                }

                var conf = {
                    type: c.method,
                    url: c.url,
                    data: c.params ? (c.params) : JSON.stringify(c.data),
                    dataType: 'json',
                    timeout: 30000, //超时时间：30秒
                    contentType: 'application/json',
                    headers: c.headers,
                    success: function (data) {

                        // 判断错误码，如果是未登录
                        if (data["errorCode"] && data["errorCode"] == "101") {
                            // 清空用户本地token存储的信息，如果
                            window.localStorage.token = '';
                            // 全局事件，方便其他view获取该事件，并给以相应的提示或处理
                            window.location.href = 'login.html';
                            //$rootScope.$emit("userIntercepted", "notLogin", response);
                        }
                        //这里统一处理弹出错误提示(错误提示信息由后台确认
                        if (data.code && !data.data) {
                            alert(data.message);
                        }
                        callback(data);

                    },
                    error: function (xhr, type) {
                        alert(JSON.stringify(xhr));
                        //var data = response.data;
                        //// 判断错误码，如果是未登录
                        //if (data["errorCode"] && data["errorCode"] == "101") {
                        //    // 清空用户本地token存储的信息，如果
                        //    window.localStorage.token = '';
                        //    // 全局事件，方便其他view获取该事件，并给以相应的提示或处理
                        //    window.location.href = 'login.html';
                        //    //$rootScope.$emit("userIntercepted", "notLogin", response);
                        //}
                    }
                }
                $.ajax(conf);
            };
        };
        return {
            login: getQuery(function (params) {
                return {
                    method: 'POST',
                    url: baseUrl+'/api/login',
                    data: params
                }
            }),
            loginForCode: getQuery(function (params) {
                return {
                    method: 'POST',
                    url: baseUrl+'/api/loginForCode',
                    data: params
                }
            }),
            loginForOpenId: getQuery(function (params) {
                return {
                    method: 'POST',
                    url: baseUrl+'/api/loginForOpenId',
                    data: params
                }
            }),
            accreditForOpenId: getQuery(function (params) {
                return {
                    method: 'POST',
                    url: baseUrl+'/api/accreditForOpenId',
                    data: params
                }
            }),
            offForOpenId: getQuery(function (params) {
                return {
                    method: 'POST',
                    url: baseUrl+'/api/v1/manage/offForOpenId',
                    data: params
                }
            }),
            product: {
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProduct',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProduct/' + params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytProduct',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytProduct/' + params.id,
                        data: params
                    }
                })
            },
            productClass: {
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProductClass',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProductClass/' + params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytProductClass',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytProductClass/' + params.id,
                        data: params
                    }
                })
            },
            adv:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytAdvertisement',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytAdvertisement/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytAdvertisement',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytAdvertisement/'+params.id,
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytAdvertisement/'+params.id,
                        params: params
                    }
                })
            },
            qu:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytQuestionnaire',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytQuestionnaire/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytQuestionnaire',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytQuestionnaire/'+params.id,
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytQuestionnaire/'+params.id,
                        params: params
                    }
                })
            },
            quf:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytQuestionnaireFill',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytQuestionnaireFill/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytQuestionnaireFill',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytQuestionnaireFill/'+params.id,
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytQuestionnaireFill/'+params.id,
                        params: params
                    }
                })
            },
            orders:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytOrders',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytOrders/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytOrders',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytOrders/'+params.id,
                        data: params
                    }
                }),
                pay: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytOrders/'+params.id+'?method=pay',
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytOrders/'+params.id,
                        params: params
                    }
                })
            },
            productApply:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProductApply',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytProductApply/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytProductApply',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytProductApply/'+params.id,
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytProductApply/'+params.id,
                        params: params
                    }
                })
            },
            feedback:{
                getByPage: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytFeedback',
                        params: params
                    }
                }),
                getById: getQuery(function (params) {

                    return {
                        method: 'GET',
                        url: baseUrl + '/api/manage/mytFeedback/'+params.id,
                        params: params
                    }
                }),
                add: getQuery(function (params) {

                    return {
                        method: 'POST',
                        url: baseUrl + '/api/manage/mytFeedback',
                        data: params
                    }
                }),
                update: getQuery(function (params) {

                    return {
                        method: 'PUT',
                        url: baseUrl + '/api/manage/mytFeedback/'+params.id,
                        data: params
                    }
                }),
                delete: getQuery(function (params) {

                    return {
                        method: 'DELETE',
                        url: baseUrl + '/api/manage/mytFeedback/'+params.id,
                        params: params
                    }
                })
            }
        }
    });
})(window)
