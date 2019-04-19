package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactListingAgentPage extends TechHelper {

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/send_email")
    @iOSXCUITFindBy(accessibility = "SEND EMAIL")
    private WebElement sendEmailButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/message_edit_text")
    @iOSXCUITFindBy(accessibility = "Write message here (you will be copied on the email)")
    private WebElement messageField;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/shrink_button")
    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement collapseButton;

    @AndroidFindBy(accessibility = "Subject textField")
    @iOSXCUITFindBy(accessibility = "Subject textField")
    private WebElement subjectField;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement emailField;

    @iOSXCUITFindBy(accessibility = "test-ios+mgmt-stribling@perchwell.com")
    private WebElement defaultAgentCCAddress;

    @iOSXCUITFindBy(accessibility = "Back")
    private WebElement backButtonFromContactListingAgentPage;

    //endregion
    
    public ContactListingAgentPage(WebDriver driver) {
        super(driver);
    }

    public void checkIfSendEmailButtonIsDisabled() {
        element(sendEmailButton).shouldNotBeEnabled();
    }

    public void fillInMessageField(String message) {
        if(Config.isAndroid()) {
            element(messageField).click();
        }
        element(messageField).sendKeys(message);
        SessionVariables.addValueInSessionVariable("Contact_message", message);
    }

    public void clickOnCollapseIcon() {
        element(collapseButton).click();
    }

    public void checkIfSendEmailButtonIsEnabled() {
        element(sendEmailButton).shouldBeEnabled();
    }

    public void clearSubjectField() {
        element(subjectField).clear();
    }

    public void fillInSubjectField(String message) {
        element(subjectField).sendKeys(message);
        SessionVariables.addValueInSessionVariable("Contact_subject", message);
    }

    public void clickOnSendEmailButton() {
        element(sendEmailButton).click();
    }

    public void fillInEmailField(String email) {
        element(emailField).sendKeys(email);
    }

    public void checkIfEmailIsAdded(String email) {
        element(MobileBy.AccessibilityId(email)).shouldBeVisible();
    }

    public void checkDefaultAgentCCAddress() {
        element(defaultAgentCCAddress).shouldBeVisible();
    }

    public void hideKeyboard() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        appiumDriver.hideKeyboard();
    }

    public void clickOnBackButton() {
        element(backButtonFromContactListingAgentPage).click();
    }
}
