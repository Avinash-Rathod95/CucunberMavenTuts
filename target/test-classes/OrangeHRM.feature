Feature: Orange HRM login with Multiple credentials\
 Scenario: To check the login page functionality for the Orange HRM site
   Given user is on Orange HRM login page
   When user enter the username in username field
   And user enter the password in password field
   And hits the login button
   Then login should be successful for Orange HRM site

 #//  Examples:
 #//  |username  |password  |status    |
 #//  |Avinash   |Avinash123|failed    |
 #//  |Admin     |admin123  |Successful|
 #//  |Rathod    |rathod124 |failed    |
