'use strict';

describe('Service: apiLoginLog', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiLoginLog;
  beforeEach(inject(function (_apiLoginLog_) {
    apiLoginLog = _apiLoginLog_;
  }));

  it('should do something', function () {
    expect(!!apiLoginLog).toBe(true);
  });

});
