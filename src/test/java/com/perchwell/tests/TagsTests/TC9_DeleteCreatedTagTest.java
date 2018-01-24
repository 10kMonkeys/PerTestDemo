package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import org.junit.Ignore;
import org.junit.Test;

public class TC9_DeleteCreatedTagTest extends SampleTest {

	@Ignore
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