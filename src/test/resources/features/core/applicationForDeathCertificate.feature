Feature: Fill an application for Death Certificate

  Scenario: Request a Death certificate
    When I open Core website
    And I sign in
    And I navigate to "Application" new form
    Then I fill in the "Application" form
