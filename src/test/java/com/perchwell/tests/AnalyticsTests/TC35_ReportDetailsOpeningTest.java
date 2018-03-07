package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests"})
public class TC35_ReportDetailsOpeningTest extends SampleTest {

	@Test
	public void reportDetailsOpeningTest() {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickAnalytics();
		analyticsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.askingPriceChartClick();
		analyticsSteps.upToOneMillionButtonClick();
		analyticsSteps.selectSecondBuildingInList();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.isBuildingOpen();


	}
}
