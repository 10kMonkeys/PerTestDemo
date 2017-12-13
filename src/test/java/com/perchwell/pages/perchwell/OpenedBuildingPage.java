package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenedBuildingPage extends BasePage {

    public OpenedBuildingPage(WebDriver driver){
        super (driver);
    }

    @iOSXCUITFindBy(accessibility = "DISCUSS THIS WITH YOUR CLIENT OR AGENT. WE'LL ORGANIZE YOUR MESSAGES BY PERSON & LISTING.")
    private WebElement discussThisHint;

    @iOSXCUITFindBy(accessibility = "MY TAGS")
    private WebElement myTagsLabel;

    @iOSXCUITFindBy(accessibility = "Nav Back White")
    private WebElement backButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private WebElement deleteTagButton;

    public void clickDiscussWithMyClientHint() { element(discussThisHint).click(); }

    public void clickMyTagsLabel() { element(myTagsLabel).click(); }

    public void clickBackButton(){ element(backButton).click(); }

    public boolean isTagDisplayed(String tagName) {
        return isElementVisible(MobileBy.AccessibilityId(tagName));
    }

    public void ckickDeleteTagButton() {
        while (element(deleteTagButton).isCurrentlyVisible()) {
            element(deleteTagButton).click();
        }
    }
}
