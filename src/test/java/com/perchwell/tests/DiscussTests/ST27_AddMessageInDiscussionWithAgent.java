package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "iOS_Second", "Android_Second", "Second", "Local_Android_Run"})
public class ST27_AddMessageInDiscussionWithAgent extends SampleTest {

	@Test
	public void addMessageInDiscussionWithAgent() {
		user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
		user.atDiscussThisListingPage.deleteDiscussionWithAgentIfExist();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.clickOnExistingAgent();
		user.atDiscussionPage.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
		user.atDiscussionPage.clickOnBackButtonFromDiscussion();
		user.atClientPage.clickOnCrossBackButtonFromClients();
		user.atOpenedBuildingPage.reopenDiscussionsPopUpInListingOnlyForAndroid();
		user.atOpenedBuildingPage.shouldSeeExistingDiscussionWithAgent();
		user.atOpenedBuildingPage.openExistingDiscussionWithAgent();
		user.atDiscussionPage.sendMessage(DiscussionMessages.ADD_MESSAGE);
		user.atDiscussionPage.shouldSeeMessageInDiscussion();
	}
}
