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
        analyticsSteps.isBuildingHeightCartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.mktShareButtonClick();
        analyticsSteps.addBuildingTypeChart();
        analyticsSteps.isBuildingTypeChartDisplayed();
        analyticsSteps.addButtonClick();
    }
}
