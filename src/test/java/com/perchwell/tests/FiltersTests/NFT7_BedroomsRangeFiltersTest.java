package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT7_BedroomsRangeFiltersTest extends SampleTest {

    @Test
    public void bedroomsRangeFilters() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilterStudioBeds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithStudios();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilterStudioBeds();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedBeds("1 BD");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter1Bed();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedBeds("2 BD");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter2Beds();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingOnlyWithSelectedBeds("3 BD");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter3Beds();
        user.atSearchPage.selectFilter4PlusBeds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListing4AndMoreBeds("bedrooms");
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deselectFilter4Beds();
        user.atSearchPage.selectFilter1Bed();
        user.atSearchPage.selectFilter3Beds();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsAreFilteredByMultipleBedroomsFilters();
    }
}
