package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST32_DeleteChartTest extends SampleTest {

    @Test
    public void deleteChart() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromACRISSection();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromNYCSection();
        analyticsSteps.addButtonClick();
        analyticsSteps.addChartFromManagementSection();
        analyticsSteps.addButtonClick();
        analyticsSteps.addTwoCharts();
        analyticsSteps.addButtonClick();
        analyticsSteps.isMessageMaximumSixChartsDisplayed();
        analyticsSteps.okButtonClick();
        analyticsSteps.holdCharts();
        analyticsSteps.deleteChart();
        analyticsSteps.doneMovingCharts();
        analyticsSteps.isAddIconDisplayed();
        analyticsSteps.isDealCountByTypeDeleted();
    }
}
