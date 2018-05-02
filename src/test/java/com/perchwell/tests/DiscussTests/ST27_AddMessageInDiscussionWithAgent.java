package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Third"})
public class ST27_AddMessageInDiscussionWithAgent extends SampleTest {

	@Test
	public void addMessageInDiscussionWithAgent() throws Exception {
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickOnDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickOnSendWithinPerchwell();
		openedBuildingSteps.clickOnAddDiscusButton();
		clientSteps.clickOnExistingAgent();
		discussionSteps.sendMessage(DiscussionMessages.HELLO);
		discussionSteps.clickOnBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDiscussionWithAgent();
		openedBuildingSteps.openExistingDiscussionWithAgent();
		discussionSteps.sendMessage(DiscussionMessages.ADD_MESSAGE);
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
