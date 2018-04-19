package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class ATS5_AddREBNYListingsFeaturesChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsFeaturesChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.featureButtonClick();
        analyticsSteps.doormanButtonClick();
        analyticsSteps.skipHints();
        analyticsSteps.shouldSeePremiumDoormanChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyElevatorPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyWorkingFireplacePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyGaragePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyGymPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyLaundryBuildingPremiumChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.featureButtonClick();
        analyticsSteps.addAndVerifyNewDevelopmentChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyOutdoorSpacePremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyPetsPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyPoolPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyPrewarPremiumChart();
        analyticsSteps.selectREBNYListingsWithFeatures();
        analyticsSteps.addAndVerifyWasherDryerPremiumChart();
    }
}
