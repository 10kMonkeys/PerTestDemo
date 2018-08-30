package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscussThisListingPage extends BasePage {

    //region WebElements

    @AndroidFindBy(xpath = "//*[@text='CONSTANT CLIENT']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'CONSTANT CLIENT'")
    private WebElement clientWithDiscussion;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/delete_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
    private WebElement deleteButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSXCUITFindBy(accessibility = "DiscussionsCancelButton")
    private WebElement closeButton;

    //endregion

    public DiscussThisListingPage(WebDriver driver) {
        super(driver);
    }

    public void DeleteClientsWithDiscussion() throws Exception {
        while (element(clientWithDiscussion).isVisible()) {
            int y = clientWithDiscussion.getLocation().getY();
//            Helper.swipeRightElementWithSetY(clientWithDiscussion, y + 1);
            Helper.universalHorizontalSwipe(clientWithDiscussion, y + 1);
            clickOnDeleteButton();
        }
    }

    public void clickOnDeleteButton() {
        element(deleteButton).click();
    }

    public void clickOnClosePageButton() {
        element(closeButton).click();
    }
}
