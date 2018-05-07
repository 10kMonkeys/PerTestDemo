package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS2_AddREBNYListingsDistributionChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsDistributionChartsTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.distributionButtonClick();
        user.atRebnyListingsPage.dollarPerFTByPriceSegmentButtonClick();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.isDollarPerFTByPriceSegmentChartAdd();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.askingPriceChartClick();
        user.atRebnyListingsPage.isAskingPriseChartAdd();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyAskingPriceByBedsChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyAskingPriceByPriceSegmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyAskingPriceByTypeChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyAskingPricePerBedChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.distributionButtonClick();
        user.atRebnyListingsPage.addAndVerifyAskingPricePerFTChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDOMByNumberBedsChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyDOMByPriceSegmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifyMonthliesChart();
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addAndVerifySquareFeetChart();
    }
}
