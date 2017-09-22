@brcreatefromcorebrseregnob
Feature: Create a NOB in eRegistry
  		   Create a BRS in Core which then matches to the NOB created in eRegistry to create the BR
  		   Search for the created BR

  Scenario: Create a NOB in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Alfred Hospital"
    And I navigate to "NOB" in "eRegistry"
    Then I can fill and submit the "NOB" form in "eRegistry"

  Scenario: Create a BRS in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Check the automatic creation of Birth Certificate
    When I open "Core" website
    And I sign in "Core"
    Then I fill in the "BR" form
