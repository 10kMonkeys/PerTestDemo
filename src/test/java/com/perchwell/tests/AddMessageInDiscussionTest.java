package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class AddMessageInDiscussionTest extends SampleTest {

@Test
public void addMessageInDiscussionTest() {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.clickDiscussWithMyClientButton();
	openedBuildingSteps.clickAddDiscusButton();
	clientSteps.selectClient();
	discussionSteps.sendMessage("Hello");
	discussionSteps.clickBackButton();
	clientSteps.closePage();
	openedBuildingSteps.openExistingDuscussion();
	discussionSteps.sendMessage("Let's start discussion");
	discussionSteps.shouldSeeMessageInDiscussion();

}
}
