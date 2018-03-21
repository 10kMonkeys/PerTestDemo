package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Third"})
public class ST27_AddMessageInDiscussionWithAgent extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	@Test
	public void addMessageInDiscussionWithAgent() throws Exception {
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickSendWithinPerchwell();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickExistingAgent();
		discussionSteps.sendMessage("Hello");
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.shouldSeeExistingDuscussionWithAgent();
		openedBuildingSteps.openExistingDuscussionWithAgent();
		discussionSteps.sendMessage("Add message " + sdf.format(new Date()));
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
