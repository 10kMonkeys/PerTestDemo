package com.perchwell.test;

import org.junit.Test;

public class CreateNewTagForListingTest extends SampleTest {

@Test
public void createNewTagForListing() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.clickMyTagsLabel();
	tagsSteps.setRandomTagAndSave();
	tagsSteps.clickBackButton();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.clickTagsLabel();
	tagsSteps.shouldSeeCreatedTagUpperCase();
	tagsSteps.clickCreatedTag();
	tagsSteps.clickSearchButton();
	tagsSteps.shouldSeeCreatedTagUpperCase();
}
}