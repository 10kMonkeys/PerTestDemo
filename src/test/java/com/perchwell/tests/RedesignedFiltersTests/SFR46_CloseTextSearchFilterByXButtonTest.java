package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "RedesignFiltersSearchesSecond", "iOS_RedesignFiltersSearchesSecond", "Android_RedesignFiltersSearchesSecond", "Local_Android_Run"})
public class SFR46_CloseTextSearchFilterByXButtonTest extends SampleTest {

    @Test
    public void closeTextSearchFilterByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.enterTextInTextSearchField("Outdoor Patio");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.enterTextInTextSearchField("Outdoor Patio");
        user.atSearchPage.clickOnAllOfTheseTermsButton();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkThatAllOfTheseTermsButtonSelected();
        user.atSearchPage.checkThatTextSearchFieldSavedText("Outdoor Patio");
        user.atSearchPage.clearTextSearchField();
        user.atSearchPage.enterTextInTextSearchField("Gym");
        user.atSearchPage.clickOnAnyOfTheseTermsButton();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clearTextSearchField();
        user.atSearchPage.enterTextInTextSearchField("Gym");
        user.atSearchPage.clickOnAnyOfTheseTermsButton();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
