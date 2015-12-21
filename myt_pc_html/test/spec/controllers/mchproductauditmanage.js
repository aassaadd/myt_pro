'use strict';

describe('Controller: MchproductauditmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MchproductauditmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MchproductauditmanageCtrl = $controller('MchproductauditmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MchproductauditmanageCtrl.awesomeThings.length).toBe(3);
  });
});
