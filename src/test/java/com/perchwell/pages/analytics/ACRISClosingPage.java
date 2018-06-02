package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
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
    private WebElement mktShareDealCountByTypeChart;

    @iOSXCUITFindBy(accessibility = "PRICE (BY DEAL COUNT)")
    private WebElement priceByDealCountButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT BY SEGMENT_28")
    private WebElement mktSharePriceByDealCountChart;

    @iOSXCUITFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement dollarPerFTPercentilesButton;

    @iOSXCUITFindBy(accessibility = "SALE $/FT²")
    private WebElement dollarPerFTPercentilesChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_$/FT² BY SEGMENT_152")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "PRICE PERCENTILES")
    private WebElement pricePercentilesButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_SALE PRICE_59")
    private WebElement distributionPricePercentilesChart;

    @iOSXCUITFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement priceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_SALE PRICE BY SEGMENT_153")
    private WebElement distributionPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET PERCENTILES")
    private WebElement squareFeetPercentilesButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY TYPE")
    private WebElement priceByTypeButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE PRICE_62")
    private WebElement distributionPriceByTypeChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_SQUARE FEET_61")
    private WebElement distributionSquareFeetPercentilesChart;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

    @iOSXCUITFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

    @iOSXCUITFindBy(accessibility = "DEAL COUNT")
    private WebElement dealCountButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT_141")
    private WebElement locationDealCountChart;

    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement priceChartButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement pricePerFT2ChartButton;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE PRICE_9")
    private WebElement medianPriceChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE PRICE_71")
    private WebElement locationPriceChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE $/FT²_10")
    private WebElement medianPricePerFT2Chart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE $/FT²_72")
    private WebElement locationPricePerFT2Chart;

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

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT_132")
    private WebElement dealCountAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_DEAL COUNT_133")
    private WebElement dealCountQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOTAL DEAL VOLUME_121")
    private WebElement dealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOTAL DEAL VOLUME_122")
    private WebElement dealVolumeQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE PRICE_44")
    private WebElement priceAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_QTRLY MEDIAN SALE PRICE_42")
    private WebElement priceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_MEDIAN SALE $/FT²_45")
    private WebElement pricePerFT2AnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_QTRLY MEDIAN SALE $/FT²_43")
    private WebElement pricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: DEAL VOLUME_125")
    private WebElement topTenPerMKTDealVolumeAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: MEDIAN PRICE_119")
    private WebElement topTenPerMKTPriceAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_QTRLY MEDIAN SALE $/FT²_43")
    private WebElement topTenPerMKTPriceQuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: MEDIAN $/FT²_120")
    private WebElement topTenPerMKTPricePerFT2AnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: MEDIAN $/FT²_128")
    private WebElement topTenPerMKTPricePerFT2QuarterlyChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: MEDIAN SIZE (FT²)_123")
    private WebElement topTenPerMKTUnitSizeAnnualChart;

    @iOSXCUITFindBy(accessibility = "ACRIS CLOSINGS_TOP 10% OF MKT: MEDIAN SIZE (FT²)_129")
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
        return Helper.isElementDisplayed(mktShareDealCountByTypeChart);
    }

    public void shouldBuildingHeightChartDisplayedWithSwipe() {
        Helper.scrollToElement(dealCountByHeightChart);
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public void shouldSeeMKTShareBuildingTypeByDealCountChart() {
        element(mktShareDealCountByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePriceByDealCountChart(){
        element(priceByDealCountButton).click();
        element(mktSharePriceByDealCountChart).shouldBeVisible();
    }

    public void addDollarPerFTByPriceSegmentChart(){
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChart(){
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPricePercentilesChart(){
        element(pricePercentilesButton).click();
        element(distributionPricePercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByPriceSegmentChart(){
        element(priceByPriceSegmentButton).click();
        element(distributionPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetPercentilesChart(){
        element(squareFeetPercentilesButton).click();
        element(distributionSquareFeetPercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByTypeChart(){
        element(priceByTypeButton).click();
        element(distributionPriceByTypeChart).shouldBeVisible();
    }

    public void addDealCountChart() {
        element(dealCountButton).click();
    }

    public void shouldSeeLocationDealCountChart() {
        element(locationDealCountChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPriceChart() {
        element(priceChartButton).click();
        element(medianPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPricePerFT2Chart() {
        element(pricePerFT2ChartButton).click();
        element(medianPricePerFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyLocationPricePerFT2Chart() {
        element(pricePerFT2ChartButton).click();
        element(locationPricePerFT2Chart).shouldBeVisible();
    }

    public void addPriceChart() {
        element(priceChartButton).click();
    }

    public void shouldSeeMedianPriceChart() {
        element(medianPriceChart).shouldBeVisible();
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
