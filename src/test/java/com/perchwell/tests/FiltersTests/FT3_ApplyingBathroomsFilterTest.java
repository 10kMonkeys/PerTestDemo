package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class FT3_ApplyingBathroomsFilterTest extends SampleTest {

    @Test
    public void resultAfterApplyingBathroomFilter()  {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1 BA");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter1Bath();
        user.atSearchPage.selectFilter1AndHalfBath();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1½ BA");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter1AndHalfBath();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("2 BA");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter2Baths();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("3 BA");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter3Baths();
        user.atSearchPage.selectFilter4PlusBaths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bathrooms");
        user.atSearchPage.saveCurrentSearch();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bathrooms");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBathsMinimumFilterSelected();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
