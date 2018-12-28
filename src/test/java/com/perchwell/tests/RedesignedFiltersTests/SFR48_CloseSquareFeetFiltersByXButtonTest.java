package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "RedesignFiltersSearchesSecond", "iOS_RedesignFiltersSearchesSecond", "Android_RedesignFiltersSearchesSecond"})
public class SFR48_CloseSquareFeetFiltersByXButtonTest extends SampleTest {

    @Test
    public void closeSquareFeetFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setSquareFeetMinFilter("1");
        user.atSearchPage.setSquareFeetMaxFilter("1000");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setSquareFeetMinFilter("1");
        user.atSearchPage.setSquareFeetMaxFilter("1000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.SQUARE_FEET_MIN_VALUE, "1");
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.SQUARE_FEET_MAX_VALUE, "1000");
        user.atSearchPage.clearSquareFeetMinFilter();
        user.atSearchPage.clearSquareFeetMaxFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearSquareFeetMinFilter();
        user.atSearchPage.clearSquareFeetMaxFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
