'use strict';

describe('Controller: MerchantaddmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MerchantaddmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MerchantaddmanageCtrl = $controller('MerchantaddmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MerchantaddmanageCtrl.awesomeThings.length).toBe(3);
  });
});
