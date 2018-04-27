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
            perchwellSteps.clickOnAnalytics();
            analyticsSteps.selectACRISClosingSection();
            analyticsSteps.distributionButtonClick();
            acrisClosingSteps.addDollarPerFTPercentilesChart();
            analyticsSteps.skipHints();
            acrisClosingSteps.shouldSeeDollarPerFTPercentiles();
            analyticsSteps.selectACRISClosingWithDistribution();
            acrisClosingSteps.addAndVerifyPricePercentilesChart();
            analyticsSteps.selectACRISClosingWithDistribution();
            acrisClosingSteps.addAndVerifyPriceByPriceSegmentChart();
            analyticsSteps.selectACRISClosingWithDistribution();
            acrisClosingSteps.addAndVerifySquareFeetPercentiles();
            analyticsSteps.selectACRISClosingWithDistribution();
            acrisClosingSteps.addAndVerifyPriceByTypeChart();
    }
}
