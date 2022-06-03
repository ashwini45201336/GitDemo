Feature: feature to test login functionality

  Scenario: Check login is successful with credentials
    Given user is on login page
    When user enters user name and passwored
    And clicks on login button
    Then user is navigated to home page
