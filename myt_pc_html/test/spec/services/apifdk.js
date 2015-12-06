'use strict';

describe('Service: apiFdk', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiFdk;
  beforeEach(inject(function (_apiFdk_) {
    apiFdk = _apiFdk_;
  }));

  it('should do something', function () {
    expect(!!apiFdk).toBe(true);
  });

});
