@parameterized1 @regression_tests
Feature: Google_Search

  Background: User_goes_to_google
    Given user opens the URL "https://www.google.com"

  Scenario Outline: : TC01_outline_search
    Given user search for "<item>" on the google
    Then verify the page title contains "<item>"
    Then close the application
    Examples:
      | item    |
      |mercedes |
      |tesla    |
      |toyota   |
      |toros    |
      |opel     |


