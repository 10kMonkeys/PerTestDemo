package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST17_ApplyingStatusTypeFilter extends SampleTest {

    @Test
    public void applyingStatusTypeFilter() throws Exception{
            loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("client_test_email"),
                    AppProperties.INSTANCE.getProperty("client_test_password"));
            perchwellSteps.skipAllHints();
            perchPopupSteps.clickNotNowButton();
            perchwellSteps.isListingsQuantity();
            perchwellSteps.clickMyNewSearch();
            searchSteps.deselectActiveFilter();
            searchSteps.selectContractFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Contract label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("InContractBanner");
            perchwellSteps.clickMyNewSearch();
            searchSteps.deselectContractFilter();
            searchSteps.selectOffMktFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Oft mkt label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("OffMarketBanner");
            perchwellSteps.clickMyNewSearch();
            searchSteps.deselectOffMktFilter();
            searchSteps.selectSoldOrRentFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Sold label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("SoldBanner");
            perchwellSteps.clickMyNewSearch();
            searchSteps.selectRentedFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Rented label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("RentedBanner");
            perchwellSteps.clickMyNewSearch();
            searchSteps.saveCurrentSearch();
            perchwellSteps.clickMyNewSearch();
            searchSteps.clickLoadSavedSearchButton();
            searchSteps.createNewSearchClick();
            searchSteps.clickApplyButton();
            perchwellSteps.checkListingsQuantity();
            perchwellSteps.clickMyNewSearch();
//            searchSteps.checkSalesAndActiveFiltersSelected();
            searchSteps.clickLoadSavedSearchButton();
            searchSteps.clickPreviouslyCreatedSearch();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //24 //Rented label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("RentedBanner");
            perchwellSteps.clickMyNewSearch();
            searchSteps.clickResetFilter();
//            searchSteps.checkSalesAndActiveFiltersSelected();
            searchSteps.clickApplyButton();
            perchwellSteps.checkListingsQuantity();
    }
}
