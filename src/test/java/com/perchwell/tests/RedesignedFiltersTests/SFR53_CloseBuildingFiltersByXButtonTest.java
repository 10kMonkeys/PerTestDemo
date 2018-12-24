package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR53_CloseBuildingFiltersByXButtonTest extends SampleTest {

    @Test
    public void closeBuildingFiltersByXButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinBldgWidthValue("1"); //To finish, when swipe elements will be added
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinBldgWidthValue("1"); //To finish, when swipe elements will be added
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.checkFilterIsApplied();
        user.atPerchwellPage.isListingsQuantity();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
//        user.atSearchPage.checkIfMinBldgWidthValueIsCorrect(); //"selected" attribute is missed
        user.atSearchPage.setMinBldgWidthValue("2"); //To finish, when swipe elements will be added
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.atPerchwellPage.clickOnSaveButton();
        user.atSearchPage.setSearchName();
        user.atSearchPage.clickOnSaveButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setMinBldgWidthValue("2"); //To finish, when swipe elements will be added
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.closeSearch();
        user.atPerchwellPage.checkListingsQuantityIsEqual();
    }
}
