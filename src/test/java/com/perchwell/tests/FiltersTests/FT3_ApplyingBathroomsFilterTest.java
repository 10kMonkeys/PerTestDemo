package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class FT3_ApplyingBathroomsFilterTest extends SampleTest {

    @Test
    public void resultAfterApplyingBathroomFilter() {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.isListingsQuantity();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.selectFilter1Bath();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("1 BA");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter1Bath();
        searchSteps.selectFilter1AndHalfBath();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("1½ BA");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter1AndHalfBath();
        searchSteps.selectFilter2Baths();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("2 BA");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter2Baths();
        searchSteps.selectFilter3Baths();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("3 BA");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter3Baths();
        searchSteps.selectFilter4PlusBaths();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bathrooms");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.saveCurrentSearch();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.clickOnLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickOnApplyButton();
        perchwellSteps.checkListingsQuantity();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.checkNoOneBathsFilterSelected();
        searchSteps.clickOnLoadSavedSearchButton();
        searchSteps.clickOnPreviouslyCreatedSearch();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bathrooms");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.clickResetFilter();
        searchSteps.checkNoOneBathsFilterSelected();
        searchSteps.clickOnApplyButton();
        perchwellSteps.checkListingsQuantity();
    }
}
