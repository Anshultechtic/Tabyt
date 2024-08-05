package com.appium;

import org.testng.annotations.Test;

public class CreateEventTest extends BaseClass {

	
	@Test
	public void createEventTest() {
	
		lp_obj.enterEmail("oliverwhite@yopmail.com");
		lp_obj.enterPassword("Test@123");
		lp_obj.clickOnLoginButton();
//		ce_obj.clickOnCreateTab();
//		ce_obj.clickOnCreateTab_Events();
		ce_obj.clickOnCreate_New_Button();
		ce_obj.clickOnCreate_New_Button_2();
		
		

	}

}
