package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_MultipleTagsSecond", "Android_MultipleTagsSecond", "MultipleTagsSecond"})
public class TI51_TagsPageEditTagEntireTagDeletionTest extends SampleTest {

    @Ignore
    @Test
    public void tagsPageEditTagEntireTagDeletionTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("muilt_tags_second_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.selectSecondListingAfterFirst();
        user.atMyTagsPage.clickOnMoreOptionsButton();
        user.atMyTagsPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDeleteButton();
        user.atEditTagPage.confirmRemoving();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
        user.atTagsPage.checkIfJustCreatedTagsPillIsNotVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atMyTagsPage.clickOnCrossFromAccountTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.checkTagsIconCountForFirstListing("tag");
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
        user.atTagsPage.checkIfJustCreatedTagsPillIsNotVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
        user.atTagsPage.checkIfJustCreatedTagsPillIsNotVisible();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnListingsBuilding();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.checkIfJustCreatedTagIsNotVisible();
        user.atTagsPage.checkIfJustCreatedTagsPillIsNotVisible();
    }
}
