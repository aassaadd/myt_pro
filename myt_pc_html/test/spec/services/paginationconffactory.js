'use strict';

describe('Service: paginationConfFactory', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var paginationConfFactory;
  beforeEach(inject(function (_paginationConfFactory_) {
    paginationConfFactory = _paginationConfFactory_;
  }));

  it('should do something', function () {
    expect(!!paginationConfFactory).toBe(true);
  });

});
