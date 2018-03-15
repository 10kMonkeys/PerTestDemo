package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AddREBNYListingsChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsChartsTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addAskingPriceChartWithMKTShare();
        analyticsSteps.skipHints();
        analyticsSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.locationButtonClick();
        analyticsSteps.askingPriceChartClick();
        analyticsSteps.isMedianAskingPriceChartDisplayed();
        analyticsSteps.addButtonClick();
        analyticsSteps.rebnyListingsButtonClick();
        analyticsSteps.medianButtonClick();
        analyticsSteps.askingPriceChartClick();
        analyticsSteps.isMedianAskingPriceChartDisplayed();
    }
}
