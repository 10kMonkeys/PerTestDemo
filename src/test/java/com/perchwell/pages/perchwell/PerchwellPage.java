package com.perchwell.pages.perchwell;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import com.perchwell.pages.base.BaseSwipe;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PerchwellPage extends BaseSwipe {

    public PerchwellPage(WebDriver driver){
        super (driver);
    }

    @iOSXCUITFindBy(accessibility = "EDIT SEARCH FILTERS OR SEARCH FOR A SPECIFIC ADDRESS")
    private WebElement editSearchFiltersHint;

    @iOSXCUITFindBy(accessibility = "MANAGE YOUR PROFILE, CONTACTS, DISCUSSIONS, AND TAGS")
    private WebElement manageYourProfileHint;

    @iOSXCUITFindBy(accessibility = "TRANSFORM DATA INTO MARKET INSIGHTS")
    private WebElement transformDataHint;

    @iOSXCUITFindBy(accessibility = "EXPLORE SEARCH RESULTS BY LOCATION")
    private WebElement exploreSearchResultHint;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton")
    private WebElement openAccountButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[1]")
    private WebElement firstBuilding;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[2]")
    private WebElement secondBuilding;

    public WebElement getThirdBuilding() {
        return thirdBuilding;
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[3]")
    private WebElement thirdBuilding;

    public void clickOpenAccountButton() { element(openAccountButton).click(); }

    public void clickEditSearchFiltersHint() { element(editSearchFiltersHint).click(); }

    public void clickManageYourProfileHint() { element(manageYourProfileHint).click(); }

    public void clickTransformDataHint() { element(transformDataHint).click(); }

    public void clickExploreSearchResultHint() { element(exploreSearchResultHint).click(); }

    public void openFirstBuilding() { element(firstBuilding).click(); }

    public void openSecondBuilding() { element(secondBuilding).click();  }

    public void openThirdBuilding() throws Exception {
                element(thirdBuilding).click();
    }

    public boolean isBuildingDisplayedWithSwipe(WebElement element) throws Exception {
            setImplicitTimeout(1, SECONDS);
            swipeDownUntilElementVisible(element);
            resetImplicitTimeout();
    return element.isDisplayed();

    }


}
