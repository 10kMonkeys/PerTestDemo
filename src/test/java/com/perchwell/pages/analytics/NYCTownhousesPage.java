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

    @iOSXCUITFindBy(accessibility = "GARDEN houses TwoPiecePie")
    private WebElement gardenChart;

    @iOSXCUITFindBy(accessibility = "GARDEN PREMIUM")
    private WebElement gardenPremiumChart;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST.")
    private WebElement historyDistChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HAS GARDEN\"`][1]")
    private WebElement rebnyTownhouseListingsHasGardenButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_GARDEN_107")
    private WebElement mktShareREBNYTownhouseListingsHasGardenChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"IN HISTORIC DIST.\"")
    private WebElement rebnyTownhouseListingsInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_HISTORIC DIST._103")
    private WebElement mktShareREBNYTownhouseListingsInHistoricDistChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"SQUARE FEET\"")
    private WebElement rebnyTownhouseListingsSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_SQUARE FEET_106")
    private WebElement mktShareREBNYTownhouseListingsSquareFeetChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"WIDTH\"")
    private WebElement rebnyTownhouseListingsWidthButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_WIDTH_85")
    private WebElement mktShareREBNYTownhouseListingsWidthChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"YEAR LAST ALTERED\"")
    private WebElement rebnyTownhouseListingsYearLastAlteredButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_YEAR LAST ALTERED_130")
    private WebElement mktShareREBNYTownhouseListingsYearLastAlteredChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HAS GARDEN\"`][2]")
    private WebElement acrisTownhouseClosingHasGardenButton;

    @iOSXCUITFindBy(accessibility = "GARDEN")
    private WebElement mktShareACRISTownhouseClosingHasGardenChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"IN HISTORIC DIST.\"`][2]")
    private WebElement ACRISTownhouseClosingInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST.")
    private WebElement ACRISTownhouseClosingInHistoricDistChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][2]")
    private WebElement ACRISTownhouseClosingSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement ACRISTownhouseClosingSquareFeetChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][2]")
    private WebElement ACRISTownhouseClosingWidthButton;

    @iOSXCUITFindBy(accessibility = "WIDTH")
    private WebElement ACRISTownhouseClosingWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT BY PRICE\"`][1]")
    private WebElement ACRISTownhouseClosingDealCountByPriceButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE")
    private WebElement ACRISTownhouseClosingDealCountByPriceChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"GARDEN\"`][2]")
    private WebElement featureACRISTownhouseClosingsGardenButton;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_GARDEN PREMIUM_147")
    private WebElement featureACRISTownhouseClosingsGardenChart;

    @iOSXCUITFindBy(accessibility = "# TOWNHOUSES")
    private WebElement locationTotalTHStockNumberTownhousesButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_COUNT OF EXISTING TOWNHOUSES_83")
    private WebElement locationTotalTHStockNumberTownhousesChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HAS GARDEN\"`][3]")
    private WebElement totalTHStockHasGardenButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_GARDEN_89")
    private WebElement mktShareTotalTHStockHasGardenChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"IN HISTORIC DIST.\"`][3]")
    private WebElement totalTHStockInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_HISTORIC DIST._104")
    private WebElement mktShareTotalTHStockInHistoricDistChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][3]")
    private WebElement totalTHStockSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_SQUARE FEET_87")
    private WebElement mktShareTotalTHStockSquareFeetChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][3]")
    private WebElement totalTHStockWidthButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_WIDTH_90")
    private WebElement mktShareTotalTHStockWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"YEAR LAST ALTERED\"`][2]")
    private WebElement totalTHStockYearLastAlteredButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_YEAR LAST ALTERED_114")
    private WebElement mktShareTotalTHStockYearLastAlteredChart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS BY FT²")
    private WebElement rebnyTHListingsNumListingsByFT2Button;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_NUMBER OF LISTINGS BY FT²_92")
    private WebElement distribREBNYTHListingsNumListingsByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS BY WIDTH")
    private WebElement rebnyTHListingsNumListingsByWidthButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_NUMBER OF LISTINGS BY WIDTH_96")
    private WebElement distribREBNYTHListingsNumListingsByWidthChart;

    @iOSXCUITFindBy(accessibility = "# SALES BY FT²")
    private WebElement acrisTownhouseClosingNumSalesByFT2Button;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_NUMBER OF SALES BY FT²_94")
    private WebElement distribACRISTownhouseClosingNumSalesByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# SALES BY WIDTH")
    private WebElement acrisTownhouseClosingNumSalesByWidthButton;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_NUMBER OF SALES BY WIDTH_95")
    private WebElement distribACRISTownhouseClosingNumSalesByWidthChart;

    @iOSXCUITFindBy(accessibility = "# HOUSES BY FT²")
    private WebElement totalTHStockNumHousesByFT2Button;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_NUMBER OF TOWNHOUSES BY FT²_93")
    private WebElement distribTotalTHStockNumHousesByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# HOUSES BY WIDTH")
    private WebElement totalTHStockNumHousesByWidthButton;

    @iOSXCUITFindBy(accessibility = "TOTAL TOWNHOUSE STOCK_NUMBER OF TOWNHOUSES BY WIDTH_102")
    private WebElement distribTotalTHStockNumHousesByWidthChart;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE")
    private WebElement rebnyTHListingsDOMByPriceButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_DOM BY PRICE_181")
    private WebElement distribREBNYTHListingsDOMByPriceChart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS")
    private WebElement rebnyTHListingsNumListingsButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_NUMBER OF LISTINGS_101")
    private WebElement rebnyTHListingsNumListingsChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"# RECENTLY ALTERED\"`][1]")
    private WebElement rebnyTHListingsNumRecentlyAlteredButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_NUMBER OF RECENTLY ALTERED LISTINGS_117")
    private WebElement rebnyTHListingsNumRecentlyAlertedChart;

    @iOSXCUITFindBy(accessibility = "ASKING $/FT²")
    private WebElement rebnyTHListingsAskingDollarsPerFT2Button;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_ASKING $/FT²_86")
    private WebElement rebnyTHListingsAskingDollarsPerFT2Chart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement rebnyTHListingsAskingPriceChartButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_ASKING PRICE_74")
    private WebElement rebnyTHListingsAskingPriceChartChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"MEDIAN WIDTH\"`][1]")
    private WebElement rebnyTHListingsMedianWidthButton;

    @iOSXCUITFindBy(accessibility = "REBNY TOWNHOUSE LISTINGS_MEDIAN WIDTH_110")
    private WebElement rebnyTHListingsMedianWidthChart;

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
        Helper.scrollToElement(mktShareREBNYTownhouseListingsHasGardenChart);
        element(mktShareREBNYTownhouseListingsHasGardenChart).shouldBeVisible();
    }

    public void addREBNYTownhouseListingsHasGardenChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTownhouseListingsHasGardenButton);
        element(rebnyTownhouseListingsHasGardenButton).click();
    }

    public void shouldSeeREBNYTownhouseListingsHasGardenChart() {
        element(mktShareREBNYTownhouseListingsHasGardenChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsInHistoricDistChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTownhouseListingsInHistoricDistButton);
        element(rebnyTownhouseListingsInHistoricDistButton).click();
        element(mktShareREBNYTownhouseListingsInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTownhouseListingsSquareFeetButton);
        element(rebnyTownhouseListingsSquareFeetButton).click();
        element(mktShareREBNYTownhouseListingsSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsWidthChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTownhouseListingsWidthButton);
        element(rebnyTownhouseListingsWidthButton).click();
        element(mktShareREBNYTownhouseListingsWidthChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTownhouseListingsYearLastAlteredChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTownhouseListingsYearLastAlteredButton);
        element(rebnyTownhouseListingsYearLastAlteredButton).click();
        element(mktShareREBNYTownhouseListingsYearLastAlteredChart).shouldBeVisible();
    }

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.swipeDownUntilElementVisible(button);
        resetImplicitTimeout();
    }

    public void addACRISTownhouseClosingHasGardenChart() throws Exception {
        this.swipeUntilButtonShown(acrisTownhouseClosingHasGardenButton);
        element(acrisTownhouseClosingHasGardenButton).click();
    }

    public void shouldSeeACRISTownhouseClosingHasGardenChart() {
        element(mktShareACRISTownhouseClosingHasGardenChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingInHistoricDistChart() throws Exception {
        this.swipeUntilButtonShown(ACRISTownhouseClosingInHistoricDistButton);
        element(ACRISTownhouseClosingInHistoricDistButton).click();
        element(ACRISTownhouseClosingInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(ACRISTownhouseClosingSquareFeetButton);
        element(ACRISTownhouseClosingSquareFeetButton).click();
        element(ACRISTownhouseClosingSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingWidthChart() throws Exception {
        this.swipeUntilButtonShown(ACRISTownhouseClosingWidthButton);
        element(ACRISTownhouseClosingWidthButton).click();
        element(ACRISTownhouseClosingWidthChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingDealCountByPriceChart() throws Exception {
        this.swipeUntilButtonShown(ACRISTownhouseClosingDealCountByPriceButton);
        element(ACRISTownhouseClosingDealCountByPriceButton).click();
        element(ACRISTownhouseClosingDealCountByPriceChart).shouldBeVisible();
    }

    public void addMKTShareREBNYTHListingsInHistoricDistChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTownhouseListingsInHistoricDistButton);
        element(rebnyTownhouseListingsInHistoricDistButton).click();
    }

    public void shouldSeeMKTShareREBNYTHListingsInHistoricDistChart() {
        element(mktShareREBNYTownhouseListingsInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesACRISTHClosingsGardenChart() throws Exception {
        Helper.swipeDownUntilElementVisible(featureACRISTownhouseClosingsGardenButton);
        element(featureACRISTownhouseClosingsGardenButton).click();
        element(featureACRISTownhouseClosingsGardenChart).shouldBeVisible();
    }

    public void addAndVerifyLocationTotalTHStockNumberTownhousesChart() throws Exception {
        Helper.swipeDownUntilElementVisible(locationTotalTHStockNumberTownhousesButton);
        element(locationTotalTHStockNumberTownhousesButton).click();
        element(locationTotalTHStockNumberTownhousesChart).shouldBeVisible();
    }

    public void addTotalTHStockHasGardenChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockHasGardenButton);
        element(totalTHStockHasGardenButton).click();
    }

    public void shouldSeeTotalTHStockHasGardenChart() {
        element(mktShareTotalTHStockHasGardenChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockInHistoricDistChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockInHistoricDistButton);
        element(totalTHStockInHistoricDistButton).click();
        element(mktShareTotalTHStockInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockSquareFeetChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockSquareFeetButton);
        element(totalTHStockSquareFeetButton).click();
        element(mktShareTotalTHStockSquareFeetChart).shouldBeVisible();

    }

    public void addAndVerifyTotalTHStockWidthChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockWidthButton);
        element(totalTHStockWidthButton).click();
        element(mktShareTotalTHStockWidthChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockYearLastAlteredChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockYearLastAlteredButton);
        element(totalTHStockYearLastAlteredButton).click();
        element(mktShareTotalTHStockYearLastAlteredChart).shouldBeVisible();
    }

    public void addREBNYTHListingsNumListingByFT2Chart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsNumListingsByFT2Button);
        element(rebnyTHListingsNumListingsByFT2Button).click();
    }

    public void shouldSeeREBNYTHListingsNumListingByFT2Chart() {
        element(distribREBNYTHListingsNumListingsByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsNumListingsByWidthChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsNumListingsByWidthButton);
        element(rebnyTHListingsNumListingsByWidthButton).click();
        element(distribREBNYTHListingsNumListingsByWidthChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingNumSalesByFT2Chart() throws Exception {
        Helper.swipeDownUntilElementVisible(acrisTownhouseClosingNumSalesByFT2Button);
        element(acrisTownhouseClosingNumSalesByFT2Button).click();
        element(distribACRISTownhouseClosingNumSalesByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingNumSalesByWidthChart() throws Exception {
        Helper.swipeDownUntilElementVisible(acrisTownhouseClosingNumSalesByWidthButton);
        element(acrisTownhouseClosingNumSalesByWidthButton).click();
        element(distribACRISTownhouseClosingNumSalesByWidthChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockNumHousesByFT2Chart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockNumHousesByFT2Button);
        element(totalTHStockNumHousesByFT2Button).click();
        element(distribTotalTHStockNumHousesByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockNumHousesByWidthChart() throws Exception {
        Helper.swipeDownUntilElementVisible(totalTHStockNumHousesByWidthButton);
        element(totalTHStockNumHousesByWidthButton).click();
        element(distribTotalTHStockNumHousesByWidthChart).shouldBeVisible();
    }

    public void addREBNYTHListingsDOMByPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsDOMByPriceButton);
        element(rebnyTHListingsDOMByPriceButton).click();
    }

    public void shouldSeeREBNYTHListingsDOMByPriceChart() {
        element(distribREBNYTHListingsDOMByPriceChart).shouldBeVisible();
    }

    public void addREBNYTHListingsNumListingsChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsNumListingsButton);
        element(rebnyTHListingsNumListingsButton).click();
    }

    public void shouldSeeREBNYTHListingsNumListingsChart() {
        element(rebnyTHListingsNumListingsChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsNumRecentlyAlteredChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsNumRecentlyAlteredButton);
        element(rebnyTHListingsNumRecentlyAlteredButton).click();
        element(rebnyTHListingsNumRecentlyAlertedChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsAskingDollarsPerFT2Chart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsAskingDollarsPerFT2Button);
        element(rebnyTHListingsAskingDollarsPerFT2Button).click();
        element(rebnyTHListingsAskingDollarsPerFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsAskingPriceChartButton);
        element(rebnyTHListingsAskingPriceChartButton).click();
        element(rebnyTHListingsAskingPriceChartChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsMedianWidthChart() throws Exception {
        Helper.swipeDownUntilElementVisible(rebnyTHListingsMedianWidthButton);
        element(rebnyTHListingsMedianWidthButton).click();
        element(rebnyTHListingsMedianWidthChart).shouldBeVisible();
    }
}
