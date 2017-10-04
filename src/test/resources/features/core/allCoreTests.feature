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
    And I sign in "Core"
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Check the automatic creation of Birth Registration
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
    And I login "Core" as user "admin2" password "Friday17"
    And I navigate to "COD" new form
    Then I fill in the "COD" form

  Scenario: Navigate to DRS and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "DRS" new form
    Then I fill in the "DRS" form

  Scenario: Check the automatic creation of Death Certificate
    Given I open "Core" website
    And I sign in "Core"
    Then I fill in the "DR" form

  Scenario: Request a Death certificate
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "Death Application" form

  Scenario: Navigate to Marriage page and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "MN" new form
    Then I fill in the "MN" form

  Scenario: Create a Marriage Registratio
    Given I open "Core" website
    And I login "Core" as user "admin2" password "Friday17"
    Then I fill in the "MR" form

  Scenario: Request a Marriage Certificate
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "Marriage Certificate request" form

  Scenario: Sign in as a Admin and create a Product
    Given I open "Core Admin UI" website
    When I sign in "Core Admin UI"
    And I navigate to "New Product" new form
    Then I fill in the "New Product" form

  Scenario: Submut a Change of Name Notifications in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Change of Name" new form
    Then I fill in the "Change of Name" form

  Scenario: Submut a Change of Sex Notifications in core
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "Change of Sex" new form
    Then I fill in the "Change of Sex" form

  # Test creation and completion of tasks using BRS
  Scenario: Test task creation and closure
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "NOB" new form
    Then I fill in the "NOB for Tasks" form

  # Test SMS&EMail correspondence: Create SMS and Email correspondence templates, create BRS and send correspondence using the newly created templates
  Scenario: Create SMS & Email correspondence templates
    Given I open "Core Admin UI" website
    When I sign in "Core Admin UI"
    And I navigate to "Create Correspondence Template" in "Core Admin UI"
    Then I can fill and submit the "Create SMS & EMail correspondence templates" form in "Core Admin UI"

  Scenario: Navigate to BRS and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "BRS" new form
    Then I fill in the "BRS for SMS & Email correspondence" form
  #=========================================================================
  #Scenario: Request a Death certificate
  #Given I open "Core Old UI" website
  #When I sign in "Core Old UI"
  #And I navigate to "System Parameters" new form
  #Then I fill in the "Relationship Registration Parameter" form
  #
  #Scenario: Create a Relationship Notification in Core
  #Given I open "Core" website
  #When I sign in "Core"
  #And I navigate to "RN" new form
  #Then I fill in the "RN" form
  #
  #Scenario: Create a Relationship Registration Service Application
  #Given I open "Core" website
  #When I sign in "Core"
  #And I navigate to "Application" new form
  #Then I fill in the "Relationship Application" form
  #
  #Scenario: Search for the Surrogacy Notification in Core
  #Given I open "Core" website
  #When I sign in "Core"
  #And I navigate to "Search SN" in "Core"
  #Then I search for "RR" form created in "Core"
