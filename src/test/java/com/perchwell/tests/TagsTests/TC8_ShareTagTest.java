package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "TagsTests")
public class TC8_ShareTagTest extends SampleTest {

	@Test
	public void shareTagTest() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickTagsLabel();
		myTagsSteps.clickSeveralExistingTagLabel();
		myTagsSteps.clickTagSearchButton();
		selectResultStep.clickTagPDFExportButton();
		selectResultStep.selectShareTaggedItems();
		shareTaggedItemsSteps.selectClientEmail();
		shareTaggedItemsSteps.fillInTitle("Test client");
		shareTaggedItemsSteps.fillInMessage("Test message");
		shareTaggedItemsSteps.doneButtonClick();
		shareTaggedItemsSteps.sendButtonClick();
		selectResultStep.shouldFindSentEmail();
	}
}
