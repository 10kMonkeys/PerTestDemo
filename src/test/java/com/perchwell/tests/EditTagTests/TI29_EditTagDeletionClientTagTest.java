package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsThird"})
public class TI29_EditTagDeletionClientTagTest extends SampleTest {

    @Test
    public void editTagDeletionClientTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
//        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT_TI29);
        user.atTagsPage.clickOnFirstTagAndGetValue(); //new
//        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
//        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT_TI29);
        user.atTagsPage.searchFirstExistingTag(); //new
//        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.clickOnFirstTag(); //new
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.swipeUpToMyTagsLabel();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDeleteButton();
        user.atEditTagPage.cancelTagRemoving();
        user.atEditTagPage.shouldSeeEditTagLabel();
        user.atEditTagPage.clickOnArrowBackFromEditTagPage();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDeleteButton();
        user.atEditTagPage.confirmRemoving();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.checkIfFirstExistingTagsPillIsNotVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.clickOnCrossFromAccountTagsButton(); //new
        user.atAccountPage.clickOnClientsLabel();
//        user.atClientPage.enterValueInSearchField(SearchRequests.CLIENT_TI29);
        user.atClientPage.enterJustCreatedTagValueInSearchField(); //new
//        user.atClientPage.shouldSeeTestClient();
        user.atClientPage.shouldSeeFirstTagClient();
    }
}
