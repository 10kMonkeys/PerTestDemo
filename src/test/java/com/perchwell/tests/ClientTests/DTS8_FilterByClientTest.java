package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch", "Local_Android_Run"})
public class DTS8_FilterByClientTest extends SampleTest {

    @Test
    public void filterByClient() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openSecondBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickShareButton();
        user.atOpenedBuildingPage.clickOnSendWithinPerchwell();
        user.atOpenedBuildingPage.clickOnAddDiscusButton();
        user.atClientPage.selectTestClient(SearchRequests.TEST_CLIENT);
        user.atDiscussionPage.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        user.atDiscussionPage.clickOnBackButtonFromDiscussion();
        user.atClientPage.clickOnCrossBackButtonFromClients();
        user.atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.enterValueInSearchField(SearchRequests.CLIENT_TEST);
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.clickDeleteIconNextToSearchText();
        user.atDiscussionsListPage.shouldBeNothingDisplayedInFilterByPerson();
        user.atDiscussionsListPage.enterValueInSearchField(SearchRequests.CLIENT);
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.clickDeleteIconNextToSearchText();
        user.atDiscussionsListPage.shouldBeNothingDisplayedInFilterByPerson();
        user.atDiscussionsListPage.enterValueInSearchField(SearchRequests.TH_CHARTS);
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.selectTestClient();
        user.atDiscussionsListPage.shouldBeOnlyDiscussionWithTestClientDisplayed();
    }
}
