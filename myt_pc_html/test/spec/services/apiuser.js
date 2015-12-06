'use strict';

describe('Service: apiUser', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiUser;
  beforeEach(inject(function (_apiUser_) {
    apiUser = _apiUser_;
  }));

  it('should do something', function () {
    expect(!!apiUser).toBe(true);
  });

});
