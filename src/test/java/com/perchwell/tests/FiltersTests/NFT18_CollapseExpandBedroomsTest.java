package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesFirst", "iOS_FiltersSearchesFirst", "Android_FiltersSearchesFirst"})
public class NFT18_CollapseExpandBedroomsTest extends SampleTest {

    @Test
    public void collapseExpandBedrooms() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.checkBedroomsRangeButtonIsNotSelected();
        user.atSearchPage.check2BedsMinFilterSelected();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.checkBedroomsRangeButtonSelected();
        user.atSearchPage.check2BedsRangeFilterSelected();
        user.atSearchPage.selectFilter4PlusBeds();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.collapseBedroomsFilters();
        user.atSearchPage.checkBedroomsRangeButtonSelected();
        user.atSearchPage.checkMultiBedroomsFiltersSelected();
    }
}
