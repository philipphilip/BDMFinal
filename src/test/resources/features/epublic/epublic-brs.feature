Feature: ePublic brs

  Scenario: Request a BRS (Updated Scenario)
    Given I open "ePublic" website
    When I sign in "ePublic"
    And I navigate to "BRS" in "ePublic"
    Then I can fill and submit the "BRS" form in "ePublic"
