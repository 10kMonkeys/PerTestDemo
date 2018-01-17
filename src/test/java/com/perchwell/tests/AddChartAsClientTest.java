package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class AddChartAsClientTest extends SampleTest {

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
