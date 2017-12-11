package com.perchwell.pages.tags;

import com.perchwell.pages.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TagsPage extends BasePage {

    public TagsPage(WebDriver driver){
        super (driver);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSearchField")
    private WebElement searchTagTexBox;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell")
    private WebElement createTagLabel;

    @iOSXCUITFindBy(accessibility = "Back")
    private WebElement back;

   // @iOSXCUITFindBy(accessibility = )

    private WebElement getCreatedTagLabel(String uniqueTagName){
        WebElement createdTag = getDriver().findElement(MobileBy.AccessibilityId(uniqueTagName));
        return createdTag;
    }

    @iOSXCUITFindBy(accessibility = "search")
    private WebElement searchButton;

    public void setUniqueSearchTagTextBox(String uniqueTagName) { element(searchTagTexBox).sendKeys(uniqueTagName); }

    public void clickCreateTagLabel () { element(createTagLabel).click(); }

    public void clickBackButton() { element(back).click(); }

    public void clickCreatedTagLabel(String uniqueTagName) {
        this.getCreatedTagLabel(uniqueTagName).click();
    }

    public void clickSearchButton() { element(searchButton).click(); }

    public boolean isTagDisplayed(String tagName) {
        return isElementVisible(MobileBy.AccessibilityId(tagName));
    }
}
