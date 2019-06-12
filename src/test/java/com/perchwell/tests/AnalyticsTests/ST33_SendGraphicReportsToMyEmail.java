package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Reports;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "iOS_Third", "Android_Third", "Third", "Local_Android_Run"})
public class ST33_SendGraphicReportsToMyEmail extends SampleTest{

	@Test
	public void sendGraphicReportsToMyEmail() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnAnalytics();
		user.atRebnyListingsPage.addChartFromREBNYSection();
		user.atAnalyticsPage.skipHints();
		user.atAnalyticsPage.addButtonClick();
		user.atAcrisClosingPage.addChartFromACRISSection();
		user.atAnalyticsPage.addButtonClick();
		user.atAnalyticsPage.shareButtonClick();
		user.atAnalyticsPage.clickMyEmailOption();
		user.atAnalyticsPage.createReportWithNameAndSave(Reports.ANALYTICS_REPORT);
		user.atAnalyticsPage.clickReportSentOkButton();
		user.atAnalyticsPage.shouldFindSentEmail();
	}
}
