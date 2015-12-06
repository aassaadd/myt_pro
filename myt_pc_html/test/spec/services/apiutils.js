'use strict';

describe('Service: apiUtils', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiUtils;
  beforeEach(inject(function (_apiUtils_) {
    apiUtils = _apiUtils_;
  }));

  it('should do something', function () {
    expect(!!apiUtils).toBe(true);
  });

});
