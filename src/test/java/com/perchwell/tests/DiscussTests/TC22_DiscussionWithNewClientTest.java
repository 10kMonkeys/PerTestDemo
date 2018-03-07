package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests"})
public class TC22_DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickSendWithinPerchwell();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickAddNewClientButton();
		clientSteps.setRundomClientData();
		clientSteps.clickGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickInviteButton();
		clientSteps.clickClientSuccessfullyAddedOkButton();
		discussionSteps.clickBackButton();
		clientSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.clickDesiredClient();
		discussionSteps.shouldSeeDicsussionWithNewClient();
	}
}
