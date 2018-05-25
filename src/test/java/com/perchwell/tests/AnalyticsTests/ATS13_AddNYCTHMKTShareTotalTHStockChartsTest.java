package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS13_AddNYCTHMKTShareTotalTHStockChartsTest extends SampleTest {

    @Test
    public void addNYCTHMKTShareTotalTHStockChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.addTotalTHStockHasGardenChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeTotalTHStockHasGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockInHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyTotalTHStockYearLastAlteredChart();
    }
}
