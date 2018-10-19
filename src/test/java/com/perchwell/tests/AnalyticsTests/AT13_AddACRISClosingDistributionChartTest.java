package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "SecondAdditionalAnalytics"})
public class AT13_AddACRISClosingDistributionChartTest extends SampleTest {

    @Test
    public void addACRISClosingDistributionChartTest() throws Exception {
            user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            user.atPerchwellPage.skipAllHints();
            user.atPerchPopup.clickNotNowButton();
            user.atPerchwellPage.clickOnAnalytics();
            user.atAnalyticsPage.selectACRISClosingSection();
            user.atAnalyticsPage.distributionButtonClick();
            user.atAcrisClosingPage.addDollarPerFTByPriceSegmentChart();
            user.atAnalyticsPage.skipHints();
            user.atAcrisClosingPage.shouldSeeDistributionDollarPerFTByPriceSegmentChart();
            user.atAnalyticsPage.selectACRISClosingWithDistribution();
            user.atAcrisClosingPage.addAndVerifyDistributionPricePercentilesChart();
            user.atAnalyticsPage.selectACRISClosingWithDistribution();
            user.atAcrisClosingPage.addAndVerifyDistributionPriceByPriceSegmentChart();
            user.atAnalyticsPage.selectACRISClosingWithDistribution();
            user.atAcrisClosingPage.addAndVerifyDistributionPriceByTypeChart();
            user.atAnalyticsPage.selectACRISClosingWithDistribution();
            user.atAcrisClosingPage.addAndVerifyDistributionSquareFeetPercentilesChart();

    }
}
