package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT1_AddREBNYListingsChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsChartsTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        rebnyListingsSteps.addAskingPriceChartWithMKTShare();
        analyticsSteps.skipHints();
        rebnyListingsSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        rebnyListingsSteps.askingPriceChartClick();
        rebnyListingsSteps.isMedianAskingPriceChartDisplayed();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.medianButtonClick();
        rebnyListingsSteps.askingPriceChartClick();
        rebnyListingsSteps.isMedianAskingPriceChartDisplayed();
    }
}
