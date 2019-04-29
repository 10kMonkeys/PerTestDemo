package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"SmokeTestSuit", "DiscussTests", "iOS_Second", "Android_Second", "Second"})
public class ST25_DiscussionWithNewAgentTest extends SampleTest {
	private DateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

	@Test
	@Screenshots(disabled=true)
	public void discussionWithNewAgentTest() throws Exception {
		user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
				AppProperties.INSTANCE.getProperty("client_password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
		user.atDiscussThisListingPage.deleteDiscussionWithAgentIfExist();
		user.atOpenedBuildingPage.clickOnAddDiscusButton();
		user.atClientPage.clickOnAddNewAgentButton();
		user.atClientPage.setAgentEmail("Not_existing_email@test.ru");
		user.atClientPage.setMessageField("Hello. I_d like invite you on " + simpleDateFormat.format(new Date()));
		user.atClientPage.clickOnInviteAgentButton();
		user.atClientPage.clickOnAgentSuccessfullyAddedOkButton();
		user.atDiscussionPage.clickOnBackButtonFromDiscussionOnlyIOS();
		user.atClientPage.clickOnBackButtonCreateAgentOnlyIOS();
		user.atClientPage.clickOnCrossBackButtonFromClients();
		user.atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnDiscussionsLabel();
		user.atDiscussionsListPage.shouldNotBeDiscussionWithMessageDisplayed();
	}
}
