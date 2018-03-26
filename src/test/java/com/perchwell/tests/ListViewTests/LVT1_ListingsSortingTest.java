package com.perchwell.tests.ListViewTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListViewTests"})
public class LVT1_ListingsSortingTest extends SampleTest {

    @Test
    public void sortListings() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickListingsByButton();
        perchwellSteps.clickLeastExpensiveButton();
        perchwellSteps.checkSortLabel("BY LEAST EXPENSIVE");
        perchwellSteps.shouldListingBeSortedByLeastExpensive();
        perchwellSteps.clickListingsByButton();
        perchwellSteps.clickMostExpensiveButton();
        perchwellSteps.checkSortLabel("BY MOST EXPENSIVE");
        perchwellSteps.shouldListingBeSortedByMostExpensive();
        perchwellSteps.clickListingsByButton();
        perchwellSteps.clickBedroomsSortButton();
        perchwellSteps.shouldListingBeSortedByBedrooms();
        perchwellSteps.checkSortLabel("BY BEDROOMS");
        perchwellSteps.clickListingsByButton();
        perchwellSteps.clickBathroomsSortButton();
        perchwellSteps.checkSortLabel("BY BATHROOMS");
        perchwellSteps.shouldListingBeSortedByBathrooms();
    }
}
