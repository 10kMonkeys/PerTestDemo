package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics"})
public class AT17_AddNYCTHMKTShareREBNYTHListingsChartsTest extends SampleTest {

    @Test
    public void addNYCTHMKTShareREBNYTHListingsChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atNycTownhousesPage.addREBNYTownhouseListingsHasGardenChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeREBNYTownhouseListingsHasGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyREBNYTownhouseListingsInHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyREBNYTownhouseListingsSquareFeetChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyREBNYTownhouseListingsWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithMKTShare();
        user.atNycTownhousesPage.addAndVerifyREBNYTownhouseListingsYearLastAlteredChart();
    }
}
