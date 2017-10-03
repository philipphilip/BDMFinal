@tasktesting
Feature: Test the creation of tasks when an invalid data is entered and then check the closure of tasks when the invalid data is corrected

Scenario: Test task creation and closure
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "NOB" new form
    Then I fill in the "NOB for Tasks" form