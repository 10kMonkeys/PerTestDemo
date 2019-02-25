package com.perchwell.tests.ListViewTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class LVT8_MultiselectSelectAllAndDeselectAllTest extends SampleTest {

    @Test
    public void multielectSelectAllAndDeselectAllTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnListingsByButton();
        user.atPerchwellPage.clickOnAddressSortButton();
        user.atPerchwellPage.checkSortLabel(SortingTypes.ADDRESS);
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.checkSelectionMenuIsShown(1); //updated
        user.atPerchwellPage.clickOnSelectAll();
        user.atPerchwellPage.checkSelectedLabelEquals(20); //
//        user.atPerchwellPage.checkListingsAreSelected(20); //need to add 20 elements in DOM
        user.atPerchwellPage.clickOnDeselectAllListingsButton();
        user.atPerchwellPage.checkSortLabel(SortingTypes.ADDRESS);
        user.atPerchwellPage.checkListingsAreSelected(0); //

    }
}
