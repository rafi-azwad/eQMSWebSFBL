Feature: Customer Complains

  @customerComplaints
  Scenario: Add customer complaints issue
    Given click on complaint management option
    When select customer complaints
    And fill in the required information
    Then save and submit the information

