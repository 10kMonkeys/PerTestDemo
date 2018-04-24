package com.perchwell.steps.analytics;

import com.perchwell.pages.analytics.AnalyticsPage;
import com.perchwell.pages.analytics.ManagementPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

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

    public void isChartDisplayed(){
        analyticsPage.isChartDisplayed();
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
        this.isChartDisplayed();
    }
}
