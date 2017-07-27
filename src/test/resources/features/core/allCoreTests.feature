Feature: All Core site testings.

  #Scenario: Sign in and sign out
    #When I open Core website
    #And I sign in
    #Then I sign out
#
  #Scenario: Navigate to BRS and fill the form
    #When I open Core website
    #And I sign in
    #And I navigate to "BRS" new form
    #Then I fill in the "BRS" form
#
  #Scenario: Navigate to NOB and fill the form
    #When I open Core website
    #And I sign in
    #And I navigate to "NOB" new form
    #Then I fill in the "NOB" form
#
  #Scenario: Navigate to DRS and fill the form
    #When I open Core website
    #And I sign in
    #And I navigate to "DRS" new form
    #Then I fill in the "DRS" form
#
  #Scenario: Navigate to COD and fill the form
    #When I open Core website
    #And I sign in
    #And I navigate to "COD" new form
    #Then I fill in the "COD" form

  Scenario: Navigate to MR and fill the form
    When I open Core website
    And I sign in
    And I navigate to "MN" new form
    Then I fill in the "MN" form

  Scenario: Request a Death certificate
    When I open Core website
    And I sign in
    And I navigate to "Application" new form
    Then I fill in the "Application" form
