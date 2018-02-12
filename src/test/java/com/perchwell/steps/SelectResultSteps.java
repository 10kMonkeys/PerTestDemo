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
	public void clickTagPDFExportButton() {
		onPage.clickTagPDFExportButton();
	}

	@Step
	public void createReportWithNameAndSave(String ReportName) {
		this.setReportName(ReportName);
		this.clickSaveButton();
		this.clickReportSentOkButton();
	}

	public void clickReportSentOkButton() {
		onPage.clickReportSentOkButton();
	}

	private void clickSaveButton() {
		onPage.clickSaveButton();
	}

	private void setReportName(String reportName) {
		onPage.addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
		onPage.setReportName(onPage.getValueFromSessionVariable("Report name"));
	}

	@Step("Should see sent email. Mail is checked twice with a three minute waiting")
	public void shouldFindSentEmail() {
		Boolean result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(onPage.getValueFromSessionVariable("Report name"));
		}
		Assert.assertTrue(result);

	}

	@Step
	public void selectShareTaggedItems(){
		onPage.selectShareTaggedItems();
	}

}
