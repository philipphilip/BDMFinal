@epublic-bcp
Feature: ePublic guest user purchase birth certificate

  Scenario: Request a birth certificate as a guest user
    Given I open "ePublic" website
    And I navigate to "Application" in "ePublic"
    Then I can fill and submit the "Application" form in "ePublic"

  Scenario: Search for the birth certificate in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search Application" in "Core"
    Then I search for "Application" form created in "ePublic"
