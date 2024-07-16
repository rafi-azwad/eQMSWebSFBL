Feature: Marketing/IMD Representative

  @marketing
  Scenario: Add Marketing representative
    Given click on customer complain option option
    When select marketing representative
    And fill in the required marketing information
    Then save and submit IMD information