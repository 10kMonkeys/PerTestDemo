package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsThird"})
public class TI10_ListingTagDeletionTest extends SampleTest {

    @Test
    public void listingTagDeletion() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atOpenedBuildingPage.clearTagsList();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(0);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnTagPillInSearchField();
        user.atTagsPage.checkIfTagsCheckMarIsNotSelected();
        user.atTagsPage.checkIfTagPillIsRemoved();
        user.atTagsPage.checkIfFirstExistingTagsItemsListIsChanged(0);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
    }
}
