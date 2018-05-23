package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ACRISClosingPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement dealCountByHeightButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT BY HEIGHT_29")
    private  WebElement dealCountByHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private WebElement buildingTypeByDealCountButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT BY TYPE_30")
    private WebElement dealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "PRICE (BY DEAL COUNT)")
    private WebElement priceByDealCountButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT BY SEGMENT")
    private WebElement dealCountBySegmentChart;

    @iOSXCUITFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement dollarPerFTPercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE $/FT²")
    private WebElement dollarPerFTPercentilesChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "$/FT² BY SEGMENT")
    private WebElement dollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "PRICE PERCENTILES")
    private WebElement pricePercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE")
    private WebElement salePriceChart;

    @iOSXCUITFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement priceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SALE PRICE BY SEGMENT")
    private WebElement salePriceBySegmentChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET PERCENTILES")
    private WebElement squareFeetPercentilesButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY TYPE")
    private WebElement priceByTypeButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE")
    private WebElement medianSalePriceChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT\"`]")
    private WebElement dealCountButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name CONTAINS[cd] \"DEAL COUNT\"`][1]")
    private WebElement dealCountChart;

    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement priceChartButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement pricePerFT2ChartButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE")
    private WebElement priceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/FT²")
    private WebElement pricePerFT2Chart;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT (ANNUAL)")
    private WebElement dealCountAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT (QUARTERLY)")
    private WebElement dealCountQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "PRICE (ANNUAL)")
    private WebElement priceAnnualButton;

    @iOSXCUITFindBy(accessibility = "PRICE (QUARTERLY)")
    private WebElement priceQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT² (ANNUAL)")
    private WebElement pricePerFT2AnnualButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT² (QUARTERLY)")
    private WebElement pricePerFT2QuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME (ANNUAL)")
    private WebElement topTenPerMKTDealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE (ANNUAL)")
    private WebElement topTenPerMKTPriceAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE (QUARTERLY)")
    private WebElement topTenPerMKTPriceQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (ANNUAL)")
    private WebElement topTenPerMKTPricePerFT2AnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (QUARTERLY)")
    private WebElement topTenPerMKTPricePerFT2QuarterlyButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (ANNUAL)")
    private WebElement topTenPerMKTUnitSizeAnnualButton;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (QUARTERLY)")
    private WebElement topTenPerMKTUnitSizeQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT")
    private WebElement dealCountAnnualChart;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT")
    private WebElement dealCountQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOTAL DEAL VOLUME")
    private WebElement dealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOTAL DEAL VOLUME")
    private WebElement dealVolumeQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE PRICE")
    private WebElement priceAnnualChart;

    @iOSXCUITFindBy(accessibility = "QTRLY MEDIAN SALE PRICE")
    private WebElement priceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN SALE $/FT²")
    private WebElement pricePerFT2AnnualChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"QTRLY MEDIAN SALE $/FT²\"")
    private WebElement pricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME")
    private WebElement topTenPerMKTDealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN PRICE")
    private WebElement topTenPerMKTPriceAnnualChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"TOP 10% OF MKT: MEDIAN PRICE\"")
    private WebElement topTenPerMKTPriceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN $/FT²")
    private WebElement topTenPerMKTPricePerFT2AnnualChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"TOP 10% OF MKT: MEDIAN $/FT²\"")
    private WebElement topTenPerMKTPricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "TOP 10% OF MKT: MEDIAN SIZE (FT²)")
    private WebElement topTenPerMKTUnitSizeAnnualChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name CONTAINS \"TOP 10% OF MKT: MEDIAN SIZE (FT²)\"")
    private WebElement topTenPerMKTUnitSizeQuarterlyChart;

    //endregion

    public ACRISClosingPage(WebDriver driver) {
        super(driver);
    }

    public void dealVolumeAnnualButtonClick() {
        element(dealVolumeAnnualButton).click();
    }

    public void dealVolumeQuarterlyButtonClick(){
        element(dealVolumeQuarterlyButton).click();
    }

    public void dealCountByHeightButtonClick(){
        element(dealCountByHeightButton).click();
    }

    public void buildingTypeByDealCountButtonClick(){
        element(buildingTypeByDealCountButton).click();
    }

    public void isDealCountByHeightChartAdd(){
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(dealCountByTypeChart);
    }

    public void shouldBuildingHeightChartDisplayedWithSwipe() {
        Helper.scrollToElement(dealCountByHeightChart);
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public void shouldBuildingTypeByDealCountDisplayed() {
        element(dealCountByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyPriceByDealCountChart(){
        element(priceByDealCountButton).click();
        element(dealCountBySegmentChart).shouldBeVisible();
    }

    public void addDollarPerFTPercentilesChart(){
        element(dollarPerFTPercentilesButton).click();
    }

    public void shouldSeeDollarPerFTPercentiles(){
        element(dollarPerFTPercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyPricePercentilesChart(){
        element(pricePercentilesButton).click();
        element(salePriceChart).shouldBeVisible();
    }

    public void addAndVerifyPriceByPriceSegmentChart(){
        element(priceByPriceSegmentButton).click();
        element(salePriceBySegmentChart).shouldBeVisible();
    }

    public void addAndVerifySquareFeetPercentiles(){
        element(squareFeetPercentilesButton).click();
        element(squareFeetButton).shouldBeVisible();
    }

    public void addAndVerifyPriceByTypeChart(){
        element(priceByTypeButton).click();
        element(medianSalePriceChart).shouldBeVisible();
    }

    public void addDealCountChart() {
        element(dealCountButton).click();
    }

    public void shouldSeeDealCount() {
        element(dealCountChart).shouldBeVisible();
    }

    public void addAndVerifyPriceChart() {
        element(priceChartButton).click();
        element(priceChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2Chart() {
        element(pricePerFT2ChartButton).click();
        element(pricePerFT2Chart).shouldBeVisible();
    }

    public void addPriceChart() {
        element(priceChartButton).click();
    }

    public void shouldSeePriceChart() {
        element(priceChart).shouldBeVisible();
    }

    public void addDealCountAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealCountAnnualButton);
        element(dealCountAnnualButton).click();

    }

    public void shouldSeeDealCountAnnualChart() {
        element(dealCountAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyDealCountQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealCountQuarterlyButton);
        element(dealCountQuarterlyButton).click();
        element(dealCountQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeAnnualButton);
        element(dealVolumeAnnualButton).click();
        element(dealVolumeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeQuarterlyButton);
        element(dealVolumeQuarterlyButton).click();
        element(dealVolumeQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyPriceAnnualChart() throws Exception {
        this.swipeUntilButtonShown(priceAnnualButton);
        element(priceAnnualButton).click();
        element(priceAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyPriceQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(priceQuarterlyButton);
        element(priceQuarterlyButton).click();
        element(priceQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2AnnualButton);
        element(pricePerFT2AnnualButton).click();
        element(pricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addAndVerifyPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2QuarterlyButton);
        element(pricePerFT2QuarterlyButton).click();
        element(pricePerFT2QuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTDealVolumeAnnualButton);
        element(topTenPerMKTDealVolumeAnnualButton).click();
        element(topTenPerMKTDealVolumeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPriceAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPriceAnnualButton);
        element(topTenPerMKTPriceAnnualButton).click();
        element(topTenPerMKTPriceAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPriceQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPriceQuarterlyButton);
        element(topTenPerMKTPriceQuarterlyButton).click();
        element(topTenPerMKTPriceQuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2AnnualButton);
        element(topTenPerMKTPricePerFT2AnnualButton).click();
        element(topTenPerMKTPricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2QuarterlyButton);
        element(topTenPerMKTPricePerFT2QuarterlyButton).click();
        element(topTenPerMKTPricePerFT2QuarterlyChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTUnitSizeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTUnitSizeAnnualButton);
        element(topTenPerMKTUnitSizeAnnualButton).click();
        element(topTenPerMKTUnitSizeAnnualChart).shouldBeVisible();
    }

    public void addAndVerifyTopTenPerMKTUnitSizeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTUnitSizeQuarterlyButton);
        element(topTenPerMKTUnitSizeQuarterlyButton).click();
        element(topTenPerMKTUnitSizeQuarterlyChart).shouldBeVisible();
    }

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.swipeDownUntilElementVisible(button);
        resetImplicitTimeout();
    }

    public void addPricePerFT2AnnualChart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2AnnualButton);
        element(pricePerFT2AnnualButton).click();
    }

    public void shouldSeePricePerFT2AnnualChart() {
        element(pricePerFT2AnnualChart).shouldBeVisible();
    }

    public void addTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTPricePerFT2QuarterlyButton);
        element(topTenPerMKTPricePerFT2QuarterlyButton).click();
    }

    public void shouldSeeTopTenPerMKTPricePerFT2QuarterlyChart() {
        element(topTenPerMKTPricePerFT2QuarterlyChart).shouldBeVisible();
    }
}
