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
            .when('/userMessage', {
                templateUrl: 'views/usermessage.html',
                controller: 'UsermessageCtrl',
                controllerAs: 'userMessage'
            })
            .when('/classMessage', {
                templateUrl: 'views/classmessage.html',
                controller: 'ClassmessageCtrl',
                controllerAs: 'classMessage'
            })
            .when('/productMessage', {
                templateUrl: 'views/productmessage.html',
                controller: 'ProductmessageCtrl',
                controllerAs: 'productMessage'
            })
            .when('/productAuditMessage', {
                templateUrl: 'views/productauditmessage.html',
                controller: 'ProductauditmessageCtrl',
                controllerAs: 'productAuditMessage'
            })
            .when('/questionnaireMessage', {
                templateUrl: 'views/questionnairemessage.html',
                controller: 'QuestionnairemessageCtrl',
                controllerAs: 'questionnaireMessage'
            })
            .when('/ordersMessage', {
                templateUrl: 'views/ordersmessage.html',
                controller: 'OrdersmessageCtrl',
                controllerAs: 'ordersMessage'
            })
            .when('/userFeedbackMessage', {
                templateUrl: 'views/userfeedbackmessage.html',
                controller: 'UserfeedbackmessageCtrl',
                controllerAs: 'userFeedbackMessage'
            })
            .when('/callLogsMessage', {
                templateUrl: 'views/calllogsmessage.html',
                controller: 'CalllogsmessageCtrl',
                controllerAs: 'callLogsMessage'
            })
            .when('/merchantMessage', {
                templateUrl: 'views/merchantmessage.html',
                controller: 'MerchantmessageCtrl',
                controllerAs: 'merchantMessage'
            })
            .when('/roleMessage', {
                templateUrl: 'views/rolemessage.html',
                controller: 'RolemessageCtrl',
                controllerAs: 'roleMessage'
            })
            .when('/loginLogMessage', {
                templateUrl: 'views/loginlogmessage.html',
                controller: 'LoginlogmessageCtrl',
                controllerAs: 'loginLogMessage'
            })
            .otherwise({
                redirectTo: '/'
            });
    });
