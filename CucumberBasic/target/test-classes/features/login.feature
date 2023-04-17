Feature: Login

  Scenario: Login to Website
    Given User navigates to website
    When User validates homepage
    Then user enters username
    And user enters password
    And user clicks on sign in button
