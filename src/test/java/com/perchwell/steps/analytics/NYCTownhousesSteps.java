package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.NYCTownhousesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NYCTownhousesSteps extends ScenarioSteps {

    NYCTownhousesPage nycTownhousesPage;
    AnalyticsPage analyticsPage;

    @Step
    public void selectGardenChart(){
        nycTownhousesPage.selectGardenChart();
    }

    @Step
    public void inHistoryDistClick(){
        nycTownhousesPage.inDHistoryDistButtonClick();
    }

    @Step
    public void isHistoryDistChartDisplayed(){
        nycTownhousesPage.isHistoryDistChartAdd();
        this.isChartDisplayed();
    }

    @Step
    public void isGardenPremiumChartDisplayed(){
        nycTownhousesPage.isGardenPremiumChartDisplayed();
        this.isChartDisplayed();
    }

    @Step
    public void addChartFromNYCSection() throws Exception {
        analyticsPage.nycTownhousesButtonClick();
        nycTownhousesPage.addREBNYTownhouseListingsHasGardenChart();
    }

    private void isChartDisplayed() {
        analyticsPage.isChartDisplayed();
    }

    private void isChartWithApplyingFiltersDisplayed() {
        analyticsPage.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void isGardenChartDisplayed() {
        nycTownhousesPage.shouldGardenChartDisplayed();
        this.isChartWithApplyingFiltersDisplayed();
    }

    @Step
    public void addREBNYTownhouseListingsHasGardenChart() throws Exception {
        nycTownhousesPage.addREBNYTownhouseListingsHasGardenChart();
    }

    @Step
    public void shouldSeeREBNYTownhouseListingsHasGardenChart() {
        nycTownhousesPage.shouldSeeREBNYTownhouseListingsHasGardenChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTownhouseListingsInHistoricDistChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTownhouseListingsInHistoricDistChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTownhouseListingsSquareFeetChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTownhouseListingsSquareFeetChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTownhouseListingsWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTownhouseListingsWidthChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTownhouseListingsYearLastAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTownhouseListingsYearLastAlteredChart();
        this.isChartDisplayed();
    }

    @Step
    public void addACRISTownhouseClosingHasGardenChart() throws Exception {
        nycTownhousesPage.addACRISTownhouseClosingHasGardenChart();
    }

    @Step
    public void shouldSeeACRISTownhouseClosingHasGardenChart() {
        nycTownhousesPage.shouldSeeACRISTownhouseClosingHasGardenChart();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingInHistoricDistChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingInHistoricDistChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingSquareFeetChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingSquareFeetChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingWidthChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingDealCountByPriceChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingDealCountByPriceChart();
        this.isChartDisplayed();
    }

    @Step
    public void addMKTShareREBNYTHListingsInHistoricDistChart() throws Exception {
        nycTownhousesPage.addMKTShareREBNYTHListingsInHistoricDistChart();
    }

    @Step
    public void shouldSeeMKTShareREBNYTHListingsInHistoricDistChart() {
        nycTownhousesPage.shouldSeeMKTShareREBNYTHListingsInHistoricDistChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesACRISTHClosingsGardenChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsGardenChart();
        this.isChartDisplayed();
    }

    @Step
    public void addAndVerifyLocationTotalTHStockNumberTownhousesChart() throws Exception {
        nycTownhousesPage.addAndVerifyLocationTotalTHStockNumberTownhousesChart();
        this.isChartDisplayed();
    }

    @Step
    public void addTotalTHStockHasGardenChart() throws Exception {
        nycTownhousesPage.addTotalTHStockHasGardenChart();

    }

    @Step
    public void shouldSeeTotalTHStockHasGardenChart() {
        nycTownhousesPage.shouldSeeTotalTHStockHasGardenChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockInHistoricDistChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockInHistoricDistChart();
    }

    @Step
    public void addAndVerifyTotalTHStockSquareFeetChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockSquareFeetChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockYearLastAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockYearLastAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void distributionButtonClick() {
        analyticsPage.distributionButtonClick();
    }

    @Step
    public void addREBNYTHListingsNumListingByFT2Chart() throws Exception {
        nycTownhousesPage.addREBNYTHListingsNumListingByFT2Chart();
    }

    @Step
    public void shouldSeeREBNYTHListingsNumListingByFT2Chart() {
        nycTownhousesPage.shouldSeeREBNYTHListingsNumListingByFT2Chart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTHListingsNumListingsByWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTHListingsNumListingsByWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingNumSalesByFT2Chart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingNumSalesByFT2Chart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISTownhouseClosingNumSalesByWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISTownhouseClosingNumSalesByWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockNumHousesByFT2Chart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockNumHousesByFT2Chart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockNumHousesByWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockNumHousesByWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addREBNYTHListingsDOMByPriceChart() throws Exception {
        nycTownhousesPage.addREBNYTHListingsDOMByPriceChart();
    }

    @Step
    public void shouldSeeREBNYTHListingsDOMByPriceChart() {
        nycTownhousesPage.shouldSeeREBNYTHListingsDOMByPriceChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addREBNYTHListingsNumListingsChart() throws Exception {
        nycTownhousesPage.addREBNYTHListingsNumListingsChart();
    }

    @Step
    public void shouldSeeREBNYTHListingsNumListingsChart() {
        nycTownhousesPage.shouldSeeREBNYTHListingsNumListingsChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTHListingsNumRecentlyAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTHListingsNumRecentlyAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTHListingsAskingDollarsPerFT2Chart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTHListingsAskingDollarsPerFT2Chart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTHListingsAskingPriceChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTHListingsAskingPriceChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyREBNYTHListingsMedianWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyREBNYTHListingsMedianWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addACRISClosingNumSalesChart() throws Exception {
        nycTownhousesPage.addACRISClosingNumSalesChart();
    }

    @Step
    public void shouldSeeACRISClosingNumSalesChart() {
        nycTownhousesPage.shouldSeeACRISClosingNumSalesChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISClosingNumSalesOfRecentlyAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISClosingNumSalesOfRecentlyAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISClosingMedianWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISClosingMedianWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISClosingPriceChart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISClosingPriceChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyACRISClosingPricePerFT2Chart() throws Exception {
        nycTownhousesPage.addAndVerifyACRISClosingPricePerFT2Chart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addTotalTHStockNumRecentlyAlteredChart() throws Exception {
        nycTownhousesPage.addTotalTHStockNumRecentlyAlteredChart();
    }

    @Step
    public void shouldSeeTotalTHStockNumRecentlyAlteredChart() {
        nycTownhousesPage.shouldSeeTotalTHStockNumRecentlyAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockNumTownhousesChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockNumTownhousesChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyTotalTHStockMedianWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyTotalTHStockMedianWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addMedianREBNYTHListingsSquareFeetChart() throws Exception {
        nycTownhousesPage.addMedianREBNYTHListingsSquareFeetChart();
    }

    @Step
    public void shouldSeeMedianREBNYTHListingsSquareFeetChart() throws Exception {
        nycTownhousesPage.shouldSeeMedianREBNYTHListingsSquareFeetChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianREBNYTHListingsWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyMedianREBNYTHListingsWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianACRISTHClosingSquareFeetChart() throws Exception {
        nycTownhousesPage.addAndVerifyMedianACRISTHClosingSquareFeetChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianACRISTHClosingWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyMedianACRISTHClosingWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianTotalTHStockSquareFeetChart() throws Exception {
        nycTownhousesPage.addAndVerifyMedianTotalTHStockSquareFeetChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyMedianTotalTHStockWidthChart() throws Exception {
        nycTownhousesPage.addAndVerifyMedianTotalTHStockWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addFeaturesREBNYTHListingsTwentyFourPlusWidthChart() throws Exception {
        nycTownhousesPage.addFeaturesREBNYTHListingsTwentyFourPlusWidthChart();
    }

    @Step
    public void shouldSeeFeaturesREBNYTHListingsTwentyFourPlusWidthChart() {
        nycTownhousesPage.shouldSeeFeaturesREBNYTHListingsTwentyFourPlusWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesREBNYTHListingsGardenChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsGardenChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesREBNYTHListingsHistoricDistChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsHistoricDistChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesREBNYTHListingsLandmarkChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsLandmarkChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesREBNYTHListingsRecentlyAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsRecentlyAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addFeaturesACRISClosingTwentyFourPlusWidthChart() throws Exception {
        nycTownhousesPage.addFeaturesACRISClosingTwentyFourPlusWidthChart();
    }

    @Step
    public void shouldFeaturesACRISClosingTwentyFourPlusWidthChart() {
        nycTownhousesPage.shouldFeaturesACRISClosingTwentyFourPlusWidthChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesACRISTHClosingsHistoricDistChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsHistoricDistChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addAndVerifyFeaturesACRISTHClosingsRecentlyAlteredChart() throws Exception {
        nycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsRecentlyAlteredChart();
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void addMKTShareACRISClosingDealCountByPriceChart() throws Exception {
        nycTownhousesPage.addMKTShareACRISClosingDealCountByPriceChart();
    }

    @Step
    public void addDistributionREBNYListingsDOMByPriceChart() throws Exception {
        nycTownhousesPage.addDistributionREBNYListingsDOMByPriceChart();
    }

    @Step
    public void addREBNYListingsSquareFeetChart() throws Exception {
        nycTownhousesPage.addREBNYListingsSquareFeetChart();
    }

    @Step
    public void addACRISClosingsSquareFeetChart() throws Exception {
        nycTownhousesPage.addACRISClosingsSquareFeetChart();
    }

    @Step
    public void addStockSquareFeetChart() throws Exception {
        nycTownhousesPage.addStockSquareFeetChart();
    }

    @Step
    public void addREBNYListingsBySQFTChar() throws Exception {
        nycTownhousesPage.addREBNYListingsBySQFTChar();
    }

    @Step
    public void addACRISClosingsBySQFTChart() throws Exception {
        nycTownhousesPage.addACRISClosingsBySQFTChart();
    }

    @Step
    public void addStockBySQFTChart() throws Exception {
        nycTownhousesPage.addStockBySQFTChart();
    }
}
