package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_BUILDING HEIGHT_13")
    private WebElement mktShareBuildingHeightChart;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE")
    private WebElement buildingTypeButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_BUILDING TYPE_14")
    private WebElement mktShareBuildingTypeChart;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_DAYS ON MARKET_171")
    private WebElement mktShareDaysOnMarketChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN DOM_173")
    private WebElement locationDaysOnMarketChart;

    @iOSXCUITFindBy(accessibility = "DOORMAN")
    private WebElement doormanButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_DOORMAN_15")
    private WebElement mktShareDoormanChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_DOORMAN PREMIUM_31")
    private WebElement featuresDoormanChart;

    @iOSXCUITFindBy(accessibility = "ELEVATOR")
    private WebElement elevatorButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ELEVATOR_16")
    private WebElement mktShareElevatorChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ELEVATOR PREMIUM_32")
    private WebElement featuresElevatorChart;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE")
    private WebElement workingFireplaceButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_WORKING FIREPLACE_25")
    private WebElement mktShareWorkingFireplaceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_WORKING FIREPLACE PREMIUM_39")
    private WebElement featuresWorkingFireplaceChart;

    @iOSXCUITFindBy(accessibility = "GARAGE")
    private WebElement garageButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_GARAGE_26")
    private WebElement mktShareGarageChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_GARAGE PREMIUM_40")
    private WebElement featuresGarageChart;

    @iOSXCUITFindBy(accessibility = "GYM")
    private WebElement gymButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_GYM_17")
    private WebElement mktShareGymChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_GYM PREMIUM_33")
    private WebElement featuresGymChart;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING")
    private WebElement laundryBuildingButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_LAUNDRY - BUILDING_23")
    private WebElement mktShareLaundryBuildingChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_LAUNDRY - BUILDING PREMIUM_37")
    private WebElement featuresLaundryBuildingChart;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE")
    private WebElement outdoorSpaceButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_OUTDOOR SPACE_27")
    private WebElement mktShareOutdoorSpaceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_OUTDOOR SPACE PREMIUM_41")
    private WebElement featuresOutdoorSpaceChart;

    @iOSXCUITFindBy(accessibility = "PETS")
    private WebElement petsButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_PETS_18")
    private WebElement mktSharePetsChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_PETS PREMIUM_34")
    private WebElement featuresPetsChart;

    @iOSXCUITFindBy(accessibility = "POOL")
    private WebElement poolButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_POOL_19")
    private WebElement mktSharePoolChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_POOL PREMIUM_35")
    private WebElement featuresPoolChart;

    @iOSXCUITFindBy(accessibility = "PREWAR")
    private WebElement prewarButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_PREWAR_20")
    private WebElement mktSharePrewarChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_PREWAR PREMIUM_36")
    private WebElement featuresPrewarChart;

    @iOSXCUITFindBy(accessibility = "WASHER/DRYER")
    private WebElement washerDryerButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_WASHER/DRYER_24")
    private WebElement mktShareWasherDryerChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_W/D PREMIUM_38")
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

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ASKING PRICE PER BED_48")
    private WebElement distributionAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE PER FT²")
    private WebElement askingPricePerFTButton;

    @iOSXCUITFindBy(accessibility = "DOM BY # BEDS")
    private WebElement domByNumberBedsButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE SEGMENT")
    private WebElement domByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_DOM BY PRICE SEGMENT_174")
    private WebElement distributionDOMByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_SQUARE FEET_54")
    private WebElement distributionSquareFeetChart;

    @iOSXCUITFindBy(accessibility = "MONTHLIES")
    private WebElement monthliesButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MONTHLIES_53")
    private WebElement distributionMonthliesChart;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT")
    private WebElement listingCountButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_LISTING COUNT_142")
    private WebElement locationListingCountChart;

    @iOSXCUITFindBy(accessibility = "PROPERTY TAXES")
    private WebElement propertyTaxesButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING $/BED_2")
    private WebElement medianAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING $/BED_65")
    private WebElement locationAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING $/FT²_3")
    private WebElement medianAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING $/FT²_64")
    private WebElement locationAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ASKING PRICE $/FT²_49")
    private WebElement distributionAskingPricePerFTChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN MONTHLIES_7")
    private WebElement medianMonthliesChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN MONTHLIES_69")
    private WebElement locationMonthliesChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN PROPERTY TAXES_8")
    private WebElement medianPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN PROPERTY TAXES_70")
    private WebElement locationPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_BEDROOM COUNT_21")
    private WebElement bedroomChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_$/FT² BY SEGMENT_154")
    private WebElement distributionDollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE BY SEGMENT_155")
    private WebElement distributionAskingPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_1")
    private WebElement medianAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_56")
    private WebElement distributionAskingPriceByTypeChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_55")
    private WebElement distributionAskingPriceByNumberBedsChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_DOM BY NUMBER BEDROOMS_172")
    private WebElement distributionDOMByNumberBedroomsChart;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT")
    private WebElement newDevelopmentButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_NEW DEVELOPMENT_182")
    private WebElement featuresNewDevelopmentChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ASKING PRICE_11")
    private WebElement mktShareAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ASKING PRICE_47")
    private WebElement distributionAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_63")
    private WebElement locationAskingPriceChart;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'REBNY LISTINGS_ASKING PRICE_11_'")
    private WebElement mktShareAskingPriceListingsAmount;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'REBNY LISTINGS_ASKING PRICE_0_'")
    private WebElement mktShareAskingPriceListingsAmountAfterFilterChanging;

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

    public void addAndVerifyMKTShareDaysOnMarketChart(){
        element(daysOnMarketButton).click();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void addAndVerifyLocationDaysOnMarketChart(){
        element(daysOnMarketButton).click();
        element(locationDaysOnMarketChart).shouldBeVisible();
    }

    public void buildingHeightButtonClick(){
        element(buildingHeightButton).click();
    }

    public void shouldSeeMKTShareBuildingHeightChart(){
        element(mktShareBuildingHeightChart).shouldBeVisible();
    }

    public void addREBNYListingsAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
        element(askingPriceButton).click();
    }

    public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
        Helper.swipeDownUntilElementVisible(mktShareAskingPriceChart);
        //	Helper.scrollToElement(askingPriceButton);
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public boolean isAskingPriseChartDisplayed() {
        Helper.scrollToElement(askingPriceButton);
        return element(askingPriceButton).isDisplayed();
    }

    public void askingPricePerBedButtonClick(){
        element(askingPricePerBedButton).click();

    }

    public void addAndVerifyMedianAskingPerFTChart(){
        element(askingPricePerFTButton).click();
        element(medianAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPerFTChart(){
        element(askingPricePerFTButton).click();
        element(locationAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerFTChart(){
        element(askingPricePerFTButton).click();
        element(distributionAskingPricePerFTChart).shouldBeVisible();
    }

    public void addAndVerifyLocationListingCountChart(){
        element(listingCountButton).click();
        element(locationListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyMedianMonthliesChart(){
        element(monthliesButton).click();
        element(medianMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationMonthliesChart(){
        element(monthliesButton).click();
        element(locationMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionMonthliesChart(){
        element(monthliesButton).click();
        element(distributionMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyMedianPropertyTaxesChart(){
        element(propertyTaxesButton).click();
        element(medianPropertyTaxesChart).shouldBeVisible();
    }

    public void addAndVerifyLocationPropertyTaxesChart(){
        element(propertyTaxesButton).click();
        element(locationPropertyTaxesChart).shouldBeVisible();
    }

    public void shouldSeeMedianAskingPricePerBedChart(){
        element(medianAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeLocationAskingPricePerBedChart(){
        element(locationAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeBedroomsChart(){
        element(bedroomChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDoormanChart(){
        element(doormanButton).click();
        element(mktShareDoormanChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareElevatorChart(){
        element(elevatorButton).click();
        element(mktShareElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesElevatorChart(){
        element(elevatorButton).click();
        element(featuresElevatorChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareFireplaceChart(){
        Helper.scrollToElement(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(mktShareWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWorkingFireplaceChart(){
        Helper.scrollToElement(workingFireplaceButton);
        element(workingFireplaceButton).click();
        element(featuresWorkingFireplaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGarageChart(){
        element(garageButton).click();
        element(mktShareGarageChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGarageChart(){
        element(garageButton).click();
        element(featuresGarageChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareGymChart(){
        element(gymButton).click();
        element(mktShareGymChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesGymChart(){
        element(gymButton).click();
        element(featuresGymChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareLaundryBuildingChart(){
        element(laundryBuildingButton).click();
        element(mktShareLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesLaundryBuildingChart(){
        element(laundryBuildingButton).click();
        element(featuresLaundryBuildingChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareOutdoorSpaceChart(){
        element(outdoorSpaceButton).click();
        element(mktShareOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesOutdoorSpaceChart(){
        element(outdoorSpaceButton).click();
        element(featuresOutdoorSpaceChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePetsChart(){
        Helper.scrollToElement(petsButton);
        element(petsButton).click();
        element(mktSharePetsChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPetsChart(){
        Helper.scrollToElement(petsButton);
        element(petsButton).click();
        element(featuresPetsChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePoolChart(){
        Helper.scrollToElement(poolButton);
        element(poolButton).click();
        element(mktSharePoolChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPoolChart(){
        Helper.scrollToElement(poolButton);
        element(poolButton).click();
        element(featuresPoolChart).shouldBeVisible();
    }

    public void addAndVerifyMKTSharePrewarChart(){
        Helper.scrollToElement(prewarButton);
        element(prewarButton).click();
        element(mktSharePrewarChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesPrewarChart(){
        Helper.scrollToElement(prewarButton);
        element(prewarButton).click();
        element(featuresPrewarChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareWasherDryerChart(){
        Helper.scrollToElement(washerDryerButton);
        element(washerDryerButton).click();
        element(mktShareWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyFeaturesWasherDryerChart(){
        Helper.scrollToElement(washerDryerButton);
        element(washerDryerButton).click();
        element(featuresWasherDryerChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingTypeChart(){
        element(buildingTypeButton).click();
        element(mktShareBuildingTypeChart).shouldBeVisible();
    }

    public void dollarPerFTByPriceSegmentButtonClick(){
        element(dollarPerFTByPriceSegmentButton).click();
    }

    public void shouldBedroomCountChartDisplayed(){
        Helper.scrollToElement(bedroomChart);
        element(bedroomChart).shouldBeVisible();
    }

    public void shouldSeeMedianOrLocationAskingPriceChart(){
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd(){
        element(distributionDollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByBedsChart(){
        element(askingPriceByBedsButton).click();
        element(distributionAskingPriceByNumberBedsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByPriceSegmentChart(){
        element(askingPriceByPriceSegmentButton).click();
        element(distributionAskingPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPriceByTypeChart(){
        element(askingPriceByTypeButton).click();
        element(distributionAskingPriceByTypeChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAskingPricePerBedChart(){
        element(askingPricePerBedButton).click();
        element(distributionAskingPricePerBedChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByNumberBedsChart(){
        element(domByNumberBedsButton).click();
        element(distributionDOMByNumberBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionDOMByPriceSegmentChart(){
        element(domByPriceSegmentButton).click();
        element(distributionDOMByPriceSegmentButton).shouldBeVisible();
    }

    public void addAndVerifyDistributionSquareFeetChart(){
        element(squareFeetButton).click();
        element(distributionSquareFeetChart).shouldBeVisible();
    }

    public void shouldSeeFeaturesDoormanChart(){
        element(featuresDoormanChart).shouldBeVisible();
    }

    public void doormanButtonClick(){
        element(doormanButton).click();
    }

    public void addAndVerifyFeaturesNewDevelopmentChart(){
        element(newDevelopmentButton).click();
        element(featuresNewDevelopmentChart).shouldBeVisible();
    }

    public void addAndVerifyLocationAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
        element(askingPriceButton).click();
        element(locationAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyMedianAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
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
                "REBNY LISTINGS_ASKING PRICE_0_" + Integer.toString(previousMKTShareAskingPriceStartListingsAmount))));

        String str = element(mktShareAskingPriceListingsAmountAfterFilterChanging).getAttribute("value");
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
                "REBNY LISTINGS_ASKING PRICE_0_" + Integer.toString(previousMKTShareAskingPriceStartListingsAmount))));

        String str = element(mktShareAskingPriceListingsAmountAfterFilterChanging).getAttribute("value");
        str = str.replace(",", "");
        int currentMKTShareAskingPriceListingsAmount = Integer.parseInt(str);

        if (((initialMKTShareAskingPriceStartListingsAmount - 50) < currentMKTShareAskingPriceListingsAmount)
                && (currentMKTShareAskingPriceListingsAmount < (initialMKTShareAskingPriceStartListingsAmount + 50))) {
            listingsAmountsAreDifferent = true;
        }
        Assert.assertTrue(listingsAmountsAreDifferent);
    }
}
