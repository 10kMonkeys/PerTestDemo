package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.tags.SelectResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SelectResultSteps extends ScenarioSteps {
	SelectResultPage onPage;

	@Step
	public void clickClientOption() {
		onPage.clickClientOption();
	}

	@Step
	public void clickMyEmailOption() {
		onPage.clickMyEmailOption();
	}

	@Step
	public void clickShareButton() {
		onPage.clickShareButton();
	}

	@Step
	public void createReportWithName(String ReportName) {
		this.provideReportName(ReportName);
		this.clickSaveButton();
		this.clickReportSemtOkButton();
	}

	public void clickReportSemtOkButton() {
		onPage.clickReportSemtOkButton();
	}

	private void clickSaveButton() {
		onPage.clickSaveButton();
	}

	private void provideReportName(String reportName) {
		onPage.addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
		onPage.provideReportname(onPage.getValueFromSessionVariable("Report name"));
	}

	@Step("Should see sent email. Mail is checked twice with a one minute waiting")
	public void shouldFindSentEmail() {
		Boolean result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
		}
		Assert.assertTrue(result);

	}

}
