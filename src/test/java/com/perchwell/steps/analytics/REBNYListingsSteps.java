package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.REBNYListingsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class REBNYListingsSteps extends ScenarioSteps {
    REBNYListingsPage rebnyListingsPage;
    AnalyticsPage analyticsPage;


    @Step
    public void shouldSeeFeaturesDoormanChart(){
        rebnyListingsPage.shouldSeeFeaturesDoormanChart();
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
    public void shouldSeeDistributionAskingPriseChart() {
        rebnyListingsPage.shouldSeeDistributionAskingPriseChart();
        this.isChartDisplayed();
    }


    @Step
    public void addBuildingHeightChartWithMKTShare() {
        analyticsPage.rebnyListingsButtonClick();
        analyticsPage.mktShareButtonClick();
        rebnyListingsPage.buildingHeightButtonClick();
    }

    @Step
    public void shouldSeeMKTShareBuildingHeightChart(){
        rebnyListingsPage.shouldSeeMKTShareBuildingHeightChart();
        this.isChartDisplayed();
    }

    @Step
    public void addMKTShareAskingPriceChart() throws Exception {
        rebnyListingsPage.addREBNYListingsAskingPriceChart();
    }

    @Step
    public void addREBNYListingsAskingPriceChart() throws Exception {
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
    public void addAndVerifyMedianAskingPerFTChart(){
        rebnyListingsPage.addAndVerifyMedianAskingPerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationAskingPerFTChart(){
        rebnyListingsPage.addAndVerifyLocationAskingPerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPricePerFTChart(){
        rebnyListingsPage.addAndVerifyDistributionAskingPricePerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationListingCountChart(){
        rebnyListingsPage.addAndVerifyLocationListingCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianMonthliesChart(){
        rebnyListingsPage.addAndVerifyMedianMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationMonthliesChart(){
        rebnyListingsPage.addAndVerifyLocationMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionMonthliesChart(){
        rebnyListingsPage.addAndVerifyDistributionMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianPropertyTaxesChart(){
        rebnyListingsPage.addAndVerifyMedianPropertyTaxesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationPropertyTaxesChart(){
        rebnyListingsPage.addAndVerifyLocationPropertyTaxesChart();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeMedianAskingPricePerBedChart(){
        rebnyListingsPage.shouldSeeMedianAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeLocationAskingPricePerBedChart(){
        rebnyListingsPage.shouldSeeLocationAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeBedroomsChart(){
        rebnyListingsPage.shouldSeeBedroomsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareDoormanChart(){
        rebnyListingsPage.addAndVerifyMKTShareDoormanChart();
    }

    @Step
    public void addAndVerifyMKTShareElevatorChart(){
        rebnyListingsPage.addAndVerifyMKTShareElevatorChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesElevatorChart(){
        rebnyListingsPage.addAndVerifyFeaturesElevatorChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareFireplaceChart(){
        rebnyListingsPage.addAndVerifyMKTShareFireplaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesWorkingFireplacChart(){
        rebnyListingsPage.addAndVerifyFeaturesWorkingFireplaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareGarageChart(){
        rebnyListingsPage.addAndVerifyMKTShareGarageChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesGarageChart(){
        rebnyListingsPage.addAndVerifyFeaturesGarageChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareGymChart(){
        rebnyListingsPage.addAndVerifyMKTShareGymChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesGymChart(){
        rebnyListingsPage.addAndVerifyFeaturesGymChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareLaundryBuildingChart(){
        rebnyListingsPage.addAndVerifyMKTShareLaundryBuildingChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesLaundryBuildingChart(){
        rebnyListingsPage.addAndVerifyFeaturesLaundryBuildingChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareOutdoorSpaceChart(){
        rebnyListingsPage.addAndVerifyMKTShareOutdoorSpaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesOutdoorSpaceChart(){
        rebnyListingsPage.addAndVerifyFeaturesOutdoorSpaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePetsChart(){
        rebnyListingsPage.addAndVerifyMKTSharePetsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPetsChart(){
        rebnyListingsPage.addAndVerifyFeaturesPetsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePoolChart(){
        rebnyListingsPage.addAndVerifyMKTSharePoolChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPoolChart(){
        rebnyListingsPage.addAndVerifyFeaturesPoolChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePrewarChart(){
        rebnyListingsPage.addAndVerifyMKTSharePrewarChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPrewarChart(){
        rebnyListingsPage.addAndVerifyFeaturesPrewarChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareWasherDryerChart(){
        rebnyListingsPage.addAndVerifyMKTShareWasherDryerChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesWasherDryerChart(){
        rebnyListingsPage.addAndVerifyFeaturesWasherDryerChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareBuildingTypeChart(){
        rebnyListingsPage.addAndVerifyMKTShareBuildingTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void dollarPerFTByPriceSegmentButtonClick(){
        rebnyListingsPage.dollarPerFTByPriceSegmentButtonClick();
    }

    @Step
    public void shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd(){
        rebnyListingsPage.shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByBedsChart(){
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByPriceSegmentChart(){
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByTypeChart(){
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPricePerBedChart(){
        rebnyListingsPage.addAndVerifyDistributionAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionDOMByNumberBedsChart(){
        rebnyListingsPage.addAndVerifyDistributionDOMByNumberBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionDOMByPriceSegmentChart(){
        rebnyListingsPage.addAndVerifyDistributionDOMByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionSquareFeetChart(){
        rebnyListingsPage.addAndVerifyDistributionSquareFeetChart();
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
    public void addAndVerifyFeaturesNewDevelopmentChart(){
        rebnyListingsPage.addAndVerifyFeaturesNewDevelopmentChart();
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

    @Step
    public void addAndVerifyMKTShareDaysOnMarketChart(){
        rebnyListingsPage.addAndVerifyMKTShareDaysOnMarketChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationDaysOnMarketChart(){
        rebnyListingsPage.addAndVerifyLocationDaysOnMarketChart();
        this.isChartDisplayed();
    }

    @Step
    public void getMKTShareAskingPriceListingsAmount() {
        rebnyListingsPage.getMKTShareAskingPriceListingsAmount();

    }

    @Step
    public void getLocationAskingPriceListingsLocations() {
        rebnyListingsPage.getLocationAskingPriceListingsLocations();
    }

    @Step
    public void checkMKTShareAskingPriceListingsAmountAfterFilterChanging() {
        rebnyListingsPage.checkMKTShareAskingPriceListingsAmountAfterFilterChanging();
    }

    @Step
    public void checkLocationAskingPriceListingsLocationsAfterFilterChanging() {
        rebnyListingsPage.checkLocationAskingPriceListingsLocationsAfterFilterChanging();
    }

    @Step
    public void checkMKTShareAskingPriceListingsAmountAfterResetFilters() {
        rebnyListingsPage.checkMKTShareAskingPriceListingsAmountAfterResetFilters();
    }

    @Step
    public void checkLocationAskingPriceListingsLocationsAfterResetFilters() {
        rebnyListingsPage.checkLocationAskingPriceListingsLocationsAfterResetFilters();
    }
}
