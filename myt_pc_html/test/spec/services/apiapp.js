'use strict';

describe('Service: apiApp', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiApp;
  beforeEach(inject(function (_apiApp_) {
    apiApp = _apiApp_;
  }));

  it('should do something', function () {
    expect(!!apiApp).toBe(true);
  });

});
