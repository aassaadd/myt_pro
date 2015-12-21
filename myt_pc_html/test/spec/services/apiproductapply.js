'use strict';

describe('Service: apiProductApply', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiProductApply;
  beforeEach(inject(function (_apiProductApply_) {
    apiProductApply = _apiProductApply_;
  }));

  it('should do something', function () {
    expect(!!apiProductApply).toBe(true);
  });

});
