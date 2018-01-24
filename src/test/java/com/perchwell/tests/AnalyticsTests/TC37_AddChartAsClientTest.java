package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC37_AddChartAsClientTest extends SampleTest {

    @Test
    public void addChartAsClient(){
        loginSteps.loginAsClient();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addAskingPriceChartWithMKTShare();
        analyticsSteps.skipHints();
        analyticsSteps.addButtonClick();
        analyticsSteps.addBuildingHeightChartWithMKTShare();
        analyticsSteps.isThisIsAProOnlyFeatureMessageShow();
    }
}
