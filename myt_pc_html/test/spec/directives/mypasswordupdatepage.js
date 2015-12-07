'use strict';

describe('Directive: myPasswordUpdatePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<my-password-update-page></my-password-update-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the myPasswordUpdatePage directive');
  }));
});
