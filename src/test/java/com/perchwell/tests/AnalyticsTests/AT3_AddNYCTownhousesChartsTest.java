package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class AT3_AddNYCTownhousesChartsTest extends SampleTest{

    @Test
    public void addNYCTownhousesChartsTest() throws Exception{
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atNycTownhousesPage.inHistoryDistClick();
        user.atAnalyticsPage.skipHints();
        user.atNycTownhousesPage.isHistoryDistChartDisplayed();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.selectNYCTownhousesSection();
        user.atAnalyticsPage.featureButtonClick();
        user.atNycTownhousesPage.selectGardenChart();
        user.atNycTownhousesPage.isGardenPremiumChartDisplayed();
    }
}
