package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "SecondAdditionalAnalytics"})
public class ATS10_AddACRISClosingTrendsChartsTest extends SampleTest {

    @Test
    public void adddACRISClosingTrendsChartsTest () throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.addDealCountAnnualChart();
        user.atAnalyticsPage.skipHints();
        user.atAcrisClosingPage.shouldSeeDealCountAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyDealCountQuarterlyChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyDealVolumeAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyDealVolumeQuarterlyChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyPriceAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyPriceQuarterlyChart();
        user.usingComplexSteps.startNewSearch();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.addPricePerFT2AnnualChart();
        user.atAcrisClosingPage.shouldSeePricePerFT2AnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyPricePerFT2QuarterlyChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTDealVolumeAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTPriceAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTPriceQuarterlyChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTPricePerFT2AnnualChart();
        user.usingComplexSteps.startNewSearch();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.trendsButtonClick();
        user.atAcrisClosingPage.addTopTenPerMKTPricePerFT2QuarterlyChart();
        user.atAcrisClosingPage.shouldSeeTopTenPerMKTPricePerFT2QuarterlyChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTUnitSizeAnnualChart();
        user.atAnalyticsPage.selectACRISClosingWithTrends();
        user.atAcrisClosingPage.addAndVerifyTopTenPerMKTUnitSizeQuarterlyChart();
    }
}
