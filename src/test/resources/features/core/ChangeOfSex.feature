Feature: All COS related test scenarion in Core site.

  #Scenario: Navigate to NOB and fill the form
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "NOB" new form
    #Then I fill in the "NOB" form
#
  #Scenario: Navigate to BRS and fill the form
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "BRS" new form
    #Then I fill in the "BRS" form

  Scenario: Submut a Change of Sex Registration Service Application in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "COS Reg Service" form

  Scenario: Submut a Change of Sex Notifications in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Change of Sex" new form
    Then I fill in the "Change of Sex" form
