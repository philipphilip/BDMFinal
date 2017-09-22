@eregistry @eregistry-sn
Feature: Submit an Surrogacy Notification in eRegistry and Search for it in Core

  Scenario: Create a surrogacy notification in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "The County Court"
    And I navigate to "SN" in "eRegistry"
    Then I can fill and submit the "SN" form in "eRegistry"

  Scenario: Search for the Surrogacy Notification in Core
    When I open "Core" website
    And I sign in
    And I navigate to "Search SN" in "Core"
    Then I search for "SN" form created in "eRegistry"