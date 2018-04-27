package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT3_AddNYCTownhousesChartsTest extends SampleTest{

    @Test
    public void addNYCTownhousesChartsTest() throws Exception{
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnAnalytics();
        analyticsSteps.selectNYCTownhousesSection();
        analyticsSteps.mktShareButtonClick();
        nycTownhousesSteps.inHistoryDistClick();
        analyticsSteps.skipHints();
        nycTownhousesSteps.isHistoryDistChartDisplayed();
        analyticsSteps.addButtonClick();
        analyticsSteps.selectNYCTownhousesSection();
        analyticsSteps.featureButtonClick();
        nycTownhousesSteps.selectGardenChart();
        nycTownhousesSteps.isGardenPremiumChartDisplayed();
    }
}
