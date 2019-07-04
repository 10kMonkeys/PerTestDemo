package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Districts;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst", "Local_Android_Run"})
public class FT1_FullLocationFilterTest extends SampleTest {

    @Test
    public void fullLocationFilterTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnNeighborhoodsPlusButton();
        user.atSearchPage.deleteManhattan();
        user.atSearchPage.deleteQueens();
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnNeighborhoodsPlusButton();
        user.atSearchPage.selectDistrict(Districts.MIDWOOD, Districts.MIDWOOD_ID);
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingsOnlyFromSelectedDistrict(Districts.MIDWOOD_UP);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnNeighborhoodsPlusButton();
        user.atSearchPage.selectDistrict(Districts.ALL_UPPER_EAST_SIDE, Districts.ALL_UPPER_EAST_SIDE_ID); //update
        user.atSearchPage.deleteMidwoodFromFilter();
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingsFromAllUpperEastSideDistricts(Districts.CARNEGIE_HILL, Districts.LENOX_HILL,
                Districts.UPPER_EAST_SIDE, Districts.YORKVILLE);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnNeighborhoodsPlusButton();
        user.atSearchPage.deleteAllUpperEastSideFromFilter();
        user.atSearchPage.selectDistrict(Districts.CARNEGIE_HILL, Districts.CARNEGIE_HILL_ID);
        user.atSearchPage.selectDistrict(Districts.LENOX_HILL, Districts.LENOX_HILL_ID);
        user.atSearchPage.selectDistrict(Districts.UPPER_EAST_SIDE, Districts.UPPER_EAST_SIDE_ID);
        user.atSearchPage.selectDistrict(Districts.YORKVILLE, Districts.YORKVILLE_ID);
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFourDistrictsListings();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnNeighborhoodsPlusButton();
        user.atSearchPage.deleteCarnegieHillsFromFilter();
        user.atSearchPage.deleteUpperEastSideFromFilter();
        user.atSearchPage.deleteYorkvilleFromFilter();
        user.atSearchPage.selectDistrict(Districts.MIDWOOD, Districts.MIDWOOD_ID);
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingsTwoDistricts(Districts.LENOX_HILL, Districts.MIDWOOD);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnSaveSearchButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSavedSearches(); //search new
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.shouldSeeListingsTwoDistricts(Districts.LENOX_HILL, Districts.MIDWOOD);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkListingsQuantity();
    }
}
