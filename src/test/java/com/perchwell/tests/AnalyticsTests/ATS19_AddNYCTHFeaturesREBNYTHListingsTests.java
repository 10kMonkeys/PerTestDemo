package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS19_AddNYCTHFeaturesREBNYTHListingsTests extends SampleTest {

    @Test
    public void addNYCTHMedianChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.featureButtonClick();
        user.atNycTownhousesPage.addFeaturesREBNYTHListingsTwentyFourPlusWidthChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldSeeFeaturesREBNYTHListingsTwentyFourPlusWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsLandmarkChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesREBNYTHListingsRecentlyAlteredChart();
    }
}
