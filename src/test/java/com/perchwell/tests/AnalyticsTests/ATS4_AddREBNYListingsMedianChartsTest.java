package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS4_AddREBNYListingsMedianChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsMedianChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.medianButtonClick();
        rebnyListingsSteps.addAskingPricePerBedChart();
        analyticsSteps.skipHints();
        rebnyListingsSteps.shouldSeeMedianAskingPricePerBedChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        rebnyListingsSteps.addMedianAskingPerFTChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        rebnyListingsSteps.addMedianMonthliesChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        rebnyListingsSteps.addMedianPropertyTaxesChart();
    }
}
