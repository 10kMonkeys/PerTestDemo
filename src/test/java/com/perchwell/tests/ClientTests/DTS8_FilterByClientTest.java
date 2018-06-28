package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ClientsTests", "DiscussionsAndContacts"})
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
        user.atClientPage.selectTestClient();
        user.atDiscussionPage.sendMessage(DiscussionMessages.I_D_LIKE_TO_DISCUSS_WITH_YOU);
        user.atDiscussionPage.clickOnBackButton();
        user.atClientPage.closePage();
        user.atOpenedBuildingPage.clickOnBackButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionsListPage.enterValueInSearchField("Tes");
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.clickDeleteIconNextToSearchText();
        user.atDiscussionsListPage.shouldBeNothingDisplayedInFilterByPerson();
        user.atDiscussionsListPage.enterValueInSearchField("st cl");
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.clickDeleteIconNextToSearchText();
        user.atDiscussionsListPage.shouldBeNothingDisplayedInFilterByPerson();
        user.atDiscussionsListPage.enterValueInSearchField(" client");
        user.atDiscussionsListPage.shouldBeTestClientPresentInFilterResult();
        user.atDiscussionsListPage.selectTestClient();
        user.atDiscussionsListPage.shouldBeOnlyDiscussionWithTestClientDisplayed();
    }
}
