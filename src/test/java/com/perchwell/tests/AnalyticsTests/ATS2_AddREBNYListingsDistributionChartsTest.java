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
        rebnyListingsSteps.dollarPerFTByPriceSegmentButtonClick();
        analyticsSteps.skipHints();
        rebnyListingsSteps.isDollarPerFTByPriceSegmentChartAdd();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.askingPriceChartClick();
        rebnyListingsSteps.isAskingPriseChartAdd();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyAskingPriceByBedsChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyAskingPriceByPriceSegmentChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyAskingPriceByTypeChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyAskingPricePerBedChart();
        analyticsSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.distributionButtonClick();
        rebnyListingsSteps.addAndVerifyAskingPricePerFTChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyDOMByNumberBedsChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyDOMByPriceSegmentChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifyMonthliesChart();
        analyticsSteps.selectREBNYListingsWithDistribution();
        rebnyListingsSteps.addAndVerifySquareFeetChart();

    }
}
