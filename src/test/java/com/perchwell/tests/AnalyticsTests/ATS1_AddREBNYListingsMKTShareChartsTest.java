package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS1_AddREBNYListingsMKTShareChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsMKTShareChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        analyticsSteps.addBedroomsChart();
        analyticsSteps.skipHints();
        analyticsSteps.shouldSeeBedroomsChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.addBuildingHeightChartWithMKTShare();
        analyticsSteps.isBuildingHeightChartAdd();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyBuildingTypeChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyDoormanChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyElevatorChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyFireplaceChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        analyticsSteps.addAndVerifyGarageChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyGymChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyLaundryBuildingChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyOutdoorSpaceChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyPetsChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyPoolChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        analyticsSteps.addAndVerifyPrewarChart();
        analyticsSteps.selectREBNYListingsWithMKTChare();
        analyticsSteps.addAndVerifyWasherDryerChart();

    }
}
