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
    public void selectNYTownhousesWithMKTShare() {
        analyticsPage.addButtonClick();
        analyticsPage.nycTownhousesButtonClick();
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
}
