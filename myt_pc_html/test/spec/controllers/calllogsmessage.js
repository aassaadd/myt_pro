'use strict';

describe('Controller: CalllogsmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var CalllogsmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    CalllogsmessageCtrl = $controller('CalllogsmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(CalllogsmessageCtrl.awesomeThings.length).toBe(3);
  });
});
