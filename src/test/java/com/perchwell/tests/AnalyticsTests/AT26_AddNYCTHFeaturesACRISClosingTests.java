package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "AnalyticsSecond"})
public class AT26_AddNYCTHFeaturesACRISClosingTests extends SampleTest {

    @Test
    public void addNYCTHMedianChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.featureButtonClick();
        user.atNycTownhousesPage.addFeaturesACRISClosingTwentyFourPlusWidthChart();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.shouldFeaturesACRISClosingTwentyFourPlusWidthChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsGardenChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsHistoricDistChart();
        user.atAnalyticsPage.selectNYTownhousesWithFeatures();
        user.atNycTownhousesPage.addAndVerifyFeaturesACRISTHClosingsRecentlyAlteredChart();
    }
}
