package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "Analytics"})
public class AT3_AddNYCTownhousesChartsTest extends SampleTest{

    @Test
    public void addNYCTownhousesChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atNycTownhousesPage.addMKTShareREBNYTHListingsInHistoricDistChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeMKTShareREBNYTHListingsInHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithLocation();
        user.atNycTownhousesPage.addAndVerifyLocationTotalTHStockNumberTownhousesChart();
    }
}
