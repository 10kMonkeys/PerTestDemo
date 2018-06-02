package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS8_AddACRISClosingLocationChartsTest extends SampleTest {

    @Test
    public void addACRISClosingLocationChartsTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.locationButtonClick();
        user.atAcrisClosingPage.addDealCountChart();
        user.atAnalyticsPage.skipHints();
        user.atAcrisClosingPage.shouldSeeLocationDealCountChart();
        user.atAnalyticsPage.selectACRISClosingWithLocation();
        user.atAcrisClosingPage.addAndVerifyLocationPriceChart();
        user.atAnalyticsPage.selectACRISClosingWithLocation();
        user.atAcrisClosingPage.addAndVerifyLocationPricePerFT2Chart();
    }
}
