package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS3_AddREBNYListingsLocationChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsLocationChartsTest() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.addAskingPricePerBedChart();
        analyticsSteps.skipHints();
        rebnyListingsSteps.shouldSeeMedianAskingPricePerBedChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.addMedianAskingPerFTChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.addListingCountChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.addMedianMonthliesChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.addMedianPropertyTaxesChart();
    }
}
