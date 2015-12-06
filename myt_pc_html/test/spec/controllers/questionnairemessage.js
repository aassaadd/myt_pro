'use strict';

describe('Controller: QuestionnairemessageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var QuestionnairemessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    QuestionnairemessageCtrl = $controller('QuestionnairemessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(QuestionnairemessageCtrl.awesomeThings.length).toBe(3);
  });
});
