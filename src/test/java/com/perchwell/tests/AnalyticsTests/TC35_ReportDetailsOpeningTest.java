package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC35_ReportDetailsOpeningTest extends SampleTest {

	@Test
	public void reportDetailsOpeningTest() {
		loginSteps.loginAsBroker();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickAnalytics();
		analyticsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.askingPriceChartClick();
		analyticsSteps.upToOneMillionButtonClick();
		analyticsSteps.selectSecondBuildingInList();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.isDiscussionWithMyClientDisplayed();


	}
}
