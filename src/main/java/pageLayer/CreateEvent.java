package pageLayer;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.PressesKey;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.UtilClass;

public class CreateEvent extends UtilClass {

	private AndroidDriver driver;

	public CreateEvent(AndroidDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Create, tab, 3 of4'")
	private WebElement createTab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement createTab_Events;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement Create_New_Event_btn;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Event Name\"]")
	private WebElement event_Name;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"MM/DD/YYYY\"])[1]")
	private WebElement startDate;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"00:00 AM\"])[1]")
	private WebElement start_time;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MM/DD/YYYY\"]")
	private WebElement endDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"00:00 AM\"]")
	private WebElement end_time;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
	private WebElement time_ok_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"21+\"]")
	private WebElement age_Requirement_DD;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"18+\"]")
	private WebElement age_Requirement_DD_options_18_plus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"21+\"]")
	private WebElement age_Requirement_DD_options_21_plus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"14+\"]")
	private WebElement age_Requirement_DD_options_14_plus;

	@AndroidFindBy(xpath = "//android.view.View")
	private WebElement age_Requirement_Done_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select Type\"]")
	private WebElement event_Type_DD;

	@AndroidFindBy(xpath = "//android.view.View")
	private WebElement event_Type_DD_Done_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select Music\"]")
	private WebElement music_Type_DD;

	@AndroidFindBy(xpath = "//android.view.View")
	private WebElement music_Type_DD_Done_btn;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"DJ Names\"]")
	private WebElement DJs_name;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add another DJ\"]")
	private WebElement add_Another_DJs_name;

	@AndroidFindBy(xpath = "//android.webkit.WebView")
	private WebElement description;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
	private WebElement continue_button;

	public void clickOnCreateTab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // 50 seconds

		// Example usage of explicit wait
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Create, tab, 3 of4'")));

		createTab.click();
	}

	public void clickOnCreateTab_Events() {
		createTab_Events.click();
	}

	public void clickOnCreate_New_Button() {

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create_New_Event_btn.click();
	}

	public void clickOnCreate_New_Button_2() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create_New_Event_btn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enterEventName(String name) {
		event_Name.sendKeys(name);
	}

	public void selectStartDate() {
		startDate.click();
	}

	public void selectStart_Date_option(int Date) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + Date + "\"));")).click();

	}

	public void selectStartTime() {
		start_time.click();
	}

	public void selectEndDate() {
		endDate.click();
	}

	public void selectEnd_Date_option(int Date) {

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + Date + "\"));")).click();
	}

	public void selectEndTime() {
		end_time.click();
	}

	public void choose_Time(String time_half, int hour, int minute) {

		driver.findElement(AppiumBy.id("android:id/am_label")).click();

		driver.findElement(
				By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='" + hour + "']"))
				.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By
				.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='" + minute + "']"))
				.click();

	}

	public void time_ok_btn() {

		time_ok_btn.click();

	}

	public void selectAgeRequirement_DD() {
		age_Requirement_DD.click();

	}

	public void selectAgeRequirement_DD_options_18_plus() {

		age_Requirement_DD_options_18_plus.click();

	}

	public void selectAgeRequirement_DD_options_14_plus() {

		age_Requirement_DD_options_14_plus.click();

//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
	}

	public void selectAgeRequirement_DD_options_21_plus() {

		age_Requirement_DD_options_21_plus.click();

//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
	}

	public void selectAgeRequirement_Done_btn() {

		age_Requirement_Done_btn.click();

//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text("+option+")")).click();
	}

	public void selectEventType_DD() {
		event_Type_DD.click();
	}

	public void selectEventType_options(String option) {

		ScrollDown_into_View(option);
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + option + "']")).click();
	}

	public void selectEventType_Done_btn() {
		event_Type_DD_Done_btn.click();
	}

	public void selectMusicType_DD() {
		music_Type_DD.click();
	}

	public void selectMusicType_options(String option) {

		ScrollDown_into_View(option);
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + option + "']")).click();
	}

	public void selectMusicType_Done_btn() {
		music_Type_DD_Done_btn.click();
	}

	public void enterDJsName(String name) {
		DJs_name.sendKeys(name);
	}

	public void enterDescription(String desc) {

		description.click();
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.T));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.H));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.I));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.S));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.I));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.S));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.A));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.E));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.V));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.E));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.N));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.T));
		driver.hideKeyboard();
		// To enter text

	}

	public void click_On_Continue() {
		continue_button.click();

	}

}
