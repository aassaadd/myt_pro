'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:kindeditorDirective
 * @description
 * # kindeditorDirective
 */
angular.module('mytPcHtmlApp')
    .directive('kindeditorDirective', function (global) {
      return {
        template: '<textarea ng-model="source" cols="100" rows="8" style="width: 100%; height: 200px; visibility: hidden;"  ></textarea>',
        restrict: 'EA',
        replace: true,
        scope: {
          source:'='
        },
        link: function postLink(scope, element, attrs) {
          scope.source='';
          var editor = KindEditor.create(
              //'textarea[name="content"]',
              element,
              {
                items:[
                  'source', '|', 'undo', 'redo', '|', 'preview', 'print', 'template', 'code', 'cut', 'copy', 'paste',
                  'plainpaste', 'wordpaste', '|', 'justifyleft', 'justifycenter', 'justifyright',
                  'justifyfull', 'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent', 'subscript',
                  'superscript', 'clearhtml', 'quickformat', 'selectall', '|', 'fullscreen', '/',
                  'formatblock', 'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold',
                  'italic', 'underline', 'strikethrough', 'lineheight', 'removeformat', '|', 'image', 'multiimage',
                  'flash', 'media', 'insertfile', 'table', 'hr', 'emoticons', 'baidumap', 'pagebreak',
                  'anchor', 'link', 'unlink'
                ],
                imageSizeLimit:'5MB',
                uploadJson: global.baseUrl+'/api/mytFile?token='+global.getToken(),
                allowFileManager : false,
                allowPreviewEmoticons : false,
                allowImageUpload : true,
                afterBlur: function(){
                  var self = this;
                  self.sync();
                  scope.$apply(function() {
                    scope.source=self.html();
                  });
                  //console.log(scope.ngModel);
                },
                afterCreate : function() {
                  //var self = this;
                  //KindEditor.ctrl(document, 13, function() {
                  //  self.sync();
                  //  scope.$apply(function() {
                  //    scope.ngModel=self.fullHtml();
                  //  });
                  //  console.log(scope.ngModel);
                  //  //document.forms['example'].submit();
                  //});
                  //KindEditor.ctrl(self.edit.doc, 13, function() {
                  //  self.sync();
                  //  scope.$apply(function() {
                  //    scope.ngModel=self.fullHtml();
                  //  });
                  //  //document.forms['example'].submit();
                  //});
                }
              });
          scope.$watch(function(){
            return  scope.source;
          },function(){
            editor.html(scope.source)
          });
        }
      };
    });
