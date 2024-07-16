Feature: Factory Head

  @factoryHead
  Scenario: Add Factory head information
    Given click on factory head option
    When select factory reference number
    And fill in the status information
    Then save and submit factory head information