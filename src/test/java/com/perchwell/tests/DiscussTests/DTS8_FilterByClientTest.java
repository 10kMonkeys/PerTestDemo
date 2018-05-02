package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DTS8_FilterByClientTest extends SampleTest {

    @Test
    public void filterByClient() throws Exception {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openSecondBuilding();
        openedBuildingSteps.clickOnDiscussWithMyClientHint();
        openedBuildingSteps.clickShareButton();
        openedBuildingSteps.clickOnSendWithinPerchwell();
        openedBuildingSteps.clickOnAddDiscusButton();
        clientSteps.selectTestClient();
        discussionSteps.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        discussionSteps.clickOnBackButton();
        clientSteps.closePage();
        openedBuildingSteps.clickOnBackButton();
        perchwellSteps.clickOnOpenAccountButton();
        accountSteps.clickOnDiscussionsLabel();
        discussionsListSteps.enterValueInSearchField("Tes");
        discussionsListSteps.shouldBeTestClientPresentInFilterResult();
        discussionsListSteps.clickDeleteIconNextToSearchText();
        discussionsListSteps.shouldBeNothingDisplayedInFilterByPerson();
        discussionsListSteps.enterValueInSearchField("st cl");
        discussionsListSteps.shouldBeTestClientPresentInFilterResult();
        discussionsListSteps.clickDeleteIconNextToSearchText();
        discussionsListSteps.shouldBeNothingDisplayedInFilterByPerson();
        discussionsListSteps.enterValueInSearchField(" client");
        discussionsListSteps.shouldBeTestClientPresentInFilterResult();
        discussionsListSteps.selectTestClient();
        discussionsListSteps.shouldBeOnlyDiscussionWithTestClientDisplayed();
    }
}
