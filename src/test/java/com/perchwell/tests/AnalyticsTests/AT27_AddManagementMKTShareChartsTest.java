package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "AnalyticsSecond", "iOS_AnalyticsSecond", "Android_AnalyticsSecond"})
public class AT27_AddManagementMKTShareChartsTest extends SampleTest {

    @Test
    public void AddManagementMKTShareChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectManagementSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atManagementPage.askingPriceChartClick();
        user.atAnalyticsPage.skipHints();
        user.atManagementPage.shouldSeeMKTShareAskingPriceChart();
        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addAndVerifyMKTShareBedroomsChart();
        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addAndVerifyMKTShareBuildingHeightChart();
        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addAndVerifyMKTShareBuildingTypeChart();
        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addAndVerifyMKTShareDaysOnMarketChart();
    }
}
