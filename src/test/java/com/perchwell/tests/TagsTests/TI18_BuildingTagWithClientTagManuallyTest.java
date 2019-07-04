package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsSecond", "Android_TagsSecond", "TagsSecond", "Local_Android_Run"})
public class TI18_BuildingTagWithClientTagManuallyTest extends SampleTest {

    @Test
    public void buildingTagWithClientTagManually() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.getFifthBuildingAddress();
        user.atOpenedBuildingPage.clearTagsList();
        user.atOpenedBuildingPage.clickOnMyTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.getTestClientsItemsValue();
        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.checkIfClientTagsItemsListIsChanged(1);
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atOpenedBuildingPage.shouldSeeFirstExistingTag();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.clickOnCrossBackButtonFromAddressSearch();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.clickOnFirstClientTag();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.shouldSeeTaggedBuilding();
    }
}
