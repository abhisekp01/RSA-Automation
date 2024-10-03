
Feature: weekly and all product count

Scenario: Livingstons Weekly Ads -

Given user is on weekly page of livingstons location
Then I count the total number in livingstons

Scenario: Livingstons All Products -

When I click on products in livingstons market
And I count all products in livingstons market

