'use strict';

describe('Service: apiAppModule', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiAppModule;
  beforeEach(inject(function (_apiAppModule_) {
    apiAppModule = _apiAppModule_;
  }));

  it('should do something', function () {
    expect(!!apiAppModule).toBe(true);
  });

});
