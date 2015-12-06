'use strict';

describe('Directive: /top/main', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<top-main></top-main>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the /top/main directive');
  }));
});
