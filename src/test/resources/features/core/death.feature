Feature: List of Death scenarios.

  Scenario: Navigate to DRS and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "DRS" new form
    Then I fill in the "DRS" form

  Scenario: Navigate to COD and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "COD" new form
    Then I fill in the "COD" form
  #Scenario: Create a Death Registration
    #When I open Core website
    #And I sign in "Core"
    #And I navigate to "COD" new form
    #Then I fill in the "COD" form
