'use strict';

describe('Controller: QuestionnaireaddmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var QuestionnaireaddmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    QuestionnaireaddmanageCtrl = $controller('QuestionnaireaddmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(QuestionnaireaddmanageCtrl.awesomeThings.length).toBe(3);
  });
});
