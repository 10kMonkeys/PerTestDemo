package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


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