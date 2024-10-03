Feature: weekly and all product count

Scenario: CAIN'S  FRESH MARKET - AlbanyCain Weekly Ads -

Given user is on weekly page of albanycain location
Then I count the total number in albanycain


Scenario: AlbanyCain All Products -

When I click on products in albanycain market
And I count all products in albanycain market
