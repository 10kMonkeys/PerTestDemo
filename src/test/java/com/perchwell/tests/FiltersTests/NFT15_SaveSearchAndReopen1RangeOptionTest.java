package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT15_SaveSearchAndReopen1RangeOptionTest extends SampleTest {

    @Test
    public void saveSearchAndReopen1RangeOption() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.saveCurrentSearch();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.check2BedsRangeFilterSelected();
        user.atSearchPage.check2BathsRangeFilterSelected();
    }
}
