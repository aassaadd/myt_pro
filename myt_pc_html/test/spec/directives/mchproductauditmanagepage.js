'use strict';

describe('Directive: mchProductAuditManagePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<mch-product-audit-manage-page></mch-product-audit-manage-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the mchProductAuditManagePage directive');
  }));
});
