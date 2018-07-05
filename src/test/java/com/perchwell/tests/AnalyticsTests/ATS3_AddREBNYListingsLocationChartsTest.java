package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "FirstAdditionalAnalytics"})
public class ATS3_AddREBNYListingsLocationChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsLocationChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.locationButtonClick();
        user.atRebnyListingsPage.addAskingPricePerBedChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeLocationAskingPricePerBedChart();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationAskingPerFTChart();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationListingCountChart();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationMonthliesChart();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationPropertyTaxesChart();
        user.atAnalyticsPage.selectREBNYListingsWithLocation();
        user.atRebnyListingsPage.addAndVerifyLocationDaysOnMarketChart();
    }
}
