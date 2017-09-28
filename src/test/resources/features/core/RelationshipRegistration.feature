Feature: Set the system parameter for Relationship Registration as negative one day to process Relationship Registration immediately
  		 Create an application for Relationship Registration Service
  		 Create a Relationship Notification and link to the application created earlier
  		 Wait for one minute and search if the Relationship Registration has been created by the system

  Scenario: Set system parameter as negative one for the Relationship Registration in Core Old UI
    Given I open "Core Old UI" website
    When I sign in "Core Old UI"
    And I navigate to "System Parameters" new form
    Then I fill in the "Relationship Registration Parameter" form

  Scenario: Create a Relationship Notification in Core
    Given I open "Core" website
    When I sign in "Core"
    And I navigate to "RN" new form
    Then I fill in the "RN" form

  Scenario: Create a Relationship Registration Service Application
    Given I open "Core" website
    When I sign in "Core"
    And I navigate to "Application" new form
    Then I fill in the "Relationship Application" form

  Scenario: Search for the Relationship Registration in Core
    Given I open "Core" website
    When I sign in "Core"
    And I navigate to "Search RR" in "Core"
    Then I search for "RR" form created in "Core"
