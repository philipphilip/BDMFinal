Feature: Automation of submitting a Merriage form on the Core system
	
  Scenario: Navigate to Merriage page and fill the form
    When I open Core website
    And I sign in
    And I navigate to "MN" new form
    Then I fill in the "MN" form