package com.cucumber.framework.PageObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.prefs.Preferences;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.cucumber.framework.CS.CustomerServ;
import com.cucumber.framework.GeneralHelperSel.SeleniumFunc;
import com.cucumber.framework.helper.Logger.LoggerHelper;

public class CallMeBackPage extends CustomerServ implements CallMeBackPageLoc {
	private final Logger log = LoggerHelper.getLogger(CallMeBackPage.class);
	CallMeBackPage callmebackpage;
	
	public CallMeBackPage(WebDriver driver) {
		super(driver);
	}

	public void sendGeneralServiceRequestPageObject(CallMeBackPage callmebackpage) {
		this.callmebackpage = callmebackpage;
	}

 
	public void selectValueFromSearchDropdown(String searchvalue) throws Exception {
		 Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_search_dd));
		 SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_search_dd, searchvalue);
	}
	
	public void enterValueIntoSearchDropdown(String searchvalue) throws Exception {
		 Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_search_for_item));
		 SeleniumFunc.xpath_GenericMethod_Sendkeys(xpath_search_for_item, searchvalue);
		 SeleniumFunc.xpath_GenericMethod_Click(xpath_search_icon);
		 SeleniumFunc.waitFor(3);
	}
	
	public void clickOnCustomerResult() throws Exception {
		Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_search_result));
		SeleniumFunc.xpath_GenericMethod_Click(xpath_search_result);
	}
	
	public void selectReasonValue(String reasonvalue) throws Exception {
		Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_reason_value));
		 SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_reason_value, reasonvalue);
	}
	
	public void enterComments(String comments) throws Exception {
		Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_comments));
		SeleniumFunc.xpath_GenericMethod_Sendkeys(xpath_comments, comments);
	}
	
	public void clickOnNextButton() throws Exception {
		Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_next_button));
		SeleniumFunc.xpath_GenericMethod_Click(xpath_next_button);
	}
	
	public void clickOnFinishButton() throws Exception {
		Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_finish_button));
		SeleniumFunc.xpath_GenericMethod_Click(xpath_finish_button);
	}
	
	public void clickOnMyWorkBasket() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(xpath_myWorkbasket);
	}
	
	public void selectValueFromViewQueueDropdwown(String queuevalue) {
		SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_myworkbasket_dropdown, queuevalue);
	}
	
	public void clickOnCaseId() throws Exception {
		SeleniumFunc.xpath_GenericMethod_Click(xpath_caseid);
	}
	
	public void clickOnOutboundIcon() throws Exception {
		SeleniumFunc.waitFor(3);
		try {
		SeleniumFunc.xpath_GenericMethod_Click(xpath_outbound_icon);
		} catch(Exception e){
			SeleniumFunc.xpath_GenericMethod_Click(xpath_outbound_icon);
		}
	}
	
	public void selectOutboundReasonForCallDropdown() {
		try {
		SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_outboundcall_reason, "General service request");
		}catch(Exception e) {
			SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_outboundcall_reason, "General service request");
		}
	}
	
	public void selectAnsweredRadioButton() throws Exception {
		try {
		SeleniumFunc.xpath_GenericMethod_Click(xpath_answered_radiobtn);
		}catch(Exception e) {
			SeleniumFunc.xpath_GenericMethod_Click(xpath_answered_radiobtn);
		}
	}
}
