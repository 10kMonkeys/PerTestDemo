package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "RedesignFiltersSearchesFirst", "iOS_RedesignFiltersSearchesFirst", "Android_RedesignFiltersSearchesFirst"})
public class SFR40_CloseTotalRoomsFilterByXButtonTest extends SampleTest {

    @Test
    public void closeTotalRoomsFilterByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.fillInTotalRoomsMinField("6");
        user.atSearchPage.fillInTotalRoomsMaxField("9");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.fillInTotalRoomsMinField("6");
        user.atSearchPage.fillInTotalRoomsMaxField("9");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.TOTAL_ROOMS_MIN_VALUE, "6");
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.TOTAL_ROOMS_MAX_VALUE, "9");
        user.atSearchPage.clearTotalRoomsMinValueFiled();
        user.atSearchPage.clearTotalRoomsMaxValueFiled();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearTotalRoomsMinValueFiled();
        user.atSearchPage.clearTotalRoomsMaxValueFiled();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
