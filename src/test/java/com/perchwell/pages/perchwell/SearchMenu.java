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

//    @iOSXCUITFindBy(accessibility = "chevronDown")
    @iOSXCUITFindBy(accessibility = "MY NEW SEARCH")
    private WebElement searchMenuIcon;

    @iOSXCUITFindBy(accessibility = "EDIT SEARCH")
    private WebElement editSearchButton;

    @iOSXCUITFindBy(accessibility = "MY SAVED SEARCHES")
    private WebElement mySavedSearchesButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton[3]")
    private WebElement openAccountButton;

    @iOSXCUITFindBy(accessibility = "x")
    private WebElement crossButton;

    //endregion

    public SearchMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearchMenuIcon() {
        element(searchMenuIcon).click();
    }

    public void clickOnEditSearchButton() {
        //        element(editSearchButton).click();

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        int x = element(searchMenuIcon).getLocation().getX() + 3;
        int y = element(searchMenuIcon).getLocation().getY() + 38;
        new TouchAction(appiumDriver).tap(x, y).release().perform();
    }

    public void clickOnMySavedSearches() {
//        element(mySavedSearchesButton).click();

        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        WebDriver webDriver = webDriverFacade.getProxiedDriver();
        AppiumDriver appiumDriver = (AppiumDriver) webDriver;

        int x = element(searchMenuIcon).getLocation().getX() + 3;
        int y = element(searchMenuIcon).getLocation().getY() + 146;
        new TouchAction(appiumDriver).tap(x, y).release().perform();
    }

    public void clickOnSearchMenuIconWithPause() {
        waitFor(ExpectedConditions.visibilityOf(openAccountButton));
        this.clickOnSearchMenuIcon();
    }
}
