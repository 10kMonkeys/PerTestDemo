package com.perchwell.pages.analytics;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class REBNYListingsPage extends BasePage {

    //region WebElements

    private int initialMKTShareAskingPriceStartListingsAmount = 0;
    private String[] initialLocationAskingPriceListingsLocationsStringList = new String[5];
    private int previousMKTShareAskingPriceStartListingsAmount = 0;
    private String[] previousLocationAskingPriceListingsLocationsStringList = new String[5];

    @AndroidFindBy(xpath = "//*[@text='PRICE']")
    @iOSXCUITFindBy(accessibility = "PRICE")
    private WebElement askingPriceButton;

    @AndroidFindBy(xpath = "//*[@text='BEDROOMS']")
    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @AndroidFindBy (xpath = "//*[@text='BUILDING HEIGHT']")
    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT_RISE_NUM_STORIES_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareBuildingHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE")
    private WebElement buildingTypeButton;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE_PROPERTYTYPES_PROPERTY_TYPE_CODE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareBuildingTypeChart;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET_DAYSONMARKETPIE_DAYS_ON_MARKET_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareDaysOnMarketChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN DOM_DAYSONMARKETBYNEIGHBORHOOD_DAYS_ON_MARKET_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationDaysOnMarketChart;

    @iOSXCUITFindBy(accessibility = "DOORMAN")
    private WebElement doormanButton;

    @iOSXCUITFindBy(accessibility = "DOORMAN_MUSTHAVE_BUILDING_DOORMAN_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareDoormanChart;

    @iOSXCUITFindBy(accessibility = "DOORMAN PREMIUM_PREMIUM_BUILDING_DOORMAN_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresDoormanChart;

    @iOSXCUITFindBy(accessibility = "ELEVATOR")
    private WebElement elevatorButton;

    @iOSXCUITFindBy(accessibility = "ELEVATOR_MUSTHAVE_BUILDING_ELEVATOR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareElevatorChart;

    @iOSXCUITFindBy(accessibility = "ELEVATOR PREMIUM_PREMIUM_BUILDING_ELEVATOR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresElevatorChart;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE")
    private WebElement workingFireplaceButton;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE_MUSTHAVE_HAS_FIREPLACE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareWorkingFireplaceChart;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE PREMIUM_PREMIUM_HAS_FIREPLACE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresWorkingFireplaceChart;

    @iOSXCUITFindBy(accessibility = "GARAGE")
    private WebElement garageButton;

    @iOSXCUITFindBy(accessibility = "GARAGE_GARAGEMULTIPIE_GARAGE_TYPE_CODE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareGarageChart;

    @iOSXCUITFindBy(accessibility = "GARAGE PREMIUM_GARAGEPREMIUM_GARAGE_TYPE_CODE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresGarageChart;

    @iOSXCUITFindBy(accessibility = "GYM")
    private WebElement gymButton;

    @iOSXCUITFindBy(accessibility = "GYM_MUSTHAVE_BUILDING_GYM_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareGymChart;

    @iOSXCUITFindBy(accessibility = "GYM PREMIUM_PREMIUM_BUILDING_GYM_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresGymChart;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING")
    private WebElement laundryBuildingButton;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING_MUSTHAVE_BUILDING_LAUNDRY_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareLaundryBuildingChart;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING PREMIUM_PREMIUM_BUILDING_LAUNDRY_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresLaundryBuildingChart;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE")
    private WebElement outdoorSpaceButton;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE_MUSTHAVE_HAS_OUTDOOR_SPACE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareOutdoorSpaceChart;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE PREMIUM_PREMIUM_HAS_OUTDOOR_SPACE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresOutdoorSpaceChart;

    @iOSXCUITFindBy(accessibility = "PETS")
    private WebElement petsButton;

    @iOSXCUITFindBy(accessibility = "PETS_MUSTHAVE_BUILDING_PETS_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktSharePetsChart;

    @iOSXCUITFindBy(accessibility = "PETS PREMIUM_PREMIUM_BUILDING_PETS_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresPetsChart;

    @iOSXCUITFindBy(accessibility = "POOL")
    private WebElement poolButton;

    @iOSXCUITFindBy(accessibility = "POOL_MUSTHAVE_BUILDING_POOL_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktSharePoolChart;

    @iOSXCUITFindBy(accessibility = "POOL PREMIUM_PREMIUM_BUILDING_POOL_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresPoolChart;

    @iOSXCUITFindBy(accessibility = "PREWAR")
    private WebElement prewarButton;

    @iOSXCUITFindBy(accessibility = "PREWAR_MUSTHAVE_BUILDING_PREWAR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktSharePrewarChart;

    @iOSXCUITFindBy(accessibility = "PREWAR PREMIUM_PREMIUM_BUILDING_PREWAR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresPrewarChart;

    @iOSXCUITFindBy(accessibility = "WASHER/DRYER")
    private WebElement washerDryerButton;

    @iOSXCUITFindBy(accessibility = "WASHER/DRYER_MUSTHAVE_UNIT_LAUNDRY_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareWasherDryerChart;

    @iOSXCUITFindBy(accessibility = "W/D PREMIUM_PREMIUM_UNIT_LAUNDRY_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresWasherDryerChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY PRICE SEGMENT")
    private WebElement dollarPerFTByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY # BEDS")
    private WebElement askingPriceByBedsButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY PRICE SEGMENT")
    private WebElement askingPriceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "PRICE BY TYPE")
    private WebElement askingPriceByTypeButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER BED")
    private WebElement askingPricePerBedButton;

    @iOSXCUITFindBy(accessibility = "PRICE PER BED_PERCENTILES_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "PRICE PER FT²")
    private WebElement askingPricePerFTButton;

    @iOSXCUITFindBy(accessibility = "DOM BY # BEDS")
    private WebElement domByNumberBedsButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE SEGMENT")
    private WebElement domByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE SEGMENT_DAYSONMARKETBYPRICESEGMENT_DAYS_ON_MARKET_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionDOMByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET_PERCENTILES_ABOVE_AREA_SQUARE_FT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionSquareFeetChart;

    @iOSXCUITFindBy(accessibility = "MONTHLIES")
    private WebElement monthliesButton;

    @iOSXCUITFindBy(accessibility = "MONTHLIES_PERCENTILES_MONTHLY_PAYMENT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionMonthliesChart;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT")
    private WebElement listingCountButton;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT_COUNTS_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationListingCountChart;

    @iOSXCUITFindBy(accessibility = "PROPERTY TAXES")
    private WebElement propertyTaxesButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN $/BED_MEDIAN_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN $/BED_BAR_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN $/SQFT_MEDIAN_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN $/SQFT_BAR_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN $/SQFT_PERCENTILES_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPricePerFTChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS 'MEDIAN MONTHLIES'")
//    @iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES_MEDIAN_MONTHLY_PAYMENT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianMonthliesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES_BAR_MONTHLY_PAYMENT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationMonthliesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES_MEDIAN_REAL_ESTATE_TAX_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES_BAR_REAL_ESTATE_TAX_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationPropertyTaxesChart;

    @AndroidFindBy(xpath = "//*[@text='BEDROOM COUNT']")
    @iOSXCUITFindBy(accessibility = "BEDROOM COUNT_ROOMS_NUM_BEDROOMS_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement bedroomChart;

    @iOSXCUITFindBy(accessibility = "$/SQFT BY SEGMENT_MEDIANPERPRICETRANCHE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PRICE BY SEGMENT_MEDIANPERPRICETRANCHE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PRICE_MEDIAN_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PRICE_MEDIANPERPROPERTYCODE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByTypeChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PRICE_MEDIANPERBR_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByNumberBedsChart;

    @iOSXCUITFindBy(accessibility = "DOM BY NUMBER BEDROOMS_DAYSONMARKETBEDROOM_DAYS_ON_MARKET_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionDOMByNumberBedroomsChart;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT")
    private WebElement newDevelopmentButton;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT_PREMIUM_NEW_DEVELOPMENT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresNewDevelopmentChart;

    @AndroidFindBy(xpath = "//*[@text='PRICE']")
    @iOSXCUITFindBy(accessibility = "PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "PRICE_PERCENTILES_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PRICE_BAR_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPriceChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL:'")
    private WebElement mktShareAskingPriceListingsAmount;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name CONTAINS 'location -'")
    private List<WebElement> locationAskingPriceListingsLocationsList;

    //endregion

    public REBNYListingsPage(WebDriver driver) {
        super(driver);
    }

    public void daysOnMarketButtonClick() {
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick() {
        setImplicitTimeout(1, SECONDS);
        Helper.universalVerticalSwipe(bedroomsButton);
        resetImplicitTimeout();
        element(bedroomsButton).click();
    }

    public void shouldSeeMKTShareAskingPriseChart() {
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public void shouldSeeDistributionAskingPriseChart() {
        element(distributionAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception {
        this.swipeUntilButtonShown(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void addAndVerifyLocationDaysOnMarketChart() throws Exception {
        this.swipeUntilButtonShown(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(locationDaysOnMarketChart).shouldBeVisible();
    }

    public void buildingHeightButtonClick() throws Exception {
        this.swipeUntilButtonShown(buildingHeightButton);
        element(buildingHeightButton).click();
    }

    public void shouldSeeMKTShareBuildingHeightChart() {
        element(mktShareBuildingHeightChart).shouldBeVisible();
    }

    public void addREBNYListingsAskingPriceChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceButton);
        element(askingPriceButton).click();
    }

    public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.universalVerticalShortSwipe(mktShareAskingPriceChart);
        resetImplicitTimeout();
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public boolean isAskingPriseChartDisplayed() throws Exception {
        this.swipeUntilButtonShown(askingPriceButton);
        return element(askingPriceButton).isDisplayed();
    }

    public void addDistributionAskingPricePerBedChart() throws Exception {
        this.swipeUntilButtonShown(askingPricePerBedButton);
        element(askingPricePerBedButton).click();

    }

    public void addAndVerifyMedianAskingPerFTChart() throws Exception {
        this.swipeUntilButtonShown(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(medianAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPerFTChart() throws Exception {
        this.swipeUntilButtonShown(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(locationAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerFTChart() throws Exception {
        this.swipeUntilButtonShown(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(distributionAskingPricePerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationListingCountChart() throws Exception {
        this.swipeUntilButtonShown(listingCountButton);
        element(listingCountButton).click();
        element(locationListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyMedianMonthliesChart() throws Exception {
        this.swipeUntilButtonShown(monthliesButton);
        element(monthliesButton).click();
        element(medianMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationMonthliesChart() throws Exception {
        this.swipeUntilButtonShown(monthliesButton);
        element(monthliesButton).click();
        element(locationMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionMonthliesChart() throws Exception {
        this.swipeUntilButtonShown(monthliesButton);
        element(monthliesButton).click();
        element(distributionMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPropertyTaxesChart() throws Exception {
        this.swipeUntilButtonShown(propertyTaxesButton);
        element(propertyTaxesButton).click();
        element(medianPropertyTaxesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPropertyTaxesChart() throws Exception {
        this.swipeUntilButtonShown(propertyTaxesButton);
        element(propertyTaxesButton).click();
        element(locationPropertyTaxesChart).shouldBeVisible();
    }

    public void shouldSeeMedianAskingPricePerBedChart() {
        element(medianAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeLocationAskingPricePerBedChart() {
        element(locationAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeBedroomsChart() {
        element(bedroomChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDoormanChart() throws Exception {
        this.swipeUntilButtonShown(doormanButton);
        element(doormanButton).click();
        element(mktShareDoormanChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareElevatorChart() throws Exception {
        this.swipeUntilButtonShown(elevatorButton);
        element(elevatorButton).click();
        element(mktShareElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesElevatorChart() throws Exception {
        this.swipeUntilButtonShown(elevatorButton);
        element(elevatorButton).click();
        element(featuresElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareFireplaceChart() throws Exception {
        this.swipeUntilButtonShown(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(mktShareWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWorkingFireplaceChart() throws Exception {
        this.swipeUntilButtonShown(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(featuresWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGarageChart() throws Exception {
        this.swipeUntilButtonShown(garageButton);
        element(garageButton).click();
        element(mktShareGarageChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGarageChart() throws Exception {
        this.swipeUntilButtonShown(garageButton);
        element(garageButton).click();
        element(featuresGarageChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGymChart() throws Exception {
        this.swipeUntilButtonShown(gymButton);
        element(gymButton).click();
        element(mktShareGymChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGymChart() throws Exception {
        this.swipeUntilButtonShown(gymButton);
        element(gymButton).click();
        element(featuresGymChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareLaundryBuildingChart() throws Exception {
        this.swipeUntilButtonShown(laundryBuildingButton);
        element(laundryBuildingButton).click();
        element(mktShareLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesLaundryBuildingChart() throws Exception {
        this.swipeUntilButtonShown(laundryBuildingButton);
        element(laundryBuildingButton).click();
        element(featuresLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareOutdoorSpaceChart() throws Exception {
        this.swipeUntilButtonShown(outdoorSpaceButton);
        element(outdoorSpaceButton).click();
        element(mktShareOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesOutdoorSpaceChart() throws Exception {
        this.swipeUntilButtonShown(outdoorSpaceButton);
        element(outdoorSpaceButton).click();
        element(featuresOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePetsChart() throws Exception {
        this.swipeUntilButtonShown(petsButton);
        element(petsButton).click();
        element(mktSharePetsChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPetsChart() throws Exception {
        this.swipeUntilButtonShown(petsButton);
        element(petsButton).click();
        element(featuresPetsChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePoolChart() throws Exception {
        this.swipeUntilButtonShown(poolButton);
        element(poolButton).click();
        element(mktSharePoolChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPoolChart() throws Exception {
        this.swipeUntilButtonShown(poolButton);
        element(poolButton).click();
        element(featuresPoolChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePrewarChart() throws Exception {
        this.swipeUntilButtonShown(prewarButton);
        element(prewarButton).click();
        element(mktSharePrewarChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPrewarChart() throws Exception {
        this.swipeUntilButtonShown(prewarButton);
        element(prewarButton).click();
        element(featuresPrewarChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareWasherDryerChart() throws Exception {
        this.swipeUntilButtonShown(washerDryerButton);
        element(washerDryerButton).click();
        element(mktShareWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWasherDryerChart() throws Exception {
        this.swipeUntilButtonShown(washerDryerButton);
        element(washerDryerButton).click();
        element(featuresWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception {
        this.swipeUntilButtonShown(buildingTypeButton);
        element(buildingTypeButton).click();
        element(mktShareBuildingTypeChart).shouldBeVisible();
    }

    public void dollarPerFTByPriceSegmentButtonClick() throws Exception {
        this.swipeUntilButtonShown(dollarPerFTByPriceSegmentButton);
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldBedroomCountChartDisplayed() throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.universalVerticalSwipe(bedroomChart);
        resetImplicitTimeout();
        element(bedroomChart).shouldBeVisible();
    }

    private void swipeUntilButtonShownAndroid(String chart) {
        Helper.androidSwipeDownUntilElementVisible(chart);
    }

    public void shouldSeeMedianOrLocationAskingPriceChart() {
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd() {
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByBedsChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceByBedsButton);
        element(askingPriceByBedsButton).click();
        element(distributionAskingPriceByNumberBedsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceByPriceSegmentButton);
        element(askingPriceByPriceSegmentButton).click();
        element(distributionAskingPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceByTypeButton);
        element(askingPriceByTypeButton).click();
        element(distributionAskingPriceByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerBedChart() throws Exception {
        this.swipeUntilButtonShown(askingPricePerBedButton);
        element(askingPricePerBedButton).click();
        element(distributionAskingPricePerBedChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByNumberBedsChart() throws Exception {
        this.swipeUntilButtonShown(domByNumberBedsButton);
        element(domByNumberBedsButton).click();
        element(distributionDOMByNumberBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(domByPriceSegmentButton);
        element(domByPriceSegmentButton).click();
        element(distributionDOMByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetChart() throws Exception {
        this.swipeUntilButtonShown(squareFeetButton);
        element(squareFeetButton).click();
        element(distributionSquareFeetChart).shouldBeVisible();
    }

    public void shouldSeeFeaturesDoormanChart() {
        element(featuresDoormanChart).shouldBeVisible();
    }

    public void addDoormanChart() throws Exception {
        this.swipeUntilButtonShown(doormanButton);
        element(doormanButton).click();
    }

    public void addAndVerifyFeaturesNewDevelopmentChart() throws Exception {
        this.swipeUntilButtonShown(newDevelopmentButton);
        element(newDevelopmentButton).click();
        element(featuresNewDevelopmentChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPriceChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceButton);
        element(askingPriceButton).click();
        element(locationAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianAskingPriceChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceButton);
        element(askingPriceButton).click();
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void getMKTShareAskingPriceListingsAmount() {
        String str = element(mktShareAskingPriceListingsAmount).getAttribute("value");
        str = str.replace(",", "");

        initialMKTShareAskingPriceStartListingsAmount = Integer.parseInt(str);
        previousMKTShareAskingPriceStartListingsAmount = initialMKTShareAskingPriceStartListingsAmount;
    }

    public void getLocationAskingPriceListingsLocations() {
        int counter = 0;

        for (WebElement element : locationAskingPriceListingsLocationsList) {
            initialLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }
        previousLocationAskingPriceListingsLocationsStringList = initialLocationAskingPriceListingsLocationsStringList;
    }

    public void checkMKTShareAskingPriceListingsAmountAfterFilterChanging() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(MobileBy.AccessibilityId(
                "PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL: "
                        + Integer.toString(previousMKTShareAskingPriceStartListingsAmount) + ".0")));

        String str = element(mktShareAskingPriceListingsAmount).getAttribute("value");
        str = str.replace(",", "");
        int currentMKTShareAskingPriceListingsAmount = Integer.parseInt(str);

        Assert.assertNotEquals(previousMKTShareAskingPriceStartListingsAmount, currentMKTShareAskingPriceListingsAmount);

        previousMKTShareAskingPriceStartListingsAmount = currentMKTShareAskingPriceListingsAmount;
    }

    public void checkLocationAskingPriceListingsLocationsAfterFilterChanging() {
        int counter = 0;
        int counter2 = 0;
        boolean arraysAreDifferent = false;
        String[] currentLocationAskingPriceListingsLocationsStringList = new String[5];

        for (WebElement element : locationAskingPriceListingsLocationsList) {
            currentLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }

        for (String element : currentLocationAskingPriceListingsLocationsStringList) {
            if (!(element.equals(previousLocationAskingPriceListingsLocationsStringList[counter2]))) {
                arraysAreDifferent = true;
            }
            counter2 += 1;
        }
        Assert.assertTrue(arraysAreDifferent);
        previousLocationAskingPriceListingsLocationsStringList = currentLocationAskingPriceListingsLocationsStringList;
    }

    public void checkLocationAskingPriceListingsLocationsAfterResetFilters() {
        int counter = 0;
        int counter2 = 0;
        boolean arraysAreDifferent = true;
        String[] currentLocationAskingPriceListingsLocationsStringList = new String[5];

        for (WebElement element : locationAskingPriceListingsLocationsList) {
            currentLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }

        for (String element : currentLocationAskingPriceListingsLocationsStringList) {
            if (!(element.equals(initialLocationAskingPriceListingsLocationsStringList[counter2]))) {
                arraysAreDifferent = false;
            }
            counter2 += 1;
        }
        Assert.assertTrue(arraysAreDifferent);
    }


    public void checkMKTShareAskingPriceListingsAmountAfterResetFilters() {
        waitFor(ExpectedConditions.visibilityOf(mktShareAskingPriceChart));
        boolean listingsAmountsAreDifferent = false;

        waitFor(ExpectedConditions.invisibilityOfElementLocated(MobileBy.AccessibilityId(
                "PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL: "
                        + Integer.toString(previousMKTShareAskingPriceStartListingsAmount) + ".0")));

        String str = element(mktShareAskingPriceListingsAmount).getAttribute("value");
        str = str.replace(",", "");
        int currentMKTShareAskingPriceListingsAmount = Integer.parseInt(str);

        if (((initialMKTShareAskingPriceStartListingsAmount - 50) < currentMKTShareAskingPriceListingsAmount)
                && (currentMKTShareAskingPriceListingsAmount < (initialMKTShareAskingPriceStartListingsAmount + 50))) {
            listingsAmountsAreDifferent = true;
        }
        Assert.assertTrue(listingsAmountsAreDifferent);
    }

    public void rebnyMKTShareAskingPriceChartTitle() {
        element(mktShareAskingPriceChart).click();
    }

    private void swipeUntilButtonShown(WebElement button) throws Exception {
        setImplicitTimeout(1, SECONDS);
        Helper.universalVerticalSwipe(button);
        resetImplicitTimeout();
    }

    public void addDistributionAskingPriceByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceByPriceSegmentButton);
        element(askingPriceByPriceSegmentButton).click();
    }

    public void addDistributionDOMByPriceSegmentChart() throws Exception {
        this.swipeUntilButtonShown(domByPriceSegmentButton);
        element(domByPriceSegmentButton).click();
    }

    public void addMKTShareBuildingTypeChart() throws Exception {
        this.swipeUntilButtonShown(buildingTypeButton);
        element(buildingTypeButton).click();

    }

    public void addDistributionAskingPriceByTypeChart() throws Exception {
        this.swipeUntilButtonShown(askingPriceByTypeButton);
        element(askingPriceByTypeButton).click();
    }

    public void addOutdoorSpaceChart() throws Exception {
        this.swipeUntilButtonShown(outdoorSpaceButton);
        element(outdoorSpaceButton).click();
    }

    public void addPrewarSpaceChart() throws Exception {
        this.swipeUntilButtonShown(prewarButton);
        element(prewarButton).click();
    }

    public void addDistributionDOMByNumberBedsChart() {
        element(domByNumberBedsButton).click();
    }

    public void addElevatorChart() throws Exception {
        Helper.swipeDownUntilElementVisible(elevatorButton);
        element(elevatorButton).click();
    }

    public void addParkingChart() throws Exception {
        Helper.swipeDownUntilElementVisible(garageButton);
        element(garageButton).click();
    }

    public void addGymChart() throws Exception {
        Helper.swipeDownUntilElementVisible(gymButton);
        element(gymButton).click();
    }

    public void addLaundryBuildingChart() throws Exception {
        Helper.swipeDownUntilElementVisible(laundryBuildingButton);
        element(laundryBuildingButton).click();
    }

    public void addPetsChart() throws Exception {
        Helper.swipeDownUntilElementVisible(petsButton);
        element(petsButton).click();
    }

    public void addPoolChart() throws Exception {
        Helper.swipeDownUntilElementVisible(poolButton);
        element(poolButton).click();
    }

    public void addFireplaceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(workingFireplaceButton);
        element(workingFireplaceButton).click();
    }
}
