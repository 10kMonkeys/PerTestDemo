package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TI32_MultiSelectSelectAndDeselectAllTest extends SampleTest {

    @Test
    public void multiSelectSelectAndDeselectAllTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.fillInTagSearchField(SearchRequests.CLIENT0_TEST);
        user.atTagsPage.getTestClientZeroTagItemsAmount();
        user.atTagsPage.clickOnRealFirstTag(); //fails
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.clickOnSortedByButton();
        user.atMyTagsPage.clickOnMostExpensiveButton();
        user.atMyTagsPage.selectFirstListing();
        user.atMyTagsPage.sortingMenuIsHidden();
        user.atMyTagsPage.multiSelectMenuIsShown();
        user.atMyTagsPage.clickOnSelectAll();
//        user.atMyTagsPage.checkListingsAreSelected(~); //need to add ~ elements in DOM
        user.atMyTagsPage.checkSavedListingNumberIsShown();
        user.atMyTagsPage.clickOnDeselectAll();
        user.atMyTagsPage.checkSortLabel(SortingTypes.MOST_EXPENSIVE_TAGGED);
        user.atMyTagsPage.multiSelectMenuIsNotShown();
    }
}
