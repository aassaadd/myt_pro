'use strict';

describe('Service: apiLogin', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiLogin;
  beforeEach(inject(function (_apiLogin_) {
    apiLogin = _apiLogin_;
  }));

  it('should do something', function () {
    expect(!!apiLogin).toBe(true);
  });

});
