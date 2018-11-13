package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.data.ListingLabels;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "iOS_Third", "Android_Third", "Third"})
public class ST17_ApplyingStatusTypeFilter extends SampleTest {

    @Ignore
    @Test
    public void applyingStatusTypeFilter() throws Exception {
            user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            user.atPerchwellPage.skipAllHints();
            user.atPerchPopup.clickNotNowButton();
            user.atPerchwellPage.isListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.selectFilter4PlusBaths();
            user.atSearchPage.deselectActiveFilter();
            user.atSearchPage.selectContractFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel(ListingLabels.IN_CONTRACT); //Labels names is missing in dom
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectContractFilter();
            user.atSearchPage.selectOffMktFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabels(ListingLabels.TEMP_OFF_MARKET,
                    ListingLabels.PERM_OFF_MARKET);
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectOffMktFilter();
            user.atSearchPage.selectSoldOrRentFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel(ListingLabels.SOLD);
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.selectRentedFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel(ListingLabels.RENTED);
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.saveCurrentSearch();
            user.atPerchwellPage.clickOnMyNewSearchWithPause();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.createNewSearchClick();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.checkSalesAndActiveFiltersSelected();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.clickOnPreviouslyCreatedSearch();
            user.atPerchwellPage.shouldSeeListingWithLabel(ListingLabels.RENTED);
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnResetFilter();
            user.atSearchPage.checkSalesAndActiveFiltersSelected();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
    }
}
