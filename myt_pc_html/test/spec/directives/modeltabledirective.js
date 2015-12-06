'use strict';

describe('Directive: modelTableDirective', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<model-table-directive></model-table-directive>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the modelTableDirective directive');
  }));
});
