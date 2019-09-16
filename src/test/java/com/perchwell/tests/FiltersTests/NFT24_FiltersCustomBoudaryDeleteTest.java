package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class NFT24_FiltersCustomBoudaryDeleteTest extends SampleTest {
    @Test
    public void filtersCustomBoudaryDeleteTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.openCustomBoundariesPage();
        user.atCustomBoundaryPage.drawAndSaveLargeSquare();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.deleteFirstCustomBoudary();
        user.atSearchPage.clickOnYesButton();
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.checkNeighbrhoodsAreDefault();
    }
}
