package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS6_AddACRISClosingMKTShareChartsTest extends SampleTest {

    @Test
    public void addACRISClosingMKTShareChartsTest(){
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.selectACRISClosingSection();
        analyticsSteps.mktShareButtonClick();
        acrisClosingSteps.addBuildingTypeByDealCountChart();
        analyticsSteps.skipHints();
        acrisClosingSteps.shouldBuildingTypeChartDisplayed();
        analyticsSteps.addButtonClick();
        analyticsSteps.selectACRISClosingSection();
        analyticsSteps.mktShareButtonClick();
        acrisClosingSteps.addAndVerifyPriceByDealCountChart();
    }
}
