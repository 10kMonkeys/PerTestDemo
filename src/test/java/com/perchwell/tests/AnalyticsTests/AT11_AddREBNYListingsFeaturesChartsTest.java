package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticTests", "Analytics", "iOS_Analytics", "Android_Analytics"})
public class AT11_AddREBNYListingsFeaturesChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsFeaturesChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.featureButtonClick();
        user.atRebnyListingsPage.addMKTShareDoormanChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeFeaturesDoormanChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesElevatorChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesWorkingFireplaceChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesGarageChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesGymChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesLaundryBuildingChart();
        user.atAnalyticsPage.clickMyNewSearch(); // old search
        user.atSearchPage.clickOnMySavedSearches(); // old search
        user.inSearchMenu.openSavedSearches(); // new search
        user.atSearchPage.createNewSearchClick();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.featureButtonClick();
        user.atRebnyListingsPage.addAndVerifyFeaturesNewDevelopmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesOutdoorSpaceChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesPetsChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesPoolChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesPrewarChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyFeaturesWasherDryerChart();
    }
}
