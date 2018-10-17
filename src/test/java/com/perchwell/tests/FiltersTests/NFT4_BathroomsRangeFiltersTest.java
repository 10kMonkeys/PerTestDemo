package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT4_BathroomsRangeFiltersTest extends SampleTest {

    @Test
    public void bathroomsRangeFiltersTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectBathroomsRangeOption();
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
        user.atSearchPage.deselectFilter4Baths();
        user.atSearchPage.selectFilter1Bath();
        user.atSearchPage.selectFilter3Baths();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.listingsFilteredByMultiBathroomsFilters();
    }
}
