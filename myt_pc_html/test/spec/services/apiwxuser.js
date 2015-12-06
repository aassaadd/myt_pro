'use strict';

describe('Service: apiWxUser', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiWxUser;
  beforeEach(inject(function (_apiWxUser_) {
    apiWxUser = _apiWxUser_;
  }));

  it('should do something', function () {
    expect(!!apiWxUser).toBe(true);
  });

});
