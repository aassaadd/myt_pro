'use strict';

describe('Service: apiQu', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiQu;
  beforeEach(inject(function (_apiQu_) {
    apiQu = _apiQu_;
  }));

  it('should do something', function () {
    expect(!!apiQu).toBe(true);
  });

});
