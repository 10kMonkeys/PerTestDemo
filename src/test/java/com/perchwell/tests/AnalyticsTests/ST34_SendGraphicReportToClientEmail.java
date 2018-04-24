package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST34_SendGraphicReportToClientEmail extends SampleTest {

	@Test
	public void sendGraphicReportToClientEmail() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickAnalytics();
		rebnyListingsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.addButtonClick();
		acrisClosingSteps.addChartFromACRISSection();
		analyticsSteps.addButtonClick();
		analyticsSteps.shareButtonClick();
		analyticsSteps.clickClientEmailOption();
		analyticsSteps.createReportWithNameAndSave("Analytics_client_report");
		analyticsSteps.setClientAddress();
		analyticsSteps.clickReportSentOkButton();
		analyticsSteps.shouldFindSentEmail();
	}
}
