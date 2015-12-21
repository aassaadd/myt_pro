'use strict';

describe('Directive: mchCallLogsManagePage', function () {

  // load the directive's module
  beforeEach(module('mytPcHtmlApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should make hidden element visible', inject(function ($compile) {
    element = angular.element('<mch-call-logs-manage-page></mch-call-logs-manage-page>');
    element = $compile(element)(scope);
    expect(element.text()).toBe('this is the mchCallLogsManagePage directive');
  }));
});
