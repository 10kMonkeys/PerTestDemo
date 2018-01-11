package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscussionPage extends BasePage {
public DiscussionPage(WebDriver driver) {
	super(driver);
}

@iOSXCUITFindBy(accessibility = "CC my email on this conversation")
private WebElement ccMyEmailText;

@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
private WebElement backButton;

public boolean ccMyEmailTextDispayed() {
	return element(ccMyEmailText).isDisplayed();
}

public boolean clickBackButton() {
	return element(backButton).isDisplayed();
}
}
