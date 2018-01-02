package com.perchwell.tests;

import org.junit.Test;

public class UseExistingTagForListingTest extends SampleTest {

@Test
public void useExistingTagForListing() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.clickMyTagsLabel();
	tagsSteps.clickExistingTagLabel();
	tagsSteps.clickBackButton();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.clickTagsLabel();
	tagsSteps.shouldSeeExistingTagUpperCase();
	tagsSteps.clickUsedTag();
	tagsSteps.clickSearchButton();
	tagsSteps.shouldSeeExistingTagUpperCase();
}
}