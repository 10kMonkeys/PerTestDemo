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
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
		user.atDiscussThisListingPage.deleteDiscussionWithClientIfExist();
		user.usingComplexSteps.sendMessageToClientAndCloseDiscussion(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
		user.atOpenedBuildingPage.shouldSeeExistingDiscussion();
		user.atOpenedBuildingPage.openExistingDiscussion();
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
		user.atDiscussionPage.clickOnCloseButton();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnDiscussionsLabel();
		user.atDiscussionsListPage.shouldBeCreatedDiscussionFirst();
		user.atDiscussionsListPage.clickOnFirstDiscussion();
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
		user.atDiscussionPage.clickOnBackButton();
		user.atDiscussionPage.clickOndiscussionsCancelButton();
		user.atClientPage.logOut();
		user.atClientPage.clickOnYesButtonLogOutWindow();
		user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnDiscussionsLabel();
		user.atDiscussionsListPage.shouldBeLastDiscussionWithBrokerFirst();
		user.atDiscussionsListPage.clickOnFirstDiscussion();
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
		user.atDiscussionsListPage.shouldFindDiscussionsEmailForExistingClient();
	}
}