package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Third"})
public class ST26_DiscussionWithExistingAgent extends SampleTest {

	@Test
	public void discussionWithExistingAgent() throws Exception {
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
		discussionSteps.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
		discussionSteps.clickOnBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDiscussionWithAgent();
		openedBuildingSteps.openExistingDiscussionWithAgent();
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
