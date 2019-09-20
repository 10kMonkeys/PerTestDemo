package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class AT36_LaundryBuildingFilterAndChartsTest extends SampleTest {

    @Ignore
    @Test
    public void laundryBuildingFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
        user.atSearchPage.clickOnLaundryBuildingFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atRebnyListingsPage.addMKTShareLaundryBuildingChart();
        user.atAnalyticsPage.skipHints();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addFeaturesLaundryBuildingChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
    }
}
