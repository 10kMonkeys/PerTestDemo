package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "FirstAdditionalAnalytics"})
public class AT8_AddREBNYListingsDistributionChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsDistributionChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.distributionButtonClick();
        user.atRebnyListingsPage.dollarPerFTByPriceSegmentButtonClick();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeDistributionDollarPerFTByPriceSegmentChartAdd();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addREBNYListingsAskingPriceChart();
        user.atRebnyListingsPage.shouldSeeDistributionAskingPriseChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionAskingPriceByBedsChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionAskingPriceByPriceSegmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionAskingPriceByTypeChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionAskingPricePerBedChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnMySavedSearches(); // old search
        user.inSearchMenu.openSavedSearches(); // new search
        user.atSearchPage.createNewSearchClick();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.distributionButtonClick();
        user.atRebnyListingsPage.addAndVerifyDistributionAskingPricePerFTChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionDOMByNumberBedsChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionDOMByPriceSegmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionMonthliesChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDistributionSquareFeetChart();
    }
}
