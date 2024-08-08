package com.appium;

import org.testng.annotations.Test;

public class CreateEventTest extends BaseClass {

	@Test
	public void createEventTest() throws InterruptedException {

		lp_obj.enterEmail("oliverwhite@yopmail.com");
		lp_obj.enterPassword("Test@123");
		lp_obj.clickOnLoginButton();
		ce_obj.clickOnCreate_New_Button();
		ce_obj.clickOnCreate_New_Button_2();
		ce_obj.enterEventName("Test Event");
		ce_obj.selectStartDate();
		ce_obj.selectStart_Date_option(8);
		ce_obj.time_ok_btn();
		ce_obj.selectStartTime();
		Thread.sleep(2000);
		ce_obj.choose_Time("AM", 2, 30);
		ce_obj.time_ok_btn();
		Thread.sleep(5000);
		ce_obj.selectEndDate();
		ce_obj.selectEnd_Date_option(9);
		ce_obj.time_ok_btn();
		Thread.sleep(2000);
		ce_obj.selectEndTime();
		Thread.sleep(1000);
		ce_obj.choose_Time("PM", 3, 40);
		ce_obj.time_ok_btn();
		Thread.sleep(2000);
		util_obj.ScrollDown1(1);
		ce_obj.selectAgeRequirement_DD();
		Thread.sleep(2000);
		ce_obj.selectAgeRequirement_DD_options_18_plus();
		ce_obj.selectAgeRequirement_Done_btn();
		ce_obj.selectEventType_DD();
		ce_obj.selectEventType_options("Car show");
		ce_obj.selectEventType_options("Cocktail Party");
		ce_obj.selectEventType_options("Festival");
		ce_obj.selectEventType_Done_btn();
		util_obj.ScrollDown1(1);
		ce_obj.selectMusicType_DD();
		ce_obj.selectMusicType_options("Disco");
		ce_obj.selectMusicType_Done_btn();
		util_obj.ScrollDown1(1);
		util_obj.ScrollDown1(1);
		ce_obj.enterDJsName("Rockerz");
		util_obj.ScrollDown1(2);

//		util_obj.ScrollDown1(5);
//		ce_obj.switchToWebView();
//		Thread.sleep(2000);
		ce_obj.enterDescription("This is a description");
		ce_obj.click_On_Continue();
	}

}
