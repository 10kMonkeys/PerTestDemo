package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "RedesignFiltersSearchesSecond", "iOS_RedesignFiltersSearchesSecond", "Android_RedesignFiltersSearchesSecond", "Local_Android_Run"})
public class SFR47_CloseResaleSponsorFiltersByXButtonTest extends SampleTest {

    @Test
    public void closeResaleSponsorFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectSponsorOption();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectSponsorOption();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfSponsorOptionIsSelected();
        user.atSearchPage.selectResaleOption();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectResaleOption();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
