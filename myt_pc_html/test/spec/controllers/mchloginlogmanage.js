'use strict';

describe('Controller: MchloginlogmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MchloginlogmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MchloginlogmanageCtrl = $controller('MchloginlogmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MchloginlogmanageCtrl.awesomeThings.length).toBe(3);
  });
});
