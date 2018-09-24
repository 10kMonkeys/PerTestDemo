package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class ATS12_AddNYCTHMKTShareACRISTHClosingChartsTest extends SampleTest {

    @Test
    public void addNYCTHMKTShareACRISTHClosingChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.addACRISTownhouseClosingHasGardenChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeACRISTownhouseClosingHasGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingInHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyACRISTownhouseClosingDealCountByPriceChart();
    }
}
