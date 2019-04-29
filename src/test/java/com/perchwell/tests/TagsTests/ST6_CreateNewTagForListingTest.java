package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "iOS_First", "Android_First", "First"})
public class ST6_CreateNewTagForListingTest extends SampleTest {

	@Test
	@Screenshots(disabled=true)
	public void createNewTagForListing() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.getFirstBuildingAddress();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atOpenedBuildingPage.clearTagsList();
		user.atTagsPage.setRandomTagAndSave();
		user.atTagsPage.clickOnArrowBackFromTagsButton();
		user.atTagsPage.justCreatedTagIsAddedToListing();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atTagsPage.shouldSeeJustCreatedTag(); //temp solution for iOS
		user.atTagsPage.clickOnCreatedTag();
		user.atTagsPage.clickOnSearchButton();
		user.atTagsPage.shouldSeeTaggedListing();
	}
}