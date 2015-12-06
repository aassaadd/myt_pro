'use strict';

describe('Service: pageModelConfFactory', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var pageModelConfFactory;
  beforeEach(inject(function (_pageModelConfFactory_) {
    pageModelConfFactory = _pageModelConfFactory_;
  }));

  it('should do something', function () {
    expect(!!pageModelConfFactory).toBe(true);
  });

});
