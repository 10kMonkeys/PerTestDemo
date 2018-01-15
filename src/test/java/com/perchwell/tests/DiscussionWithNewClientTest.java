package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class DiscussionWithNewClientTest extends SampleTest {

	@Test
	public void discussionWithNewClientTest() throws Exception {

		loginSteps.loginAsBroker();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyClientButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickAddNewClientButton();
		clientSteps.setRundomClientData();
		clientSteps.clickGroupLabel();
		clientSteps.selectGroup("Actively Searching");
		clientSteps.clickInviteButton();
		discussionSteps.clickBackButton();
		clientSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.shouldSeeRecentlyCreatedClient();
		clientSteps.clickDesiredClient();
		discussionSteps.shouldSeeDicsussionWithNewClient();


		}
}
