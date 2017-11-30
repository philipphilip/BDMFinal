Feature: All Core site testings.

  #Scenario: Sign in and sign out
    #Given I open "Core" website
    #And I sign in "Core"
    #Then I sign out

  Scenario: Navigate to NOB and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "NOB" new form
    Then I fill in the "NOB" form

  Scenario: Navigate to BRS and fill the form
    Given I open "Core" website
    And I login "Core" as user "admin2" password "Friday17"
#    And I login "Core" as user "Carl.Ruz" password "oSWCjm1vvCjOHnrniMAW"
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form
#
  Scenario: Search for a Birth Registration
    Given I open "Core" website
    And I sign in "Core"
    Then I fill in the "BR" form

  Scenario: Request a Birth certificate
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "Birth Application" form

  Scenario: Navigate to COD and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "COD" new form
    Then I fill in the "COD" form

  Scenario: Navigate to DRS and fill the form
    Given I open "Core" website
    And I login "Core" as user "admin2" password "Friday17"
#    And I login "Core" as user "Carl.Ruz" password "oSWCjm1vvCjOHnrniMAW"
    And I navigate to "DRS" new form
    Then I fill in the "DRS" form

  Scenario: Check the automatic creation of Death Registration
    Given I open "Core" website
    And I sign in "Core"
    Then I fill in the "DR" form

  #Scenario: Request a Death certificate
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Application" new form
    #Then I fill in the "Death Application" form
#
  #Scenario: Navigate to Marriage page and fill the form
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "MN" new form
    #Then I fill in the "MN" form
#
  #Scenario: Create a Marriage Registratio
    #Given I open "Core" website
    #And I login "Core" as user "admin2" password "Friday17"
    #Then I fill in the "MR" form
#
  #Scenario: Request a Marriage Certificate
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Application" new form
    #Then I fill in the "Marriage Certificate request" form
#
  #Scenario: Sign in as a Admin and create a Product
    #Given I open "Core Admin UI" website
    #When I sign in "Core Admin UI"
    #And I navigate to "New Product" new form
    #Then I fill in the "New Product" form
#
  #Scenario: Submut a Change of Name Notifications in core
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Change of Name" new form
    #Then I fill in the "Change of Name" form
#
  #Scenario: Navigate to Adoption form and fill the form
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Adoption Notification" new form
    #Then I fill in the "Adoption Notification" form
#
  #Scenario: Submut a Change of Sex Notifications in core
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "Change of Sex Notification" new form
    #Then I fill in the "Change of Sex" form
#
  #Scenario: Test task creation and closure (Test creation and completion of tasks using NOB)
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "NOB" new form
    #Then I fill in the "NOB for Tasks" form
#
  #Scenario: Create SMS & Email correspondence templates (Test SMS&EMail correspondence: Create SMS and Email correspondence templates, create BRS and send correspondence using the newly created templates)
    #Given I open "Core Admin UI" website
    #When I sign in "Core Admin UI"
    #And I navigate to "Create Correspondence Template" in "Core Admin UI"
    #Then I can fill and submit the "Create SMS & EMail correspondence templates" form in "Core Admin UI"
#
  #Scenario: Navigate to BRS and fill the form for SMS & Email correspondence
    #Given I open "Core" website
    #And I sign in "Core"
    #And I navigate to "BRS" new form
    #Then I fill in the "BRS for SMS & Email correspondence" form
#
  #Scenario: Create an Internal User in Core Admin UI (Test creation of an internal user: Create an internal user in Core Admin UI)
    #Given I open "Core Admin UI" website
    #When I sign in "Core Admin UI"
    #And I navigate to "Create internal user" in "Core Admin UI"
    #Then I can fill and submit the "Create internal user" form in "Core Admin UI"
