'use strict';

describe('Controller: MerchantmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MerchantmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MerchantmessageCtrl = $controller('MerchantmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MerchantmessageCtrl.awesomeThings.length).toBe(3);
  });
});
