package com.appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pageLayer.CreateEvent;
import pageLayer.LoginPage;
import utilities.UtilClass;

/**
 * Hello world!
 *
 */
public class BaseClass {
	public AndroidDriver driver;
	public LoginPage lp_obj;
	public CreateEvent ce_obj;
	public UtilClass util_obj;
	String phone_3a = "Pixel 3a XL API 30";
	String phone_4a = "Pixel 4a API 30";

	public AndroidDriver ConnectToAppium() {
		UiAutomator2Options options = new UiAutomator2Options();

//		options.setDeviceName(phone_3a);
		options.setDeviceName(phone_4a);
		options.setApp(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\ORG 7-AUG.apk");
		options.setCapability("chromedriverExecutable", "D:\\Downloads\\chromes\\chrome-win32");
		AndroidDriver driver = null;
		try {
			try {
				driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Chalu ho gaya");
		util_obj = new UtilClass(driver);
		lp_obj = new LoginPage(driver);
		ce_obj = new CreateEvent(driver);
		return driver;

	}

	@BeforeMethod
	public void launchApplication() {
		ConnectToAppium();

	}

//	@AfterMethod
	public void tearDown() {
		ConnectToAppium().close();

	}

}
