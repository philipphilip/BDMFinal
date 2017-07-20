@core

Feature: Create BRS and NOB, then generate BR in Core

  Scenario: Create BRS in core
    Given I open "Core" website
    When I login "Core" as user "objectadmin" password "EipPSZAG0SDXebOW2gd3"
    And I navigate to "NOB" new form
    And I fill in the "NOB" of "BR" in "Core"
    And I logout from "Core"
    And I login "Core" as user "Yatin.Patel" password "Yv3eGjfZWUthN4iVjkz9"
    And I navigate to "BRS" new form
    And I fill in the "BRS" of "BR" in "Core"
    And I click "Validate" button on "brs" page of "br" in "Core"
    And I click "Exception List" button on "brs" page of "br" in "Core"
    And I click "Override" button on "brs" page of "br" in "Core"
    And I select "Court Order" in "Reason Code" dropdown list on "Override" page of "br" in "Core"
    And I input "123456" in "Comments" input on "Override" page of "br" in "Core"
    And I click "Do Override" button on "brs" page of "br" in "Core"
    And I click "Check For Duplicates" button on "brs" page of "br" in "Core"
    And I click "Proceed to Death Check" button on "brs" page of "br" in "Core"
    And I click "Submit" button on "brs" page of "br" in "Core"

    And I logout from "Core"
    And I login "Core" as user "Grace.Vella" password "upAP5ZqFAP"
    And I click "Search" link in "Core"
    And I click "Notice of Birth Search" link in "Core"
    And I input "@coreBrMotherFirstName" in "Mother First Name" on "core nob search" page of "Core"
    And I click "Search" button on "core nob search" page of "br" in "Core"
    And I click "First NOB Search Result" button on "core nob search" page of "br" in "Core"
    And I select "Register" in "Action List" dropdown list on "Notice of Birth" page of "br" in "Core"
    And I click "Go" button on "Notice of Birth" page of "br" in "Core"
    And I can see "This Birth Registration has been successfully registered" on "br" page of "Core"




