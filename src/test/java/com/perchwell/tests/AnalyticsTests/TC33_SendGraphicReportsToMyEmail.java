package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC33_SendGraphicReportsToMyEmail extends SampleTest{
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	@Test
	public void sendGraphicReportsToMyEmail() throws Exception {

		loginSteps.loginAsBroker();
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
		analyticsSteps.createReportWithNameAndSave("Analytics_report"+sdf.format(new Date()));
		analyticsSteps.shouldFindSentEmail();

	}

}
