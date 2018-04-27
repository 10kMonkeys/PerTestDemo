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
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.deselectActiveFilter();
            searchSteps.selectContractFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Contract label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("InContractBanner");
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.deselectContractFilter();
            searchSteps.selectOffMktFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Oft mkt label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("OffMarketBanner");
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.deselectOffMktFilter();
            searchSteps.selectSoldOrRentFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Sold label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("SoldBanner");
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.selectRentedFilter();
            searchSteps.clickApplyButton();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //Rented label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("RentedBanner");
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.saveCurrentSearch();
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.clickLoadSavedSearchButton();
            searchSteps.createNewSearchClick();
            searchSteps.clickApplyButton();
            perchwellSteps.checkListingsQuantity();
            perchwellSteps.clickOnMyNewSearch();
//            searchSteps.checkSalesAndActiveFiltersSelected();
            searchSteps.clickLoadSavedSearchButton();
            searchSteps.clickPreviouslyCreatedSearch();
//            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter(); //24 //Rented label SEARCH PAGE??
//            perchwellSteps.shouldSeeListingOnlyWithLabel("RentedBanner");
            perchwellSteps.clickOnMyNewSearch();
            searchSteps.clickResetFilter();
//            searchSteps.checkSalesAndActiveFiltersSelected();
            searchSteps.clickApplyButton();
            perchwellSteps.checkListingsQuantity();
    }
}
