package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsSecond", "Local_Android_Run"})
public class TI17_BuildingTagDeletionTest extends SampleTest {

    @Test
    public void BuildingTagDeletionTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.UNITED_NAT_PLAZA);
        user.atSearchPage.openFirstBuilding();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnExistingTag();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.oneItemForSearchedTagIsShown();
        user.atTagsPage.clickOnJustAddedTagPil();
        user.atTagsPage.checkNoOneTagPillIsShown();
        user.atTagsPage.shouldSeeJustCreatedTag(1);
        user.atTagsPage.noOneTagWithItemIsShown();
        user.atTagsPage.allTagsAreDeselected(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldNotSeeJustCreatedTag();
    }
}
