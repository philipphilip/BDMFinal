Feature: Create a DRS & COD & Death Certificate in eRegistry.
  		   Make COD compliant and match with DRS to create the DR in Core. 
  		   Search for the Death Certificate in Core and Validate if it is Compliant.
  		   Match the Certificate with DR and print the certificate.

  Scenario: Create a COD in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Manningham Medical Practitioner"
    And I navigate to "COD" in "eRegistry"
    Then I can fill and submit the "COD" form in "eRegistry"

  Scenario: Create a DRS in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    Then I can fill and submit the "DRS" form in "eRegistry"

  Scenario: Create a Death Certificate in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Legal Certificates"
    And I navigate to "Certificates" in "eRegistry"
    Then I can fill and submit the "Certificates" form in "eRegistry"

  Scenario: Search for the DRS in Core and make it compliant
    When I open "Core" website
    And I sign in
    And I navigate to "Search DRS" in "Core"
    Then I search for "DRS" form and make it compliant

  Scenario: Search for the COD in Core and make it compliant
    When I open "Core" website
    And I sign in
    And I navigate to "Search COD" in "Core"
    Then I search for "COD" form and make it compliant

  Scenario: Search for the Application in Core and validate if it is compliant
    When I open "Core" website
    And I sign in
    And I navigate to "Search Item Id" in "Core"
    Then I search for "Application" form created in "eRegistry"
