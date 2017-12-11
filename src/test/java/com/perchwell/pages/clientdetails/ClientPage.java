package com.perchwell.pages.clientdetails;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.perchwell.pages.BasePage;

public class ClientPage extends BasePage {

    public ClientPage(WebDriver driver){
        super (driver);
    }

    @iOSXCUITFindBy(accessibility = "ADD NEW CLIENT")
    private WebElement addNewClientButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement clientNameTextBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private WebElement clientEmailTextBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
    private WebElement groupLabel;



    private WebElement getGroupLabelName(String groupName){
        WebElement groupLabelName = getDriver().findElement(MobileBy.AccessibilityId(groupName));
        return groupLabelName;
    }

    @iOSXCUITFindBy(accessibility = "INVITE")
    private WebElement inviteButton;

    public void clickInviteButton() { element(inviteButton).click(); }

    public void clickAddNewClientButton() { element(addNewClientButton).click(); }

    public void setClientName(String clientName){ element(clientNameTextBox).sendKeys(clientName); }

    public void setClientEmail(String clientEmail) { element(clientEmailTextBox).sendKeys(clientEmail); }

    public void clickGroupLabel() { element(groupLabel).click(); }

    public void selectGroup(String groupName) {
        this.getGroupLabelName(groupName).click();
    }

    public boolean isClientDisplayed(String clientName) {
        return isElementVisible(MobileBy.AccessibilityId(clientName));
    }
}
