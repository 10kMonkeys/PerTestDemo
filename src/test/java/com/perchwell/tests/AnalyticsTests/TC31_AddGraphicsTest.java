package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC31_AddGraphicsTest extends SampleTest {

    @Test
    public void addGraphics() throws Exception {
        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromACRISSection();
        analyticsSteps.isBuildingHeightCartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromNYCSection();
        analyticsSteps.isDomByPriceCartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromManagementSection();
        analyticsSteps.isDaysOnMarketAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addTwoCharts();
        analyticsSteps.addButtonClick();
        analyticsSteps.isMessageMaximumSixChartsDisplayed();
    }
}
