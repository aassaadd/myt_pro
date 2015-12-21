'use strict';

describe('Controller: MchcalllogsmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var MchcalllogsmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MchcalllogsmanageCtrl = $controller('MchcalllogsmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MchcalllogsmanageCtrl.awesomeThings.length).toBe(3);
  });
});
