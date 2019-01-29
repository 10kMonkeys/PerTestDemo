package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI13_TagWithClientTagDiscussTest extends SampleTest {

    @Test
    public void tagWithClientTagDiscuss() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnSendWithinPerchwell();
        user.atDiscussThisListingPage.deleteDiscussionWithClientIfExist();
        user.usingComplexSteps.sendMessageToClientAndCloseDiscussion(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        user.atDiscussionsListPage.shouldFindDiscussionsEmailForExistingClient();
        user.atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeSpecificClient();
    }
}
