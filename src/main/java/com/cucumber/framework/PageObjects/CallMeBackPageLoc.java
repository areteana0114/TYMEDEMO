package com.cucumber.framework.PageObjects;

public interface CallMeBackPageLoc {
	
	String xpath_search_dd="//select[@name='$PpyDisplayHarness$pSelectedTypeOfSearch']";
	String xpath_search_for_item="//input[@name='$PpyDisplayHarness$ppySearchText']";
	String xpath_search_icon="//i[@name='CPMSearchInHeader_pyDisplayHarness_3']";
	String xpath_search_result="(//a[@title='Create research case for Customer '])[1]";
	String xpath_reason_value="//select[@name='$PpyWorkPage$pReason']";
	String xpath_comments="//textarea[@name='$PpyWorkPage$pUserComments']";
	String xpath_next_button="//button[@title='Complete this assignment']";
    String xpath_finish_button="//button[@title='Complete the assignment']//div[text()='Finish']";
    String xpath_myWorkbasket="//h3[contains(@id,'headerlabel') and text()='My workbaskets']";
    String xpath_myworkbasket_dropdown="//select[@title='View queue for']";
    String xpath_caseid="//table[@pl_prop='D_ConsolidateWorkBasket.pxResults']/tbody/tr[2]/td[2]";
    String xpath_outbound_icon="//img[@name='OutboundCallIcon_pyWorkPage_3']";
    String xpath_outboundcall_reason="//select[@name='$PpyWorkPage$pSelectReason']";
    String xpath_answered_radiobtn="//label[contains(@for,'Answered')]";
	
}
