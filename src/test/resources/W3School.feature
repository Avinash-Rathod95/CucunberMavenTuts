Feature: validate W3School website
  Scenario: Validate SignUp page of W3Schools website
    Given user on W3Schools page
    When user click on signUp page
    Then user redirect to the signUp page
    And User click on signUp for free button
    Then user navigate to signUp Page
    Then user enter the email Id
    And user enter the password
    Then hits the signUp for free button
