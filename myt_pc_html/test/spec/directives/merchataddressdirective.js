'use strict';

describe('Directive: merchatAddressDirective', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<merchat-address-directive></merchat-address-directive>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the merchatAddressDirective directive');
  }));
});
