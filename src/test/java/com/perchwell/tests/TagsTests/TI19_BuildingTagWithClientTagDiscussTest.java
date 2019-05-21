package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsSecond"})
public class TI19_BuildingTagWithClientTagDiscussTest extends SampleTest {

    @Test
    public void buildingTagWithClientTagDiscuss() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
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
