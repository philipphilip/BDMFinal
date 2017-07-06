@epublic

Feature: ePublic brs

  Scenario: ePublic create brs and submit to core
    Given I open ePublic website
    When I sign in ePublic
    And I navigate to "BRS" in ePublic
    And I fill in the "Child's details" of BRS in epublic
    And I fill in the "Parent details" of BRS in epublic
    And I fill in the "Second parent details" of BRS in epublic
    And I click "Next" button on "Donor treatment details" page of "BRS" in "epublic"
    And I fill in the "Relationship details" of BRS in epublic
    And I click "Next" button on "Children of this relationship" page of "BRS" in "epublic"
    And I click "Next" button on "Children of previously relationship" page of "BRS" in "epublic"
    And I fill in the "Second parent participation details" of BRS in epublic
    And I fill in the "Informant 1 details" of BRS in epublic
    And I click "Save" button on "Declaration" page of "BRS" in "epublic"
    And I can see "This Birth Registration Statement has been successfully saved" on page
    And I click "Continue" button on "Declaration" page of "BRS" in "epublic"
    And I click "Close" button on "Add Documents" page of "BRS" in "epublic"
    And I click "DashBoard" button on "Declaration" page of "BRS" in "epublic"
    And I click "Submit Order" button on "Declaration" page of "BRS" in "epublic"
    And I click "accept the terms and conditions" button on "Review" page of "BRS" in "epublic"
    And I click "Submit" button on "Review" page of "BRS" in "epublic"


    #And I click "Close" button on "Add Documents" page of "BRS" in "epublic"
    #And I input "1" in "Quantity" on "Birth Certificates and Packages" page in "epublic"
    #And I click "Proceed" button on "Birth Certificates and Packages" page of "BRS" in "epublic"
    #And I click "Next" button on "Delivery Address" page of "BRS" in "epublic"
    #And I click "Checkout" button on "Review Draft Request Form" page of "BRS" in "epublic"
    #And I tick "accept" checkbox on "Checkout" page of "BRS" in "epublic"
    #And I click "Pay in person" button on "Checkout" page of "BRS" in "epublic"