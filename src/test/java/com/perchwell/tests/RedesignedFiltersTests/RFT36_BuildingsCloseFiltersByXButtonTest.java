package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RFT36_BuildingsCloseFiltersByXButtonTest extends SampleTest {

    @Test
    public void buildingsCloseFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.addBuildingFilter("2");
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.addBuildingFilter("2");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkIfListingsWereChanged();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkIfBuildingsFilterChangesAreSaved();
        user.atSearchPage.deleteFirstBuildingFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteFirstBuildingFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantity();
    }

}
