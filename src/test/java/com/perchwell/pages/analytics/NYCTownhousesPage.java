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

    @iOSXCUITFindBy(accessibility = "GARDEN_MUSTHAVE_GARDEN_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareREBNYTownhouseListingsHasGardenChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"IN HISTORIC DIST.\"")
    private WebElement rebnyTownhouseListingsInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST._MUSTHAVE_IS_HISTORICAL_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareREBNYTownhouseListingsInHistoricDistChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"SQUARE FEET\"")
    private WebElement rebnyTownhouseListingsSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET_SQFTTRANCHES_ABOVE_AREA_SQUARE_FT_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareREBNYTownhouseListingsSquareFeetChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"WIDTH\"")
    private WebElement rebnyTownhouseListingsWidthButton;

    @iOSXCUITFindBy(accessibility = "WIDTH_WIDTHTRANCHES_WIDTH_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareREBNYTownhouseListingsWidthChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"YEAR LAST ALTERED\"")
    private WebElement rebnyTownhouseListingsYearLastAlteredButton;

    @iOSXCUITFindBy(accessibility = "YEAR LAST ALTERED_YEARALTEREDTRANCHES_YEAR_LAST_ALTERED_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareREBNYTownhouseListingsYearLastAlteredChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HAS GARDEN\"`][2]")
    private WebElement acrisTownhouseClosingHasGardenButton;

    @iOSXCUITFindBy(accessibility = "GARDEN_MUSTHAVE_GARDEN_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareACRISTownhouseClosingHasGardenChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"IN HISTORIC DIST.\"`][2]")
    private WebElement ACRISTownhouseClosingInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST._MUSTHAVE_IS_HISTORICAL_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement ACRISTownhouseClosingInHistoricDistChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][2]")
    private WebElement ACRISTownhouseClosingSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET_SQFTTRANCHES_ABOVE_AREA_SQUARE_FT_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement ACRISTownhouseClosingSquareFeetChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][2]")
    private WebElement ACRISTownhouseClosingWidthButton;

    @iOSXCUITFindBy(accessibility = "WIDTH_WIDTHTRANCHES_WIDTH_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement ACRISTownhouseClosingWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT BY PRICE\"`][1]")
    private WebElement ACRISTownhouseClosingDealCountByPriceButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE_PRICETRANCHES_SALE_PRICE_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement ACRISTownhouseClosingDealCountByPriceChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"GARDEN\"`][2]")
    private WebElement featureACRISTownhouseClosingsGardenButton;

    @iOSXCUITFindBy(accessibility = "GARDEN PREMIUM_PREMIUM_GARDEN_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement featureACRISTownhouseClosingsGardenChart;

    @iOSXCUITFindBy(accessibility = "# TOWNHOUSES")
    private WebElement locationTotalTHStockNumberTownhousesButton;

    @iOSXCUITFindBy(accessibility = "COUNT OF EXISTING TOWNHOUSES_COUNTS_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement locationTotalTHStockNumberTownhousesChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HAS GARDEN\"`][3]")
    private WebElement totalTHStockHasGardenButton;

    @iOSXCUITFindBy(accessibility = "GARDEN_MUSTHAVE_GARDEN_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareTotalTHStockHasGardenChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"IN HISTORIC DIST.\"`][3]")
    private WebElement totalTHStockInHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "HISTORIC DIST._MUSTHAVE_IS_HISTORICAL_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareTotalTHStockInHistoricDistChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][3]")
    private WebElement totalTHStockSquareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET_SQFTTRANCHES_ABOVE_AREA_SQUARE_FT_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareTotalTHStockSquareFeetChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][3]")
    private WebElement totalTHStockWidthButton;

    @iOSXCUITFindBy(accessibility = "WIDTH_WIDTHTRANCHES_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareTotalTHStockWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"YEAR LAST ALTERED\"`][2]")
    private WebElement totalTHStockYearLastAlteredButton;

    @iOSXCUITFindBy(accessibility = "YEAR LAST ALTERED_YEARALTEREDTRANCHES_YEAR_LAST_ALTERED_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement mktShareTotalTHStockYearLastAlteredChart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS BY FT²")
    private WebElement rebnyTHListingsNumListingsByFT2Button;

    @iOSXCUITFindBy(accessibility = "NUMBER OF LISTINGS BY SQFT_SQFTDISTRIBUTION_ABOVE_AREA_SQUARE_FT_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement distribREBNYTHListingsNumListingsByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS BY WIDTH")
    private WebElement rebnyTHListingsNumListingsByWidthButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF LISTINGS BY WIDTH_COUNTPERWIDTHTRANCHE_WIDTH_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement distribREBNYTHListingsNumListingsByWidthChart;

    @iOSXCUITFindBy(accessibility = "# SALES BY FT²")
    private WebElement acrisTownhouseClosingNumSalesByFT2Button;

    @iOSXCUITFindBy(accessibility = "NUMBER OF SALES BY SQFT_SQFTDISTRIBUTION_ABOVE_AREA_SQUARE_FT_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement distribACRISTownhouseClosingNumSalesByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# SALES BY WIDTH")
    private WebElement acrisTownhouseClosingNumSalesByWidthButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF SALES BY WIDTH_COUNTPERWIDTHTRANCHE_WIDTH_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement distribACRISTownhouseClosingNumSalesByWidthChart;

    @iOSXCUITFindBy(accessibility = "# HOUSES BY FT²")
    private WebElement totalTHStockNumHousesByFT2Button;

    @iOSXCUITFindBy(accessibility = "NUMBER OF TOWNHOUSES BY SQFT_SQFTDISTRIBUTION_ABOVE_AREA_SQUARE_FT_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement distribTotalTHStockNumHousesByFT2Chart;

    @iOSXCUITFindBy(accessibility = "# HOUSES BY WIDTH")
    private WebElement totalTHStockNumHousesByWidthButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF TOWNHOUSES BY WIDTH_COUNTPERWIDTHTRANCHE_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement distribTotalTHStockNumHousesByWidthChart;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE")
    private WebElement rebnyTHListingsDOMByPriceButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE_DAYSONMARKETBYPRICESEGMENT_DAYS_ON_MARKET_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement distribREBNYTHListingsDOMByPriceChart;

    @iOSXCUITFindBy(accessibility = "# LISTINGS")
    private WebElement rebnyTHListingsNumListingsButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF LISTINGS_COUNTS_LISTING_PRICE_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement rebnyTHListingsNumListingsChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"# RECENTLY ALTERED\"`][1]")
    private WebElement rebnyTHListingsNumRecentlyAlteredButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF RECENTLY ALTERED LISTINGS_FILTEREDCOUNT_IS_RECENTLY_ALTERED_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement rebnyTHListingsNumRecentlyAlertedChart;

    @iOSXCUITFindBy(accessibility = "ASKING $/FT²")
    private WebElement rebnyTHListingsAskingDollarsPerFT2Button;

    @iOSXCUITFindBy(accessibility = "ASKING $/SQFT_BAR_LISTING_PRICE_PER_SQFT_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement rebnyTHListingsAskingDollarsPerFT2Chart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement rebnyTHListingsAskingPriceChartButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE_BAR_LISTING_PRICE_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement rebnyTHListingsAskingPriceChartChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"MEDIAN WIDTH\"`][1]")
    private WebElement rebnyTHListingsMedianWidthButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_BAR_WIDTH_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement rebnyTHListingsMedianWidthChart;

    @iOSXCUITFindBy(accessibility = "# SALES")
    private WebElement acrisClosingNumSalesButton;

    @iOSXCUITFindBy(accessibility = "# SALES OF RECENTLY ALTERED")
    private WebElement acrisClosingNumSalesOfRecentlyAlteredButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"MEDIAN WIDTH\"`][2]")
    private WebElement acrisClosingMedianWidthButton;

    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement acrisClosingPriceButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement acrisClosingPricePerFT2Button;

    @iOSXCUITFindBy(accessibility = "NUMBER OF SALES_COUNTS_SALE_PRICE_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement locationACRISClosingNumSalesChart;

    @iOSXCUITFindBy(accessibility = "COUNT OF RCNTLY ALTERED TH SALES_FILTEREDCOUNT_IS_RECENTLY_ALTERED_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement locationACRISClosingNumSalesOfRecentlyAlteredChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_BAR_WIDTH_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement locationACRISClosingMedianWidthChart;

    @iOSXCUITFindBy(accessibility = "SALE PRICE_BAR_SALE_PRICE_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement locationACRISClosingPriceChart;

    @iOSXCUITFindBy(accessibility = "SALE $/SQFT_BAR_SALE_PRICE_PER_SQFT_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement locationACRISClosingPricePerFT2Chart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"# RECENTLY ALTERED\"`][2]")
    private WebElement locationTotalTHStockNumRecentlyAlteredButton;

    @iOSXCUITFindBy(accessibility = "# TOWNHOUSES")
    private WebElement locationTotalTHStockNumTownhousesButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"MEDIAN WIDTH\"`][3]")
    private WebElement locationTotalTHStockMedianWidthButton;

    @iOSXCUITFindBy(accessibility = "NUMBER OF RECENTLY ALTERED HOUSES_FILTEREDCOUNT_IS_RECENTLY_ALTERED_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement locationTotalTHStockNumRecentlyAlteredChart;

    @iOSXCUITFindBy(accessibility = "COUNT OF EXISTING TOWNHOUSES_COUNTS_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement locationTotalTHStockNumTownhousesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_BAR_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement locationTotalTHStockMedianWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][1]")
    private WebElement medianREBNYTHListingsSquareFeetButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][1]")
    private WebElement medianREBNYTHListingsWidthButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][2]")
    private WebElement medianACRISTHClosingSquareFeetButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][2]")
    private WebElement medianACRISTHClosingWidthButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"SQUARE FEET\"`][3]")
    private WebElement medianTotalTHStockSquareFeetButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"WIDTH\"`][3]")
    private WebElement medianTotalTHStockWidthButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SQUARE FEET_MEDIAN_ABOVE_AREA_SQUARE_FT_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement medianREBNYTHListingsSquareFeetChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_MEDIAN_WIDTH_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement medianREBNYTHListingsWidthChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SQUARE FEET_MEDIAN_ABOVE_AREA_SQUARE_FT_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement medianACRISTHClosingSquareFeetChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_MEDIAN_WIDTH_HISTORICALS_HOUSES: HEADER TITLE LABEL")
    private WebElement medianACRISTHClosingWidthChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SQUARE FEET_MEDIAN_ABOVE_AREA_SQUARE_FT_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement medianTotalTHStockSquareFeetChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN WIDTH_MEDIAN_WIDTH_HOUSES_HOUSES: HEADER TITLE LABEL")
    private WebElement medianTotalTHStockWidthChart;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"24 FT+ WIDTH\"`][1]")
    private WebElement featuresREBNYTHListingsTwentyFourPlusWidthButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"GARDEN\"`][1]")
    private WebElement featuresREBNYTHListingsGardenButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HISTORIC DISTRICT\"`][1]")
    private WebElement featuresREBNYTHListingsHistoricDistButton;

    @iOSXCUITFindBy(accessibility = "LANDMARK")
    private WebElement featuresREBNYTHListingsLandmarkButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"RECENTLY ALTERED\"`][1]")
    private WebElement featuresREBNYTHListingsRecentlyAlteredButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"24 FT+ WIDTH\"`][2]")
    private WebElement featuresACRISClosingTwentyFourPlusWidthButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"HISTORIC DISTRICT\"`][2]")
    private WebElement featuresACRISTHClosingsHistoricDistButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"RECENTLY ALTERED\"`][2]")
    private WebElement featuresACRISTHClosingsRecentlyAlteredButton;

    @iOSXCUITFindBy(accessibility = "24 FT+ WIDTH PREMIUM_PREMIUM_IS_WIDE_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement featuresREBNYTHListingsTwentyFourPlusWidthChart;

    @iOSXCUITFindBy(accessibility = "GARDEN PREMIUM_PREMIUM_GARDEN_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement featuresREBNYTHListingsGardenChart;

    @iOSXCUITFindBy(accessibility = "HISTORIC DISTRICT PREMIUM_PREMIUM_IS_HISTORICAL_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement featuresREBNYTHListingsHistoricDistChart;

    @iOSXCUITFindBy(accessibility = "LANDMARK PREMIUM_PREMIUM_IS_LANDMARK_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement featuresREBNYTHListingsLandmarkChart;

    @iOSXCUITFindBy(accessibility = "RECENTLY ALTERED_PREMIUM_IS_RECENTLY_ALTERED_LISTINGS_HOUSES: HEADER TITLE LABEL")
    private WebElement featuresREBNYTHListingsRecentlyAlteredChart;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_24 FT+ WIDTH PREMIUM_146")
    private WebElement featuresACRISClosingTwentyFourPlusWidthChart;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_HISTORIC DISTRICT PREMIUM_148")
    private WebElement featuresACRISTHClosingsHistoricDistChart;

    @iOSXCUITFindBy(accessibility = "ACRIS TOWNHOUSE CLOSINGS_RECENTLY ALTERED PREMIUM_144")
    private WebElement featuresACRISTHClosingsRecentlyAlteredChart;

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
        Helper.swipeDownUntilElementVisibleForCharButtons(button);
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
        this.swipeUntilButtonShown(rebnyTownhouseListingsInHistoricDistButton);
        element(rebnyTownhouseListingsInHistoricDistButton).click();
    }

    public void shouldSeeMKTShareREBNYTHListingsInHistoricDistChart() {
        element(mktShareREBNYTownhouseListingsInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesACRISTHClosingsGardenChart() throws Exception {
        this.swipeUntilButtonShown(featureACRISTownhouseClosingsGardenButton);
        element(featureACRISTownhouseClosingsGardenButton).click();
        element(featureACRISTownhouseClosingsGardenChart).shouldBeVisible();
    }

    public void addAndVerifyLocationTotalTHStockNumberTownhousesChart() throws Exception {
        this.swipeUntilButtonShown(locationTotalTHStockNumberTownhousesButton);
        element(locationTotalTHStockNumberTownhousesButton).click();
        element(locationTotalTHStockNumberTownhousesChart).shouldBeVisible();
    }

    public void addTotalTHStockHasGardenChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockHasGardenButton);
        element(totalTHStockHasGardenButton).click();
    }

    public void shouldSeeTotalTHStockHasGardenChart() {
        element(mktShareTotalTHStockHasGardenChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockInHistoricDistChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockInHistoricDistButton);
        element(totalTHStockInHistoricDistButton).click();
        element(mktShareTotalTHStockInHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockSquareFeetButton);
        element(totalTHStockSquareFeetButton).click();
        element(mktShareTotalTHStockSquareFeetChart).shouldBeVisible();

    }

    public void addAndVerifyTotalTHStockWidthChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockWidthButton);
        element(totalTHStockWidthButton).click();
        element(mktShareTotalTHStockWidthChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockYearLastAlteredChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockYearLastAlteredButton);
        element(totalTHStockYearLastAlteredButton).click();
        element(mktShareTotalTHStockYearLastAlteredChart).shouldBeVisible();
    }

    public void addREBNYTHListingsNumListingByFT2Chart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsNumListingsByFT2Button);
        element(rebnyTHListingsNumListingsByFT2Button).click();
    }

    public void shouldSeeREBNYTHListingsNumListingByFT2Chart() {
        element(distribREBNYTHListingsNumListingsByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsNumListingsByWidthChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsNumListingsByWidthButton);
        element(rebnyTHListingsNumListingsByWidthButton).click();
        element(distribREBNYTHListingsNumListingsByWidthChart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingNumSalesByFT2Chart() throws Exception {
        this.swipeUntilButtonShown(acrisTownhouseClosingNumSalesByFT2Button);
        element(acrisTownhouseClosingNumSalesByFT2Button).click();
        element(distribACRISTownhouseClosingNumSalesByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyACRISTownhouseClosingNumSalesByWidthChart() throws Exception {
        this.swipeUntilButtonShown(acrisTownhouseClosingNumSalesByWidthButton);
        element(acrisTownhouseClosingNumSalesByWidthButton).click();
        element(distribACRISTownhouseClosingNumSalesByWidthChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockNumHousesByFT2Chart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockNumHousesByFT2Button);
        element(totalTHStockNumHousesByFT2Button).click();
        element(distribTotalTHStockNumHousesByFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockNumHousesByWidthChart() throws Exception {
        this.swipeUntilButtonShown(totalTHStockNumHousesByWidthButton);
        element(totalTHStockNumHousesByWidthButton).click();
        element(distribTotalTHStockNumHousesByWidthChart).shouldBeVisible();
    }

    public void addREBNYTHListingsDOMByPriceChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsDOMByPriceButton);
        element(rebnyTHListingsDOMByPriceButton).click();
    }

    public void shouldSeeREBNYTHListingsDOMByPriceChart() {
        element(distribREBNYTHListingsDOMByPriceChart).shouldBeVisible();
    }

    public void addREBNYTHListingsNumListingsChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsNumListingsButton);
        element(rebnyTHListingsNumListingsButton).click();
    }

    public void shouldSeeREBNYTHListingsNumListingsChart() {
        element(rebnyTHListingsNumListingsChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsNumRecentlyAlteredChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsNumRecentlyAlteredButton);
        element(rebnyTHListingsNumRecentlyAlteredButton).click();
        element(rebnyTHListingsNumRecentlyAlertedChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsAskingDollarsPerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsAskingDollarsPerFT2Button);
        element(rebnyTHListingsAskingDollarsPerFT2Button).click();
        element(rebnyTHListingsAskingDollarsPerFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsAskingPriceChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsAskingPriceChartButton);
        element(rebnyTHListingsAskingPriceChartButton).click();
        element(rebnyTHListingsAskingPriceChartChart).shouldBeVisible();
    }

    public void addAndVerifyREBNYTHListingsMedianWidthChart() throws Exception {
        this.swipeUntilButtonShown(rebnyTHListingsMedianWidthButton);
        element(rebnyTHListingsMedianWidthButton).click();
        element(rebnyTHListingsMedianWidthChart).shouldBeVisible();
    }

    public void addACRISClosingNumSalesChart() throws Exception {
        this.swipeUntilButtonShown(acrisClosingNumSalesButton);
        element(acrisClosingNumSalesButton).click();

    }

    public void shouldSeeACRISClosingNumSalesChart() {
        element(locationACRISClosingNumSalesChart).shouldBeVisible();
    }

    public void addAndVerifyACRISClosingNumSalesOfRecentlyAlteredChart() throws Exception {
        this.swipeUntilButtonShown(acrisClosingNumSalesOfRecentlyAlteredButton);
        element(acrisClosingNumSalesOfRecentlyAlteredButton).click();
        element(locationACRISClosingNumSalesOfRecentlyAlteredChart).shouldBeVisible();
    }

    public void addAndVerifyACRISClosingMedianWidthChart() throws Exception {
        this.swipeUntilButtonShown(acrisClosingMedianWidthButton);
        element(acrisClosingMedianWidthButton).click();
        element(locationACRISClosingMedianWidthChart).shouldBeVisible();
    }

    public void addAndVerifyACRISClosingPriceChart() throws Exception {
        this.swipeUntilButtonShown(acrisClosingPriceButton);
        element(acrisClosingPriceButton).click();
        element(locationACRISClosingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyACRISClosingPricePerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(acrisClosingPricePerFT2Button);
        element(acrisClosingPricePerFT2Button).click();
        element(locationACRISClosingPricePerFT2Chart).shouldBeVisible();
    }

    public void addTotalTHStockNumRecentlyAlteredChart() throws Exception {
        this.swipeUntilButtonShown(locationTotalTHStockNumRecentlyAlteredButton);
        element(locationTotalTHStockNumRecentlyAlteredButton).click();
    }

    public void shouldSeeTotalTHStockNumRecentlyAlteredChart() {
        element(locationTotalTHStockNumRecentlyAlteredChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockNumTownhousesChart() throws Exception {
        this.swipeUntilButtonShown(locationTotalTHStockNumTownhousesButton);
        element(locationTotalTHStockNumTownhousesButton).click();
        element(locationTotalTHStockNumTownhousesChart).shouldBeVisible();
    }

    public void addAndVerifyTotalTHStockMedianWidthChart() throws Exception {
        this.swipeUntilButtonShown(locationTotalTHStockMedianWidthButton);
        element(locationTotalTHStockMedianWidthButton).click();
        element(locationTotalTHStockMedianWidthChart).shouldBeVisible();
    }

    public void addMedianREBNYTHListingsSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(medianREBNYTHListingsSquareFeetButton);
        element(medianREBNYTHListingsSquareFeetButton).click();
    }

    public void shouldSeeMedianREBNYTHListingsSquareFeetChart() {
        element(medianREBNYTHListingsSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyMedianREBNYTHListingsWidthChart() throws Exception {
        this.swipeUntilButtonShown(medianREBNYTHListingsWidthButton);
        element(medianREBNYTHListingsWidthButton).click();
        element(medianREBNYTHListingsWidthChart).shouldBeVisible();
    }

    public void addAndVerifyMedianACRISTHClosingSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(medianACRISTHClosingSquareFeetButton);
        element(medianACRISTHClosingSquareFeetButton).click();
        element(medianACRISTHClosingSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyMedianACRISTHClosingWidthChart() throws Exception {
        this.swipeUntilButtonShown(medianACRISTHClosingWidthButton);
        element(medianACRISTHClosingWidthButton).click();
        element(medianACRISTHClosingWidthChart).shouldBeVisible();
    }

    public void addAndVerifyMedianTotalTHStockSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(medianTotalTHStockSquareFeetButton);
        element(medianTotalTHStockSquareFeetButton).click();
        element(medianTotalTHStockSquareFeetChart).shouldBeVisible();
    }

    public void addAndVerifyMedianTotalTHStockWidthChart() throws Exception {
        this.swipeUntilButtonShown(medianTotalTHStockWidthButton);
        element(medianTotalTHStockWidthButton).click();
        element(medianTotalTHStockWidthChart).shouldBeVisible();
    }

    public void addFeaturesREBNYTHListingsTwentyFourPlusWidthChart() throws Exception {
        this.swipeUntilButtonShown(featuresREBNYTHListingsTwentyFourPlusWidthButton);
        element(featuresREBNYTHListingsTwentyFourPlusWidthButton).click();
    }

    public void shouldSeeFeaturesREBNYTHListingsTwentyFourPlusWidthChart() {
        element(featuresREBNYTHListingsTwentyFourPlusWidthChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesREBNYTHListingsGardenChart() throws Exception {
        this.swipeUntilButtonShown(featuresREBNYTHListingsGardenButton);
        element(featuresREBNYTHListingsGardenButton).click();
        element(featuresREBNYTHListingsGardenChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesREBNYTHListingsHistoricDistChart() throws Exception {
        this.swipeUntilButtonShown(featuresREBNYTHListingsHistoricDistButton);
        element(featuresREBNYTHListingsHistoricDistButton).click();
        element(featuresREBNYTHListingsHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesREBNYTHListingsLandmarkChart() throws Exception {
        this.swipeUntilButtonShown(featuresREBNYTHListingsLandmarkButton);
        element(featuresREBNYTHListingsLandmarkButton).click();
        element(featuresREBNYTHListingsLandmarkChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesREBNYTHListingsRecentlyAlteredChart() throws Exception {
        this.swipeUntilButtonShown(featuresREBNYTHListingsRecentlyAlteredButton);
        element(featuresREBNYTHListingsRecentlyAlteredButton).click();
        element(featuresREBNYTHListingsRecentlyAlteredChart).shouldBeVisible();
    }

    public void addFeaturesACRISClosingTwentyFourPlusWidthChart() throws Exception{
        this.swipeUntilButtonShown(featuresACRISClosingTwentyFourPlusWidthButton);
        element(featuresACRISClosingTwentyFourPlusWidthButton).click();
    }

    public void shouldFeaturesACRISClosingTwentyFourPlusWidthChart() {
        element(featuresACRISClosingTwentyFourPlusWidthChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesACRISTHClosingsHistoricDistChart() throws Exception {
        this.swipeUntilButtonShown(featuresACRISTHClosingsHistoricDistButton);
        element(featuresACRISTHClosingsHistoricDistButton).click();
        element(featuresACRISTHClosingsHistoricDistChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesACRISTHClosingsRecentlyAlteredChart() throws Exception {
        this.swipeUntilButtonShown(featuresACRISTHClosingsRecentlyAlteredButton);
        element(featuresACRISTHClosingsRecentlyAlteredButton).click();
        element(featuresACRISTHClosingsRecentlyAlteredChart).shouldBeVisible();
    }
}
