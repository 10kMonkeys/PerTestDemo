package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "iOS_Second_IGNORED", "Android_Second", "Second", "Local_Android_Run"})
public class ST22_DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.getFirstListingAddress();
		user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
		user.atClientPage.invitationEmailSent();
		user.atClientPage.openDiscussion();
		user.atDiscussionPage.sendMessageWithPause(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
		user.atDiscussionPage.clickOnBackButtonFromDiscussion(); //ai
		user.atClientPage.clickOnBackButtonCreateClientOnlyIOS(); //new
		user.atClientPage.clickOnCrossBackButtonFromClients(); //ai
		user.atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient(); //ai
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing(); //ia
		user.atPerchwellPage.openSpecificBuilding();
		user.atOpenedBuildingPage.clickShareButton();
		user.atOpenedBuildingPage.clickOnSendWithinPerchwell();
		user.atOpenedBuildingPage.openDiscussionWithJustCreatedClient();
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
	}
}
