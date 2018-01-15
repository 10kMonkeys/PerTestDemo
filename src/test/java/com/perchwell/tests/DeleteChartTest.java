package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class DeleteChartTest extends SampleTest {

    @Test
    public void deleteChart() throws Exception {
        loginSteps.loginAsBroker();
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
