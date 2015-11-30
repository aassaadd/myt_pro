'use strict';

/**
 * @ngdoc directive
 * @name mytPcHtmlApp.directive:paginationDirective
 * @description
 * # paginationDirective
 */
angular.module('mytPcHtmlApp')
  .directive('paginationDirective', function () {
    return {
      templateUrl: 'views/utils/paginationview.html',
      replace: true,
      restrict: 'EA',
      scope: {
        source: '=',
        page:'=',
        pageSize:'='
      },
      link: function postLink(scope, element, attrs) {
        //scope.pageSource = {
        //  totalElements: 0,//所有数据的条目
        //  totalPages: 0,//设置分页的总页数,
        //  size: 0,//每一页的条目数,
        //  number: 0,//当前页号,
        //  content: [],//分页数据内容,
        //  sort: {},//排序,
        //  last: true,//末页,
        //  numberOfElements: 0,//当前页的数据条目数
        //  first: false//首页
        //};
        if (!scope.conf) {
          scope.conf = {
            //currentPage: scope.source.number + 1,
            //itemsPerPage: scope.source.size,
            //totalItems: scope.source.totalElements,
            //numberOfPages: scope.source.totalPages
          };
        }
        // 定义分页的长度必须为奇数 (default:9)
        scope.conf.pagesLength = parseInt(scope.conf.pagesLength) ? parseInt(scope.conf.pagesLength) : 9;
        if (scope.conf.pagesLength % 2 === 0) {
          // 如果不是奇数的时候处理一下
          scope.conf.pagesLength = scope.conf.pagesLength - 1;
        }

        // conf.erPageOptions
        if (!scope.conf.perPageOptions) {
          scope.conf.perPageOptions = [10, 15, 20, 30, 50];
        }
        // 变更当前页
        scope.changeCurrentPage = function (item) {

          if (item == '...') {
            return;
          } else {
            scope.page = parseInt(item);
          }
        };
        // 跳转页
        //scope.jumpToPage = function () {
        //  scope.jumpPageNum = scope.jumpPageNum.replace(/[^0-9]/g, '');
        //  if (scope.jumpPageNum !== '') {
        //    scope.page  = scope.jumpPageNum;
        //  }
        //};
        // prevPage
        scope.prevPage = function () {
          if (scope.page > 1) {
            scope.page -= 1;
          }
        };
        // nextPage
        scope.nextPage = function () {
          if (scope.page < scope.source.totalPages) {
            scope.page += 1;
          }
        };
        // 修改每页显示的条数
        scope.changeItemsPerPage = function(){
          //scope.pageSize=;
        };

        // pageList数组
        function getPagination() {
          //// jumpPageNum
          //scope.jumpPageNum = scope.page;

          //// 如果scope.source.size在不在perPageOptions数组中，就把scope.source.size加入这个数组中
          //var perPageOptionsLength = scope.conf.perPageOptions.length;
          //// 定义状态
          //var perPageOptionsStatus;
          //for (var i = 0; i < perPageOptionsLength; i++) {
          //  if (scope.conf.perPageOptions[i] == scope.source.size) {
          //    perPageOptionsStatus = true;
          //  }
          //}
          //// 如果scope.source.size在不在perPageOptions数组中，就把scope.source.size加入这个数组中
          //if (!perPageOptionsStatus) {
          //  scope.conf.perPageOptions.push(scope.source.size);
          //}
          //
          //// 对选项进行sort
          //scope.conf.perPageOptions.sort(function (a, b) {
          //  return a - b
          //});

          scope.pageList = [];
          if (scope.source.totalPages <= scope.conf.pagesLength) {
            // 判断总页数如果小于等于分页的长度，若小于则直接显示
            for (var i = 1; i <= scope.source.totalPages; i++) {
              scope.pageList.push(i);
            }
          } else {
            // 总页数大于分页长度（此时分为三种情况：1.左边没有...2.右边没有...3.左右都有...）
            // 计算中心偏移量
            var offset = (scope.conf.pagesLength - 1) / 2;
            if (scope.page <= offset) {
              // 左边没有...
              for (var i = 1; i <= offset + 1; i++) {
                scope.pageList.push(i);
              }
              scope.pageList.push('...');
              scope.pageList.push(scope.source.totalPages);
            } else if (scope.page > scope.source.totalPages - offset) {
              scope.pageList.push(1);
              scope.pageList.push('...');
              for (var i = offset + 1; i >= 1; i--) {
                scope.pageList.push(scope.source.totalPages - i);
              }
              scope.pageList.push(scope.source.totalPages);
            } else {
              // 最后一种情况，两边都有...
              scope.pageList.push(1);
              scope.pageList.push('...');

              for (var i = Math.ceil(offset / 2); i >= 1; i--) {
                scope.pageList.push(scope.page - i);
              }
              scope.pageList.push(scope.page);
              for (var i = 1; i <= offset / 2; i++) {
                scope.pageList.push(scope.page + i);
              }

              scope.pageList.push('...');
              scope.pageList.push(scope.source.totalPages);
            }
          }
        };

        scope.$watch(function () {
          return scope.source;

        }, getPagination);
      }
    };
  });
