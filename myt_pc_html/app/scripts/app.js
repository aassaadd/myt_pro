'use strict';

/**
 * @ngdoc overview
 * @name mytPcHtmlApp
 * @description
 * # mytPcHtmlApp
 *
 * Main module of the application.
 */
angular
    .module('mytPcHtmlApp', [
        'ngAnimate',
        'ngCookies',
        'ngResource',
        'ngRoute',
        'ngSanitize',
        'ngTouch',
        'ui.bootstrap',
        'ngFileUpload',
        'ngMessages',
        'chieffancypants.loadingBar',
        'checklist-model'
    ])
    .config(function ($routeProvider, $httpProvider) {
        $httpProvider.interceptors.push('UserInterceptor');
        $routeProvider
            .when('/', {
                templateUrl: 'views/main.html',
                controller: 'MainCtrl',
                controllerAs: 'main'
            })
            .when('/about', {
                templateUrl: 'views/about.html',
                controller: 'AboutCtrl',
                controllerAs: 'about'
            })
            .when('/userManage', {
                templateUrl: 'views/usermanage.html',
                controller: 'UsermanageCtrl',
                controllerAs: 'userManage'
            })
            .when('/classManage', {
                templateUrl: 'views/classmanage.html',
                controller: 'ClassmanageCtrl',
                controllerAs: 'classManage'
            })
            .when('/productManage', {
                templateUrl: 'views/productmanage.html',
                controller: 'ProductmanageCtrl',
                controllerAs: 'productManage'
            })
            .when('/productAuditManage', {
                templateUrl: 'views/productauditmanage.html',
                controller: 'ProductauditmanageCtrl',
                controllerAs: 'productAuditManage'
            })
            .when('/questionnaireManage', {
                templateUrl: 'views/questionnairemanage.html',
                controller: 'QuestionnairemanageCtrl',
                controllerAs: 'questionnaireManage'
            })
            .when('/ordersManage', {
                templateUrl: 'views/ordersmanage.html',
                controller: 'OrdersmanageCtrl',
                controllerAs: 'ordersManage'
            })
            .when('/callLogsManage', {
                templateUrl: 'views/calllogsmanage.html',
                controller: 'CalllogsmanageCtrl',
                controllerAs: 'callLogsManage'
            })
            .when('/merchantManage', {
                templateUrl: 'views/merchantmanage.html',
                controller: 'MerchantmanageCtrl',
                controllerAs: 'merchantManage'
            })
            .when('/roleManage', {
                templateUrl: 'views/rolemanage.html',
                controller: 'RolemanageCtrl',
                controllerAs: 'roleManage'
            })
            .when('/loginLogManage', {
                templateUrl: 'views/loginlogmanage.html',
                controller: 'LoginlogmanageCtrl',
                controllerAs: 'loginLogManage'
            })
            .when('/advManage', {
              templateUrl: 'views/advmanage.html',
              controller: 'AdvmanageCtrl',
              controllerAs: 'advManage'
            })
            .when('/fdkManage', {
              templateUrl: 'views/fdkmanage.html',
              controller: 'FdkmanageCtrl',
              controllerAs: 'fdkManage'
            })
            .when('/wxUserManage', {
              templateUrl: 'views/wxusermanage.html',
              controller: 'WxusermanageCtrl',
              controllerAs: 'wxUserManage'
            })
            .when('/productAddManage', {
              templateUrl: 'views/productaddmanage.html',
              controller: 'ProductaddmanageCtrl',
              controllerAs: 'productAddManage'
            })
            .when('/advAddManage', {
              templateUrl: 'views/advaddmanage.html',
              controller: 'AdvaddmanageCtrl',
              controllerAs: 'advAddManage'
            })
            .when('/userAddManage', {
              templateUrl: 'views/useraddmanage.html',
              controller: 'UseraddmanageCtrl',
              controllerAs: 'userAddManage'
            })
            .when('/roleAddManage', {
              templateUrl: 'views/roleaddmanage.html',
              controller: 'RoleaddmanageCtrl',
              controllerAs: 'roleAddManage'
            })
            .otherwise({
                redirectTo: '/'
            });
        //判断当前页面大小
        $(window).resize(function() {
            if(document.body.clientWidth <= 960){
                $('body').addClass('sidebar-left-mini');
            }else{
                $('body').removeClass('sidebar-left-mini');
            }
        });
        $(window).resize();
    });
