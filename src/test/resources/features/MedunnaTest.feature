Feature: Medunna_Test

  Background: Go to homepage
    Given user opens the URL "https://medunna.com"
    Then verify the page title contains "MEDUNNA"
    Then capture the screenshot
@Medunna_Room_Test
  Scenario Outline: Medunna_Room_Manipulation
    Given Sign in as Admin with username "<username>" and password "<password>"
    When Click on Items&Titles button
    And Click on Room button
    And Click on Create a new Room button
    Then Verify Create or edit a Room text
    When Enter the room number as "<room number>" in the room number box
    And Clear the room number
    And Click on Room Type dropdown
    Then Verify This field is required.
    When Enter the room number as "<room number>" in the room number box
    Then Verify 5 room types exist in Room Type dropdown
    When Click on Status Checkbox
    Then Verify that checkbox is selected
    When Send price as "<price>" to price box
    And Clear the price box
    And Click on Description box
    Then Verify This field is required.
    When Send price as "<price>" to price box
    And Send description as "<description>" to the Description box
    And Clear the Description box
    And Click on price
    Then Verify that This field is required is not displayed
    When Click on first view button
    Then Verify Room header
    When Click on back button
    Then Verify there are 20 view buttons
    When Click on Edit Button
    And Change the Description
    And Click on save button
    Then Verify The room is updated.
    When Click on Created Date to sort rooms from newest to oldest
    And Click on first delete button
    And Click on Delete button on alert
    Then Verify A room is Deleted message
    Then close the application


    Examples:
      | username   | password | room number | price | description  |
      | adminrecep | 123Recep | 99579       | 1234  | Medunna Room |