Feature: ePublic brs

  Scenario: Request a BRS (Updated Scenario)
    Given I open "ePublic" website
    When I sign in "ePublic"
    And I navigate to "BRS" in "ePublic"
    Then I can fill and submit the "BRS" form in "ePublic"

  Scenario: Search for the BRS in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search BRS" in "Core"
    Then I search for "BRS" form created in "ePublic"
