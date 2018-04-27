package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST23_DiscussionWithExistingClient extends SampleTest {

	@Test
	public void discussionWithExistingClientTest() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickSendWithinPerchwell();
		discussThisListingSteps.deleteDiscussionWithClientIfExist();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingClient();
		discussionSteps.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
		discussionSteps.clickOnBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussion();
		openedBuildingSteps.openExistingDuscussion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionSteps.clickOnCloseButton();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnDiscussionsLabel();
		discussionsListSteps.shouldBeCreatedDiscussionFirst();
		discussionsListSteps.clickOnFirstDiscussion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionSteps.clickOnBackButton();
		discussionSteps.clickOndiscussionsCancelButton();
		clientSteps.logOut();
		clientSteps.clickOnYesButtonLogOutWindow();
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnDiscussionsLabel();
		discussionsListSteps.shouldBeLastDiscussionWithBrokerFirst();
		discussionsListSteps.clickOnFirstDiscussion();
		discussionSteps.shouldSeeMessageInDiscussion();
		discussionsListSteps.shouldFindDiscussionsEmailForExistingClient();
	}
}