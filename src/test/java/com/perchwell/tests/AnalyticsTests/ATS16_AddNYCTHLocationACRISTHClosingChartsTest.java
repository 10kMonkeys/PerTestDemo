package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class ATS16_AddNYCTHLocationACRISTHClosingChartsTest extends SampleTest {

    @Test
    public void addNYCTHLocationACRISTHClosingChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.locationButtonClick();
        user.atNycTownhousesPage.addACRISClosingNumSalesChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeACRISClosingNumSalesChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyACRISClosingNumSalesOfRecentlyAlteredChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyACRISClosingMedianWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyACRISClosingPriceChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyACRISClosingPricePerFT2Chart();
    }
}
