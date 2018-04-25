package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST36_SendReportDetailsPDF extends SampleTest {

	@Test
	public void sendReportDetailsPDF() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickAnalytics();
		rebnyListingsSteps.addChartFromREBNYSection();
		analyticsSteps.skipHints();
		rebnyListingsSteps.askingPriceChartClick();
		analyticsSteps.upTo12MillionButtonClick();
		analyticsSteps.shareButtonClick();
		analyticsSteps.clickSendButton();
		analyticsSteps.shouldFindPDFSummaryEmail();


	}
}
