package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.EmailData;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST8_ShareTagTest extends SampleTest {

	@Test
	public void shareTagTest() {
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
		user.atShareTaggedItemsPage.fillInTitle(EmailData.EMAILTITLE);
		user.atShareTaggedItemsPage.fillInMessage(EmailData.EMAILMESSAGE);
		user.atShareTaggedItemsPage.doneButtonClick();
		user.atShareTaggedItemsPage.sendButtonClick();
		user.atSelectResultPage.shouldFindSentEmail();
	}
}
