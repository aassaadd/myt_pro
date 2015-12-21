'use strict';

describe('Controller: MchproductmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MchproductmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MchproductmanageCtrl = $controller('MchproductmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MchproductmanageCtrl.awesomeThings.length).toBe(3);
  });
});
