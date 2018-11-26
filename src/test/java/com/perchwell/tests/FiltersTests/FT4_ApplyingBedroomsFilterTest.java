package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class FT4_ApplyingBedroomsFilterTest extends SampleTest {

    @Test
    public void resultAfterApplyingBedroomFilter() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithStudios();
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectFilterStudioBeds();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1 BD");
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectFilter1Bed();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("2 BD");
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectFilter2Beds();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("3 BD");
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectFilter3Beds();
        user.atSearchPage.selectFilter4PlusBeds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bedrooms");
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch(); // search old
        user.atSearchPage.clickOnMySavedSearches(); // search old
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.atSearchPage.clickOnMySavedSearches(); //search old
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bedrooms");
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBedsMinimumFilterSelected();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
