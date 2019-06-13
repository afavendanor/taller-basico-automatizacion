Feature: Authenticate
  As a user, I want to authenticate to be able to buy a flight.

  Scenario: Authenticate
    Given I am in mercury tours
    When I authenticate
    Then I should see the home page