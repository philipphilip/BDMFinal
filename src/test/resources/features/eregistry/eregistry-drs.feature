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
