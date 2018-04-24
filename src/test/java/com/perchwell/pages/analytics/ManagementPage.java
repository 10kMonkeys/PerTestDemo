package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagementPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceButton;

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE")
    private WebElement buildingTypeChart;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @iOSXCUITFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement firmListingCountButton;

    //endregion


    public ManagementPage(WebDriver driver) {
        super(driver);
    }

    public void daysOnMarketButtonClick(){
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick(){
        element(bedroomsButton).click();
    }

    public void isAskingPriseChartAdd(){
        element(askingPriceButton).shouldBeVisible();
    }

    public void isDaysOnMarketChartAdd(){
        element(daysOnMarketButton).shouldBeVisible();
    }

    public void buildingHeightButton(){
        element(buildingHeightButton).click();
    }

    public void isBuildingHeightChartAdd(){
        element(buildingHeightButton).shouldBeVisible();
    }

    public void askingPriceButtonClick(){
        element(askingPriceButton).click();
    }

    public void addAndVerifyBuildingTypeChart(){
        element(buildingTypeChart).click();
        element(buildingTypeChart).shouldBeVisible();
    }

    public void firmListingCountButtonClick(){
        element(firmListingCountButton).click();
    }

    public void isFirmListingCountChartDisplayed(){
        element(firmListingCountButton).shouldBeVisible();
    }

    public void shouldDaysOnMarketDisplayedWithSwipe() throws Exception {
        Helper.swipeDownUntilElementVisible(daysOnMarketButton);
        //Helper.scrollToElement(daysOnMarketButton);
        element(daysOnMarketButton).shouldBeVisible();
    }
}
