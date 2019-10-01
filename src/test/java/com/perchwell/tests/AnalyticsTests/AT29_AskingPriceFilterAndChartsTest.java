package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;


@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class AT29_AskingPriceFilterAndChartsTest extends SampleTest {

    @Ignore
    @Test
    public void askingPriceFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinimumPriceFilter("1000000");
        user.atSearchPage.setMaximumPriceFilter("2900000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atRebnyListingsPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atAnalyticsPage.checkOnlyOnlyOneValueInDonutIsShown(); //TODO
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addDistributionAskingPriceByPriceSegmentChart();
//        checkOnlyOnlyOneColumn1to3dollarsIsShown(); //TODO missing locator
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addDistributionDOMByPriceSegmentChart();
//        checkOnlyOnlyOneColumn1to3dollarsIsShown(); //TODO
        user.atAnalyticsPage.selectACRISClosingSectionWithMKTShare();
        user.atAcrisClosingPage.addMKTSharePriceByDealCountChart();
        user.atAnalyticsPage.checkOnlyOnlyOneValueInDonutIsShown(); //TODO
        user.atAnalyticsPage.selectACRISClosingWithDistribution();
        user.atAcrisClosingPage.addDistributionDollarFT2ByPriceSegmentChart();
//        checkOnlyOnlyOneColumn1to3dollarsIsShown(); //TODO
        user.atAnalyticsPage.selectACRISClosingWithDistribution();
        user.atAcrisClosingPage.addDistributionPriceByPriceSegmentChart();
        //        checkOnlyOnlyOneColumn1to3dollarsIsShown(); //TODO
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinimumPriceFilter("1000000");
        user.atSearchPage.setMaximumPriceFilter("2900000");
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.selectManagementSection();
        user.atManagementPage.addMKTShareAskingPriceChart();
        user.atAnalyticsPage.checkOnlyOnlyOneValueInDonutIsShown();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addMKTShareACRISClosingDealCountByPriceChart();
        user.atAnalyticsPage.checkOnlyOnlyOneValueInDonutIsShown();
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addDistributionREBNYListingsDOMByPriceChart();
        //        checkOnlyOnlyOneColumnUpTo3MdollarsIsShown(); //TODO
    }
}
