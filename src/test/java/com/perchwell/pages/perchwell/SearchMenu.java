package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class SearchMenu extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private WebElement searchMenuIcon;

    @iOSXCUITFindBy(accessibility = "Edit Search Button")
    private WebElement editSearchButton;

    @iOSXCUITFindBy(accessibility = "My Saved Searches Button")
    private WebElement mySavedSearchesButton;

    @iOSXCUITFindBy(accessibility = "Account Bar Button")
    private WebElement openAccountButton;

    @iOSXCUITFindBy(accessibility = "x")
    private WebElement crossButton;

    @iOSXCUITFindBy(accessibility = "Search By Address Button")
    private WebElement searchByAddressButton;

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

    public void clickOnSearchByAddressButton() {
        element(searchByAddressButton).click();
    }
}
