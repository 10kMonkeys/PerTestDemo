package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST24_AddMessageInDiscussionTest extends SampleTest {

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
		discussionSteps.sendMessage(DiscussionMessages.HELLO);
		discussionSteps.clickOnBackButton();
		clientSteps.closePage();
		openedBuildingSteps.openExistingDuscussion();
		discussionSteps.sendMessage(DiscussionMessages.LETS_START_DISCUSSION);
		discussionSteps.shouldSeeMessageInDiscussion();
	}
}
