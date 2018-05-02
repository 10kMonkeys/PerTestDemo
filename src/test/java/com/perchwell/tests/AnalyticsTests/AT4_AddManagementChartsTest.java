package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT4_AddManagementChartsTest extends SampleTest {

    @Test
    public void addManagementChartsTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.selectManagementSection();
        managementSteps.askingPriceChartClick();
        analyticsSteps.skipHints();
        managementSteps.isAskingPriseChartAdd();
        analyticsSteps.addButtonClick();
        analyticsSteps.selectManagementSection();
        analyticsSteps.distributionButtonClick();
        managementSteps.selectFirmListingCountChart();
        managementSteps.isFirmListingCountChartDisplayed();
    }
}
