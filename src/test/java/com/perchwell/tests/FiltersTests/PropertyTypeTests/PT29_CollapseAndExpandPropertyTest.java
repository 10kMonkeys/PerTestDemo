package com.perchwell.tests.FiltersTests.PropertyTypeTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class PT29_CollapseAndExpandPropertyTest extends SampleTest {

    @Test
    public void collapseAndExpandProperty(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnCollapsePropertyButton();
        user.atSearchPage.clickOnCollapsePropertyButton();
        user.atSearchPage.checkCondoFilterIsSelectedInSalesProperty();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnCollapsePropertyButton();
        user.atSearchPage.clickOnCollapsePropertyButton();
        user.atSearchPage.checkCondoFilterIsSelectedInRentalsProperty();
    }
}
