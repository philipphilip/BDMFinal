@stsmoketests
Feature: Smoke tests on Development environment for deployment to System Test Environment

  Scenario: Request a BRS (Updated Scenario)
    Given I open "ePublic Dev" website
    When I sign in "ePublic"
    And I navigate to "BRS" in "ePublic"
    Then I can fill and submit the "BRS" form in "ePublic"

  Scenario: eregistry create drs and submit to Core
    Given I open "eRegistry Dev" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    Then I can fill and submit the "DRS" form in "eRegistry"

  Scenario: Navigate to BRS and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Navigate to NOB and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "NOB" new form
    Then I fill in the "NOB" form

  Scenario: Check the automatic creation of Birth Certificate
    When I open "Core Dev" website
    And I sign in
    Then I fill in the "BR" form

  Scenario: Navigate to DRS and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "DRS" new form
    Then I fill in the "DRS" form
