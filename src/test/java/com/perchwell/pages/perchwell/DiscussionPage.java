package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscussionPage extends BasePage {

	public DiscussionPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "CC my email on this conversation")
	private WebElement ccMyEmailText;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "ChatViewBackButton")
	private WebElement backButtonFromDiscussion;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/send")
	@iOSXCUITFindBy(accessibility = "SendMessageButton")
//	@iOSXCUITFindBy(accessibility = "SEND")
	private WebElement sendButton;

	@AndroidFindBy(xpath = "*//android.widget.EditText[@text = 'MESSAGE']")
	@iOSXCUITFindBy(accessibility = "MessageTextField")
	private WebElement message;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "x")
	private WebElement crossBackButtonFromDiscussion;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement crossBackButtonFromDiscussionsPage;

	public void shouldBeCcMyEmailTextDispayed() {
		element(ccMyEmailText).shouldBeVisible();
	}

	public void clickOnBackButtonFromDiscussion() {
		element(backButtonFromDiscussion).click();
	}

	public void typeMessage(String text) {
		element(message).sendKeys(text);
	}

	public void clickOnSendButton() {
		element(sendButton).click();
	}

	public void shouldBeMessageDispayed(String message) {
		if (Config.isAndroid()){
			element(By.xpath("//*[contains(@text,'" + message + "')]")).shouldBeVisible();
		} else {
			element(By.name(message)).shouldBeVisible();
		}
	}

	public void clickOnCrossBackButtonFromDiscussion() {
		element(crossBackButtonFromDiscussion).click();
	}

	public void clickOnCrossBackButtonFromDiscussionsPage() {
		element(crossBackButtonFromDiscussionsPage).click();
	}
}
