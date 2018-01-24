package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC25_DiscussionWithNewAgentTest extends SampleTest {
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void discussionWithNewAgentTest() {
		loginSteps.loginAsClient();
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickDiscussWithMyClientHint();
		openedBuildingSteps.clickDiscussWithMyAgentButton();
		openedBuildingSteps.clickAddDiscusButton();
		clientSteps.clickAddNewAgentButton();
		clientSteps.setAgentEmail("Not_existing_email@test.ru");
		clientSteps.setMessageField("Hello. I'd like invite you on "+sdf.format(new Date()));
		clientSteps.clickInviteButton();
		discussionSteps.clickBackButton();
		clientSteps.clickBackButtonCreateAgent();
		clientSteps.closePage();
		openedBuildingSteps.clickBackButton();
		perchwellSteps.clickOpenAccountButton();
		accountSteps.clickDiscusionsLabel();
		discussionsListSteps.discussionWithMessageNotDisplayed();

	}
}
