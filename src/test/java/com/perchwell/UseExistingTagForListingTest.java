package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


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