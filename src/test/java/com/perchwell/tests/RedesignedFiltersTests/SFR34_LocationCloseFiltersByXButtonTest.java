package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "RedesignFiltersSearchesFirst", "iOS_RedesignFiltersSearchesFirst", "Android_RedesignFiltersSearchesFirst", "Local_Android_Run"})
public class SFR34_LocationCloseFiltersByXButtonTest extends SampleTest {

    @Test
    public void locationCloseFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteManhattan();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteManhattan();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkManhattanIsNotVisible();
        user.atSearchPage.deleteBrooklyn();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteBrooklyn();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
