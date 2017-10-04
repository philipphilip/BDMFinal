@internalUser
Feature: Create an internal user

  Scenario: Create an Internal User in Core Admin UI
    Given I open "Core Admin UI" website
    When I sign in "Core Admin UI"
    And I navigate to "Create internal user" in "Core Admin UI"
    Then I can fill and submit the "Create internal user" form in "Core Admin UI"
