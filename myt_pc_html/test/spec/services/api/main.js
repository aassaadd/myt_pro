'use strict';

describe('Service: apiMain', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiMain;
  beforeEach(inject(function (_apiMain_) {
    apiMain = _apiMain_;
  }));

  it('should do something', function () {
    expect(!!apiMain).toBe(true);
  });

});
