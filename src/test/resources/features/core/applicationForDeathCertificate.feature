Feature: Fill an application for Death Certificate

  Scenario: Request a Death certificate
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "Death Application" form
