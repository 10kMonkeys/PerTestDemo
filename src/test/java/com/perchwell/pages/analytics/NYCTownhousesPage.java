package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class NYCTownhousesPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HAS GARDEN\"][1]")
    private WebElement hasGardenButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"IN HISTORIC DIST.\"])[1]\n")
    private WebElement inHistoryDistButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "GARDEN")
    private WebElement gardenChart;

    @iOSXCUITFindBy(accessibility = "GARDEN PREMIUM")
    private WebElement gardenPremiumChart;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST.")
    private WebElement historyDistChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"HAS GARDEN\"")
    private WebElement REBNYTownhouseListingsHasGardenButton;

    @iOSXCUITFindBy(accessibility = "GARDEN")
    private WebElement REBNYTownhouseListingsHasGardenChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"IN HISTORIC DIST.\"")
    private WebElement REBNYTownhouseListingsInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST.")
    private WebElement REBNYTownhouseListingsInHistoricDistChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"SQUARE FEET\"")
    private WebElement REBNYTownhouseListingsSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement REBNYTownhouseListingsSquareFeetChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"WIDTH\"")
    private WebElement REBNYTownhouseListingsWidthButton;

    @iOSXCUITFindBy(accessibility = "WIDTH")
    private WebElement REBNYTownhouseListingsWidthChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"YEAR LAST ALTERED\"")
    private WebElement REBNYTownhouseListingsYearLastAlteredButton;

    @iOSXCUITFindBy(accessibility = "YEAR LAST ALTERED")
    private WebElement REBNYTownhouseListingsYearLastAlteredChart;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS")
    private WebElement REBNYTownhouseListingsTitle;

    //endregion

    public NYCTownhousesPage(WebDriver driver) {
        super(driver);
    }

    public void selectGardenChart(){
        element(gardenChart).click();
    }

    public void isHistoryDistChartAdd(){
        element(historyDistChart).shouldBeVisible();
    }

    public void isGardenPremiumChartDisplayed(){
        element(gardenPremiumChart).shouldBeVisible();
    }

    public void inDHistoryDistButtonClick(){
        element(inHistoryDistButton).click();
    }

    public void hasGardenButtonClick(){
        element(hasGardenButton).click();
    }

    public void shouldGardenChartDisplayed() {
        Helper.scrollToElement(gardenChart);
        element(gardenChart).shouldBeVisible();
    }

    public void addREBNYTownhouseListingsHasGardenChart() throws Exception {
        swipeUntilButtonShown(REBNYTownhouseListingsHasGardenButton);
        element(REBNYTownhouseListingsHasGardenButton).click();
    }

    public void shouldSeeREBNYTownhouseListingsHasGardenChart() {
        element(REBNYTownhouseListingsTitle).shouldBeVisible();
        element(REBNYTownhouseListingsHasGardenChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsInHistoricDistChart() throws Exception {
        swipeUntilButtonShown(REBNYTownhouseListingsInHistoricDistButton);
        element(REBNYTownhouseListingsInHistoricDistButton).click();
        element(REBNYTownhouseListingsTitle).shouldBeVisible();
        element(REBNYTownhouseListingsInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsSquareFeetChart() throws Exception {
        swipeUntilButtonShown(REBNYTownhouseListingsSquareFeetButton);
        element(REBNYTownhouseListingsSquareFeetButton).click();
        element(REBNYTownhouseListingsTitle).shouldBeVisible();
        element(REBNYTownhouseListingsSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsWidthChart() throws Exception {
        swipeUntilButtonShown(REBNYTownhouseListingsWidthButton);
        element(REBNYTownhouseListingsWidthButton).click();
        element(REBNYTownhouseListingsTitle).shouldBeVisible();
        element(REBNYTownhouseListingsWidthChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsYearLastAlteredChart() throws Exception {
        swipeUntilButtonShown(REBNYTownhouseListingsYearLastAlteredButton);
        element(REBNYTownhouseListingsYearLastAlteredButton).click();
        element(REBNYTownhouseListingsTitle).shouldBeVisible();
        element(REBNYTownhouseListingsYearLastAlteredChart).shouldBeVisible();
    }

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.swipeDownUntilElementVisible(button);
        resetImplicitTimeout();
    }
}
