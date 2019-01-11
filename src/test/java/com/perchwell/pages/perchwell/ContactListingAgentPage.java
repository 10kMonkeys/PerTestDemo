package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactListingAgentPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "SEND EMAIL")
    private WebElement sendEmailButton;

    @iOSXCUITFindBy(accessibility = "Write message here (you will be copied on the email)")
    private WebElement messageField;

    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement collapseButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private WebElement subjectField;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement emailField;

    //endregion
    
    public ContactListingAgentPage(WebDriver driver) {
        super(driver);
    }

    public void checkIfSendEmailButtonIsDisabled() {
        Assert.assertFalse(element(sendEmailButton).isEnabled());
    }

    public void fillInMessageField(String message) {
        element(messageField).sendKeys(message);
    }

    public void clickOnCollapseIcon() {
        element(collapseButton).click();
    }

    public void checkIfSendEmailButtonIsEnabled() {
        Assert.assertTrue(element(sendEmailButton).isEnabled());
    }

    public void clearSubjectField() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        element(subjectField).clear();
        appiumDriver.hideKeyboard();
    }

    public void fillInSubjectField(String message) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        element(subjectField).sendKeys(message);
        appiumDriver.hideKeyboard();
    }

    public void clickOnSendEmailButton() {
        element(sendEmailButton).click();
    }

    public void fillInEmailField(String email) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        element(emailField).sendKeys(email);
        appiumDriver.hideKeyboard();
    }

    public void checkIfEmailIsAdded(String email) {
        element(MobileBy.AccessibilityId(email)).shouldBeVisible();
    }

}
