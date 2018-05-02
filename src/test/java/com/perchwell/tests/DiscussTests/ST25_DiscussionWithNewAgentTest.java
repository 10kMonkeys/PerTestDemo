package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Third"})
public class ST25_DiscussionWithNewAgentTest extends SampleTest {
	private DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void discussionWithNewAgentTest() {
		loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickOnDiscussWithMyClientHint();
		openedBuildingSteps.clickShareButton();
		openedBuildingSteps.clickOnSendWithinPerchwell();
		openedBuildingSteps.clickOnAddDiscusButton();
		clientSteps.clickOnAddNewAgentButton();
		clientSteps.setAgentEmail("Not_existing_email@test.ru");
		clientSteps.setMessageField("Hello. I'd like invite you on "+simpleDateFormat.format(new Date()));
		clientSteps.clickOnInviteButton();
		clientSteps.clickOnAgentSuccessfullyAddedOkButton();
		discussionSteps.clickOnBackButton();
		clientSteps.clickOnBackButtonCreateAgent();
		clientSteps.closePage();
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnDiscussionsLabel();
		discussionsListSteps.shouldNotBeDiscussionWithMessageDisplayed();
	}
}
