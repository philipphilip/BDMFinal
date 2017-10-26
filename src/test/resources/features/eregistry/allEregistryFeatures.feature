Feature: All eRegistry tests

  #eRegistry: Submit COD to Core (includes Search for the COD in Core and make it compliant)
  Scenario: Create a COD in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Manningham Medical Practitioner"
    And I navigate to "COD" in "eRegistry"
    Then I can fill and submit the "COD" form in "eRegistry"

  #eRegistry: Create a DRS in eRegistry and submit to Core (includes Search for the DRS in Core and make it compliant)
  Scenario: Create a DRS in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Melbourne Funeral Services"
    And I navigate to "DRS" in "eRegistry"
    Then I can fill and submit the "DRS" form in "eRegistry"

  #eRegistry: Create a Death Certificate in eRegistry and submit to Core (Search for the Application in Core and validate if it is compliant)
  Scenario: Create a Death Certificate in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "Legal Certificates"
    And I navigate to "Certificates" in "eRegistry"
    Then I can fill and submit the "Certificates" form in "eRegistry"

  Scenario: Search for the DRS in Core and make it compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search DRS" in "Core"
    Then I search for "DRS" form and make it compliant

  Scenario: Search for the COD in Core and make it compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search COD" in "Core"
    Then I search for "COD" form and make it compliant

  Scenario: Search for the Application in Core and validate if it is compliant
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search Item Id" in "Core"
    Then I search for "Application" form created in "eRegistry"

  # Create Adoption Notification in eRegistry and submit to Core and search for it in Core
  Scenario: Create an adoption notification in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "FIND (Adoption Service - Govt)"
    And I navigate to "AN" in "eRegistry"
    Then I can fill and submit the "AN" form in "eRegistry"

  Scenario: Search for the AN in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search AN" in "Core"
    Then I search for "AN" form created in "eRegistry"

  # Create Surrgoacy Notification in eRegistry and submit to Core and search for it in Core
  Scenario: Create a surrogacy notification in eRegistry and submit to Core
    Given I open "eRegistry" website
    When I sign in "eRegistry"
    And I select stakeholder as "The County Court"
    And I navigate to "SN" in "eRegistry"
    Then I can fill and submit the "SN" form in "eRegistry"

  Scenario: Search for the Surrogacy Notification in Core
    When I open "Core" website
    And I sign in "Core"
    And I navigate to "Search SN" in "Core"
    Then I search for "SN" form created in "eRegistry"
