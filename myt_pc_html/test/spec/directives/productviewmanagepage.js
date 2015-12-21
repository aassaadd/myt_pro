'use strict';

describe('Directive: productViewManagePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<product-view-manage-page></product-view-manage-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the productViewManagePage directive');
  }));
});
