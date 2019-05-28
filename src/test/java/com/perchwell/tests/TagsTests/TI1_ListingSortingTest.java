package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsFirst"})
public class TI1_ListingSortingTest extends SampleTest {

    @Test
    public void listingSortingTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.selectThirdListingAfterSecond();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnSearchButton();
        user.atMyTagsPage.checkListingAmount(3);
        user.atMyTagsPage.clickOnSortedByButton();
        user.atMyTagsPage.clickOnMostExpensiveButton();
        user.atMyTagsPage.shouldTaggedListingBeSortedByMostExpensive();
        user.atMyTagsPage.clickOnSortedByButton();
        user.atMyTagsPage.clickOnLeastExpensiveButton();
        user.atMyTagsPage.shouldTaggedListingBeSortedByLeastExpensive();
    }

}
