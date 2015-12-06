'use strict';

describe('Controller: UsermessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var UsermessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    UsermessageCtrl = $controller('UsermessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(UsermessageCtrl.awesomeThings.length).toBe(3);
  });
});
