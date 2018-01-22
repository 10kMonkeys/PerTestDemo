package com.perchwell.steps;

import com.perchwell.pages.perchwell.AnalyticsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AnalyticsSteps extends ScenarioSteps {
    AnalyticsPage onPage;

    @Step
    public void holdCharts(){
        onPage.holdCharts();
    }

    @Step
    public void deleteChart(){
        onPage.deleteChart();
    }

    @Step
    public void isAddIconDisplayed(){
        Assert.assertTrue(onPage.isAddIconDisplayed());
    }

    @Step
    public void addChartFromREBNYSection(){
        onPage.addChartFromREBNYSection();
    }

    @Step
    public void addButtonClick(){
        onPage.addButtonClick();
    }

    @Step
    public void addChartFromACRISSection(){
        onPage.addChartFromACRISSection();
    }

    @Step
    public void addChartFromNYCSection(){
        onPage.addChartFromNYCSection();
    }

    @Step
    public void addChartFromManagementSection(){
        onPage.addChartFromManagementSection();
    }

    @Step
    public void addTwoCharts(){
        onPage.addTwoCharts();
    }

    @Step
    public void skipHints(){
        onPage.skipHints();
    }

    @Step
    public void isMessageMaximumSixChartsDisplayed(){
        Assert.assertTrue(onPage.isMessageMaximumSixChartsDisplayed());
    }

    @Step
    public void isAskingPriseChartAdd(){
        Assert.assertTrue(onPage.isAskingPriseChartAdd());
    }

    @Step
    public void isBuildingHeightCartAdd(){
        Assert.assertTrue(onPage.isBuildingHeightCartAdd());
    }

    @Step
    public void isDomByPriceCartAdd(){
        Assert.assertTrue(onPage.isDomByPriceCartAdd());
    }

    @Step
    public void isDaysOnMarketAdd(){
        Assert.assertTrue(onPage.isDaysOnMarketAdd());
    }

    @Step
    public void okButtonClick(){
        onPage.okButtonClick();
    }

    @Step
    public void doneMovingCharts(){
        onPage.doneMovingChartsButtonClick();
    }

    @Step
    public void isDealCountByTypeDeleted(){
        Assert.assertFalse(onPage.isDealCountByTypeDisplayed());
    }

    @Step
    public void addAskingPriceChartWithMKTShare(){
        onPage.addAskingPriceChartWithMKTShare();
    }

    @Step
    public void isThisIsAProOnlyFeatureMessageShow(){
        onPage.isThisIsAProOnlyFeatureMessageShow();
    }

    @Step
    public void addBuildingHeightChartWithMKTShare(){
        onPage.addBuildingHeightChartWithMKTShare();
    }

    @Step
    public void askingPriceChartClick(){
        onPage.askingPriceChartClick();
    }

    @Step
    public void upToOneMillionButtonClick(){
        onPage.upToOneMillionButtonClick();
    }

    @Step
    public void selectFirstBuildingInList(){
        onPage.selectFirstBuildingInList();
    }
}
