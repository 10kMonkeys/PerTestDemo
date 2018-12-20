package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR43_CloseFeaturesAndAmenitiesFiltersByXButton extends SampleTest {

    @Test
    public void closeFeaturesAndAmenitiesFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
        user.atSearchPage.clickOnLaundryBuildingFilter();
        user.atSearchPage.clickOnOutdoorSpaceFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
        user.atSearchPage.clickOnLaundryBuildingFilter();
        user.atSearchPage.clickOnOutdoorSpaceFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
        user.atSearchPage.checkLaundryBuildingAndOutdoorSpaceFiltersAreSelected();
        user.atSearchPage.deselectOutDoorSpaceCheckmarkFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnShowMoreFeaturesAndAmenitiesButton();
        user.atSearchPage.checkLaundryBuildingAndOutdoorSpaceFiltersAreSelected();
        user.atSearchPage.deselectOutDoorSpaceCheckmarkFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
