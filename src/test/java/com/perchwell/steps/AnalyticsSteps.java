package com.perchwell.steps;

import com.perchwell.pages.perchwell.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
    AnalyticsPage analyticsPage;
    @Step
    public void addSixCharts(){
        analyticsPage.addSixCharts();
    }

    @Step
    public void holdCharts(){
        analyticsPage.holdCharts();
    }

    @Step
    public void deleteChart(){
        analyticsPage.deleteChart();
    }

    @Step
    public void isAddIconDisplayed(){
        Assert.assertTrue(analyticsPage.isAddIconDisplayed());
    }

    @Step
    public void addChartFromREBNYSection(){
        analyticsPage.addChartFromREBNYSection();
    }

    @Step
    public void addButtonClick(){
        analyticsPage.addButtonClick();
    }

    @Step
    public void addChartFromACRISSection(){
        analyticsPage.addChartFromACRISSection();
    }

    @Step
    public void addChartFromNYCSection(){
        analyticsPage.addChartFromNYCSection();
    }

    @Step
    public void addChartFromManagementSection(){
        analyticsPage.addChartFromManagementSection();
    }

    @Step
    public void addTwoCharts(){
        analyticsPage.addTwoCharts();
    }

    @Step
    public void skipHints(){
        analyticsPage.skipHints();
    }

    @Step
    public void isMessageMaximumSixChartsDisplayed(){
        Assert.assertTrue(analyticsPage.isMessageMaximumSixChartsDisplayed());
    }

    @Step
    public void isAskingPriseChartAdd(){
        Assert.assertTrue(analyticsPage.isAskingPriseChartAdd());
    }

    @Step
    public void isBuildingHeightCartAdd(){
        Assert.assertTrue(analyticsPage.isBuildingHeightCartAdd());
    }

    @Step
    public void isDomByPriceCartAdd(){
        Assert.assertTrue(analyticsPage.isDomByPriceCartAdd());
    }

    @Step
    public void isDaysOnMarketAdd(){
        Assert.assertTrue(analyticsPage.isDaysOnMarketAdd());
    }

    @Step
    public void okButtonClick(){
        analyticsPage.okButtonClick();
    }

    @Step
    public void doneMovingCharts(){
        analyticsPage.doneMovingChartsButtonClick();
    }

    @Step
    public void isDealCountByTypeDeleted(){
        Assert.assertFalse(analyticsPage.isDealCountByTypeDisplayed());
    }

}
