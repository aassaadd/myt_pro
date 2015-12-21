'use strict';

describe('Directive: productApplyManagePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<product-apply-manage-page></product-apply-manage-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the productApplyManagePage directive');
  }));
});
