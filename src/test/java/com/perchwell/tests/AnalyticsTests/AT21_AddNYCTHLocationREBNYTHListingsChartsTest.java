package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "AnalyticsSecond", "iOS_AnalyticsSecond", "Android_AnalyticsSecond"})
public class AT21_AddNYCTHLocationREBNYTHListingsChartsTest extends SampleTest {

    @Test
    public void addNYCTownhousesLocationChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.locationButtonClick();
        user.atNycTownhousesPage.addREBNYTHListingsNumListingsChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeREBNYTHListingsNumListingsChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyREBNYTHListingsNumRecentlyAlteredChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyREBNYTHListingsAskingDollarsPerFT2Chart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyREBNYTHListingsAskingPriceChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyREBNYTHListingsMedianWidthChart();
    }
}
