Feature: List of Adoption scenarios.

  Scenario: Navigate to Adoption form and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Adoption Notification" new form
    Then I fill in the "Adoption Notification" form

  #Scenario: Submut a Change of Sex Registration Service Application in core
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Application" new form
    #Then I fill in the "COS Reg Service" form
#
  #Scenario: Submut a Change of Sex Notifications in core
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Change of Sex Notification" new form
    #Then I fill in the "Change of Sex" form
