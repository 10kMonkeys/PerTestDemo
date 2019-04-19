package com.perchwell.pages.analytics;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ACRISClosingPage extends TechHelper {

    //region WebElements

    @AndroidFindBy(xpath = "//*[@text='BUILDING HEIGHT (BY DEAL COUNT)']")
    @iOSFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement dealCountByHeightButton;

    @AndroidFindBy(xpath = "//*[@text='DEAL COUNT BY HEIGHT']")
    @iOSFindBy(accessibility = "DEAL COUNT BY HEIGHT_RISE_NUM_STORIES_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private  WebElement dealCountByHeightChart;

    @AndroidFindBy(xpath = "//*[@text='BUILDING TYPE (BY DEAL COUNT)']")
    @iOSFindBy(accessibility = "BUILDING TYPE (BY DEAL COUNT)")
    private WebElement buildingTypeByDealCountButton;

    @AndroidFindBy(xpath = "//*[@text='DEAL COUNT BY TYPE']")
    @iOSFindBy(accessibility = "DEAL COUNT BY TYPE_PROPERTYTYPES_PROPERTY_TYPE_CODE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktShareDealCountByTypeChart;

    @iOSFindBy(accessibility = "PRICE (BY DEAL COUNT)")
    private WebElement priceByDealCountButton;

    @iOSFindBy(accessibility = "DEAL COUNT BY SEGMENT_PRICETRANCHES_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktSharePriceByDealCountChart;

    @iOSFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement dollarPerFTPercentilesButton;

    @iOSFindBy(accessibility = "SALE $/FT²")
    private WebElement dollarPerFTPercentilesChart;

    @iOSFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSFindBy(accessibility = "$/SQFT BY SEGMENT_MEDIANPERPRICETRANCHE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSFindBy(accessibility = "PRICE PERCENTILES")
    private WebElement pricePercentilesButton;

    @iOSFindBy(accessibility = "SALE PRICE_PERCENTILES_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPricePercentilesChart;

    @iOSFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement priceByPriceSegmentButton;

    @iOSFindBy(accessibility = "SALE PRICE BY SEGMENT_MEDIANPERPRICETRANCHE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPriceByPriceSegmentChart;

    @iOSFindBy(accessibility = "SQUARE FEET PERCENTILES")
    private WebElement squareFeetPercentilesButton;

    @iOSFindBy(accessibility = "PRICE BY TYPE")
    private WebElement priceByTypeButton;

    @iOSFindBy(accessibility = "MEDIAN SALE PRICE_MEDIANPERPROPERTYCODE_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionPriceByTypeChart;

    @iOSFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSFindBy(accessibility = "SQUARE FEET_PERCENTILES_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionSquareFeetPercentilesChart;

    @iOSFindBy(accessibility = "DEAL VOLUME (ANNUAL)")
    private WebElement dealVolumeAnnualButton;

    @iOSFindBy(accessibility = "DEAL VOLUME (QUARTERLY)")
    private WebElement dealVolumeQuarterlyButton;

    @iOSFindBy(accessibility = "DEAL COUNT")
    private WebElement dealCountButton;

    @iOSFindBy(accessibility = "DEAL COUNT_COUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationDealCountChart;

    @iOSFindBy(accessibility = "PRICE")
    private WebElement priceChartButton;

    @iOSFindBy(accessibility = "PRICE PER FT²")
    private WebElement pricePerFT2ChartButton;

    @iOSFindBy(accessibility = "MEDIAN SALE PRICE_MEDIAN_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement medianPriceChart;

    @iOSFindBy(accessibility = "MEDIAN SALE PRICE_BAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationPriceChart;

    @iOSFindBy(accessibility = "MEDIAN SALE $/SQFT_MEDIAN_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement medianPricePerFT2Chart;

    @iOSFindBy(accessibility = "MEDIAN SALE $/SQFT_BAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement locationPricePerFT2Chart;

    @iOSFindBy(accessibility = "DEAL COUNT (ANNUAL)")
    private WebElement dealCountAnnualButton;

    @iOSFindBy(accessibility = "DEAL COUNT (QUARTERLY)")
    private WebElement dealCountQuarterlyButton;

    @iOSFindBy(accessibility = "PRICE (ANNUAL)")
    private WebElement priceAnnualButton;

    @iOSFindBy(accessibility = "PRICE (QUARTERLY)")
    private WebElement priceQuarterlyButton;

    @iOSFindBy(accessibility = "PRICE PER FT² (ANNUAL)")
    private WebElement pricePerFT2AnnualButton;

    @iOSFindBy(accessibility = "PRICE PER FT² (QUARTERLY)")
    private WebElement pricePerFT2QuarterlyButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME (ANNUAL)")
    private WebElement topTenPerMKTDealVolumeAnnualButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: PRICE (ANNUAL)")
    private WebElement topTenPerMKTPriceAnnualButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: PRICE (QUARTERLY)")
    private WebElement topTenPerMKTPriceQuarterlyButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (ANNUAL)")
    private WebElement topTenPerMKTPricePerFT2AnnualButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: PRICE PER FT² (QUARTERLY)")
    private WebElement topTenPerMKTPricePerFT2QuarterlyButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (ANNUAL)")
    private WebElement topTenPerMKTUnitSizeAnnualButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: UNIT SIZE (QUARTERLY)")
    private WebElement topTenPerMKTUnitSizeQuarterlyButton;

    @iOSFindBy(accessibility = "DEAL COUNT_STACKEDYEARLYTRENDBARCOUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealCountAnnualChart;

    @iOSFindBy(accessibility = "DEAL COUNT_STACKEDQUARTERLYTRENDBARCOUNTS_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealCountQuarterlyChart;

    @iOSFindBy(accessibility = "TOTAL DEAL VOLUME_STACKEDYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealVolumeAnnualChart;

    @iOSFindBy(accessibility = "TOTAL DEAL VOLUME_STACKEDQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement dealVolumeQuarterlyChart;

    @iOSFindBy(accessibility = "MEDIAN SALE PRICE_YEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement priceAnnualChart;

    @iOSFindBy(accessibility = "QTRLY MEDIAN SALE PRICE_QUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement priceQuarterlyChart;

    @iOSFindBy(accessibility = "MEDIAN SALE $/SQFT_YEARLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement pricePerFT2AnnualChart;

    @iOSFindBy(accessibility = "QTRLY MEDIAN SALE $/SQFT_QUARTERLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement pricePerFT2QuarterlyChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME_TOPTENSTACKEDYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTDealVolumeAnnualChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN PRICE_TOPTENYEARLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPriceAnnualChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN PRICE_TOPTENQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPriceQuarterlyChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN $/SQFT_TOPTENYEARLYTRENDBAR_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPricePerFT2AnnualChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN $/SQFT_TOPTENQUARTERLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTPricePerFT2QuarterlyChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN SIZE (SQFT)_TOPTENYEARLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTUnitSizeAnnualChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: MEDIAN SIZE (SQFT)_TOPTENQUARTERLYTRENDBAR_GROSS_SQUARE_FEET_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement topTenPerMKTUnitSizeQuarterlyChart;

    @iOSFindBy(accessibility = "BUILDING HEIGHT (BY DEAL COUNT)")
    private WebElement mktShareBuildingHeightByDealCountButton;

    @iOSFindBy(accessibility = "DEAL COUNT BY HEIGHT_RISE_NUM_STORIES_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement mktShareBuildingHeightByDealCountChart;

    @iOSFindBy(accessibility = "$/FT² PERCENTILES")
    private WebElement distributionDollarFT2PercentilesButton;

    @iOSFindBy(accessibility = "SALE $/SQFT_PERCENTILES_SALE_PRICE_PER_SQFT_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement distributionDollarFT2PercentilesChart;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME (QUARTERLY)")
    private WebElement trendsTopTenPerMKTDealVolumeQuarterlyButton;

    @iOSFindBy(accessibility = "TOP 10% OF MKT: DEAL VOLUME_TOPTENSTACKEDQUARTERLYTRENDBAR_SALE_PRICE_HISTORICALS_HISTORICALS: HEADER TITLE LABEL")
    private WebElement trendsTopTenPerMKTDealVolumeQuarterlyChart;

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
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        Helper.universalVerticalSwipe(dealCountByHeightButton);
        resetImplicitTimeout();
        element(dealCountByHeightButton).click();
    }

    public void buildingTypeByDealCountButtonClick() throws Exception {
        this.swipeUntilButtonShown(buildingTypeByDealCountButton);
        element(buildingTypeByDealCountButton).click();
    }

    public void isDealCountByHeightChartAdd(){
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public boolean isDealCountByTypeDisplayed(){
        return Helper.isElementDisplayed(mktShareDealCountByTypeChart);
    }

    public void shouldBuildingHeightChartDisplayedWithSwipe() throws Exception {
        if(!Config.isAndroid()) {
            setImplicitTimeout(1, ChronoUnit.SECONDS);
            Helper.universalVerticalSwipe(dealCountByHeightChart);
            resetImplicitTimeout();
        }
        element(dealCountByHeightChart).shouldBeVisible();
    }

    public void shouldSeeMKTShareBuildingTypeByDealCountChart() {
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        Helper.universalVerticalSwipe(mktShareDealCountByTypeChart);
        resetImplicitTimeout();
        element(mktShareDealCountByTypeChart).shouldBeVisible();

    }

    public void addAndVerifyMKTSharePriceByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(priceByDealCountButton);
        element(priceByDealCountButton).click();
        element(mktSharePriceByDealCountChart).shouldBeVisible();
    }

    public void addDollarPerFTByPriceSegmentChart(){
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChart(){
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPricePercentilesChart() throws Exception {
        this.swipeUntilButtonShown(pricePercentilesButton);
        element(pricePercentilesButton).click();
        element(distributionPricePercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(priceByPriceSegmentButton);
        element(priceByPriceSegmentButton).click();
        element(distributionPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetPercentilesChart() throws Exception {
        this.swipeUntilButtonShown(squareFeetPercentilesButton);
        element(squareFeetPercentilesButton).click();
        element(distributionSquareFeetPercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(priceByTypeButton);
        element(priceByTypeButton).click();
        element(distributionPriceByTypeChart).shouldBeVisible();
    }

    public void addDealCountChart() {
        element(dealCountButton).click();
    }

    public void shouldSeeLocationDealCountChart() {
        element(locationDealCountChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPriceChart() throws Exception {
        this.swipeUntilButtonShown(priceChartButton);
        element(priceChartButton).click();
        element(locationPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPricePerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2ChartButton);
        element(pricePerFT2ChartButton).click();
        element(medianPricePerFT2Chart).shouldBeVisible();
    }

    public void addAndVerifyLocationPricePerFT2Chart() throws Exception {
        this.swipeUntilButtonShown(pricePerFT2ChartButton);
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

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        Helper.universalVerticalSwipe(button);
        resetImplicitTimeout();
    }

    public void addMKTShareBuildingHeightByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(mktShareBuildingHeightByDealCountButton);
        element(mktShareBuildingHeightByDealCountButton).click();
    }

    public void shouldSeeMKTShareBuildingHeightByDealCountChart() {
        element(mktShareBuildingHeightByDealCountChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDollarFT2PercentilesChart() throws Exception {
        this.swipeUntilButtonShown(distributionDollarFT2PercentilesButton);
        element(distributionDollarFT2PercentilesButton).click();
        element(distributionDollarFT2PercentilesChart).shouldBeVisible();
    }

    public void addAndVerifyTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(trendsTopTenPerMKTDealVolumeQuarterlyButton);
        element(trendsTopTenPerMKTDealVolumeQuarterlyButton).click();
        element(trendsTopTenPerMKTDealVolumeQuarterlyChart).shouldBeVisible();
    }

    public void addMKTSharePriceByDealCountChart() throws Exception {
        this.swipeUntilButtonShown(priceByDealCountButton);
        element(priceByDealCountButton).click();
    }

    public void addDistributionDollarFT2ByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(dollarPerFTByPriceSegmentButton);
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void addDistributionPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(priceByPriceSegmentButton);
        element(priceByPriceSegmentButton).click();
    }

    public void addDistributionPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(priceByTypeButton);
        element(priceByTypeButton).click();
    }

    public void addATrendsDealCountQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealCountQuarterlyButton);
        element(dealCountQuarterlyButton).click();
    }

    public void addTrendsDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeAnnualButton);
        element(dealVolumeAnnualButton).click();
    }

    public void addTrendsTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        this.swipeUntilButtonShown(topTenPerMKTDealVolumeAnnualButton);
        element(topTenPerMKTDealVolumeAnnualButton).click();
    }

    public void addTrendsDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(dealVolumeQuarterlyButton);
        element(dealVolumeQuarterlyButton).click();
    }

    public void addTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        this.swipeUntilButtonShown(trendsTopTenPerMKTDealVolumeQuarterlyButton);
        element(trendsTopTenPerMKTDealVolumeQuarterlyButton).click();
    }
}
