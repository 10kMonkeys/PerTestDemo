package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class ATS14_AddNYCTHDistributionChartsTest extends SampleTest {

    @Test
    public void addNYCTownhousesDistributionChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.distributionButtonClick();
        user.atNycTownhousesPage.addREBNYTHListingsNumListingByFT2Chart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeREBNYTHListingsNumListingByFT2Chart();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addAndVerifyREBNYTHListingsNumListingsByWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingNumSalesByFT2Chart();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingNumSalesByWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockNumHousesByFT2Chart();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockNumHousesByWidthChart();
        user.usingComplexSteps.startNewSearch();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.distributionButtonClick();
        user.atNycTownhousesPage.addREBNYTHListingsDOMByPriceChart();
        user.atNycTownhousesPage.shouldSeeREBNYTHListingsDOMByPriceChart();
    }
}
