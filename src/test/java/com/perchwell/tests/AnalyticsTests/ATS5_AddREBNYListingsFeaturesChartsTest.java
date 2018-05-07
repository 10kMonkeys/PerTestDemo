package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS5_AddREBNYListingsFeaturesChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsFeaturesChartsTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.featureButtonClick();
        user.atRebnyListingsPage.doormanButtonClick();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeePremiumDoormanChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyElevatorPremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyWorkingFireplacePremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyGaragePremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyGymPremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyLaundryBuildingPremiumChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.featureButtonClick();
        user.atRebnyListingsPage.addAndVerifyNewDevelopmentChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyOutdoorSpacePremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyPetsPremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyPoolPremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyPrewarPremiumChart();
        user.atAnalyticsPage.selectREBNYListingsWithFeatures();
        user.atRebnyListingsPage.addAndVerifyWasherDryerPremiumChart();
    }
}
