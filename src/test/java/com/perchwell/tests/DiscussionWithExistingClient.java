package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Ignore;
import org.junit.Test;

public class DiscussionWithExistingClient extends SampleTest {

	@Test
	public void discussionWithExistingClientTest() throws Exception {
		loginSteps.loginAsBroker();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyClientButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingClient();
		discussionSteps.sendMessage("I'd_like_discuss_with_you");
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussion();
		openedBuildingSteps.openExistingDuscussion();
		discussionSteps.shouldSeeMessageInDiscussion();
		clientSteps.closePage();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickDiscusionsLabel();
		discussionsListSteps.createdDiscussionIsFirst();
		discussionsListSteps.clickFirstDiscusion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		clientSteps.logOut();
		clientSteps.clickYesButtonLogOutWindow();
		loginSteps.loginAsClient();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickDiscusionsLabel();
		discussionsListSteps.lastDiscussionWithBrokerIsFirst();
		discussionsListSteps.clickFirstDiscusion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionsListSteps.shouldFindDiscussionsEmailForExistingClient();
	}
}