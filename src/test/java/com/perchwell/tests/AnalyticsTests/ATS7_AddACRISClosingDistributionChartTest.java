package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS7_AddACRISClosingDistributionChartTest extends SampleTest {

    @Test
    public void addACRISClosingDistributionChartTest(){
            loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            perchwellSteps.skipAllHints();
            perchPopupSteps.clickNotNowButton();
            perchwellSteps.clickAnalytics();
            analyticsSteps.selectACRISClosingSection();
            analyticsSteps.distributionButtonClick();
            analyticsSteps.addDollarPerFTPercentilesChart();
            analyticsSteps.skipHints();
            analyticsSteps.shouldSeeDollarPerFTPercentiles();
            analyticsSteps.selectACRISClosingWithDistribution();
            analyticsSteps.addAndVerifyPricePercentilesChart();
            analyticsSteps.selectACRISClosingWithDistribution();
            analyticsSteps.addAndVerifyPriceByPriceSegmentChart();
            analyticsSteps.selectACRISClosingWithDistribution();
            analyticsSteps.addAndVerifySquareFeetPercentiles();
            analyticsSteps.selectACRISClosingWithDistribution();
            analyticsSteps.addAndVerifyPriceByTypeChart();
    }
}
