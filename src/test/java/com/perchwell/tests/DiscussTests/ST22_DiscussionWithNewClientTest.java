package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST22_DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.clickShareButton();
		user.atOpenedBuildingPage.clickOnSendWithinPerchwell();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.clickOnAddNewClientButton();
		user.atClientPage.setRandomClientData();
		user.atClientPage.clickOnGroupLabel();
		user.atClientPage.selectGroup("Actively Searching");
		user.atClientPage.clickOnInviteButton();
		user.atClientPage.clickOnClientSuccessfullyAddedOkButton();
		user.atDiscussionPage.clickOnBackButton();
		user.atClientPage.clickOnBackButton();
		user.atClientPage.closePage();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.shouldSeeRecentlyCreatedClient();
		user.atClientPage.clickOnDesiredClient();
		user.atDiscussionPage.shouldSeeDicsussionWithNewClient();
	}
}
