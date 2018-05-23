package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "Analytics"})
public class AT4_AddManagementChartsTest extends SampleTest {

    @Test
    public void addManagementChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectManagementSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atManagementPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atManagementPage.shouldSeeMKTShareAskingPriceChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionFirmListingCountChart();
    }
}
