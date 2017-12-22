package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class CreateNewTagForListingTest extends SampleTest {

@Test
public void createNewTagForListing() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
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