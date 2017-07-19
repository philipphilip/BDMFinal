
Feature: List of Birth scenarios.

  Scenario: Navigate to BRS and fill the form
    When I open Core website
    And I sign in
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Navigate to NOB and fill the form
    When I open Core website
    And I sign in
    And I navigate to "NOB" new form
    Then I fill in the "NOB" form
