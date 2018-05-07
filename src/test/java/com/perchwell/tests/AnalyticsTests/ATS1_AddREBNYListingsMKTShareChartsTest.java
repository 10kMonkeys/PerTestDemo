package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS1_AddREBNYListingsMKTShareChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsMKTShareChartsTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addBedroomsChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeBedroomsChart();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBuildingHeightChartWithMKTShare();
        user.atRebnyListingsPage.isBuildingHeightChartAdd();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyBuildingTypeChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyDoormanChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyElevatorChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyFireplaceChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addAndVerifyGarageChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyGymChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyLaundryBuildingChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyOutdoorSpaceChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyPetsChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyPoolChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addAndVerifyPrewarChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyWasherDryerChart();
    }
}
