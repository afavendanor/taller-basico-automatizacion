Feature: Authenticate
  As a user, I want to authenticate to be able to buy a flight.

  Scenario: Authenticate
    Given Cesar is in mercury tours
    When Cesar is authenticated
    Then Cesar should see the home page