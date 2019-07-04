package com.perchwell.tests.EditTagTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsThird_IGNORED", "Android_TagsThird", "TagsThird", "Local_Android_Run"})
public class TI27_TagDuplicationClientTagTest extends SampleTest {

    @Test
    public void tagDuplicationClientTag() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("tags_third_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.removeAllTagPills();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.removeAllTags();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.swipeFirstExistingTag();
        user.atTagsPage.clickOnEditTagIcon();
        user.atEditTagPage.clickOnDuplicateButton();
        user.atEditTagPage.clickOnCancelButton();
        user.atEditTagPage.shouldSeeEditTagLabel();
        user.atEditTagPage.clickOnDuplicateButton();
        user.atEditTagPage.fillInDuplicateTagName();
        user.atEditTagPage.clickOnPopUpSaveButton();
        user.atTagsPage.shouldSeeAddTagLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.allTagsAreSelected(1);
        user.atTagsPage.checkTagBelowOtherTagsLabelWithTwoTagPills();
        user.atTagsPage.shouldSeeFirstExistingTagsPill();
        user.atTagsPage.shouldSeeDuplicatedTagsPill();
        user.atTagsPage.checkDuplicatedAndExistingTagsItemsAreSame();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.checkBothTagsGreenColor(1);
        user.atOpenedBuildingPage.checkBothTagsGrayColor(1);
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.shouldSeeDuplicatedTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstExistingTag();
        user.atTagsPage.getFirstTagsItemsValue();
        user.atTagsPage.clearTextField();
        user.atTagsPage.searchDuplicatedTag();
        user.atTagsPage.checkDuplicatedAndExistingTagsItemsAreSame();
    }
}
