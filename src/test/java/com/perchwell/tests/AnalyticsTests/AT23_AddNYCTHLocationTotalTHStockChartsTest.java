package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics"})
public class AT23_AddNYCTHLocationTotalTHStockChartsTest extends SampleTest {

    @Test
    public void addNYCTHLocationTotalTHStockChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.locationButtonClick();
        user.atNycTownhousesPage.addTotalTHStockNumRecentlyAlteredChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeTotalTHStockNumRecentlyAlteredChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockNumTownhousesChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockMedianWidthChart();
    }
}
