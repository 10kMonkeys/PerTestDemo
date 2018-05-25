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
    public void addBuildingTypeByDealCountChartFromACRISClosing(){
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
    public void addBuildingTypeByDealCountChart(){
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
    public void shouldSeeBuildingHeightChartWithSwipe() {
        acrisClosingPage.shouldBuildingHeightChartDisplayedWithSwipe();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void shouldBuildingTypeChartDisplayed() {
        acrisClosingPage.shouldBuildingTypeByDealCountDisplayed();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addAndVerifyPriceByDealCountChart(){
        acrisClosingPage.addAndVerifyPriceByDealCountChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDollarPerFTPercentilesChart(){
        acrisClosingPage.addDollarPerFTPercentilesChart();
    }

    @Step
    public void shouldSeeDollarPerFTPercentiles(){
        acrisClosingPage.shouldSeeDollarPerFTPercentiles();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPricePercentilesChart(){
        acrisClosingPage.addAndVerifyPricePercentilesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceByPriceSegmentChart(){
        acrisClosingPage.addAndVerifyPriceByPriceSegmentChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifySquareFeetPercentiles(){
        acrisClosingPage.addAndVerifySquareFeetPercentiles();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceByTypeChart(){
        acrisClosingPage.addAndVerifyPriceByTypeChart();
        this.isChartDisplayed();
    }

    @Step
    public void addDealCountChart() {
        acrisClosingPage.addDealCountChart();
    }

    @Step
    public void shouldSeeDealCountChart() {
        acrisClosingPage.shouldSeeDealCount();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyPriceChart() {
        acrisClosingPage.addAndVerifyPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianPricePerFT2Chart() {
        acrisClosingPage.addAndVerifyMedianPricePerFT2Chart();
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
}

