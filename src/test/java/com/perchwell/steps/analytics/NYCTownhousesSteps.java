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
    public void addChartFromNYCSection() {
        analyticsPage.nycTownhousesButtonClick();
        nycTownhousesPage.hasGardenButtonClick();
    }

    private void isChartDisplayed(){
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void isGardenChartDisplayed() {
        nycTownhousesPage.shouldGardenChartDisplayed();
        this.isChartDisplayed();
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
}
