package com.perchwell.test;

import org.junit.Test;

public class DeleteCreatedTagTest extends SampleTest {


@Test
public void deleteCreatedTag() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.clickMyTagsLabel();
	tagsSteps.setRandomTagAndSave();
	tagsSteps.clickBackButton();
	openedBuildingSteps.ckickDeleteTagButton();
	tagsSteps.shouldNotSeeCreatedTagUpperCase();
	openedBuildingSteps.clickBackButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.clickTagsLabel();
	tagsSteps.shouldNotSeeCreatedTagUpperCase();
}
}