package pageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement startDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement start_time;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement endDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement end_time;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement age_Requirement_DD;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement event_Type_DD;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create New Event\"]")
	private WebElement music_Type_DD;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"DJ Names\"]")
	private WebElement DJs_name;

	@AndroidFindBy(xpath = "(//android.webkit.WebView)[0]")
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
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create_New_Event_btn.click();
	}

	public void clickOnCreate_New_Button_2() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create_New_Event_btn.click();
		try {
			Thread.sleep(2000);
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

	public void selectStartTime() {
		start_time.click();
	}

	public void selectEndDate() {
		endDate.click();
	}

	public void selectEndTime() {
		end_time.click();
	}

	public void selectAgeRequirement_DD() {
		age_Requirement_DD.click();
	}

	public void selectEventType_DD() {
		event_Type_DD.click();
	}

	public void selectMusicType_DD() {
		music_Type_DD.click();
	}

	public void enterDJsName(String name) {
		DJs_name.sendKeys(name);
	}

	public void enterDescription(String desc) {
		description.sendKeys(desc);
	}

}
