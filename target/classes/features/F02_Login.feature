@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user should navigate to login page
    When user enter email "mohmed2501@gmail.com" and password "momo_2000"
    And user click on login button
    Then user login to the web application successfully
  Scenario: user login with invalid email and password
    Given user should navigate to login page
    When user enter email "momo123@gmail.com" and password "momo1234"
    And user click on login button
    Then user could not login to the web application