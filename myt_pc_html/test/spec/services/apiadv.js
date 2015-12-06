'use strict';

describe('Service: apiAdv', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiAdv;
  beforeEach(inject(function (_apiAdv_) {
    apiAdv = _apiAdv_;
  }));

  it('should do something', function () {
    expect(!!apiAdv).toBe(true);
  });

});
