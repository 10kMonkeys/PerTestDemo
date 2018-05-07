package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT1_AddREBNYListingsChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsChartsTest() throws Exception{
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atRebnyListingsPage.addAskingPriceChartWithMKTShare();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.isAskingPriseChartAdd();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.locationButtonClick();
        user.atRebnyListingsPage.askingPriceChartClick();
        user.atRebnyListingsPage.isMedianAskingPriceChartDisplayed();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.medianButtonClick();
        user.atRebnyListingsPage.askingPriceChartClick();
        user.atRebnyListingsPage.isMedianAskingPriceChartDisplayed();
    }
}
