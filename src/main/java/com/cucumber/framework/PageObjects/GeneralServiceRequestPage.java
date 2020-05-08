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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.cucumber.framework.CS.CustomerServ;
import com.cucumber.framework.GeneralHelperSel.SeleniumFunc;
import com.cucumber.framework.helper.Logger.LoggerHelper;

public class GeneralServiceRequestPage extends CustomerServ implements GeneralServiceRequestPageLoc {
	private final Logger log = LoggerHelper.getLogger(GeneralServiceRequestPage.class);
	GeneralServiceRequestPage generalservicerequestpage;
	
	public GeneralServiceRequestPage(WebDriver driver) {
		super(driver);
	}

	public void sendGeneralServiceRequestPageObject(GeneralServiceRequestPage generalservicerequestpage) {
		this.generalservicerequestpage = generalservicerequestpage;
	}

   public void enterPhoneNumber(String searchcondition) {
	   try {
		SeleniumFunc.xpath_GenericMethod_Sendkeys(xpath_search_phonenumber, searchcondition);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

  public void selectServiceType(String servicetype) throws Exception  {
	
		 Assert.assertTrue(SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_servicetype_dd));
		 SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_servicetype_dd, servicetype);
	 
  }

  public void selectCategory(String category) {
	  SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_category_dd, category);
  }
  
  public void selectHandledOnSpot(String value) {
	  SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_Handledonspot_dd, value);
  }

  public void selectRespondVia(String respondvia) {
	  SeleniumFunc.xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_respondtype_dd, respondvia);
  }

  public void clickOnConfirmButton() {
	  try {
		  SeleniumFunc.xpath_Genericmethod_verifyElementPresent(xpath_confirm_btn);
		  SeleniumFunc.xpath_GenericMethod_Click(xpath_confirm_btn);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
}
