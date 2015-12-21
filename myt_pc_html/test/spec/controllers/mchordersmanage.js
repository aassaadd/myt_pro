'use strict';

describe('Controller: MchordersmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MchordersmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MchordersmanageCtrl = $controller('MchordersmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MchordersmanageCtrl.awesomeThings.length).toBe(3);
  });
});
