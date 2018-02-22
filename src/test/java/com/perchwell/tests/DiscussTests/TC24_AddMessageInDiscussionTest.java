package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTag(type = "SmokeTestSuit", name = "DiscussTests")
public class TC24_AddMessageInDiscussionTest extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void addMessageInDiscussionTest() {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickDiscussWithMyClientOption();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.selectClient();
		discussionSteps.sendMessage("Hello");
		discussionSteps.clickBackButton();
		clientSteps.closePage();
		openedBuildingSteps.openExistingDuscussion();
		discussionSteps.sendMessage("Let's start discussion "+ sdf.format(new Date()));
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
