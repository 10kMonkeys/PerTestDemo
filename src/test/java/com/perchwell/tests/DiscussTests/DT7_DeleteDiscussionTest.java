package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DT7_DeleteDiscussionTest extends SampleTest {

    @Test
    public void deleteDiscussion() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickOnDiscussWithMyClientHint();
        openedBuildingSteps.clickShareButton();
        openedBuildingSteps.clickOnSendWithinPerchwell();
        openedBuildingSteps.clickOnAddDiscusButton();
        clientSteps.selectClient();
        discussionSteps.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        discussionSteps.clickOnBackButton();
        clientSteps.closePage();
        openedBuildingSteps.clickOnBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickOnDiscussionsLabel();
        discussionsListSteps.swipeFirstDiscussionName();
        discussionsListSteps.clickOnDeleteButton();
        discussionsListSteps.shouldDeleteDiscussionFromDiscussionsList();
        discussionsListSteps.closePage();
        accountSteps.clickOnDiscussionsLabel();
        discussionsListSteps.shouldNotContainPreviouslyDeletedDiscussion();
    }
}
