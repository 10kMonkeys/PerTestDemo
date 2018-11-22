package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchMenu extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "chevronDown")
    private WebElement searchMenuIcon;

    @iOSXCUITFindBy(accessibility = "EDIT SEARCH")
    private WebElement editSearchButton;

    @iOSXCUITFindBy(accessibility = "MY SAVED SEARCHES")
    private WebElement mySavedSearchesButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton[3]")
    private WebElement openAccountButton;

    //endregion

    public SearchMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearchMenuIcon() {
        element(searchMenuIcon).click();
    }

    public void clickOnEditSearchButton() {
        element(editSearchButton).click();
    }

    public void clickOnMySavedSearches() {
        element(mySavedSearchesButton).click();

    }

    public void clickOnSearchMenuIconWithPause() {
        waitFor(ExpectedConditions.visibilityOf(openAccountButton));
        this.clickOnSearchMenuIcon();
    }
}
