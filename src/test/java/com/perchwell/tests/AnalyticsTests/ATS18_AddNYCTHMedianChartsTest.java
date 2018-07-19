package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "ThirdAdditionalAnalytics"})
public class ATS18_AddNYCTHMedianChartsTest extends SampleTest {

    @Test
    public void addNYCTHMedianChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.medianButtonClick();
        user.atNycTownhousesPage.addMedianREBNYTHListingsSquareFeetChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeMedianREBNYTHListingsSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMedian();
        user.atNycTownhousesPage.addAndVerifyMedianREBNYTHListingsWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithMedian();
        user.atNycTownhousesPage.addAndVerifyMedianACRISTHClosingSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMedian();
        user.atNycTownhousesPage.addAndVerifyMedianACRISTHClosingWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithMedian();
        user.atNycTownhousesPage.addAndVerifyMedianTotalTHStockSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMedian();
        user.atNycTownhousesPage.addAndVerifyMedianTotalTHStockWidthChart();
    }
}
