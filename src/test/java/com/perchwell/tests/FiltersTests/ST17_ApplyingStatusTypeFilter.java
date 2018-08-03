package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import java.awt.*;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST17_ApplyingStatusTypeFilter extends SampleTest {

    @Test
    public void applyingStatusTypeFilter() throws Exception{
            user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            user.atPerchwellPage.skipAllHints();
            user.atPerchPopup.clickNotNowButton();
            user.atPerchwellPage.isListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectActiveFilter();
            user.atSearchPage.selectContractFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel("In Contract");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectContractFilter();
            user.atSearchPage.selectOffMktFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabels("Temporarily Off Market", "Permanently Off Market");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectOffMktFilter();
            user.atSearchPage.selectSoldOrRentFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel("Sold");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.deselectSoldFilter();
            user.atSearchPage.selectRentedFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.shouldSeeListingWithLabel("Rented");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.saveCurrentSearch();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.createNewSearchClick();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnLoadSavedSearchButton();
            user.atSearchPage.clickOnPreviouslyCreatedSearch();
            user.atPerchwellPage.shouldSeeListingWithLabel("Rented");
            user.atPerchwellPage.clickOnMyNewSearch();
            user.atSearchPage.clickOnResetFilter();
            user.atSearchPage.clickOnApplyButton();
            user.atPerchwellPage.checkListingsQuantity();
    }
}
