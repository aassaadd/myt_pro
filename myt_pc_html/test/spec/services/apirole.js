'use strict';

describe('Service: apiRole', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiRole;
  beforeEach(inject(function (_apiRole_) {
    apiRole = _apiRole_;
  }));

  it('should do something', function () {
    expect(!!apiRole).toBe(true);
  });

});
