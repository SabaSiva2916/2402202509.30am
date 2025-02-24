Feature: Validating login fields

  Scenario: Validating login with invalid username and invalid password
    Given user is on facebook application in chrome
    When user enter username and password
    And user click on login button

  Scenario: Validating login with valid username and invalid password
    Given user is on facebook application in chrome
    When user enrer valid username and invalid password
    And user click on login button
