package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "iOS_Third", "Android_Third", "Third"})
public class ST32_DeleteChartTest extends SampleTest {

    @Test
    public void deleteChart() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atRebnyListingsPage.addChartFromREBNYSection();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.addButtonClick();
        user.atAcrisClosingPage.addChartFromACRISSection();
        user.atAnalyticsPage.addButtonClick();
        user.atNycTownhousesPage.addChartFromNYCSection();
        user.atAnalyticsPage.addButtonClick();
        user.atManagementPage.addChartFromManagementSection();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBedroomsChartFromREBNYListings();
        user.atAnalyticsPage.addButtonClick();
        user.atAcrisClosingPage.addBuildingTypeByDealCountChartFromACRISClosing();
        user.atAnalyticsPage.isMessageMaximumSixChartsDisplayed();
        user.atAnalyticsPage.okButtonClick();
        user.atAnalyticsPage.holdCharts();
        user.atAnalyticsPage.deleteChart();
        user.atAnalyticsPage.doneMovingCharts();
        user.atAnalyticsPage.isAddIconDisplayed();
        user.atAcrisClosingPage.isDealCountByTypeDeleted();
    }
}
