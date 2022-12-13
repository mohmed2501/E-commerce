@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
     When user select gender type
    And user enter First Name "Mohamed"
    And user Enter Last Name  "Ali"
    And user Enter Date of birth
    And user enter valid email
    And  user enter matched password
    And  user enter confirm password
    And  user clicks on register button
    Then success message is displayed