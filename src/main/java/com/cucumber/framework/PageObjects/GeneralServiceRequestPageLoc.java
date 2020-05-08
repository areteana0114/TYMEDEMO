package com.cucumber.framework.PageObjects;

public interface GeneralServiceRequestPageLoc {
	
	String xpath_searchcustomer_dd="//select[@data-test-id='201610190747440120129777']";
	String xpath_search_phonenumber="//input[contains(@name,'SearchStringPhone')]";
	String xpath_servicetype_dd="//select[@name='$PpyWorkPage$pServiceItemType']";
	String xpath_category_dd="//select[@name='$PpyWorkPage$pDisplayCategory']";
	String xpath_Handledonspot_dd="//select[@name='$PpyWorkPage$pHandledOnTheSpot']";
	String xpath_respondtype_dd="//select[@name='$PpyWorkPage$pRespondVia']";
	String xpath_confirm_btn="//button[text()='Confirm']";
	
}
