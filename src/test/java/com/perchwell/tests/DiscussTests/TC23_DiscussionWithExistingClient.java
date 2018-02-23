package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "SmokeTestSuit", name = "DiscussTests")
public class TC23_DiscussionWithExistingClient extends SampleTest {

	@Test
	public void discussionWithExistingClientTest() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"), AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickSendWithinPerchwell();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingClient();
		discussionSteps.sendMessage("I'd_like_discuss_with_you");
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussion();
		openedBuildingSteps.openExistingDuscussion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionSteps.closeButtonClick();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickDiscusionsLabel();
		discussionsListSteps.createdDiscussionIsFirst();
		discussionsListSteps.clickFirstDiscusion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionSteps.clickBackButton();
		discussionSteps.discussionsCancelButtonClick();
		clientSteps.logOut();
		clientSteps.clickYesButtonLogOutWindow();
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickDiscusionsLabel();
		discussionsListSteps.lastDiscussionWithBrokerIsFirst();
		discussionsListSteps.clickFirstDiscusion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionsListSteps.shouldFindDiscussionsEmailForExistingClient();
	}
}