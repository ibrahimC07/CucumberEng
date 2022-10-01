@db_read
Feature: db_customer_information

  Scenario: TC01_read_customer_ssn_info
    Given user connects to the application database
    And user gets the column "*" from table "tp_customer"
    And user reads all of the column "ssn" data
    Then user close the connection