package com.perchwell.tests.MapTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"MapTests"})
public class MVTF1_ListingsSortingTest extends SampleTest {

    @Test
    public void sortListingsOnMap() throws Exception {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
                AppProperties.INSTANCE.getProperty("client_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickMap();
        mapSteps.clickOnNotNowButton();
        mapSteps.selectPinOnMap();
        mapSteps.clickOnSortingSectionButton();
        mapSteps.selectLeastExpensiveOption();
        mapSteps.checkSortLabel(SortingTypes.LEASTEXPENSIVE);
        mapSteps.shouldListingBeSortedByLeastExpensive();
        mapSteps.clickOnSortingSectionButton();
        mapSteps.selectMostExpensiveOption();
        mapSteps.checkSortLabel(SortingTypes.MOSTEXPENSIVE);
        mapSteps.shouldListingBeSortedByMostExpensive();
        mapSteps.clickOnSortingSectionButton();
        mapSteps.selectBedroomsOption();
        mapSteps.checkSortLabel(SortingTypes.BEDROOMS);
        mapSteps.shouldListingBeSortedByBedrooms();
        mapSteps.clickOnSortingSectionButton();
        mapSteps.selectBathroomsOption();
        mapSteps.checkSortLabel(SortingTypes.BATHROOMS);
        mapSteps.shouldListingBeSortedByBathrooms();
    }
}
