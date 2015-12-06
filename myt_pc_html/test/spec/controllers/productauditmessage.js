'use strict';

describe('Controller: ProductauditmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var ProductauditmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ProductauditmessageCtrl = $controller('ProductauditmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(ProductauditmessageCtrl.awesomeThings.length).toBe(3);
  });
});
