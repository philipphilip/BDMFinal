@eregistry @eregistry-an
Feature: Submit an Adoption Notification in eRegistry and Search for it in Core

  Scenario: Create an adoption notification in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Find Adoption"
    And I navigate to "AN" in "eRegistry"
    Then I can fill and submit the "AN" form in "eRegistry"

  Scenario: Search for the AN in Core
    When I open "Core" website
    And I sign in
    And I navigate to "Search AN" in "Core"
    Then I search for "AN" form created in "eRegistry"