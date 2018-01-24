package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Ignore;
import org.junit.Test;

public class AddGraphicsTest extends SampleTest {
@Ignore
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
