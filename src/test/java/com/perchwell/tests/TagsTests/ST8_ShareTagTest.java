package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "Second"})
public class ST8_ShareTagTest extends SampleTest {

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
