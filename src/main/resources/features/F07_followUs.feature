@smoke

Feature: Validating follow us feature

  Scenario: user should be able to click on facebook link
    When user click on facebook link
    Then user should navigate to facebook website

  Scenario: user should be able to click on twitter link
    When user click on twitter link
    Then user should navigate to twitter website

  Scenario: user should be able to click on rss link
    When user click on rss link
    Then user should navigate to rss website

  Scenario: user should be able to click on youtube link
    When user click on youtube link
    Then user should navigate to youtube website
