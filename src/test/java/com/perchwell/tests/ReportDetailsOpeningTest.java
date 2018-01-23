package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class ReportDetailsOpeningTest extends SampleTest {

    @Test
    public void reportDetailsOpeningTest(){
        loginSteps.loginAsBroker();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickAnalytics();
        analyticsSteps.addChartFromREBNYSection();
        analyticsSteps.skipHints();
        analyticsSteps.askingPriceChartClick();
        analyticsSteps.upToOneMillionButtonClick();
        analyticsSteps.selectFirstBuildingInList();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.isDiscussionWithMyClientDisplayed();

    }
}
