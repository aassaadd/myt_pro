'use strict';

describe('Service: apiProduct', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var apiProduct;
  beforeEach(inject(function (_apiProduct_) {
    apiProduct = _apiProduct_;
  }));

  it('should do something', function () {
    expect(!!apiProduct).toBe(true);
  });

});
