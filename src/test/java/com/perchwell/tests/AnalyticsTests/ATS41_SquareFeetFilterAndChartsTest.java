package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class ATS41_SquareFeetFilterAndChartsTest extends SampleTest {

    @Ignore
    @Test
    public void squareFeetFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.setSquareFeetMinFilterToSixK();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.addREBNYListingsSquareFeetChart();
        user.atAnalyticsPage.skipHints();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addACRISClosingsSquareFeetChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addStockSquareFeetChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addREBNYListingsBySQFTChar();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addACRISClosingsBySQFTChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectNYTownhousesWithDistribution();
        user.atNycTownhousesPage.addStockBySQFTChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
    }
}
