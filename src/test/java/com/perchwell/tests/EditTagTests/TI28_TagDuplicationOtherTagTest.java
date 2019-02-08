package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI28_TagDuplicationOtherTagTest extends SampleTest {

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
        user.atEditTagPage.clickOnDuplicateButton();//
        user.atEditTagPage.clickOnCancelButton();//
        user.atEditTagPage.shouldSeeEditTagLabel();//
        user.atEditTagPage.clickOnDuplicateButton();//
        user.atEditTagPage.fillInDuplicateTagName();//
        user.atEditTagPage.clickOnSaveButton();//
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicateTag();//
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.checkTagBelowOtherTagsLabel();//want to update
        user.atTagsPage.shouldSeeJustCreatedTagsPill();
        user.atTagsPage.shouldSeeDuplicateTagsPill();//
        user.atTagsPage.closeTagsPage();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.shouldSeeDuplicateTag();//
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.DAKOTA);
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.shouldSeeAddedNewTag();
        user.atOpenedBuildingPage.shouldSeeDuplicateTag();//
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.getFirstTagsItemsValue();//
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicateTag();//
        user.atTagsPage.checkDuplicateAndExistingTagsItemsAreSame();//
    }
}
