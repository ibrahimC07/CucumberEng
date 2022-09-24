@parameterized1
Feature: Google_Search

  Background: User_goes_to_google
    Given user opens the URL "https://www.google.com"

  Scenario: TC01_mercedes_search
    Given user search for "mercedes" on the google
    Then verify the page title contains "mercedes"
    Then close the application

  Scenario: TC02_tesla_search
    Given user search for "tesla" on the google
    Then verify the page title contains "tesla"
    Then close the application

  Scenario: TC03_sdet_search
    Given user search for "sdet" on the google
    Then verify the page title contains "sdet"
    Then close the application

  Scenario: TC03_QA_search
    Given user search for "QA" on the google
    Then verify the page title contains "QA"
    Then close the application


#Parameterization is done to create more reusable steps
#We use "" to pass dynamic data in the feature file
#We parameterize the feature file using ""
#There are other ways: Scenario Outline, DataTabless_search