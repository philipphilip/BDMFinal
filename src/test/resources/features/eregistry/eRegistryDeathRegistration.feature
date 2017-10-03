Feature: Create a COD in eRegistry, Create a DRS in eRegistry
  		 Search for the COD and DRS in Core and make them Compliant if not already
  		 Search for the auto created Death Registration in Core

  Scenario: Validate & Create a COD in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Manningham Medical Practitioner"
    And I navigate to "COD" in "eRegistry"
    Then I can validate the "COD in eRegistry" form
    Then I can fill and submit the "COD" form in "eRegistry"

  Scenario: Validate & Create a DRS in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    Then I can validate the "DRS in eRegistry" form
    Then I can fill and submit the "DRS" form in "eRegistry"

  Scenario: Search for the DRS in Core and make it compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search DRS" in "Core"
    Then I search for "DRS" form and make it compliant

  Scenario: Search for the COD in Core and make it compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search COD" in "Core"
    Then I search for "COD" form and make it compliant

  Scenario: Search for the COD in Core and make it compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search DR" in "Core"
    Then I search for "DR" form created in "eRegistry"
