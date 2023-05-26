Feature: Web login
  Scenario: User should be able to login with valid credencials
    Given the user is on page
    When the user enters valid credentials
    And hits submit button
    Then the user should be logged in Successfully