package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TC27_AddMessageInDiscussionWithAgent extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	@Test
	public void addMessageInDiscussionWithAgent() throws Exception {
		loginSteps.loginAsClient();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();

		perchwellSteps.openFirstBuilding();

		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyAgentButton();

		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingAgent();
		discussionSteps.sendMessage("Hello");
		discussionSteps.clickBackButton();
		clientSteps.closePage();

		openedBuildingSteps.shouldSeeExistingDuscussionWithAgent();
		openedBuildingSteps.openExistingDuscussionWithAgent();
		discussionSteps.sendMessage("Add message " + sdf);
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
