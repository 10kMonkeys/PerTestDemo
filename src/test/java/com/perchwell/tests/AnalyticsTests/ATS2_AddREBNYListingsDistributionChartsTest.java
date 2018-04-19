package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS2_AddREBNYListingsDistributionChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsDistributionChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.distributionButtonClick();
        analyticsSteps.dollarPerFTByPriceSegmentButtonClick();
        analyticsSteps.skipHints();
        analyticsSteps.isDollarPerFTByPriceSegmentChartAdd();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.askingPriceChartClick();
        analyticsSteps.isAskingPriseChartAdd();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyAskingPriceByBedsChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyAskingPriceByPriceSegmentChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyAskingPriceByTypeChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyAskingPricePerBedChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.distributionButtonClick();
        analyticsSteps.addAndVerifyAskingPricePerFTChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyDOMByNumberBedsChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyDOMByPriceSegmentChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifyMonthliesChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        analyticsSteps.addAndVerifySquareFeetChart();

    }
}
