@eregistry @eregistry-cod-st3 @eregistry-cod @st3 @temp
Feature: eregistry cod

  Scenario: eregistry create drs and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Manningham Medical Practitioner"
    And I navigate to "COD" in "eRegistry"
    Then I can fill and submit the "COD" form in "eRegistry"

  Scenario: Search for the COD in Core
    When I open "Core" website
    And I sign in
    And I navigate to "Search COD" in "Core"
    Then I search for "COD" form created in "eRegistry"
