package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC34_SendGraphicReportToClientEmail extends SampleTest {
private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void sendGraphicReportToClientEmail() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickAnalytics();
		analyticsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		analyticsSteps.addButtonClick();
		analyticsSteps.addChartFromACRISSection();
		analyticsSteps.addButtonClick();
		analyticsSteps.shareButtonClick();
		analyticsSteps.clickMyEmailOption();
		analyticsSteps.createReportWithNameAndSave("Analytics_client_report"+sdf.format(new Date()));
		analyticsSteps.shouldFindSentEmail();

	}
}
