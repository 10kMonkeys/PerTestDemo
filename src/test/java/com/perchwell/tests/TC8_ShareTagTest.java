package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class TC8_ShareTagTest extends SampleTest {

	@Test
	public void shareTagTest() throws Exception {

		loginSteps.loginAsBroker();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickTagsLabel();
		myTagsSteps.clickSeveralExistingTagLabel();
		myTagsSteps.clickTagSearchButton();
		selectResultStep.clickTagPDFExportButton();
		selectResultStep.clickMyEmailOption();
		selectResultStep.createReportWithNameAndSave("Test my email");
		selectResultStep.shouldFindSentEmail();
		selectResultStep.clickTagPDFExportButton();
		selectResultStep.clickClientOption();
		clientSteps.selectClient();
		selectResultStep.createReportWithNameAndSave("Test client email");
		selectResultStep.shouldFindSentEmail();


	}
}
