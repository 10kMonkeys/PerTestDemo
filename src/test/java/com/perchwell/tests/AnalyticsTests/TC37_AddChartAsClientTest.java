package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class TC37_AddChartAsClientTest extends SampleTest {

    @Test
    public void addChartAsClient(){
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
                AppProperties.INSTANCE.getProperty("client_password"));
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
