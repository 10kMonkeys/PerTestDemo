package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.EmailData;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "iOS_First", "Android_First", "First", "Local_Android_Run"})
public class ST8_ShareTagTest extends SampleTest {

	@Ignore
	@Test
	public void shareTagTest() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.addTagToTheFirstListing();
		user.usingComplexSteps.addTagToTheSecondListing();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atMyTagsPage.checkTwoJustCreatedTags(); //temp solution for iOS
		user.atMyTagsPage.clickOnTagSearchButton();
		user.atSelectResultPage.clickOnTagPDFExportButton();
		user.atSelectResultPage.selectShareTaggedItems();
		user.atShareTaggedItemsPage.selectClientEmail();
		user.atShareTaggedItemsPage.fillInTitle(EmailData.EMAIL_TITLE);
		user.atShareTaggedItemsPage.fillInMessage();
		user.atShareTaggedItemsPage.doneButtonClick();
		user.atShareTaggedItemsPage.sendButtonClick();
		user.atSelectResultPage.shouldFindSentEmail();
	}
}
