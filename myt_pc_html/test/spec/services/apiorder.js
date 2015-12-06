'use strict';

describe('Service: apiOrder', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiOrder;
  beforeEach(inject(function (_apiOrder_) {
    apiOrder = _apiOrder_;
  }));

  it('should do something', function () {
    expect(!!apiOrder).toBe(true);
  });

});
