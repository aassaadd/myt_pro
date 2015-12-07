'use strict';

describe('Controller: MypasswordupdateCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MypasswordupdateCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MypasswordupdateCtrl = $controller('MypasswordupdateCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MypasswordupdateCtrl.awesomeThings.length).toBe(3);
  });
});
