package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "DiscussionsAndContacts"})
public class DT7_DeleteDiscussionTest extends SampleTest {

    @Test
    public void deleteDiscussion() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.usingComplexSteps.startShareAndSendWithinPerchwellForFirstBuilding();
        user.usingComplexSteps.sendMessageToClientAndCloseDiscussion(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        user.atOpenedBuildingPage.clickOnBackButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.swipeJustCreatedDiscussion();
        user.atDiscussionsListPage.clickOnDeleteButton();
        user.atDiscussionsListPage.shouldBeDiscussionDeletedFromDiscussionsList();
        user.atDiscussionsListPage.closePage();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.shouldBeNotDisplayedPreviouslyDeletedDiscussion();
    }
}
