'use strict';

describe('Directive: roleSelectTabDirective', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<role-select-tab-directive></role-select-tab-directive>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the roleSelectTabDirective directive');
  }));
});
