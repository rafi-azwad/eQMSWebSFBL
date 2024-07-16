Feature: Head of Production

  @production
  Scenario: Add Head of Production
    Given click on head of production option
    When select the production reference number
    And fill in the production comment information
    Then save and submit head of production information