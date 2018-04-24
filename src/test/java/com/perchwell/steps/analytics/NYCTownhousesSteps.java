package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.NYCTownhousesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

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
        analyticsPage.nycTownHousesButtonClick();
        nycTownhousesPage.hasGardenButtonClick();
    }

    public void isChartDisplayed(){
        analyticsPage.isChartDisplayed();
    }

    @Step
    public void isGardenChartDisplayed() {
        nycTownhousesPage.shouldGardenChartDisplayed();
        this.isChartDisplayed();
    }
}
