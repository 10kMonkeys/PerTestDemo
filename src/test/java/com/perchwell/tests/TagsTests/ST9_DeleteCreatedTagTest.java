package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST9_DeleteCreatedTagTest extends SampleTest {

	@Test
	public void deleteCreatedTag() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atTagsPage.setRandomTagAndSave();
		user.atTagsPage.clickOnBackButton();
		user.atOpenedBuildingPage.clickOnDeleteTagButton();
		user.atTagsPage.shouldNotSeeCreatedTagUpperCase();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atTagsPage.shouldNotSeeCreatedTagUpperCase();
	}
}