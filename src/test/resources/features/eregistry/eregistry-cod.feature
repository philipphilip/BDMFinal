@eregistry @st3 @temp

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




    #Given I open ePublic website
    #When I sign in ePublic
    #And I navigate to "BRS" in ePublic
    #And I fill in the "Child's details" of BRS in epublic
    #And I fill in the "Parent details" of BRS in epublic
    #And I fill in the "Second parent details" of BRS in epublic
    #And I click "Next" button on "Donor treatment details" page of "BRS" in "epublic"
    #And I fill in the "Relationship details" of BRS in epublic
    #And I click "Next" button on "Children of this relationship" page of "BRS" in "epublic"
    #And I click "Next" button on "Children of previously relationship" page of "BRS" in "epublic"
    #And I fill in the "Second parent participation details" of BRS in epublic
    #And I fill in the "Informant 1 details" of BRS in epublic
    #And I click "Save" button on "Declaration" page of "BRS" in "epublic"
    #And I can see "This Birth Registration Statement has been successfully saved" on page
    #And I click "Continue" button on "Declaration" page of "BRS" in "epublic"
    #And I click "Close" button on "Add Documents" page of "BRS" in "epublic"
    #And I click "DashBoard" button on "Declaration" page of "BRS" in "epublic"
    #And I click "Submit Order" button on "Declaration" page of "BRS" in "epublic"
    #And I click "accept the terms and conditions" button on "Review" page of "BRS" in "epublic"
    #Then I click "Submit" button on "Review" page of "BRS" in "epublic"
