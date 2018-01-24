package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC24_AddMessageInDiscussionTest extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
@Test
public void addMessageInDiscussionTest() {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.openFirstBuilding();
	openedBuildingSteps.clickDiscussWithMyClientHint();
	openedBuildingSteps.clickDiscussWithMyClientButton();
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
