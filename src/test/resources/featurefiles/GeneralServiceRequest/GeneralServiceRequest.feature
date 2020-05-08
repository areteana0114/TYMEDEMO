Feature: General Service Request

  #Author U.Ramakrishna
  #@Smoke @GSR_TC1 @Tyme
  Scenario Outline: General Service Request
    Given Open the browser and navigate to the url
    When I enter username as "<Username>"
    And I enter password as "<Password>"
    And I click on Login button
    Then Login should be successful
    And Click on New Menu button
    And Click on Phone Call Interaction
    And Enter Search Criteria "<MobileNumber>"
    And Click on Search button
    And Select the customer from search results
    And Click on Submit button
    And Select the Questionnaire
    And Click on Submit button
    And Click on AddTask
    And Select service case "<ServiceCase>"
    And Click on AddTasks button
    When User select Service type as "<ServiceType>"
    And Select Category as "<Category>"
    And Select Handled On Spot values as "<HandledOnSpot>"
    And Select Respond via as "<RespondVia>"
    And Click on Submit button
    And Click on Confirm button
    And Click on WrapUp
    And Click on Submit button in WrapUp
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    @TymeSIT 
    Examples: 
      | Username        | Password | MobileNumber | ServiceCase             | ServiceType         | Category                     | HandledOnSpot | RespondVia |
      | Performance_csr | rules    |   0835901234 | General Service Request | Product Information | Online shopping              | Yes           | Email      |
      | Performance_csr | rules    |   0835901234 | General Service Request | Personal loan       | Progress on Loan Application | Yes           | Email      |
    
    @TymeUAT
    Examples: 
      | Username        | Password | MobileNumber | ServiceCase             | ServiceType         | Category                     | HandledOnSpot | RespondVia |
      | Performance_csr | rules    |   0835901234 | General Service Request | Product Information | Online shopping              | Yes           | Email      |
    #  | Performance_csr | rules    |   0835901234 | General Service Request | Personal loan       | Progress on Loan Application | Yes           | Email      |
