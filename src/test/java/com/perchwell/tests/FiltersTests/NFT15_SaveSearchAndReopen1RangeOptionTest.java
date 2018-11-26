package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond"})
public class NFT15_SaveSearchAndReopen1RangeOptionTest extends SampleTest {

    @Test
    public void saveSearchAndReopen1RangeOption() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.atSearchPage.clickOnMySavedSearches(); //search old
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.atSearchPage.clickOnMySavedSearches(); //search old
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.check2BedsRangeFilterSelected();
        user.atSearchPage.check2BathsRangeFilterSelected();
    }
}
