package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class ShareTagTest extends SampleTest {

	@Test
	public void shareTagTest() throws Exception {

		loginSteps.loginAsBroker();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickTagsLabel();
		tagsSteps.clickSeveralExistingTagLabel();
		tagsSteps.clickShareButton();
		selectResultStep.clickShareButton();
		selectResultStep.clickMyEmailOption();
		selectResultStep.createReportWithName("Test my email");
		selectResultStep.shouldFindSentEmail();
		selectResultStep.clickShareButton();
		selectResultStep.clickClientOption();
		clientSteps.selectClient();
		selectResultStep.createReportWithName("Test client email");
		selectResultStep.shouldFindSentEmail();


	}
}
