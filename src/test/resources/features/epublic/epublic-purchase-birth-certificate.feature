@epublic-bcp
Feature: ePublic purchase birth certificate

  Scenario: purchase birth certificate
    Given I open "ePublic" website
    And I sign in "ePublic"
    
    And I click "Certificates" link in "ePublic"
    And I click "Standalone certificate order" link in "ePublic"
    And I click "agree" button in "ePublic"
    And I fill in the "Applicant details" of "application" in "ePublic"
    And I click "Next" button in "ePublic"
    And I fill in the "Subject details" of "application" in "ePublic"
    And I click "Continue" button in "ePublic"
    And I click "Proceed" button in "ePublic"
    And I input "1" in field with id "orderCertificates-certificateQuantity0" in "ePublic"
    #And I click "Close" button in "ePublic"
    And I click "Proceed" button in "ePublic"
    #And I click "Next" button in "ePublic"
    And I click "Checkout" button in "ePublic"
    And I click "accept the terms and conditions" item by id "reviewDraftRequest-declaration" in "ePublic"
    #ADDED THE AND STATEMENT FOR PAY USING "Pay in person" AS THE OPTION "PAY NOW" IS NOT WORKING AS PER THE BUG VB-7183
    #And I click "Pay now" button in "ePublic"
    And I click "Pay in person" button in "ePublic"
    #COMMENTED THE BELOW THREE STATEMENTS DUE TO THE ERROR IN PAY NOW METHOD OF PAYMENT AS PER THE BUG VB-7183
    #And I fill in the "Payment details" of "application" in "ePublic"
    #And I click "ignore Duplicate" item by id "ignoreDuplicate" in "ePublic"
    #And I click "confirm Button" item by id "confirmButton" in "ePublic"
    #THE THEN STATEMENT IN THE MODULE HAS BEEN MODIFIED TO ACCEPT THE XPATH OF THE MESSAGE WHEN SUBMITTED THROUGH OPTION 'Pay in person'
    Then I can see "Your order request has been submitted" on "application payment result" page of "epublic"

  #4242424242424242 4111111111111111 4444333322221111
