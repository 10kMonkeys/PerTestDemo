package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST6_CreateNewTagForListingTest extends SampleTest {

	@Test
	public void createNewTagForListing() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atTagsPage.setRandomTagAndSave();
		user.atTagsPage.clickOnBackButton();
		user.atTagsPage.justCreatedTagIsAddedToListing();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atTagsPage.shouldSeeJustCreatedTag();
		user.atTagsPage.clickOnCreatedTag();
		user.atTagsPage.clickOnSearchButton();
		user.atTagsPage.shouldSeeJustCreatedTag();
	}
}