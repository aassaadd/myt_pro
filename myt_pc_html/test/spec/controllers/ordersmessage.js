'use strict';

describe('Controller: OrdersmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var OrdersmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    OrdersmessageCtrl = $controller('OrdersmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(OrdersmessageCtrl.awesomeThings.length).toBe(3);
  });
});
