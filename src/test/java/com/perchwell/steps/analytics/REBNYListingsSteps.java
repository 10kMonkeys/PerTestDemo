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
    public void addMKTShareDoormanChart() throws Exception {
        rebnyListingsPage.addDoormanChart();
    }

    private void isChartDisplayed() {
        analyticsPage.isChartDisplayed();
    }

    private void isChartWithApplyingFiltersDisplayed() {
        analyticsPage.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addMKTShareBedroomsChart(){
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
    public void addBuildingHeightChartWithMKTShare() throws Exception {
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
    public void addDistributionAskingPricePerBedChart() throws Exception {
        rebnyListingsPage.addDistributionAskingPricePerBedChart();
    }

    @Step
    public void addAndVerifyMedianAskingPerFTChart() throws Exception {
        rebnyListingsPage.addAndVerifyMedianAskingPerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationAskingPerFTChart() throws Exception {
        rebnyListingsPage.addAndVerifyLocationAskingPerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPricePerFTChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionAskingPricePerFTChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationListingCountChart() throws Exception {
        rebnyListingsPage.addAndVerifyLocationListingCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianMonthliesChart() throws Exception {
        rebnyListingsPage.addAndVerifyMedianMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationMonthliesChart() throws Exception {
        rebnyListingsPage.addAndVerifyLocationMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionMonthliesChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionMonthliesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianPropertyTaxesChart() throws Exception {
        rebnyListingsPage.addAndVerifyMedianPropertyTaxesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationPropertyTaxesChart() throws Exception {
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
    public void addAndVerifyMKTShareDoormanChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareDoormanChart();
    }

    @Step
    public void addAndVerifyMKTShareElevatorChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareElevatorChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesElevatorChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesElevatorChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareFireplaceChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareFireplaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesWorkingFireplaceChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesWorkingFireplaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareGarageChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareGarageChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesGarageChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesGarageChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareGymChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareGymChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesGymChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesGymChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareLaundryBuildingChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareLaundryBuildingChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesLaundryBuildingChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesLaundryBuildingChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareOutdoorSpaceChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareOutdoorSpaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesOutdoorSpaceChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesOutdoorSpaceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePetsChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTSharePetsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPetsChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesPetsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePoolChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTSharePoolChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPoolChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesPoolChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePrewarChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTSharePrewarChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesPrewarChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesPrewarChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareWasherDryerChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareWasherDryerChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesWasherDryerChart() throws Exception {
        rebnyListingsPage.addAndVerifyFeaturesWasherDryerChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareBuildingTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void dollarPerFTByPriceSegmentButtonClick() throws Exception {
        rebnyListingsPage.dollarPerFTByPriceSegmentButtonClick();
    }

    @Step
    public void shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd(){
        rebnyListingsPage.shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByBedsChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByPriceSegmentChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPriceByTypeChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionAskingPriceByTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionAskingPricePerBedChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionAskingPricePerBedChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionDOMByNumberBedsChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionDOMByNumberBedsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionDOMByPriceSegmentChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionDOMByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionSquareFeetChart() throws Exception {
        rebnyListingsPage.addAndVerifyDistributionSquareFeetChart();
    }

    @Step
    public void shouldSeeBedroomCountChart() throws Exception {
        rebnyListingsPage.shouldBedroomCountChartDisplayed();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void shouldSeeMedianOrLocationAskingPriceChart(){
        rebnyListingsPage.shouldSeeMedianOrLocationAskingPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesNewDevelopmentChart() throws Exception {
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
    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception {
        rebnyListingsPage.addAndVerifyMKTShareDaysOnMarketChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationDaysOnMarketChart() throws Exception {
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

    @Step
    public void rebnyMKTShareAskingPriceChartTitle() {
        rebnyListingsPage.rebnyMKTShareAskingPriceChartTitle();
    }

    @Step
    public void addDistributionAskingPriceByPriceSegmentChart() throws Exception {
        rebnyListingsPage.addDistributionAskingPriceByPriceSegmentChart();
    }

    @Step
    public void addDistributionDOMByPriceSegmentChart() throws Exception {
        rebnyListingsPage.addDistributionDOMByPriceSegmentChart();
    }

    @Step
    public void addMKTShareBuildingTypeChart() throws Exception {
        rebnyListingsPage.addMKTShareBuildingTypeChart();
    }

    @Step
    public void addDistributionAskingPriceByTypeChart() throws Exception {
        rebnyListingsPage.addDistributionAskingPriceByTypeChart();
    }

    @Step
    public void addMKTShareOutdoorSpaceChart() throws Exception {
        rebnyListingsPage.addOutdoorSpaceChart();
    }

    @Step
    public void addFeaturesOutdoorSpaceChart() throws Exception {
        rebnyListingsPage.addOutdoorSpaceChart();
    }

    @Step
    public void addMKTSharePrewarSpaceChart() throws Exception {
        rebnyListingsPage.addPrewarSpaceChart();
    }

    @Step
    public void addFeaturesPrewarChart() throws Exception {
        rebnyListingsPage.addPrewarSpaceChart();
    }

    @Step
    public void addDistributionDOMByNumberBedsChart() {
        rebnyListingsPage.addDistributionDOMByNumberBedsChart();
    }

    @Step
    public void addMKTShareElevatorChart() throws Exception {
        rebnyListingsPage.addElevatorChart();
    }

    @Step
    public void addFeaturesElevatorChart() throws Exception {
        rebnyListingsPage.addElevatorChart();
    }

    @Step
    public void addMKTShareParkingChart() throws Exception {
        rebnyListingsPage.addParkingChart();
    }

    @Step
    public void addFeaturesParkingChart() throws Exception {
        rebnyListingsPage.addParkingChart();
    }

    @Step
    public void addMKTShareGymChart() throws Exception {
        rebnyListingsPage.addGymChart();
    }

    @Step
    public void addFeaturesGymChart() throws Exception {
        rebnyListingsPage.addGymChart();
    }

    @Step
    public void addMKTShareLaundryBuildingChart() throws Exception {
        rebnyListingsPage.addLaundryBuildingChart();
    }

    @Step
    public void addFeaturesLaundryBuildingChart() throws Exception {
        rebnyListingsPage.addLaundryBuildingChart();
    }

    @Step
    public void addMKTSHarePetsChart() throws Exception {
        rebnyListingsPage.addPetsChart();
    }

    @Step
    public void addFeaturesPetsChart() throws Exception {
        rebnyListingsPage.addPetsChart();
    }

    @Step
    public void addMKTSharePoolChart() throws Exception {
        rebnyListingsPage.addPoolChart();
    }

    @Step
    public void addFeaturesPoolChart() throws Exception {
        rebnyListingsPage.addPoolChart();
    }

    @Step
    public void addMKTShareFireplaceChart() throws Exception {
        rebnyListingsPage.addFireplaceChart();
    }

    @Step
    public void addFeaturesFireplaceChart() throws Exception {
        rebnyListingsPage.addFireplaceChart();
    }

    @Step
    public void addFeaturesDoormanChart() throws Exception {
        rebnyListingsPage.addDoormanChart();
    }
}
