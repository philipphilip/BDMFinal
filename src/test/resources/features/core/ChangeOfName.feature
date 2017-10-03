Feature: All CON related test scenarion in Core site.

  Scenario: Submut a Change of Name Notifications in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Change of Name" new form
    Then I fill in the "Change of Name" form

  #Scenario: Validate the required fileds in CON form for a VIC Born Adult
    #Given I open "Core" website
    #And I sign in
    #And I navigate to "Change of Name" new form
    #Then I can validate the "Vic Born Adult CON Blank" form
    
  #Scenario: Validate the required fileds in CON form for a Overseas Born Adult
    #Given I open "Core" website
    #And I sign in
    #And I navigate to "Change of Name" new form
    #Then I can validate the "Overseas Born Adolt CON Blan" form
#
  #Scenario: Validate the required fileds in CON form for a Overseas Born Child
    #Given I open "Core" website
    #And I sign in
    #And I navigate to "Change of Name" new form
    #Then I can validate the "Overseas Born Child CON Blank" form
#
  #Scenario: Validate the required fileds in CON form for a VIC Born Child
    #Given I open "Core" website
    #And I sign in
    #And I navigate to "Change of Name" new form
    #Then I can validate the "Vic Born Child CON Blank" form
