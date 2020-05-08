Feature: Call Me Back Service Case

  #Author U.Ramakrishna
  #@Smoke @CMB_TC1 @Tyme
  Scenario Outline: Validating the General Service Request Case through Outbound call, by using Call Me Back Case.
    Given Open the browser and navigate to the url
    When I enter username as "<Username>"
    And I enter password as "<Password>"
    And I click on Login button
    Then Login should be successful
    And Select value from Search dropdown "<SearchFieldValue>"
    And Enter value into search field "<Value>"
    And Click on search result displayed
    And Click on AddTask
    And Select service case "<ServiceCaseOne>"
    And Click on AddTasks button
    When User select Reason as "<Reason>"
    And Enter comments as "<Comments>"
    And Click on Next button
    And Click on Next button
    And Click on Finish button
    And Click on Confirm button
    And Click on WrapUp
    And Click on Submit button in WrapUp
    And Click on My Workbasket
    And Select queue "<WorkQueue>" from View Queue For dropdown
    And Click on Case Id
    And Click on Outbound call icon
    And Select as Answered
    And Select Reason for the call
    And Click on Submit button
    And Select the Questionnaire
    And Click on Submit button
    And Click on AddTask
    And Select service case "<ServiceCaseTwo>"
    And Click on AddTasks button
    When User select Service type as "<ServiceType>"
    And Select Category as "<Category>"
    And Select Handled On Spot values as "<HandledOnSpot>"
    And Select Respond via as "<RespondVia>"
    And Click on Submit button
    And Click on Confirm button
    And Click on WrapUp
    And Click on Submit button in WrapUp
    And Enter comments as "<Comments>"
    And Click on Submit button
    And Click on Confirm button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    @TymeSIT
    Examples: 
      | Username        | Password | SearchFieldValue | Value      | ServiceCaseOne | Reason              | Comments                    | WorkQueue             | ServiceCaseTwo          | ServiceType         | Category        | HandledOnSpot | RespondVia |
      | Performance_csr | rules    | Mobile Number    | 0835901234 | Call Me Back   | Product information | This is comments for Reason | Pending outbound call | General Service Request | Product Information | Online shopping | Yes           | Email      |

    @TymeUAT
    Examples: 
      | Username        | Password | SearchFieldValue | Value      | ServiceCaseOne | Reason              | Comments                    | WorkQueue             | ServiceCaseTwo          | ServiceType   | Category                     | HandledOnSpot | RespondVia |
      | Performance_csr | rules    | Mobile Number    | 0835901234 | Call Me Back   | Product information | This is comments for Reason | Pending outbound call | General Service Request | Personal loan | Progress on Loan Application | Yes           | Email      |
