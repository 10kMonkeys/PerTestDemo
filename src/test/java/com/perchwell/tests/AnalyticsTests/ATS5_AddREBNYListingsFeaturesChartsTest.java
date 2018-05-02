package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS5_AddREBNYListingsFeaturesChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsFeaturesChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.featureButtonClick();
        rebnyListingsSteps.doormanButtonClick();
        analyticsSteps.skipHints();
        rebnyListingsSteps.shouldSeePremiumDoormanChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyElevatorPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyWorkingFireplacePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyGaragePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyGymPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyLaundryBuildingPremiumChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickOnLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickOnApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.featureButtonClick();
        rebnyListingsSteps.addAndVerifyNewDevelopmentChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyOutdoorSpacePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyPetsPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyPoolPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyPrewarPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        rebnyListingsSteps.addAndVerifyWasherDryerPremiumChart();
    }
}
