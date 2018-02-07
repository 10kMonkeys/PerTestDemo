package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC26_DiscussionWithExistingAgent extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void discussionWithExistingAgent() throws Exception {
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickDiscussWithMyAgentButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingAgent();
		discussionSteps.sendMessage("I'd like discuss with you " + sdf.format(new Date()));
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussionWithAgent();
		openedBuildingSteps.openExistingDuscussionWithAgent();
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
