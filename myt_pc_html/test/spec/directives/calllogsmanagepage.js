'use strict';

describe('Directive: callLogsManagePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<call-logs-manage-page></call-logs-manage-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the callLogsManagePage directive');
  }));
});
