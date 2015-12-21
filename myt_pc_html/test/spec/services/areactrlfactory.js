'use strict';

describe('Service: areaCtrlFactory', function () {

  // load the service's module
  beforeEach(module('mytPcHtmlApp'));

  // instantiate service
  var areaCtrlFactory;
  beforeEach(inject(function (_areaCtrlFactory_) {
    areaCtrlFactory = _areaCtrlFactory_;
  }));

  it('should do something', function () {
    expect(!!areaCtrlFactory).toBe(true);
  });

});
