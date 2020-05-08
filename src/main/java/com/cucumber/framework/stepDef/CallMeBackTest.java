package com.cucumber.framework.stepDef;

import org.apache.log4j.Logger;

import com.cucumber.framework.PageObjects.CallMeBackPage;
import com.cucumber.framework.PageObjects.GeneralServiceRequestPage;
import com.cucumber.framework.PageObjects.Pulse;
import com.cucumber.framework.TestBase.TestBase;
import com.cucumber.framework.helper.Logger.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CallMeBackTest {

	private final Logger log = LoggerHelper.getLogger(CallMeBackTest.class);

	CallMeBackPage callmebackpage;

	@Given("Select value from Search dropdown {string}")
	public void select_value_from_Search_dropdown(String searchvalue) throws Exception {
		callmebackpage = new CallMeBackPage(TestBase.getDriver());
		callmebackpage.sendGeneralServiceRequestPageObject(callmebackpage);
		callmebackpage.selectValueFromSearchDropdown(searchvalue);
	}

	@Given("Enter value into search field {string}")
	public void enter_value_into_search_field(String value) throws Exception {
		callmebackpage.enterValueIntoSearchDropdown(value);
	}

	@Given("Click on search result displayed")
	public void click_on_search_result_displayed() throws Exception {
		callmebackpage.clickOnCustomerResult();
	}

	@When("User select Reason as {string}")
	public void user_select_Reason_as(String reasonvalue) throws Exception {
		callmebackpage.selectReasonValue(reasonvalue);
	}

	@When("Enter comments as {string}")
	public void enter_comments_as(String comments) throws Exception {
		callmebackpage.enterComments(comments);
	}

	@When("Click on Next button")
	public void click_on_Next_button() throws Exception {
		callmebackpage.clickOnNextButton();
	}

	@When("Click on Finish button")
	public void click_on_Finish_button() throws Exception {
		callmebackpage.clickOnFinishButton();
	}

	@Given("Click on My Workbasket")
	public void click_on_My_Workbasket() throws Exception {
		callmebackpage.clickOnMyWorkBasket();
	}

	@Given("Select queue {string} from View Queue For dropdown")
	public void select_queue_from_View_Queue_For_dropdown(String queuevalue) {
		callmebackpage.selectValueFromViewQueueDropdwown(queuevalue);
	}

	@Given("Click on Case Id")
	public void click_on_Case_Id() throws Exception {
		callmebackpage.clickOnCaseId();
	}

	@Given("Click on Outbound call icon")
	public void click_on_Outbound_call_icon() throws Exception {
		callmebackpage.clickOnOutboundIcon();
	}

	@Given("Select Reason for the call")
	public void select_Reason_for_the_call() {
		callmebackpage.selectOutboundReasonForCallDropdown();
	}

	@Given("Select as Answered")
	public void select_as_Answered() throws Exception {
		callmebackpage.selectAnsweredRadioButton();
	}

}
