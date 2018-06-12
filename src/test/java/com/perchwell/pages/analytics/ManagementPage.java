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
    private WebElement buildingTypeButton;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET_DAYSONMARKETPIE_DAYS_ON_MARKET_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareDaysOnMarketChart;

    @iOSXCUITFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement firmListingCountButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceChart;

    @iOSXCUITFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement distributionFirmListingCountButton;

    @iOSXCUITFindBy(accessibility = "FIRM LISTING COUNT_COUNTPER_BROKERAGE_DISPLAY_NAME_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmListingCountChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_BEDROOMS_165")
    private WebElement mktShareBedroomsChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_BUILDING HEIGHT_166")
    private WebElement mktShareBuildingHeightChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_BUILDING TYPE_167")
    private WebElement mktShareBuildingTypeChart;

    @iOSXCUITFindBy(accessibility = "AGENT LISTING COUNT")
    private WebElement agentListingCountButton;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_AGENT LISTING COUNT_162")
    private WebElement distributionAgentListingCountChart;

    @iOSXCUITFindBy(accessibility = "AGENT MEDIAN PRICE")
    private WebElement agentMedianPriceButton;

    @iOSXCUITFindBy(accessibility = "FIRM DOM")
    private WebElement firmDOMButton;

    @iOSXCUITFindBy(accessibility = "FIRM LISTING VOLUME")
    private WebElement firmListingVolumeButton;

    @iOSXCUITFindBy(accessibility = "FIRM MEDIAN $/SQFT")
    private WebElement firmMedianDollarPerSQFTButton;

    @iOSXCUITFindBy(accessibility = "FIRM MEDIAN PRICE")
    private WebElement firmMedianPriceButton;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_AGENT MEDIAN PRICE_161")
    private WebElement distributionAgentMedianPriceChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_MEDIAN DOM_178")
    private WebElement distributionFirmDOMChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_CURRENT LISTING VOLUME_176")
    private WebElement distributionFirmListingVolumeChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_FIRM MEDIAN $/FT²_159")
    private WebElement distributionFirmMedianDollarPerSQFTChart;

    @iOSXCUITFindBy(accessibility = "MANAGEMENT_FIRM MEDIAN PRICE_160")
    private WebElement distributionFirmMedianPriceChart;

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
        element(mktShareDaysOnMarketChart).shouldBeVisible();
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

    public void firmListingCountButtonClick(){
        element(firmListingCountButton).click();
    }

    public void isFirmListingCountChartDisplayed(){
        element(firmListingCountButton).shouldBeVisible();
    }

    public void shouldDaysOnMarketDisplayedWithSwipe() throws Exception {
        Helper.swipeDownUntilElementVisible(mktShareDaysOnMarketChart);
        //Helper.scrollToElement(daysOnMarketButton);
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void addMKTShareAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
        element(askingPriceButton).click();

    }

    public void shouldSeeMKTShareAskingPriceChart() {
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmListingCountChart() throws Exception {
        Helper.swipeDownUntilElementVisible(distributionFirmListingCountButton);
        element(distributionFirmListingCountButton).click();
        element(distributionFirmListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBedroomsChart() throws Exception{
        Helper.swipeDownUntilElementVisible(bedroomsButton);
        element(bedroomsButton).click();
        element(mktShareBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingHeightChart() throws Exception{
        Helper.swipeDownUntilElementVisible(buildingHeightButton);
        element(buildingHeightButton).click();
        element(mktShareBuildingHeightChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception{
        Helper.swipeDownUntilElementVisible(buildingTypeButton);
        element(buildingTypeButton).click();
        element(mktShareBuildingTypeChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception{
        Helper.swipeDownUntilElementVisible(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void agentsListingCountButtonClick(){
        element(agentListingCountButton).click();
    }

    public void shouldSeeDistributionAgentsListingCountChart(){
        element(distributionAgentListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAgentMedianPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(agentMedianPriceButton);
        element(agentMedianPriceButton).click();
        element(distributionAgentMedianPriceChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmDOMChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmDOMButton);
        element(firmDOMButton).click();
        element(distributionFirmDOMChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmListingVolumeChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmListingVolumeButton);
        element(firmListingVolumeButton).click();
        element(distributionFirmListingVolumeChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmMedianDollarPerSQFTChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmMedianDollarPerSQFTButton);
        element(firmMedianDollarPerSQFTButton).click();
        element(distributionFirmMedianDollarPerSQFTChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmMedianPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmMedianPriceButton);
        element(firmMedianPriceButton).click();
        element(distributionFirmMedianPriceChart).shouldBeVisible();
    }
}
