'use strict';

describe('Service: apiClass', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiClass;
  beforeEach(inject(function (_apiClass_) {
    apiClass = _apiClass_;
  }));

  it('should do something', function () {
    expect(!!apiClass).toBe(true);
  });

});
