'use strict';

describe('Service: apiMch', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiMch;
  beforeEach(inject(function (_apiMch_) {
    apiMch = _apiMch_;
  }));

  it('should do something', function () {
    expect(!!apiMch).toBe(true);
  });

});
