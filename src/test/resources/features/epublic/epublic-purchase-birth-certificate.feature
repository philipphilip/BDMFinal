@epublic-bcp
Feature: ePublic purchase birth certificate

  Scenario: Request a BRS (Updated Scenario)
    Given I open "ePublic" website
    When I sign in "ePublic"
    And I navigate to "Application" in "ePublic"
    Then I can fill and submit the "Application" form in "ePublic"
