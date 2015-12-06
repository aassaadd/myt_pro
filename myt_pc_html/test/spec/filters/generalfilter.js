'use strict';

describe('Filter: generalFilter', function () {

  // load the filter's module
  beforeEach(module('mytPcHtmlApp'));

  // initialize a new instance of the filter before each test
  var generalFilter;
  beforeEach(inject(function ($filter) {
    generalFilter = $filter('generalFilter');
  }));

  it('should return the input prefixed with "generalFilter filter:"', function () {
    var text = 'angularjs';
    expect(generalFilter(text)).toBe('generalFilter filter: ' + text);
  });

});
