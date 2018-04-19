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
        analyticsSteps.addAskingPricePerBedChart();
        analyticsSteps.skipHints();
        analyticsSteps.shouldSeeMedianAskingPricePerBedChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        analyticsSteps.addMedianAskingPerFTChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        analyticsSteps.addMedianMonthliesChart();
        analyticsSteps.selectREBNYListingsWithMedian();
        analyticsSteps.addMedianPropertyTaxesChart();
    }
}
