'use strict';

describe('Controller: ProductmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var ProductmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ProductmessageCtrl = $controller('ProductmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(ProductmessageCtrl.awesomeThings.length).toBe(3);
  });
});
