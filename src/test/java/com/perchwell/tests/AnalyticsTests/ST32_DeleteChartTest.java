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
        rebnyListingsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.addButtonClick();
        acrisClosingSteps.addChartFromACRISSection();
        analyticsSteps.addButtonClick();
        nycTownhousesSteps.addChartFromNYCSection();
        analyticsSteps.addButtonClick();
        managementSteps.addChartFromManagementSection();
        analyticsSteps.addButtonClick();
        rebnyListingsSteps.addBedroomsChartFromREBNYListings();
        analyticsSteps.addButtonClick();
        acrisClosingSteps.addBuildingTypeByDealCountChartFromACRISCloasing();
        analyticsSteps.addButtonClick();
        analyticsSteps.isMessageMaximumSixChartsDisplayed();
        analyticsSteps.okButtonClick();
        analyticsSteps.holdCharts();
        analyticsSteps.deleteChart();
        analyticsSteps.doneMovingCharts();
        analyticsSteps.isAddIconDisplayed();
        acrisClosingSteps.isDealCountByTypeDeleted();
    }
}
