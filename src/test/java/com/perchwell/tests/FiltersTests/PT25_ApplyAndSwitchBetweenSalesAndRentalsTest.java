package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Properties;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond", "Local_Android_Run"})
public class PT25_ApplyAndSwitchBetweenSalesAndRentalsTest extends SampleTest {

    @Test
    public void applyAndSwitchBetweenSalesAndRentals() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.CONDO);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectCondoFilter();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.COOP);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectCoopFilter();
        user.atSearchPage.swipeToPropertiesSection(); ///////////
        user.atSearchPage.selectTownhouseFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.TOWNHOUSE);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.selectSalesProperty();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.checkNoOnePropertyIsSelectedInRentals();
        user.atSearchPage.selectSalesProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.selectCondopFilter();
        user.atSearchPage.selectTownhouseFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInSales();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.CONDO_RENTAL);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectCondoFilter();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.COOP_RENTAL);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectCoopFilter();
        user.atSearchPage.selectTownhouseFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.TOWNHOUSE_RENTAL);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.deselectTownhouseFilter();
        user.atSearchPage.selectRentalFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.checkListingsType(Properties.RENTAL);
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.selectCoopFilter();
        user.atSearchPage.selectCondopFilter();
        user.atSearchPage.selectTownhouseFilter();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.swipeToPropertiesSection();
        user.atSearchPage.checkNoOnePropertyIsSelectedInRentals();
    }
}
