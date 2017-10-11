Feature: Automation of submitting a Merriage form on the Core system and the creation of Merriage Rej

  Scenario: Navigate to Merriage page and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "MN" new form
    Then I fill in the "MN" form
#
  #Scenario: Create a Merriage Registration
    #Given I open "Core" website
    #And I login "Core" as user "admin2" password "Friday17"
    #Then I fill in the "MR" form
