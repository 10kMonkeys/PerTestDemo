package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.ManagementPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ManagementSteps extends ScenarioSteps {
    ManagementPage managementPage;
    AnalyticsPage analyticsPage;

    @Step
    public void addChartFromManagementSection() {
        analyticsPage.managementButtonClick();
        managementPage.daysOnMarketButtonClick();
    }

    @Step
    public void addChartBedroomsFromManagementSection(){
        analyticsPage.managementButtonClick();
        managementPage.bedroomsButtonClick();
    }

    @Step
    public void selectFirmListingCountChart(){
        managementPage.firmListingCountButtonClick();
    }

    @Step
    public void isFirmListingCountChartDisplayed(){
        managementPage.isFirmListingCountChartDisplayed();
        this.isChartDisplayed();
    }

    public void isChartDisplayed() {
        analyticsPage.isChartDisplayed();
    }

    private void isChartWithApplyingFiltersDisplayed() {
        analyticsPage.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void askingPriceChartClick() {
        managementPage.askingPriceButtonClick();
    }

    @Step
    public void isAskingPriseChartAdd() {
        managementPage.isAskingPriseChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void isDaysOnMarketChartAdd() {
        managementPage.isDaysOnMarketChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void shouldSeeDaysOnMarketChartWithSwipe() throws Exception {
        managementPage.shouldDaysOnMarketDisplayedWithSwipe();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addMKTShareAskingPriceChart() throws Exception {
        managementPage.addMKTShareAskingPriceChart();
    }

    @Step
    public void shouldSeeMKTShareAskingPriceChart() {
        managementPage.shouldSeeMKTShareAskingPriceChart();
        this.isChartDisplayed();
    }


    @Step
    public void addAndVerifyDistributionFirmListingCountChart() throws Exception {
        managementPage.addAndVerifyDistributionFirmListingCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareBedroomsChart() throws Exception {
        managementPage.addAndVerifyMKTShareBedroomsChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareBuildingHeightChart() throws Exception{
        managementPage.addAndVerifyMKTShareBuildingHeightChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception{
        managementPage.addAndVerifyMKTShareBuildingTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception{
        managementPage.addAndVerifyMKTShareDaysOnMarketChart();
        this.isChartDisplayed();
    }

    @Step
    public void agentsListingCountButtonClick(){
        managementPage.agentsListingCountButtonClick();
    }

    @Step
    public void shouldSeeDistributionAgentsListingCountChart(){
        managementPage.shouldSeeDistributionAgentsListingCountChart();
    }

    @Step
    public void addAndVerifyDistributionAgentMedianPriceChart() throws Exception {
        managementPage.addAndVerifyDistributionAgentMedianPriceChart();
    }

    @Step
    public void addAndVerifyDistributionFirmDOMChart() throws Exception {
        managementPage.addAndVerifyDistributionFirmDOMChart();
    }

    @Step
    public void addAndVerifyDistributionFirmListingVolumeChart() throws Exception {
        managementPage.addAndVerifyDistributionFirmListingVolumeChart();
    }

    @Step
    public void addAndVerifyDistributionFirmMedianDollarPerSQFTChart() throws Exception {
        managementPage.addAndVerifyDistributionFirmMedianDollarPerSQFTChart();
    }

    @Step
    public void addAndVerifyDistributionFirmMedianPriceChart() throws Exception {
        managementPage.addAndVerifyDistributionFirmMedianPriceChart();
    }

    @Step
    public void addMKTShareBuildingTypeChart() throws Exception {
        managementPage.addMKTShareBuildingTypeChart();
    }
}
