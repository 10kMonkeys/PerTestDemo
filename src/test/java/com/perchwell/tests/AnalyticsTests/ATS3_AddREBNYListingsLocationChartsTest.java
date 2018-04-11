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
        perchwellSteps.clickAnalytics();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.addAskingPricePerBedChart();
        analyticsSteps.skipHints();
        analyticsSteps.shouldSeeAskingPricePerBedChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.addAskingPricePerFTChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.addListingCountChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.addMonthliesChart();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.addPropertyTaxesChart();
    }
}
