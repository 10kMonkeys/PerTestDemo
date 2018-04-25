package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST7_UseExistingTagForListingTest extends SampleTest {

	@Test
	public void useExistingTagForListing() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickMyTagsLabel();
		tagsSteps.clickExistingTagLabel();
		tagsSteps.clickBackButton();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickOnTagsLabel();
		tagsSteps.shouldSeeExistingTagUpperCase();
		tagsSteps.clickUsedTag();
		tagsSteps.clickSearchButton();
		tagsSteps.shouldSeeExistingTagUpperCase();
	}
}