package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.ACRISClosingPage;
import com.perchwell.pages.analytics.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ACRISClosingSteps extends ScenarioSteps {

    ACRISClosingPage acrisClosingPage;
    AnalyticsPage analyticsPage;

    @Step
    public void addBuildingTypeByDealCountChartFromACRISClosing() throws Exception {
        analyticsPage.acrisClosingsButtonClick();
        acrisClosingPage.buildingTypeByDealCountButtonClick();
    }

    @Step
    public void dealVolumeAnnualButtonClick(){
        acrisClosingPage.dealVolumeAnnualButtonClick();
    }

    @Step
    public void dealVolumeQuarterlyButtonClick(){
        acrisClosingPage.dealVolumeQuarterlyButtonClick();
    }

    @Step
    public void addChartFromACRISSection() {
        analyticsPage.acrisClosingsButtonClick();
        acrisClosingPage.dealCountByHeightButtonClick();
    }

    @Step
    public void addBuildingTypeByDealCountChart() throws Exception {
        acrisClosingPage.buildingTypeByDealCountButtonClick();
    }

    @Step
    public void isDealCountByHeightAdd() {
        acrisClosingPage.isDealCountByHeightChartAdd();
        this.isChartDisplayed();
    }

    private void isChartDisplayed() {
        analyticsPage.isChartDisplayed();
    }

    private void isChartWithApplyingFiltersDisplayed() {
        analyticsPage.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void isDealCountByTypeDeleted() {
        Assert.assertFalse(acrisClosingPage.isDealCountByTypeDisplayed());
    }

    @Step
    public void shouldSeeBuildingHeightChartWithSwipe() throws Exception {
        acrisClosingPage.shouldBuildingHeightChartDisplayedWithSwipe();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void shouldSeeMKTShareBuildingTypeByDealCountChart() {
        acrisClosingPage.shouldSeeMKTShareBuildingTypeByDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMKTSharePriceByDealCountChart() throws Exception {
        acrisClosingPage.addAndVerifyMKTSharePriceByDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDollarPerFTByPriceSegmentChart(){
        acrisClosingPage.addDollarPerFTByPriceSegmentChart();
    }

    @Step
    public void shouldSeeDistributionDollarPerFTByPriceSegmentChart(){
        acrisClosingPage.shouldSeeDistributionDollarPerFTByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionPricePercentilesChart() throws Exception {
        acrisClosingPage.addAndVerifyDistributionPricePercentilesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionPriceByPriceSegmentChart() throws Exception {
        acrisClosingPage.addAndVerifyDistributionPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionSquareFeetPercentilesChart() throws Exception {
        acrisClosingPage.addAndVerifyDistributionSquareFeetPercentilesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionPriceByTypeChart() throws Exception {
        acrisClosingPage.addAndVerifyDistributionPriceByTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDealCountChart() {
        acrisClosingPage.addDealCountChart();
    }

    @Step
    public void shouldSeeLocationDealCountChart() {
        acrisClosingPage.shouldSeeLocationDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationPriceChart() throws Exception {
        acrisClosingPage.addAndVerifyLocationPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianPricePerFT2Chart() throws Exception {
        acrisClosingPage.addAndVerifyMedianPricePerFT2Chart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationPricePerFT2Chart() throws Exception {
        acrisClosingPage.addAndVerifyLocationPricePerFT2Chart();
        this.isChartDisplayed();
    }

    @Step
    public void addPriceChart() {
        acrisClosingPage.addPriceChart();
    }

    @Step
    public void shouldSeeMedianPriceChart() {
        acrisClosingPage.shouldSeeMedianPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDealCountAnnualChart() throws Exception {
        acrisClosingPage.addDealCountAnnualChart();
    }

    @Step
    public void shouldSeeDealCountAnnualChart() {
        acrisClosingPage.shouldSeeDealCountAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDealCountQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyDealCountQuarterlyChart();
        this.isChartDisplayed();
    }

    public void addAndVerifyDealVolumeAnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyDealVolumeAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDealVolumeQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyDealVolumeQuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceAnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyPriceAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyPriceQuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPricePerFT2AnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyPricePerFT2AnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPricePerFT2QuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyPricePerFT2QuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTDealVolumeAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTPriceAnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTPriceAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTPriceQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTPriceQuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTPricePerFT2AnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTPricePerFT2AnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTPricePerFT2QuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTUnitSizeAnnualChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTUnitSizeAnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTopTenPerMKTUnitSizeQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyTopTenPerMKTUnitSizeQuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addPricePerFT2AnnualChart() throws Exception {
        acrisClosingPage.addPricePerFT2AnnualChart();
    }

    @Step
    public void shouldSeePricePerFT2AnnualChart() {
        acrisClosingPage.shouldSeePricePerFT2AnnualChart();
        this.isChartDisplayed();
    }

    @Step
    public void addTopTenPerMKTPricePerFT2QuarterlyChart() throws Exception {
        acrisClosingPage.addTopTenPerMKTPricePerFT2QuarterlyChart();
    }

    @Step
    public void shouldSeeTopTenPerMKTPricePerFT2QuarterlyChart() {
        acrisClosingPage.shouldSeeTopTenPerMKTPricePerFT2QuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void isBuildingTypeByDealCountChartDisplayed() {
        acrisClosingPage.shouldSeeMKTShareBuildingTypeByDealCountChart();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addMKTShareBuildingHeightByDealCountChart() throws Exception {
        acrisClosingPage.addMKTShareBuildingHeightByDealCountChart();
    }

    @Step
    public void shouldSeeMKTShareBuildingHeightByDealCountChart() {
        acrisClosingPage.shouldSeeMKTShareBuildingHeightByDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyDistributionDollarFT2PercentilesChart() throws Exception {
        acrisClosingPage.addAndVerifyDistributionDollarFT2PercentilesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        acrisClosingPage.addAndVerifyTrendsTopTenPerMKTDealVolumeQuarterlyChart();
        this.isChartDisplayed();
    }

    @Step
    public void addMKTSharePriceByDealCountChart() throws Exception {
        acrisClosingPage.addMKTSharePriceByDealCountChart();
    }

    @Step
    public void addDistributionDollarFT2ByPriceSegmentChart() throws Exception {
        acrisClosingPage.addDistributionDollarFT2ByPriceSegmentChart();
    }

    @Step
    public void addDistributionPriceByPriceSegmentChart() throws Exception {
        acrisClosingPage.addDistributionPriceByPriceSegmentChart();
    }

    @Step
    public void addACRISClosingBuildingTypeByDealCountChart() throws Exception {
        acrisClosingPage.buildingTypeByDealCountButtonClick();
    }

    @Step
    public void addDistributionPriceByTypeChart() throws Exception {
        acrisClosingPage.addDistributionPriceByTypeChart();
    }

    @Step
    public void addATrendsDealCountQuarterlyChart() throws Exception {
        acrisClosingPage.addATrendsDealCountQuarterlyChart();
    }

    @Step
    public void addTrendsDealVolumeAnnualChart() throws Exception {
        acrisClosingPage.addTrendsDealVolumeAnnualChart();
    }

    @Step
    public void addTrendsTopTenPerMKTDealVolumeAnnualChart() throws Exception {
        acrisClosingPage.addTrendsTopTenPerMKTDealVolumeAnnualChart();
    }

    @Step
    public void addTrendsDealVolumeQuarterlyChart() throws Exception {
        acrisClosingPage.addTrendsDealVolumeQuarterlyChart();
    }

    @Step
    public void addTrendsTopTenPerMKTDealVolumeQuarterlyChart() throws Exception {
        acrisClosingPage.addTrendsTopTenPerMKTDealVolumeQuarterlyChart();
    }
}

