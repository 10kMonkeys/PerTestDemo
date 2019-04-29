package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "iOS_Third", "Android_Third", "Third"})
public class ST37_AddChartAsClientTest extends SampleTest {

    @Test
    @Screenshots(disabled=true)
    public void addChartAsClient() throws Exception {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
                AppProperties.INSTANCE.getProperty("client_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBuildingHeightChartWithMKTShare();
        user.atAnalyticsPage.isThisIsAProOnlyFeatureMessageShow();
    }
}
