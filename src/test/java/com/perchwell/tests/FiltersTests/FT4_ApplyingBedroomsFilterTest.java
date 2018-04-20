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
        perchwellSteps.clickMyNewSearch();
        searchSteps.selectFilterStudioBeds();
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithStudios();
        perchwellSteps.clickMyNewSearch();
        searchSteps.deselectFilterStudioBeds();
        searchSteps.selectFilter1Bed();
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("1 BD");
        perchwellSteps.clickMyNewSearch();
        searchSteps.deselectFilter1Bed();
        searchSteps.selectFilter2Beds();
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("2 BD");
        perchwellSteps.clickMyNewSearch();
        searchSteps.deselectFilter2Beds();
        searchSteps.selectFilter3Beds();
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListingOnlyWithSelectedRooms("3 BD");
        perchwellSteps.clickMyNewSearch();
        searchSteps.deselectFilter3Beds();
        searchSteps.selectFilter4PlusBeds();
        searchSteps.clickApplyButton();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bedrooms");
        perchwellSteps.clickMyNewSearch();
        searchSteps.saveCurrentSearch();
        perchwellSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.createNewSearchClick();
        searchSteps.clickApplyButton();
        perchwellSteps.checkListingsQuantity();
        perchwellSteps.clickMyNewSearch();
        searchSteps.checkNoOneBedsFilterSelected();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.clickPreviouslyCreatedSearch();
        perchwellSteps.shouldSeeListing4AndMoreRooms("bedrooms");
        perchwellSteps.clickMyNewSearch();
        searchSteps.clickResetFilter();
        searchSteps.checkNoOneBedsFilterSelected();
        searchSteps.clickApplyButton();
        perchwellSteps.checkListingsQuantity();
    }
}
