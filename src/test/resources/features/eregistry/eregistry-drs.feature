@eregistry @eregistry-drs @st3

Feature: eregistry drs

  Scenario: eregistry create drs and submit to core
    Given I open "eRegistry" website
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




