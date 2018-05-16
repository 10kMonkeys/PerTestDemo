package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST17_ApplyingStatusTypeFilter extends SampleTest {

    @Test
    public void applyingStatusTypeFilter() throws Exception{
            user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("client_email"),
                    AppProperties.INSTANCE.getProperty("client_password"));
            user.atPerchwellPage.skipAllHints();
            user.atPerchPopup.clickNotNowButton();
            user.atPerchwellPage.isListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectActiveFilter();
            user.atSearchPage.selectContractFilter();
            user.atSearchPage.clickOnApplyButton();
//            user.atSearchPage.isBuildingsFilteredAfterApplyingStatusFilter(); //Contract label SEARCH PAGE??
//            user.atPerchwellPage.shouldSeeListingOnlyWithLabel("InContractBanner");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectContractFilter();
            user.atSearchPage.selectOffMktFilter();
            user.atSearchPage.clickOnApplyButton();
//            user.atSearchPage.isBuildingsFilteredAfterApplyingStatusFilter(); //Oft mkt label SEARCH PAGE??
//            user.atPerchwellPage.shouldSeeListingOnlyWithLabel("OffMarketBanner");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectOffMktFilter();
            user.atSearchPage.selectSoldOrRentFilter();
            user.atSearchPage.clickOnApplyButton();
//            user.atSearchPage.isBuildingsFilteredAfterApplyingStatusFilter(); //Sold label SEARCH PAGE??
//            user.atPerchwellPage.shouldSeeListingOnlyWithLabel("SoldBanner");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.selectRentedFilter();
            user.atSearchPage.clickOnApplyButton();
//            user.atSearchPage.isBuildingsFilteredAfterApplyingStatusFilter(); //Rented label SEARCH PAGE??
//            user.atPerchwellPage.shouldSeeListingOnlyWithLabel("RentedBanner");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.saveCurrentSearch();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.createNewSearchClick();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
//           user.atSearchPage.checkSalesAndActiveFiltersSelected();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.clickOnPreviouslyCreatedSearch();
//            user.atSearchPage.isBuildingsFilteredAfterApplyingStatusFilter(); //24 //Rented label SEARCH PAGE??
//            user.atPerchwellPage.shouldSeeListingOnlyWithLabel("RentedBanner");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnResetFilter();
//            user.atSearchPage.checkSalesAndActiveFiltersSelected();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
    }
}
