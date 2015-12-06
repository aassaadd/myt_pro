'use strict';

describe('Directive: leftMenuUser', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<left-menu-user></left-menu-user>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the leftMenuUser directive');
  }));
});
