'use strict';

describe('Controller: RolemessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var RolemessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    RolemessageCtrl = $controller('RolemessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(RolemessageCtrl.awesomeThings.length).toBe(3);
  });
});
