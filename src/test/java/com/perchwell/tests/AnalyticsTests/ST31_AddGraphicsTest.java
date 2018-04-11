package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST31_AddGraphicsTest extends SampleTest {

    @Test
    public void addGraphics() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromACRISSection();
        analyticsSteps.isDealCountByHeightAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromNYCSection();
        analyticsSteps.isGardenChartDisplayed();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromManagementSection();
        analyticsSteps.isDaysOnMarketAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.addTwoCharts();
        analyticsSteps.addButtonClick();
        analyticsSteps.isMessageMaximumSixChartsDisplayed();
    }
}
