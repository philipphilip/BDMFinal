Feature: All Products related test scenarion in Core-Admin site.

  Scenario: Sign in as a Admin and create a Product
    Given I open "Core Admin UI" website
    When I sign in "Core Admin UI"
    And I navigate to "New Product" new form
    Then I fill in the "New Product" form
