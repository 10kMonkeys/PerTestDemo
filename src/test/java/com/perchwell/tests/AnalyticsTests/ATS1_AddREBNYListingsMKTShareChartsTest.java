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
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        rebnyListingsSteps.addBedroomsChart();
        analyticsSteps.skipHints();
        rebnyListingsSteps.shouldSeeBedroomsChart();
        analyticsSteps.addButtonClick();
        rebnyListingsSteps.addBuildingHeightChartWithMKTShare();
        rebnyListingsSteps.isBuildingHeightChartAdd();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyBuildingTypeChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyDoormanChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyElevatorChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyFireplaceChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        rebnyListingsSteps.addAndVerifyGarageChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyGymChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyLaundryBuildingChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyOutdoorSpaceChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyPetsChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyPoolChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        rebnyListingsSteps.addAndVerifyPrewarChart();
        analyticsSteps.selectREBNYListingsWithMKTShare();
        rebnyListingsSteps.addAndVerifyWasherDryerChart();

    }
}
