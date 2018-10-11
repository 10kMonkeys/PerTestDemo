package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "SecondAdditionalAnalytics"})
public class ATS9_AddACRISClosingMedianChartsTest extends SampleTest {

    @Test
    public void addACRISClosingMedianChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.medianButtonClick();
        user.atAcrisClosingPage.addPriceChart();
        user.atAnalyticsPage.skipHints();
        user.atAcrisClosingPage.shouldSeeMedianPriceChart();
        user.atAnalyticsPage.selectACRISClosingWithMedian();
        user.atAcrisClosingPage.addAndVerifyMedianPricePerFT2Chart();
    }
}
