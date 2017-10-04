@emailsmscorrespondence
Feature: Create SMS & Email correspondece templates and send correspondence from a newly created BRS and validate that the correspondence was sent

  Scenario: Create SMS & Email correspondence templates
    Given I open "Core Admin UI" website
    When I sign in "Core Admin UI"
    And I navigate to "Create Correspondence Template" in "Core Admin UI"
    Then I can fill and submit the "Create SMS & EMail correspondence templates" form in "Core Admin UI"

  Scenario: Navigate to BRS and fill the form
    Given I open "Core" website
    And I sign in "Core"
    And I navigate to "BRS" new form
    Then I fill in the "BRS for SMS & Email correspondence" form
