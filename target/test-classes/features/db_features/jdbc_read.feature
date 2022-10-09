@db_read
Feature: db_customer_information

  Background: Connecting to the DB
    Given user connects to the application database

  Scenario: TC01_read_customer_ssn_info
    And user gets the column "*" from table "tp_customer"
    And user reads all of the column "ssn" data
    Then user close the connection


#  Print the phone number of customers
  Scenario: TC02_read_customer_phone_info
    And user gets the column "*" from table "tp_customer"
    And user reads all of the column "phone_number" data
    Then user close the connection

#    Print the city of customers
  Scenario: TC03_read_customer_city_info
    And user gets the column "*" from table "tp_customer"
    And user reads all of the column "city" data
    Then user close the connection


