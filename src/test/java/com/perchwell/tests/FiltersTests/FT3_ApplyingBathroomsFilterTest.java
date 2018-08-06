package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesMapView"})
public class FT3_ApplyingBathroomsFilterTest extends SampleTest {

    @Test
    public void resultAfterApplyingBathroomFilter() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1 BA");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.deselectFilter1Bath();
        user.atSearchPage.selectFilter1AndHalfBath();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1½ BA");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.deselectFilter1AndHalfBath();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("2 BA");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.deselectFilter2Baths();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("3 BA");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.deselectFilter3Baths();
        user.atSearchPage.selectFilter4PlusBaths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bathrooms");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.checkNoOneBathsFilterSelected();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bathrooms");
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.checkNoOneBathsFilterSelected();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
