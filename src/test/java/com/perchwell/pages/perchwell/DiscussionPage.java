package com.perchwell.pages.perchwell;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscussionPage extends BasePage {

	public DiscussionPage(WebDriver driver) {
		super(driver);
	}

	@iOSXCUITFindBy(accessibility = "CC my email on this conversation")
	private WebElement ccMyEmailText;

	@iOSXCUITFindBy(accessibility = "ChatViewBackButton")
	private WebElement backButton;

	@iOSXCUITFindBy(accessibility = "SEND")
	private WebElement sendButton;

	@iOSXCUITFindBy(className= "XCUIElementTypeTextView")
	private WebElement message;

	@iOSXCUITFindBy(accessibility = "x")
	private WebElement closeButton;

	@iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
	private WebElement discussionsCancelButton;

	public void shouldBeCcMyEmailTextDispayed() {
		element(ccMyEmailText).shouldBeVisible();
	}

	public void clickOnBackButton() {
		element(backButton).click();
	}

	public void typeMessage(String text) {
		element(message).sendKeys(text);
	}

	public void clickOnSendButton() {
		element(sendButton).click();
	}

	public void shouldBeMessageDispayed() {
		element(By.name(SessionVariables.getValueFromSessionVariable("message"))).shouldBeVisible();
	}

	public void clickOnCloseButton() {
		element(closeButton).click();
	}

	public void clickOndiscussionsCancelButton() {
		element(discussionsCancelButton).click();
	}
}
