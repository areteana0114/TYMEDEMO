package com.cucumber.framework.stepDef;

import org.apache.log4j.Logger;

import com.cucumber.framework.PageObjects.GeneralServiceRequestPage;
import com.cucumber.framework.PageObjects.Pulse;
import com.cucumber.framework.TestBase.TestBase;
import com.cucumber.framework.helper.Logger.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneralServiceRequestTest {
	
	private final Logger log = LoggerHelper.getLogger(GeneralServiceRequestTest.class);

	GeneralServiceRequestPage generalservicerequestpage;
	

	@Then("Click on New Menu button")
	public void click_on_New_Menu_button() throws Exception {
		generalservicerequestpage=new GeneralServiceRequestPage(TestBase.getDriver());
		generalservicerequestpage.sendGeneralServiceRequestPageObject(generalservicerequestpage);
		generalservicerequestpage.clickOnNewButton();
	}

	@Then("Click on Phone Call Interaction")
	public void click_on_Phone_Call_Interaction() throws Exception {
		generalservicerequestpage.clickOnPhoneCallInteraction();
	}
	
	@Given("Enter Search Criteria {string}")
	public void enter_Search_Criteria(String searchcondition) {
		generalservicerequestpage.enterPhoneNumber(searchcondition);
	}

	@Given("Click on Search button")
	public void click_on_Search_button() throws Exception {
		generalservicerequestpage.clickOnSearchButton();
	}

	@Given("Select the customer from search results")
	public void select_the_customer_from_search_results() throws Exception {
		generalservicerequestpage.clickOnSearchResultRow();
	}

	@Given("Click on Submit button")
	public void click_on_Submit_button() {
		generalservicerequestpage.SubmitButton();
	}

	@Given("Select the Questionnaire")
	public void select_the_Questionnaire() throws Exception {
		generalservicerequestpage.clickOnPersonalQuestionOne();
		generalservicerequestpage.clickOnPersonalQuestionTwo();
		generalservicerequestpage.clickOnContactQuestionOne();
	}

	@Given("Click on AddTask")
	public void click_on_AddTask() throws Exception {
		generalservicerequestpage=new GeneralServiceRequestPage(TestBase.getDriver());
		generalservicerequestpage.sendGeneralServiceRequestPageObject(generalservicerequestpage);
		generalservicerequestpage.clickAddTaskButton();
	}

	@Given("Select service case {string}")
	public void select_service_case(String servicecase) {
		generalservicerequestpage.selectServiceCase(servicecase);
	}

	@Given("Click on AddTasks button")
	public void click_on_AddTasks_button() {
		generalservicerequestpage.clickAddTasksButton();
	}

	@When("User select Service type as {string}")
	public void user_select_Service_type_as(String servicetype) throws Exception  {
		generalservicerequestpage.selectServiceType(servicetype);
	}

	@When("Select Category as {string}")
	public void select_Category_as(String category) {
		generalservicerequestpage.selectCategory(category);
	}

	@When("Select Handled On Spot values as {string}")
	public void select_Handled_On_Spot_values_as(String spotvalue) {
		generalservicerequestpage.selectHandledOnSpot(spotvalue);
	}

	@When("Select Respond via as {string}")
	public void select_Respond_via_as(String respondvia) {
		generalservicerequestpage.selectRespondVia(respondvia);
	}
	
	@Given("Click on Confirm button")
	public void click_on_Confirm_button() throws Exception {
		generalservicerequestpage.clickOnConfirmButton();
	}

	@Given("Click on WrapUp")
	public void click_on_WrapUp() throws Exception {
		generalservicerequestpage.clickWrapUpButton();
	}

	@Given("Click on Submit button in WrapUp")
	public void click_on_Submit_button_in_WrapUp() throws Exception {
		generalservicerequestpage.clickOnSubmitWrapUp();
	}
	



}
