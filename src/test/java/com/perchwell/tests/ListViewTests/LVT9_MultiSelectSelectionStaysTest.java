package com.perchwell.tests.ListViewTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListViewTests", "ListView", "iOS_ListView", "Android_ListView"})
public class LVT9_MultiSelectSelectionStaysTest extends SampleTest {

    @Test
    public void listView() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.openFirstBuilding();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnTagIconOnFirstListing();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnDiscussionIconOnFirstListing();
        user.atDiscussionPage.clickOnArrowBackFromDiscussionToListViewButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();
        user.atPerchwellPage.checkOneListingIsSelected();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.clickOnCrossBackButtonFromClients();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.clickOnCrossBackButtonFromClients();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnDiscussionsLabel();
        user.atDiscussionPage.clickOnCrossBackButtonFromDiscussionsPage();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.clickOnCrossBackFromTagsButton();
        user.atAccountPage.closeAccountMenu();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.inSearchMenu.openSearchMenu();
        user.inSearchMenu.closeSearchMenu();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.inSearchMenu.openAddressSearch();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
        user.atSearchPage.closeAddressSearch();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.closeSavedSearches();
        user.atPerchwellPage.checkSelectionMenuIsShown(1);
    }
}
