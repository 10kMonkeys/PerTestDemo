package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactListingAgentsPage extends BasePage {

    @iOSXCUITFindBy(accessibility = "Back")
    private WebElement backButtonFromConstactListingAgentsPage;

    @iOSXCUITFindBy(accessibility = "Write message here (you will be copied on the email)")
    private WebElement messageField;

    @iOSXCUITFindBy(accessibility = "SEND EMAIL")
    private WebElement sendEmailButton;

    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement shrinkButton;

    public ContactListingAgentsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBackButton() {
        element(backButtonFromConstactListingAgentsPage).click();
    }

    public void fillMessageField(String message) {
        element(messageField).sendKeys(message);
        element(shrinkButton).click();
    }

    public void clickOnSendEmailButton() {
        element(sendEmailButton).click();
    }
}
