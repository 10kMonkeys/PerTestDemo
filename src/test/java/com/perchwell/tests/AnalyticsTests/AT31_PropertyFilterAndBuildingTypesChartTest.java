package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class AT31_PropertyFilterAndBuildingTypesChartTest extends SampleTest {

    @Test
    public void propertyFilterAndBuildingTypesChartTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();

        user.atAnalyticsPage.selectREBNYListingsSection();
        user.atRebnyListingsPage.addMKTShareBuildingTypeChart();
        user.atAnalyticsPage.skipHints();
        //        checkOnlyOnlyOneValueInDonutIsShown(); //TODO

        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addDistributionAskingPriceByTypeChart();
        //        checkOnlyOnlyOneColumnCondoIsShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingSectionWithMKTShare();
        user.atAcrisClosingPage.addACRISClosingBuildingTypeByDealCountChart();
        //        checkOnlyOnlyOneValueInDonutIsShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithDistribution();
        user.atAcrisClosingPage.addDistributionPriceByTypeChart();
        //        checkOnlyOnlyOneColumnCondoIsShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addDealCountAnnualChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addATrendsDealCountQuarterlyChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();

        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.addTrendsDealVolumeAnnualChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addTrendsTopTenPerMKTDealVolumeAnnualChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addTrendsDealVolumeQuarterlyChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addTrendsTopTenPerMKTDealVolumeQuarterlyChart();
        //        checkOnlyOnlyColumnsCondoAreShown(); //TODO

        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addMKTShareBuildingTypeChart();
//        checkOnlyOnlyOneValueInDonutIsShown(); //TODO
    }
}
