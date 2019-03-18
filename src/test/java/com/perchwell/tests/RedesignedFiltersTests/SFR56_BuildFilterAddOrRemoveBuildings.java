package com.perchwell.tests.RedesignedFiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class SFR56_BuildFilterAddOrRemoveBuildings extends SampleTest {

    @Test
    public void buildFilterAddOrRemoveBuildings() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.DAKOTA);
        user.atSearchPage.clickOnFirstBuilding();

        user.atSearchPage.checkFirstBuildingIsSelected();
        user.atSearchPage.checkBuildingPillIsDisplayed("111");
        user.atSearchPage
    }
}
