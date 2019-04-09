package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics", "iOS_Analytics", "Android_Analytics"})
public class AT10_AddREBNYListingsMedianChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsMedianChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.medianButtonClick();
        user.atRebnyListingsPage.addDistributionAskingPricePerBedChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeMedianAskingPricePerBedChart();
        user.atAnalyticsPage.selectREBNYListingsWithMedian();
        user.atRebnyListingsPage.addAndVerifyMedianAskingPerFTChart();
        user.atAnalyticsPage.selectREBNYListingsWithMedian();
        user.atRebnyListingsPage.addAndVerifyMedianMonthliesChart();
        user.atAnalyticsPage.selectREBNYListingsWithMedian();
        user.atRebnyListingsPage.addAndVerifyMedianPropertyTaxesChart();
    }
}
