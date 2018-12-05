package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics"})
public class AT2_AddACRISClosingChartsTest extends SampleTest {

    @Test
    public void addACRISClosingChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAcrisClosingPage.addMKTShareBuildingHeightByDealCountChart();
        user.atAnalyticsPage.skipHints();
        user.atAcrisClosingPage.shouldSeeMKTShareBuildingHeightByDealCountChart();
        user.atAnalyticsPage.selectACRISClosingWithDistribution();
        user.atAcrisClosingPage.addAndVerifyDistributionDollarFT2PercentilesChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTrendsTopTenPerMKTDealVolumeQuarterlyChart();
    }
}
