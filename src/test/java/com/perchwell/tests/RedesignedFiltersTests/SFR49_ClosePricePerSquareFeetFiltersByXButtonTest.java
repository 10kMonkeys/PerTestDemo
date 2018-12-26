package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR49_ClosePricePerSquareFeetFiltersByXButtonTest extends SampleTest {

    @Test
    public void closePricePerSquareFeetFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.fillInPricePerSquareFeetMinField("2000");
        user.atSearchPage.fillInPricePerSquareFeetMaxField("3000");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.fillInPricePerSquareFeetMinField("2000");
        user.atSearchPage.fillInPricePerSquareFeetMaxField("3000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.PRICE_PER_SQFT_MIN_VALUE, "2000");
        user.atSearchPage.checkIfFieldIsFilledByCorrectValue(Filters.PRICE_PER_SQFT_MAX_VALUE, "3000");
        user.atSearchPage.clearMinPricePerSFTField();
        user.atSearchPage.clearMaxPricePerSFTField();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearMinPricePerSFTField();
        user.atSearchPage.clearMaxPricePerSFTField();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
