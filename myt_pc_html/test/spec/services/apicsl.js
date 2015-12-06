'use strict';

describe('Service: apiCsl', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiCsl;
  beforeEach(inject(function (_apiCsl_) {
    apiCsl = _apiCsl_;
  }));

  it('should do something', function () {
    expect(!!apiCsl).toBe(true);
  });

});
