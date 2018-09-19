package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "SecondAdditionalAnalytics"})
public class ATS22_AddManagementDistributionChartsTest extends SampleTest {

    @Test
    public void AddManagementDistributionChartsTest() throws Exception{
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectManagementSection();
        user.atAnalyticsPage.distributionButtonClick();
        user.atManagementPage.agentsListingCountButtonClick();
        user.atAnalyticsPage.skipHints();
        user.atManagementPage.shouldSeeDistributionAgentsListingCountChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionAgentMedianPriceChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionFirmDOMChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionFirmListingCountChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionFirmListingVolumeChart();
        user.atAnalyticsPage.selectManagementWithDistribution();
        user.atManagementPage.addAndVerifyDistributionFirmMedianDollarPerSQFTChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.selectManagementSection();
        user.atAnalyticsPage.distributionButtonClick();
        user.atManagementPage.addAndVerifyDistributionFirmMedianPriceChart();
    }
}