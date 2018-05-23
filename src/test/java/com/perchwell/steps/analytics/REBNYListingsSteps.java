package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.REBNYListingsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class REBNYListingsSteps extends ScenarioSteps {
    REBNYListingsPage rebnyListingsPage;
    AnalyticsPage analyticsPage;


    @Step
    public void shouldSeePremiumDoormanChart(){
        rebnyListingsPage.shouldSeePremiumDoormanChart();
        this.isChartDisplayed();
    }

    @Step
    public void doormanButtonClick(){
        rebnyListingsPage.doormanButtonClick();
    }

    private void isChartDisplayed() {
        analyticsPage.isChartDisplayed();
    }

    private void isChartWithApplyingFiltersDisplayed() {
        analyticsPage.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addBedroomsChart(){
        rebnyListingsPage.bedroomsButtonClick();
    }

    @Step
    public void shouldSeeMKTShareAskingPriseChart() {
        rebnyListingsPage.shouldSeeMKTShareAskingPriseChart();
        this.isChartDisplayed();
    }

    @Step
    public void addBuildingHeightChartWithMKTShare() {
        analyticsPage.rebnyListingsButtonClick();
        analyticsPage.mktShareButtonClick();
        rebnyListingsPage.buildingHeightButtonClick();
    }

    @Step
    public void isBuildingHeightChartAdd(){
        rebnyListingsPage.isBuildingHeightChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void addMKTShareAskingPriceChart() throws Exception {
        rebnyListingsPage.addREBNYListingsAskingPriceChart();
    }

    @Step
    public void addMedianOrLocationPriceChart() throws Exception {
        rebnyListingsPage.addREBNYListingsAskingPriceChart();
    }

    @Step
    public void addChartFromREBNYSection() throws Exception {
        analyticsPage.rebnyListingsButtonClick();
        rebnyListingsPage.addREBNYListingsAskingPriceChart();
    }

    @Step
    public void addBedroomsChartFromREBNYListings(){
        analyticsPage.rebnyListingsButtonClick();
        rebnyListingsPage.bedroomsButtonClick();
    }

    @Step
    public void shouldSeeAskingPriceChartWithSwipe() throws Exception {
        rebnyListingsPage.shouldSeeAskingPriceChartWithSwipe();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addAskingPricePerBedChart(){
        rebnyListingsPage.askingPricePerBedButtonClick();
    }

    @Step
    public void addMedianAskingPerFTChart(){
        rebnyListingsPage.medianAskingPerFTButtonClick();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyAskingPricePerFTChart(){
        rebnyListingsPage.addAndVerifyAskingPricePerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addListingCountChart(){
        rebnyListingsPage.listingCountButtonClick();
        this.isChartDisplayed();
    }

    @Step
    public void addMedianMonthliesChart(){
        rebnyListingsPage.medianMonthliesButtonClick();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMonthliesChart(){
        rebnyListingsPage.addAndVerifyMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addMedianPropertyTaxesChart(){
        rebnyListingsPage.medianPropertyTaxesButtonClick();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeMedianAskingPricePerBedChart(){
        rebnyListingsPage.shouldSeeMedianAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeBedroomsChart(){
        rebnyListingsPage.shouldSeeBedroomsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDoormanChart(){
        rebnyListingsPage.addAndVerifyDoormanChart();
    }

    @Step
    public void addAndVerifyElevatorChart(){
        rebnyListingsPage.addAndVerifyElevatorChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyElevatorPremiumChart(){
        rebnyListingsPage.addAndVerifyElevatorPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFireplaceChart(){
        rebnyListingsPage.addAndVerifyFireplaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyWorkingFireplacePremiumChart(){
        rebnyListingsPage.addAndVerifyWorkingFireplacePremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyGarageChart(){
        rebnyListingsPage.addAndVerifyGarageChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyGaragePremiumChart(){
        rebnyListingsPage.addAndVerifyGaragePremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyGymChart(){
        rebnyListingsPage.addAndVerifyGymChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyGymPremiumChart(){
        rebnyListingsPage.addAndVerifyGymPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLaundryBuildingChart(){
        rebnyListingsPage.addAndVerifyLaundryBuildingChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLaundryBuildingPremiumChart(){
        rebnyListingsPage.addAndVerifyLaundryBuildingPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyOutdoorSpaceChart(){
        rebnyListingsPage.addAndVerifyOutdoorSpaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyOutdoorSpacePremiumChart(){
        rebnyListingsPage.addAndVerifyOutdoorSpacePremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPetsChart(){
        rebnyListingsPage.addAndVerifyPetsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPetsPremiumChart(){
        rebnyListingsPage.addAndVerifyPetsPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPoolChart(){
        rebnyListingsPage.addAndVerifyPoolChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPoolPremiumChart(){
        rebnyListingsPage.addAndVerifyPoolPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPrewarChart(){
        rebnyListingsPage.addAndVerifyPrewarChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPrewarPremiumChart(){
        rebnyListingsPage.addAndVerifyPrewarPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyWasherDryerChart(){
        rebnyListingsPage.addAndVerifyWasherDryerChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyWasherDryerPremiumChart(){
        rebnyListingsPage.addAndVerifyWasherDryerPremiumChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyBuildingTypeChart(){
        rebnyListingsPage.addAndVerifyBuildingTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void dollarPerFTByPriceSegmentButtonClick(){
        rebnyListingsPage.dollarPerFTByPriceSegmentButtonClick();
    }

    @Step
    public void isDollarPerFTByPriceSegmentChartAdd(){
        rebnyListingsPage.isDollarPerFTByPriceSegmentChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyAskingPriceByBedsChart(){
        rebnyListingsPage.addAndVerifyAskingPriceByBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyAskingPriceByPriceSegmentChart(){
        rebnyListingsPage.addAndVerifyAskingPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyAskingPriceByTypeChart(){
        rebnyListingsPage.addAndVerifyAskingPriceByTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyAskingPricePerBedChart(){
        rebnyListingsPage.addAndVerifyAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDOMByNumberBedsChart(){
        rebnyListingsPage.addAndVerifyDOMByNumberBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDOMByPriceSegmentChart(){
        rebnyListingsPage.addAndVerifyDOMByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifySquareFeetChart(){
        rebnyListingsPage.addAndVerifySquareFeetChart();
    }

    @Step
    public void shouldSeeBedroomCountChart() {
        rebnyListingsPage.shouldBedroomCountChartDisplayed();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void shouldSeeMedianOrLocationAskingPriceChart(){
        rebnyListingsPage.shouldSeeMedianOrLocationAskingPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyNewDevelopmentChart(){
        rebnyListingsPage.addAndVerifyNewDevelopmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationAskingPriceChart() throws Exception {
        rebnyListingsPage.addAndVerifyLocationAskingPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianAskingPriceChart() throws Exception {
        rebnyListingsPage.addAndVerifyMedianAskingPriceChart();
        this.isChartDisplayed();
    }
}
