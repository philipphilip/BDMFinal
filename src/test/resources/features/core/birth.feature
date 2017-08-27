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

  Scenario: Check the automatic creation of Birth Certificate
    When I open Core website
    And I sign in
    Then I fill in the "BR" form
    
  Scenario: Request a Birth certificate
    When I open "Core" website
    And I sign in
    And I navigate to "Application" new form
    Then I fill in the "Birth Application" form
