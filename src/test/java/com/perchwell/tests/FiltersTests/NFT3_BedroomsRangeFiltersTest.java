package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT3_BedroomsRangeFiltersTest extends SampleTest {

    @Test
    public void bedroomsRangeFilters() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectBedroomsRangeOption();
//        user.atSearchPage.selectFilterStudioBeds();
//        user.atSearchPage.clickOnApplyButton();
//        user.atPerchwellPage.shouldSeeListingOnlyWithStudios();
//        user.atPerchwellPage.clickOnMyNewSearch();
//        user.atSearchPage.deselectFilterStudioBeds();
//        user.atSearchPage.selectFilter1Bed();
//        user.atSearchPage.clickOnApplyButton();
//        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("1 BD");
//        user.atPerchwellPage.clickOnMyNewSearch();
//        user.atSearchPage.deselectFilter1Bed();
//        user.atSearchPage.selectFilter2Beds();
//        user.atSearchPage.clickOnApplyButton();
//        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("2 BD");
//        user.atPerchwellPage.clickOnMyNewSearch();
//        user.atSearchPage.deselectFilter2Beds();
//        user.atSearchPage.selectFilter3Beds();
//        user.atSearchPage.clickOnApplyButton();
//        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedRooms("3 BD");
//        user.atPerchwellPage.clickOnMyNewSearch();
//        user.atSearchPage.deselectFilter3Beds();
//        user.atSearchPage.selectFilter4PlusBeds();
//        user.atSearchPage.clickOnApplyButton();
//        user.atPerchwellPage.shouldSeeListing4AndMoreRooms("bedrooms");
//        user.atPerchwellPage.clickOnMyNewSearch();
//        user.atSearchPage.deselectFilter4Beds();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMultipleBedroomsFilters();
    }
}
