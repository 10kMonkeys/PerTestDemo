package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscussionPage extends BasePage {
public DiscussionPage(WebDriver driver) {
	super(driver);
}

@iOSXCUITFindBy(accessibility = "CC my email on this conversation")
private WebElement ccMyEmailText;

//@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Perchwell_Staging.ChatView\"]/XCUIElementTypeButton")
private WebElement backButton;

@iOSXCUITFindBy(accessibility = "SEND")
private WebElement sendButton;

//iosClassChain change and depends on numder of message
@iOSXCUITFindBy(className= "XCUIElementTypeTextView")
private WebElement message;

	public boolean ccMyEmailTextDispayed() {
		return element(ccMyEmailText).isDisplayed();
	}

	public void clickBackButton() {
		element(backButton).click();
	}
	public void typeMessage(String text) {
		element(message).sendKeys(text);
	}

	public void clickSend() {
		element(sendButton).click();
	}

	public void addValueInSessionVariable(String name, String value) {
		Serenity.setSessionVariable(name).to(value);
	}

	public String getValueFromSessionVariable(String name) {
		return Serenity.sessionVariableCalled(name);
	}

	public boolean messageIsDispayed() {
		return Helper.isElementDisplayed(element(By.name(getValueFromSessionVariable("message"))));
	}
}
