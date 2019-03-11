package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class DT7_DeleteDiscussionTest extends SampleTest {

    @Ignore
    @Test
    public void deleteDiscussion() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.clickOnCrossBackButtonFromClients(); //new ia
        user.atPerchwellPage.closeAccountMenu();
        user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
        user.usingComplexSteps.sendMessageToJustCreatedClientAndCloseDiscussion(DiscussionMessages.MESSAGE_FOR_REMOVING); //ia
        user.atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient(); //new ia
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing(); //ia
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.swipeJustCreatedDiscussion();
        user.atDiscussionsListPage.clickOnDeleteButton();
        user.atDiscussionsListPage.shouldBeDiscussionDeletedFromDiscussionsList();
        user.atDiscussionPage.clickOnCrossBackButtonFromDiscussionsPage();//new ia
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.shouldBeNotDisplayedPreviouslyDeletedDiscussion();
    }
}
