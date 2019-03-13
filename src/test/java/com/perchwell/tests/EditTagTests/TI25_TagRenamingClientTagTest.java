package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ClientGroups;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsThird"})
public class TI25_TagRenamingClientTagTest extends SampleTest {

    @Test
    public void tagRenamingClientTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.addNewClient(ClientGroups.ACTIVELY_SEARCHING);
        user.atClientPage.clickOnCrossBackButtonFromClients();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.getFirstBuildingAddress();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedClientTag();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.swipeUpToMyTagsLabel();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.shouldSeeFirstExistingTag();
        user.atTagsPage.checkCustomTagsItemsValue();
        user.atEditTagPage.checkIfSaveButtonIsNotDisplayed();
        user.atEditTagPage.changeClientTagName();
        user.atEditTagPage.checkIfSaveButtonIsDisplayed();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.checkIfTagsPillIsRenamed();
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeRenamedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.checkIfFirstExistingTagIsNotVisible();
        user.atTagsPage.clearSearchField();
        user.atTagsPage.searchRenamedTag();
        user.atTagsPage.checkIfRenamedTagIsVisible();
        user.atTagsPage.closeTagsPage();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.enterJustCreatedTagValueInSearchField();
        user.atClientPage.shouldSeeFirstTagClient();
    }
}
