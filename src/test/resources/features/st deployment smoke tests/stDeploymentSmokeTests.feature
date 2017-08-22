Feature: Smoke tests on Development environment for deployment to System Test Environment

  Scenario: Request a BRS (Updated Scenario)
    Given I open "ePublic Dev" website
    When I sign in "ePublic"
		And I navigate to "BRS" in "ePublic Dev"
		Then I can fill and submit the "BRS" form
		
  Scenario: eregistry create drs and submit to core
    Given I open "eRegistry Dev" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    And I fill in the "DRS" of "DRS form" in "eregistry"
    And I can see "This Death Registration Statement has been successfully saved" on "Drs" page of "eregistry"
    And I navigate to "DRS draft list" in "eRegistry"
    And I input "@DrsFamilyName" in "Deceased's Family Name" on "drs draft search" page of "eregistry"
    And I click "Refresh" button on "drs draft search" page of "Drs" in "eregistry"
    And I click "searchResult" button on "drs draft search" page of "Drs" in "eregistry"
    And I click "Submit Drs" button on "drs draft search" page of "Drs" in "eregistry"
    And I click "Confirm Submit" button on "Confirmation required" page of "Drs" in "eregistry"
    Then I can see "Successfully submitted notifications" on "drs Submit result" page of "eregistry"
  
  Scenario: Navigate to BRS and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Navigate to NOB and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "NOB" new form
    Then I fill in the "NOB" form

  Scenario: Check the automatic creation of Birth Certificate
    When I open "Core Dev" website
    And I sign in
    Then I fill in the "BR" form
    
  Scenario: Navigate to DRS and fill the form
    When I open "Core Dev" website
    And I sign in
    And I navigate to "DRS" new form
    Then I fill in the "DRS" form