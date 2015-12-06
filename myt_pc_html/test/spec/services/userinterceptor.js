'use strict';

describe('Service: UserInterceptor', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var UserInterceptor;
  beforeEach(inject(function (_UserInterceptor_) {
    UserInterceptor = _UserInterceptor_;
  }));

  it('should do something', function () {
    expect(!!UserInterceptor).toBe(true);
  });

});
