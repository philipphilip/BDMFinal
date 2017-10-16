Feature: All ePublic Tests

  Scenario: Request a BRS
    Given I open "ePublic" website
    When I sign in "ePublic"
    And I navigate to "BRS" in "ePublic"
    Then I can fill and submit the "BRS" form in "ePublic"

  Scenario: Search for the BRS in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search BRS" in "Core"
    Then I search for "BRS" form created in "ePublic"

  Scenario: Request a birth certificate
    Given I open "ePublic" website
    When I sign in "ePublic"
    And I navigate to "Application" in "ePublic"
    Then I can fill and submit the "Application" form in "ePublic"

  Scenario: Search for the birth certificate in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search Application" in "Core"
    Then I search for "Application" form created in "ePublic"
