package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pageLayer.CreateEvent;
import pageLayer.LoginPage;

/**
 * Hello world!
 *
 */
public class BaseClass {
	public WebDriver driver;
	public LoginPage lp_obj ;
	public CreateEvent ce_obj ;
	public AndroidDriver ConnectToAppium()  {
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setDeviceName("Pixel 3a API 30");
		options.setApp(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\app-release.apk");
		AndroidDriver driver = null;
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Chalu ho gaya");
		
		lp_obj = new LoginPage(driver);
		ce_obj= new CreateEvent(driver);
		return driver;
		
	}
	
	@BeforeMethod
	public void launchApplication() {
		ConnectToAppium();
		
	}
	
	
	
	
	
}
