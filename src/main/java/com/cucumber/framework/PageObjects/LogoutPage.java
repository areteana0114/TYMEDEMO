package com.cucumber.framework.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.CS.CustomerServ;
import com.cucumber.framework.GeneralHelperSel.SeleniumFunc;
import com.cucumber.framework.helper.Logger.LoggerHelper;



public class LogoutPage extends CustomerServ implements LogoutPageLoc  {
	private final Logger log = LoggerHelper.getLogger(LogoutPage.class);
	LogoutPage logoutpage;

	public LogoutPage(WebDriver driver) {
		super(driver);
		
	}

	public void testLogoutPage() {
		//System.out.println("In test logout page");
		}
	
	public void sendLogoutObject(LogoutPage logoutpage) {
		this.logoutpage=logoutpage;
		//System.out.println("In sendLogoutObject method page"+this.logoutpage);
	}
	
	public void clickOnDownArrow() throws Exception {
		
		  try { //driver.findElement(By.xpath(login_popup_close_xpath)).click();
		  xpath_GenericMethod_Click(login_popup_close_xpath); }catch(Exception e) {
		  System.out.println(e.getMessage()); }
		 
		
		  try { //driver.findElement(By.xpath(logout_icon_xpath)).click();
		  xpath_GenericMethod_Click(logout_icon_xpath); //waitFor(3); 
		  }catch(Exception e) { System.out.println(e.getMessage()); }
		 
		
	}
	
	public void clickOnLogoutButton() throws Exception {
		/*
		 * try { //driver.findElement(By.xpath(login_popup_close_xpath)).click();
		 * xpath_GenericMethod_Click(login_popup_close_xpath); }catch(Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		 
		/*
		 * try { //driver.findElement(By.xpath(logout_icon_xpath)).click();
		 * 
		 * xpath_GenericMethod_Click(logout_icon_xpath); waitFor(3); }catch(Exception e)
		 * { System.out.println(e.getMessage()); }
		 */
		driver.switchTo().defaultContent();
		SeleniumFunc.xpath_GenericMethod_Click(logout_icon_xpath);
	}
	public void clickOnLogoutLink() {
        try {
               xpath_GenericMethod_Click(logout_xpath);
               waitFor(1);
        } catch (Exception e1) {  
               e1.printStackTrace();
        }      
       // SeleniumFunc.robotClass();
        waitFor(1);
        driver.switchTo().alert().accept();
        waitFor(2);
 }

	
	public void verifyUsernameField_IsDisplayed() {
		WebElement ele=driver.findElement(By.xpath(username_xpath));
		SeleniumFunc.waitForElement(ele, 5);
		Assert.assertTrue(ele.isDisplayed(),"Logout is not successful");
		
	}
		
		
}
