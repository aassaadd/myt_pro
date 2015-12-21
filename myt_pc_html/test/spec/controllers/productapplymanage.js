'use strict';

describe('Controller: ProductapplymanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var ProductapplymanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ProductapplymanageCtrl = $controller('ProductapplymanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(ProductapplymanageCtrl.awesomeThings.length).toBe(3);
  });
});
