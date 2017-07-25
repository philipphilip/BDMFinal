@eregistry @eregistry-cod-st3 @eregistry-cod @st3 @temp

Feature: eregistry cod

  Scenario: eregistry create cod and submit to core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "abc Medical Practitioner"
    And I navigate to "Cause of Death" in "eRegistry"
    And I fill in the "COD" of "COD form" in "eregistry"
    And I can see "This Cause of Death has been successfully saved" on "COD" page of "eregistry"
    And I navigate to "COD draft list" in "eRegistry"
    And I input "@CodFamilyName" in "Deceased's Family Name" on "cod draft search" page of "eregistry"
    And I click "Refresh" button on "cod draft search" page of "cod" in "eregistry"
    And I click "searchResult" button on "cod draft search" page of "cod" in "eregistry"
    And I click "Submit cod" button on "cod draft search" page of "cod" in "eregistry"
    And I click "Confirm Submit" button on "Confirmation required" page of "cod" in "eregistry"
    Then I can see "Successfully submitted notifications" on "cod Submit result" page of "eregistry"





