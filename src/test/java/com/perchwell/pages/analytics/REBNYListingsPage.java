package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class REBNYListingsPage extends BasePage {

    //region WebElements

    private int initialMKTShareAskingPriceStartListingsAmount = 0;
    private String[] initialLocationAskingPriceListingsLocationsStringList = new String[5];
    private int previousMKTShareAskingPriceStartListingsAmount = 0;
    private String[] previousLocationAskingPriceListingsLocationsStringList = new String[5];

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceButton;

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

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

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY # BEDS")
    private WebElement askingPriceByBedsButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY PRICE SEGMENT")
    private WebElement askingPriceByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE BY TYPE")
    private WebElement askingPriceByTypeButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE PER BED")
    private WebElement askingPricePerBedButton;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE PER BED_PERCENTILES_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE PER FT²")
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

    @iOSXCUITFindBy(accessibility = "MONTHLIES_PERCENTILES_HOA_FEE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionMonthliesChart;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT")
    private WebElement listingCountButton;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT_COUNTS_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationListingCountChart;

    @iOSXCUITFindBy(accessibility = "PROPERTY TAXES")
    private WebElement propertyTaxesButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/BED_MEDIAN_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/BED_BAR_LISTING_PRICE_PER_BR_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/SQFT_MEDIAN_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/SQFT_BAR_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE $/SQFT_PERCENTILES_LISTING_PRICE_PER_SQFT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPricePerFTChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES_MEDIAN_HOA_FEE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianMonthliesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES_BAR_HOA_FEE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationMonthliesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES_MEDIAN_REAL_ESTATE_TAX_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES_BAR_REAL_ESTATE_TAX_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "BEDROOM COUNT_ROOMS_NUM_BEDROOMS_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement bedroomChart;

    @iOSXCUITFindBy(accessibility = "$/SQFT BY SEGMENT_MEDIANPERPRICETRANCHE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE BY SEGMENT_MEDIANPERPRICETRANCHE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE_MEDIAN_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement medianAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE_MEDIANPERPROPERTYCODE_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByTypeChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE_MEDIANPERBR_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceByNumberBedsChart;

    @iOSXCUITFindBy(accessibility = "DOM BY NUMBER BEDROOMS_DAYSONMARKETBEDROOM_DAYS_ON_MARKET_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionDOMByNumberBedroomsChart;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT")
    private WebElement newDevelopmentButton;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT_PREMIUM_NEW_DEVELOPMENT_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement featuresNewDevelopmentChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement mktShareAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE_PERCENTILES_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement distributionAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE_BAR_LISTING_PRICE_LISTINGS_PROPERTIES: HEADER TITLE LABEL")
    private WebElement locationAskingPriceChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'ASKING PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL:'")
    private WebElement mktShareAskingPriceListingsAmount;
//
//    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'REBNY LISTINGS_ASKING PRICE_0_'")
//    private WebElement mktShareAskingPriceListingsAmountAfterFilterChanging;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name CONTAINS 'location -'")
    private List<WebElement> locationAskingPriceListingsLocationsList;

    //endregion

    public REBNYListingsPage(WebDriver driver) {
        super(driver);
    }

    public void daysOnMarketButtonClick(){
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick(){
        element(bedroomsButton).click();
    }

    public void shouldSeeMKTShareAskingPriseChart() {
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public void shouldSeeDistributionAskingPriseChart() {
        element(distributionAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void addAndVerifyLocationDaysOnMarketChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(locationDaysOnMarketChart).shouldBeVisible();
    }

    public void buildingHeightButtonClick() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(buildingHeightButton);
        element(buildingHeightButton).click();
    }

    public void shouldSeeMKTShareBuildingHeightChart() {
        element(mktShareBuildingHeightChart).shouldBeVisible();
    }

    public void addREBNYListingsAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceButton);
        element(askingPriceButton).click();
    }

    public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(mktShareAskingPriceChart);
        //	Helper.scrollToElement(askingPriceButton);
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public boolean isAskingPriseChartDisplayed() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceButton);
        return element(askingPriceButton).isDisplayed();
    }

    public void askingPricePerBedButtonClick() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPricePerBedButton);
        element(askingPricePerBedButton).click();

    }

    public void addAndVerifyMedianAskingPerFTChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(medianAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPerFTChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(locationAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerFTChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPricePerFTButton);
        element(askingPricePerFTButton).click();
        element(distributionAskingPricePerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationListingCountChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(listingCountButton);
        element(listingCountButton).click();
        element(locationListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyMedianMonthliesChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(monthliesButton);
        element(monthliesButton).click();
        element(medianMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationMonthliesChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(monthliesButton);
        element(monthliesButton).click();
        element(locationMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionMonthliesChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(monthliesButton);
        element(monthliesButton).click();
        element(distributionMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPropertyTaxesChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(propertyTaxesButton);
        element(propertyTaxesButton).click();
        element(medianPropertyTaxesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPropertyTaxesChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(propertyTaxesButton);
        element(propertyTaxesButton).click();
        element(locationPropertyTaxesChart).shouldBeVisible();
    }

    public void shouldSeeMedianAskingPricePerBedChart(){
        element(medianAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeLocationAskingPricePerBedChart(){
        element(locationAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeBedroomsChart() {
        element(bedroomChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDoormanChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(doormanButton);
        element(doormanButton).click();
        element(mktShareDoormanChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareElevatorChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(elevatorButton);
        element(elevatorButton).click();
        element(mktShareElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesElevatorChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(elevatorButton);
        element(elevatorButton).click();
        element(featuresElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareFireplaceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(mktShareWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWorkingFireplaceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(featuresWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGarageChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(garageButton);
        element(garageButton).click();
        element(mktShareGarageChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGarageChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(garageButton);
        element(garageButton).click();
        element(featuresGarageChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGymChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(gymButton);
        element(gymButton).click();
        element(mktShareGymChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGymChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(gymButton);
        element(gymButton).click();
        element(featuresGymChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareLaundryBuildingChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(laundryBuildingButton);
        element(laundryBuildingButton).click();
        element(mktShareLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesLaundryBuildingChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(laundryBuildingButton);
        element(laundryBuildingButton).click();
        element(featuresLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareOutdoorSpaceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(outdoorSpaceButton);
        element(outdoorSpaceButton).click();
        element(mktShareOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesOutdoorSpaceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(outdoorSpaceButton);
        element(outdoorSpaceButton).click();
        element(featuresOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePetsChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(petsButton);
        element(petsButton).click();
        element(mktSharePetsChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPetsChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(petsButton);
        element(petsButton).click();
        element(featuresPetsChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePoolChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(poolButton);
        element(poolButton).click();
        element(mktSharePoolChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPoolChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(poolButton);
        element(poolButton).click();
        element(featuresPoolChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePrewarChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(prewarButton);
        element(prewarButton).click();
        element(mktSharePrewarChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPrewarChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(prewarButton);
        element(prewarButton).click();
        element(featuresPrewarChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareWasherDryerChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(washerDryerButton);
        element(washerDryerButton).click();
        element(mktShareWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWasherDryerChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(washerDryerButton);
        element(washerDryerButton).click();
        element(featuresWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(buildingTypeButton);
        element(buildingTypeButton).click();
        element(mktShareBuildingTypeChart).shouldBeVisible();
    }

    public void dollarPerFTByPriceSegmentButtonClick() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(dollarPerFTByPriceSegmentButton);
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldBedroomCountChartDisplayed() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(bedroomChart);
        element(bedroomChart).shouldBeVisible();
    }

    public void shouldSeeMedianOrLocationAskingPriceChart(){
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd(){
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByBedsChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceByBedsButton);
        element(askingPriceByBedsButton).click();
        element(distributionAskingPriceByNumberBedsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByPriceSegmentChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceByPriceSegmentButton);
        element(askingPriceByPriceSegmentButton).click();
        element(distributionAskingPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByTypeChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceByTypeButton);
        element(askingPriceByTypeButton).click();
        element(distributionAskingPriceByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerBedChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPricePerBedButton);
        element(askingPricePerBedButton).click();
        element(distributionAskingPricePerBedChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByNumberBedsChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(domByNumberBedsButton);
        element(domByNumberBedsButton).click();
        element(distributionDOMByNumberBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByPriceSegmentChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(domByPriceSegmentButton);
        element(domByPriceSegmentButton).click();
        element(distributionDOMByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(squareFeetButton);
        element(squareFeetButton).click();
        element(distributionSquareFeetChart).shouldBeVisible();
    }

    public void shouldSeeFeaturesDoormanChart(){
        element(featuresDoormanChart).shouldBeVisible();
    }

    public void doormanButtonClick() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(doormanButton);
        element(doormanButton).click();
    }

    public void addAndVerifyFeaturesNewDevelopmentChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(newDevelopmentButton);
        element(newDevelopmentButton).click();
        element(featuresNewDevelopmentChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceButton);
        element(askingPriceButton).click();
        element(locationAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisibleForCharButtons(askingPriceButton);
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

        for(WebElement element: locationAskingPriceListingsLocationsList) {
            initialLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }
        previousLocationAskingPriceListingsLocationsStringList = initialLocationAskingPriceListingsLocationsStringList;
    }

    public void checkMKTShareAskingPriceListingsAmountAfterFilterChanging() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(MobileBy.AccessibilityId(
                "ASKING PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL: "
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

        for(WebElement element: locationAskingPriceListingsLocationsList) {
            currentLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }

        for(String element: currentLocationAskingPriceListingsLocationsStringList) {
            if(!(element.equals(previousLocationAskingPriceListingsLocationsStringList[counter2]))) {
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

        for(WebElement element: locationAskingPriceListingsLocationsList) {
            currentLocationAskingPriceListingsLocationsStringList[counter] = element.getAttribute("name");
            counter += 1;
        }

        for(String element: currentLocationAskingPriceListingsLocationsStringList) {
            if(!(element.equals(initialLocationAskingPriceListingsLocationsStringList[counter2]))) {
                arraysAreDifferent = false;
            }
            counter2 += 1;
        }
        Assert.assertTrue(arraysAreDifferent);
    }


    public void checkMKTShareAskingPriceListingsAmountAfterResetFilters() {
        boolean listingsAmountsAreDifferent = false;

        waitFor(ExpectedConditions.invisibilityOfElementLocated(MobileBy.AccessibilityId(
                "ASKING PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_PROPERTIES: VALUE_LABEL: "
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
}
