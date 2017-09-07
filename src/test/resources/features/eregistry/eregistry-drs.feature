@eregistry @eregistry-drs @st3
Feature: eregistry drs

  Scenario: eregistry create drs and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    Then I can fill and submit the "DRS" form in "eRegistry"

  Scenario: Search for the DRS in Core
    When I open "Core" website
    And I sign in
    And I navigate to "Search DRS" in "Core"
    Then I search for "DRS" form created in "eRegistry"
