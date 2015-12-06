'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:imgUpDirective
 * @description
 * # imgUpDirective
 */
angular.module('mytPcHtmlApp')
  .directive('imgUpDirective', function (global,Upload) {
    return {
      template: '<div><a href="" ng-href="{{url}}" target="_blank"><img class="img-thumbnail user-img" style="width: 100px;" ng-src="{{url}}"></a>' +
      '<a href="" class="btn btn-sm btn-primary" ngf-select="upload($file)" style="margin-left: 5px;">上传</a>' +
      '</div>',
      restrict: 'AE',
      replace: true,
      scope: {
        source:'='
      },
      link: function postLink(scope, element, attrs) {
        scope.url=global.baseUrl + '/api/manage/mytFile/'+scope.source+'?postMethod=image&token='+global.getToken();
        scope.upload = function (file,urlL) {
          if(!/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/.test(file.name)){
            alert("图片类型必须是gif,jpeg,jpg,png中的一种")
            return ;
          }
          if(file.size> 500000){
            alert('图片不能大于5M');
            return ;
          }
          Upload.upload({
            url: global.baseUrl + '/api/manage/mytFile', //upload.php script, node.js route, or servlet url
            method: 'POST',
            file: file
          }).progress(function (evt) {
            var progressPercentage = parseInt(100.0 * evt.loaded / evt.total);
            console.log('progress: ' + progressPercentage + '% ' + evt.config.file.name);
          }).success(function (data, status, headers, config) {

            if(data && data.data){
              scope.source=data.data.id;
              scope.url = global.baseUrl + '/api/manage/mytFile/'+data.data.id+'?postMethod=image&token='+global.getToken();
            }
            console.log('file ' + config.file.name + 'uploaded. Response: ' + data);
          }).error(function (data, status, headers, config) {
            console.log('error status: ' + status);
          })
        };
        scope.$watch(function () {
          return scope.source;

        }, function () {
          scope.url=global.baseUrl + '/api/manage/mytFile/'+scope.source+'?postMethod=image&token='+global.getToken();
        });

      }
    };
  });
