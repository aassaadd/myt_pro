'use strict';

describe('Controller: ProductdoauditmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var ProductdoauditmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ProductdoauditmanageCtrl = $controller('ProductdoauditmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(ProductdoauditmanageCtrl.awesomeThings.length).toBe(3);
  });
});
