package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class REBNYListingsPage extends BasePage {

    //region WebElements

    @iOSXCUITFindBy(accessibility = "ASKING PRICE")
    private WebElement askingPriceButton;

    @iOSXCUITFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSXCUITFindBy(accessibility = "BUILDING HEIGHT")
    private WebElement buildingHeightButton;

    @iOSXCUITFindBy(accessibility = "BUILDING TYPE")
    private WebElement buildingTypeChart;

    @iOSXCUITFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @iOSXCUITFindBy(accessibility = "DOORMAN")
    private WebElement doormanButton;

    @iOSXCUITFindBy(accessibility = "DOORMAN PREMIUM")
    private WebElement premiumDoormanChart;

    @iOSXCUITFindBy(accessibility = "ELEVATOR")
    private WebElement elevatorButton;

    @iOSXCUITFindBy(accessibility = "ELEVATOR PREMIUM")
    private WebElement elevatorPremiumChart;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE")
    private WebElement fireplaceButton;

    @iOSXCUITFindBy(accessibility = "WORKING FIREPLACE PREMIUM")
    private WebElement fireplacePremiumChart;

    @iOSXCUITFindBy(accessibility = "GARAGE")
    private WebElement garageButton;

    @iOSXCUITFindBy(accessibility = "GARAGE PREMIUM")
    private WebElement garagePremiumChart;

    @iOSXCUITFindBy(accessibility = "GYM")
    private WebElement gymButton;

    @iOSXCUITFindBy(accessibility = "GYM PREMIUM")
    private WebElement gymPremiumChart;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING")
    private WebElement laundryBuildingButton;

    @iOSXCUITFindBy(accessibility = "LAUNDRY - BUILDING PREMIUM")
    private WebElement laundryBuildingPremiumChart;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE")
    private WebElement outdoorSpaceButton;

    @iOSXCUITFindBy(accessibility = "OUTDOOR SPACE PREMIUM")
    private WebElement outdoorSpacePremiumChart;

    @iOSXCUITFindBy(accessibility = "PETS")
    private WebElement petsButton;

    @iOSXCUITFindBy(accessibility = "PETS PREMIUM")
    private WebElement petsPremiumChart;

    @iOSXCUITFindBy(accessibility = "POOL")
    private WebElement poolButton;

    @iOSXCUITFindBy(accessibility = "POOL PREMIUM")
    private WebElement poolPremiumChart;

    @iOSXCUITFindBy(accessibility = "PREWAR")
    private WebElement prewarButton;

    @iOSXCUITFindBy(accessibility = "PREWAR PREMIUM")
    private WebElement prewarPremiumChart;

    @iOSXCUITFindBy(accessibility = "WASHER/DRYER")
    private WebElement washerDryerButton;

    @iOSXCUITFindBy(accessibility = "W/D PREMIUM")
    private WebElement washerDryerPremiumChart;

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

    @iOSXCUITFindBy(accessibility = "ASKING PRICE PER FT²")
    private WebElement askingPricePerFTButton;

    @iOSXCUITFindBy(accessibility = "DOM BY # BEDS")
    private WebElement domByNumberBedsButton;

    @iOSXCUITFindBy(accessibility = "DOM BY PRICE SEGMENT")
    private WebElement domByPriceSegmentButton;

    @iOSXCUITFindBy(accessibility = "SQUARE FEET")
    private WebElement squareFeetButton;

    @iOSXCUITFindBy(accessibility = "MONTHLIES")
    private WebElement monthliesButton;

    @iOSXCUITFindBy(accessibility = "LISTING COUNT")
    private WebElement listingCountButton;

    @iOSXCUITFindBy(accessibility = "PROPERTY TAXES")
    private WebElement propertyTaxesButton;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/BED")
    private WebElement medianAskingPricePerBedChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING $/FT²")
    private WebElement medianAskingPerFTChart;

    @iOSXCUITFindBy(accessibility = "ASKING PRICE $/FT²")
    private WebElement askingPricePerFTChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN MONTHLIES")
    private WebElement medianMonthliesChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN PROPERTY TAXES")
    private WebElement medianPropertyTaxesChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_BEDROOM COUNT_21")
    private WebElement bedroomChart;

    @iOSXCUITFindBy(accessibility = "$/FT² BY SEGMENT")
    private WebElement dollarPerFTByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "MEDIAN ASKING PRICE BY SEGMENT")
    private WebElement askingPriceByPriceSegmentChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_1")
    private WebElement medianAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "DOM BY NUMBER BEDROOMS")
    private WebElement domByNumberBedroomsChart;

    @iOSXCUITFindBy(accessibility = "NEW DEVELOPMENT")
    private WebElement newDevelopmentButton;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_ASKING PRICE_11")
    private WebElement mktShareAskingPriceChart;

    @iOSXCUITFindBy(accessibility = "REBNY LISTINGS_MEDIAN ASKING PRICE_63")
    private WebElement locationAskingPriceChart;


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

    public void isDaysOnMarketChartAdd(){
        element(daysOnMarketButton).shouldBeVisible();
    }

    public void buildingHeightButtonClick(){
        element(buildingHeightButton).click();
    }

    public void isBuildingHeightChartAdd(){
        element(buildingHeightButton).shouldBeVisible();
    }

    public void addREBNYListingsAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
        element(askingPriceButton).click();
    }

    public void shouldDaysOnMarketDisplayedWithSwipe() throws Exception {
        Helper.swipeDownUntilElementVisible(daysOnMarketButton);
        //Helper.scrollToElement(daysOnMarketButton);
        element(daysOnMarketButton).shouldBeVisible();
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

    public void medianAskingPerFTButtonClick(){
        element(askingPricePerFTButton).click();
        element(medianAskingPerFTChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPricePerFTChart(){
        element(askingPricePerFTButton).click();
        element(askingPricePerFTChart).shouldBeVisible();
    }

    public void listingCountButtonClick(){
        element(listingCountButton).click();
        element(listingCountButton).shouldBeVisible();
    }

    public void medianMonthliesButtonClick(){
        element(monthliesButton).click();
        element(medianMonthliesChart).shouldBeVisible();
    }

    public void addAndVerifyMonthliesChart(){
        element(monthliesButton).click();
        element(monthliesButton).shouldBeVisible();
    }

    public void medianPropertyTaxesButtonClick(){
        element(propertyTaxesButton).click();
        element(medianPropertyTaxesChart).shouldBeVisible();
    }

    public void shouldSeeMedianAskingPricePerBedChart(){
        element(medianAskingPricePerBedChart).shouldBeVisible();
    }

    public void shouldSeeBedroomsChart(){
        element(bedroomChart).shouldBeVisible();
    }

    public void addAndVerifyDoormanChart(){
        element(doormanButton).click();
        element(doormanButton).shouldBeVisible();
    }

    public void addAndVerifyElevatorChart(){
        element(elevatorButton).click();
        element(elevatorButton).shouldBeVisible();
    }

    public void addAndVerifyElevatorPremiumChart(){
        element(elevatorButton).click();
        element(elevatorPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyFireplaceChart(){
        Helper.scrollToElement(fireplaceButton);
        element(fireplaceButton).click();
        element(fireplaceButton).shouldBeVisible();
    }

    public void addAndVerifyWorkingFireplacePremiumChart(){
        Helper.scrollToElement(fireplaceButton);
        element(fireplaceButton).click();
        element(fireplacePremiumChart).shouldBeVisible();
    }

    public void addAndVerifyGarageChart(){
        element(garageButton).click();
        element(garageButton).shouldBeVisible();
    }

    public void addAndVerifyGaragePremiumChart(){
        element(garageButton).click();
        element(garagePremiumChart).shouldBeVisible();
    }

    public void addAndVerifyGymChart(){
        element(gymButton).click();
        element(gymButton).shouldBeVisible();
    }

    public void addAndVerifyGymPremiumChart(){
        element(gymButton).click();
        element(gymPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyLaundryBuildingChart(){
        element(laundryBuildingButton).click();
        element(laundryBuildingButton).shouldBeVisible();
    }

    public void addAndVerifyLaundryBuildingPremiumChart(){
        element(laundryBuildingButton).click();
        element(laundryBuildingPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyOutdoorSpaceChart(){
        element(outdoorSpaceButton).click();
        element(outdoorSpaceButton).shouldBeVisible();
    }

    public void addAndVerifyOutdoorSpacePremiumChart(){
        element(outdoorSpaceButton).click();
        element(outdoorSpacePremiumChart).shouldBeVisible();
    }

    public void addAndVerifyPetsChart(){
        Helper.scrollToElement(petsButton);
        element(petsButton).click();
        element(petsButton).shouldBeVisible();
    }

    public void addAndVerifyPetsPremiumChart(){
        Helper.scrollToElement(petsButton);
        element(petsButton).click();
        element(petsPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyPoolChart(){
        Helper.scrollToElement(poolButton);
        element(poolButton).click();
        element(poolButton).shouldBeVisible();
    }

    public void addAndVerifyPoolPremiumChart(){
        Helper.scrollToElement(poolButton);
        element(poolButton).click();
        element(poolPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyPrewarChart(){
        Helper.scrollToElement(prewarButton);
        element(prewarButton).click();
        element(prewarButton).shouldBeVisible();
    }

    public void addAndVerifyPrewarPremiumChart(){
        Helper.scrollToElement(prewarButton);
        element(prewarButton).click();
        element(prewarPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyWasherDryerChart(){
        Helper.scrollToElement(washerDryerButton);
        element(washerDryerButton).click();
        element(washerDryerButton).shouldBeVisible();
    }

    public void addAndVerifyWasherDryerPremiumChart(){
        Helper.scrollToElement(washerDryerButton);
        element(washerDryerButton).click();
        element(washerDryerPremiumChart).shouldBeVisible();
    }

    public void addAndVerifyBuildingTypeChart(){
        element(buildingTypeChart).click();
        element(buildingTypeChart).shouldBeVisible();
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

    public void isDollarPerFTByPriceSegmentChartAdd(){
        element(dollarPerFTByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByBedsChart(){
        element(askingPriceByBedsButton).click();
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByPriceSegmentChart(){
        element(askingPriceByPriceSegmentButton).click();
        element(askingPriceByPriceSegmentChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPriceByTypeChart(){
        element(askingPriceByTypeButton).click();
        element(medianAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyAskingPricePerBedChart(){
        element(askingPricePerBedButton).click();
        element(askingPricePerBedButton).shouldBeVisible();
    }

    public void addAndVerifyDOMByNumberBedsChart(){
        element(domByNumberBedsButton).click();
        element(domByNumberBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyDOMByPriceSegmentChart(){
        element(domByPriceSegmentButton).click();
        element(domByPriceSegmentButton).shouldBeVisible();
    }

    public void addAndVerifySquareFeetChart(){
        element(squareFeetButton).click();
        element(squareFeetButton).shouldBeVisible();
    }

    public void shouldSeePremiumDoormanChart(){
        element(premiumDoormanChart).shouldBeVisible();
    }

    public void doormanButtonClick(){
        element(doormanButton).click();
    }

    public void addAndVerifyNewDevelopmentChart(){
        element(newDevelopmentButton).click();
        element(newDevelopmentButton).shouldBeVisible();
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
}
