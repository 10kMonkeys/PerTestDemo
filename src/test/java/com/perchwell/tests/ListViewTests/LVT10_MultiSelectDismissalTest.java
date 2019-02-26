package com.perchwell.tests.ListViewTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class LVT10_MultiSelectDismissalTest extends SampleTest {

    @Test
    public void multiSelectDismissalTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.usingComplexSteps.startNewSearch();
        user.atPerchwellPage.selectFirstListing();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.checkNoOneListingIsSelected();
        user.atPerchwellPage.multiSelectMenuIsHidden(); //
        user.atPerchwellPage.checkSortLabel(SortingTypes.NEWEST);
        user.atPerchwellPage.selectFirstListing();
        user.usingComplexSteps.startNewSearch();
        user.atPerchwellPage.checkNoOneListingIsSelected();
        user.atPerchwellPage.multiSelectMenuIsHidden(); //
        user.atPerchwellPage.checkSortLabel(SortingTypes.NEWEST);
        user.atPerchwellPage.selectFirstListing();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkNoOneListingIsSelected();
        user.atPerchwellPage.multiSelectMenuIsHidden(); //
        user.atPerchwellPage.checkSortLabel(SortingTypes.NEWEST);
        user.atPerchwellPage.selectFirstListing();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkNoOneListingIsSelected();
        user.atPerchwellPage.multiSelectMenuIsHidden(); //
        user.atPerchwellPage.checkSortLabel(SortingTypes.NEWEST);
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.swipeUpListViewToRefresh(); //
        user.atPerchwellPage.checkNoOneListingIsSelected();
        user.atPerchwellPage.multiSelectMenuIsHidden(); //
        user.atPerchwellPage.checkSortLabel(SortingTypes.NEWEST);
    }
}
