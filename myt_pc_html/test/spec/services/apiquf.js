'use strict';

describe('Service: apiQuf', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiQuf;
  beforeEach(inject(function (_apiQuf_) {
    apiQuf = _apiQuf_;
  }));

  it('should do something', function () {
    expect(!!apiQuf).toBe(true);
  });

});
