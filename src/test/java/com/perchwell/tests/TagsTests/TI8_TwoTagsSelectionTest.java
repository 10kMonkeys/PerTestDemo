package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsFirst"})
public class TI8_TwoTagsSelectionTest extends SampleTest {

    @Test
    public void twoTagsSelection() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(4);
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.selectThirdListingAfterSecond();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.setRandomFirstTagAndSave();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnDeselectAllListingsButton();
        user.atPerchwellPage.selectThirdAndFourthListingsByAddress();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.setRandomSecondTagAndSave();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.getFifthBuildingAddress();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.searchSecondCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchFirstCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.searchSecondCreatedTag();
        user.atTagsPage.clickOnFirstTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkTaggedListingsAmount(5);
        user.atMyTagsPage.checkIfFourListingsAndBuildingAreDisplayed();
        user.atMyTagsPage.swipeDownSecondTagsPill();
        user.atMyTagsPage.clickOnFirstTagsPill();
        user.atMyTagsPage.checkTaggedListingsAmount(3);
        user.atMyTagsPage.checkIfTwoLastListingsAndBuildingAreDisplayed();
    }
}
