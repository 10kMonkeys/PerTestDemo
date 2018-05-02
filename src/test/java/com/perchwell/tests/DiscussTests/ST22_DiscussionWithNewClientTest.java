package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST22_DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() throws Exception {
		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickOnDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickOnSendWithinPerchwell();
		openedBuildingSteps.clickOnAddDiscusButton();
		clientSteps.clickOnAddNewClientButton();
		clientSteps.setRandomClientData();
		clientSteps.clickOnGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickOnInviteButton();
		clientSteps.clickOnClientSuccessfullyAddedOkButton();
		discussionSteps.clickOnBackButton();
		clientSteps.clickOnBackButton();
		clientSteps.closePage();
		openedBuildingSteps.clickOnAddDiscusButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.clickOnDesiredClient();
		discussionSteps.shouldSeeDicsussionWithNewClient();
	}
}
