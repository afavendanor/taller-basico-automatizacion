Feature: Bay flight
  As a user, I want to buy a flight to relax on my vacations.

  Scenario: Bay flight
    Given I authenticate myself
    And I look for the flight
    And I select the flight
    When I buy the flight
    Then you should see the Flight Confirmation