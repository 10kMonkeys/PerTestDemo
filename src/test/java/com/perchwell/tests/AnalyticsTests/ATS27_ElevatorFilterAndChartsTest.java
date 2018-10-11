package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class ATS27_ElevatorFilterAndChartsTest extends SampleTest {

    @Test
    public void elevatorFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.addElevatorFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addMKTShareElevatorChart();
        user.atAnalyticsPage.skipHints();
//        user.atAnalyticsPage.verifyThatChartDisplayedWithFilter("");
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addFeaturesElevatorChart();
//        user.atAnalyticsPage.verifyThatChartDisplayedWithFilter("");
    }
}
