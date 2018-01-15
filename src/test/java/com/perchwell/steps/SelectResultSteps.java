package com.perchwell.steps;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.tags.SelectResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SelectResultSteps extends ScenarioSteps {
SelectResultPage selectResultPage;

@Step
public void clickClientOption() {
	selectResultPage.clickClientOption();
}

@Step
public void clickMyEmailOption() {
	selectResultPage.clickMyEmailOption();
}

@Step
public void clickShareButton() {
	selectResultPage.clickShareButton();
}

@Step
public void createReportWithName(String ReportName) {
	this.provideReportName(ReportName);
	this.clickSaveButton();
	this.clickReportSemtOkButton();
}

public void clickReportSemtOkButton() {
	selectResultPage.clickReportSemtOkButton();
}

private void clickSaveButton() {
	selectResultPage.clickSaveButton();
}

private void provideReportName(String reportName) {
	selectResultPage.addValueInSessionVariable("Report name", RandomGenerator.getRandomString(reportName));
	selectResultPage.provideReportname(selectResultPage.getValueFromSessionVariable("Report name"));
}

@Step("Should see sent email. Mail is checked twice with a one minute waiting")
public void shouldFindSentEmail() {
	Boolean result = selectResultPage.shouldFindSentEmail(selectResultPage.getValueFromSessionVariable("Report name"));
	if (!result) {
		result = selectResultPage.shouldFindSentEmail(selectResultPage.getValueFromSessionVariable("Report name"));
	}
	Assert.assertTrue(result);

}

}
