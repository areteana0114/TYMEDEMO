Feature: Complaint or Compliment

  #Author U.Ramakrishna
  @Smoke @CC_TC1
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
    And Click on WrapUp
    And Click on Submit button in WrapUp
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username        | Password | MobileNumber | ServiceCase             |
      | Performance_csr | rules    |   0835901234 | Complaint Or Compliment |
