Feature: Approval Page

  @qaApproval
  Scenario: Add QA Head Approval
    Given click on qa head approval option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information


  @pdApproval
  Scenario: Add PD Head Approval
    Given click on pd head approval option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information


  @productionApproval
  Scenario: Add Production Head Approval
    Given click on production head approval option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information


  @factoryApproval
  Scenario: Add Factory Head Approval
    Given click on factory head approval option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information


  @marketingHead
  Scenario: Add Marketing Head Acknowledgement
    Given click on marketing head acknowledgement option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information

  @actionTaken
  Scenario: Add Action Taken Report
    Given click on action taken report option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information

  @salesHead
  Scenario: Add Sales Head Acknowledgement
    Given click on sales head acknowledgement option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the all information

  @complaintClose
  Scenario: Add Complaint Close
    Given click on complaint close option
    When select reference number of qa head approval
    And fill in the comment field
    Then save and submit the complaint close information