package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WithTagValuesOf({"DiscussTests"})
public class DISCUSS7_DeleteDiscussionTest extends SampleTest {
    private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    @Test
    public void deleteDiscussion() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickShareButton();
        openedBuildingSteps.clickSendWithinPerchwell();
        openedBuildingSteps.clickAddDiscusButton();
        clientSteps.selectClient();
        discussionSteps.sendMessage("I'd_like_discuss_with_you " + sdf.format(new Date()));
        discussionSteps.clickBackButton();
        clientSteps.closePage();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickDiscusionsLabel();
        discussionsListSteps.swipeFirstDiscussionName();
        discussionsListSteps.clickOnDeleteButton();
        discussionsListSteps.shouldDeleteDiscussionFromDiscussionsList();
        discussionsListSteps.closePage();
        accountSteps.clickDiscusionsLabel();
        discussionsListSteps.shouldNotContainPreviouslyDeletedDiscussion();
    }
}
