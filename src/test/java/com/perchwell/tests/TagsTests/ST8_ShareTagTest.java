package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST8_ShareTagTest extends SampleTest {

	@Test
	public void shareTagTest() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atMyTagsPage.clickOnSeveralExistingTagLabel();
		user.atMyTagsPage.clickOnTagSearchButton();
		user.atSelectResultPage.clickOnTagPDFExportButton();
		user.atSelectResultPage.selectShareTaggedItems();
		user.atShareTaggedItemsPage.selectClientEmail();
		user.atShareTaggedItemsPage.fillInTitle("Test client");
		user.atShareTaggedItemsPage.fillInMessage("Test message");
		user.atShareTaggedItemsPage.doneButtonClick();
		user.atShareTaggedItemsPage.sendButtonClick();
		user.atSelectResultPage.shouldFindSentEmail();
	}
}
