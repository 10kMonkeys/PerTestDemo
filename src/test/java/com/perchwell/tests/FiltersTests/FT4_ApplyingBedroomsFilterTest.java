package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests"})
public class FT4_ApplyingBedroomsFilterTest extends SampleTest {

    @Test
    public void resultAfterApplyingBedroomFilter() throws Exception {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.isListingsQuantity();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.selectFilterStudioBeds();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithStudios();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilterStudioBeds();
        searchSteps.selectFilter1Bed();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("1 BD");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter1Bed();
        searchSteps.selectFilter2Beds();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("2 BD");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter2Beds();
        searchSteps.selectFilter3Beds();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("3 BD");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.deselectFilter3Beds();
        searchSteps.selectFilter4PlusBeds();
        searchSteps.clickOnApplyButton();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bedrooms");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.saveCurrentSearch();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.clickOnLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickOnApplyButton();
        perchwellSteps.checkListingsQuantity();
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.checkNoOneBedsFilterSelected();
        searchSteps.clickOnLoadSavedSearchButton();
        searchSteps.clickOnPreviouslyCreatedSearch();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bedrooms");
        perchwellSteps.clickOnMyNewSearch();
        searchSteps.clickResetFilter();
        searchSteps.checkNoOneBedsFilterSelected();
        searchSteps.clickOnApplyButton();
        perchwellSteps.checkListingsQuantity();
    }
}
