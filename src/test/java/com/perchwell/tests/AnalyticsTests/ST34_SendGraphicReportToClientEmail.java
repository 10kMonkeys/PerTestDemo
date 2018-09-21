package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Reports;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST34_SendGraphicReportToClientEmail extends SampleTest {

	@Test
	public void sendGraphicReportToClientEmail() throws Exception {
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
		user.atAnalyticsPage.clickClientEmailOption();
		user.atAnalyticsPage.createReportWithNameAndSave(Reports.ANALYTICS_CLIENT_REPORT);
		user.atAnalyticsPage.setClientAddress();
		user.atAnalyticsPage.clickReportSentOkButton();
		user.atAnalyticsPage.shouldFindSentEmail();
	}
}
