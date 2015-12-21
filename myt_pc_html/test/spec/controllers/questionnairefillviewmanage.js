'use strict';

describe('Controller: QuestionnairefillviewmanageCtrl', function () {

  // load the controller's module
  beforeEach(module('mytPcHtmlApp'));

  var QuestionnairefillviewmanageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    QuestionnairefillviewmanageCtrl = $controller('QuestionnairefillviewmanageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(QuestionnairefillviewmanageCtrl.awesomeThings.length).toBe(3);
  });
});
