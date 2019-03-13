package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsThird"})
public class TI28_TagDuplicationOtherTagTest extends SampleTest {

    @Ignore
    @Test
    public void tagDuplicationOtherTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.swipeJustCreatedTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDuplicateButton();
        user.atEditTagPage.clickOnCancelButton();
        user.atEditTagPage.shouldSeeEditTagLabel();
        user.atEditTagPage.clickOnDuplicateButton();
        user.atEditTagPage.fillInDuplicateTagName();
        user.atEditTagPage.clickOnSaveButton();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.checkDuplicatedTagBelowOtherTagsLabel();
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.checkDuplicatedAndExistingTagsItemsAreSame();
        user.atTagsPage.closeTagsPage();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.checkDuplicatedAndExistingTagsItemsAreSame();
    }
}
