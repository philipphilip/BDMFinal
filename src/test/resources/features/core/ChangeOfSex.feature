Feature: All COS related test scenarion in Core site.

  Scenario: Submut a Change of Sex Notifications in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Change of Sex" new form
    Then I fill in the "Change of Sex" form
