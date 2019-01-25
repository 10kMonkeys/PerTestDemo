package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI9_TagGroupsTest extends SampleTest {

    @Test
    public void tagGroupsTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();

//        user.atPerchwellPage.clickOnOpenAccountButton();
//        user.atAccountPage.clickOnClientsLabel();
//        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING); //update
//        user.atClientPage.clickOnCrossBackButtonFromClients();
//        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag(); //update

        user.atTagsPage.searchJustCreatedTag();
//        user.atTagsPage.checkTagBelowOtherTagsLabel();
        user.atTagsPage.clearTextField();

        user.atTagsPage.searchJustCreatedClientTag();
//        user.atTagsPage.checkClientTagBelowSharedWithClientLabel();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();

        user.atTagsPage.searchJustCreatedTag();
//        user.atTagsPage.checkTagBelowOtherTagsLabel();
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchJustCreatedClientTag();
//        user.atTagsPage.checkClientTagBelowSharedWithClientLabel();
    }
}
