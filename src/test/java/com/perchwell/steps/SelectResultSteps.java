package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.tags.SelectResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SelectResultSteps extends ScenarioSteps {

	SelectResultPage onPage;

	@Step
	public void clickOnClientOption() {
		onPage.clickOnClientOption();
	}

	@Step
	public void clickOnMyEmailOption() {
		onPage.clickOnMyEmailOption();
	}

	@Step
	public void clickOnTagPDFExportButton() {
		onPage.clickOnTagPDFExportButton();
	}

	@Step
	public void createReportWithNameAndSave(String ReportName) {
		this.setReportName(ReportName);
		this.clickOnSaveButton();
		this.clickOnReportSentOkButton();
	}

	private void clickOnReportSentOkButton() {
		onPage.clickOnReportSentOkButton();
	}

	private void clickOnSaveButton() {
		onPage.clickOnSaveButton();
	}

	private void setReportName(String reportName) {
		SessionVariables.addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
		onPage.setReportName(SessionVariables.getValueFromSessionVariable("Report name"));
	}

	@Step("Should see sent email. Mail is checked twice with a five minute waiting")
	public void shouldFindSentEmail() {
		Boolean result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report name"));
		if (!result) {
			result = onPage.shouldFindSentEmail(SessionVariables.getValueFromSessionVariable("Report name"));
		}
		Assert.assertTrue(result);
	}

	@Step
	public void selectShareTaggedItems(){
		onPage.selectShareTaggedItems();
	}
}
