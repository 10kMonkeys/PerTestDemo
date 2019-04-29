package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "TagsTests", "iOS_First", "Android_First", "First"})
public class ST7_UseExistingTagForListingTest extends SampleTest {

	@Test
	@Screenshots(disabled=true)
	public void useExistingTagForListing() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.getFirstBuildingAddress();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atTagsPage.setRandomTagAndSave();
		user.atOpenedBuildingPage.clearTagsList();
		user.atTagsPage.clickOnArrowBackFromTagsButton();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atTagsPage.clickOnFirstTagAndGetValue();
		user.atTagsPage.clickOnArrowBackFromTagsButton();
		user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atTagsPage.clickOnExistingTag();
		user.atTagsPage.clickOnSearchButton();
		user.atTagsPage.shouldSeeTaggedListing();
	}
}