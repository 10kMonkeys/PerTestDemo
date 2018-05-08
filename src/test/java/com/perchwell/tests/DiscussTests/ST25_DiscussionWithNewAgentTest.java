package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "Second"})
public class ST25_DiscussionWithNewAgentTest extends SampleTest {
	private DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	public void discussionWithNewAgentTest() {
		user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.clickOnAddNewAgentButton();
		user.atClientPage.setAgentEmail("Not_existing_email@test.ru");
		user.atClientPage.setMessageField("Hello. I'd like invite you on " + simpleDateFormat.format(new Date()));
		user.atClientPage.clickOnInviteButton();
		user.atClientPage.clickOnAgentSuccessfullyAddedOkButton();
		user.atDiscussionPage.clickOnBackButton();
		user.atClientPage.clickOnBackButtonCreateAgent();
		user.atClientPage.closePage();
		user.atOpenedBuildingPage.clickOnBackButton();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnDiscussionsLabel();
		user.atDiscussionsListPage.shouldNotBeDiscussionWithMessageDisplayed();
	}
}
