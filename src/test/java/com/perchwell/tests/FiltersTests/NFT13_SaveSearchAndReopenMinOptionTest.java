package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "AdditionalFiltersTest"})
public class NFT13_SaveSearchAndReopenMinOptionTest extends SampleTest {

    @Test
    public void saveSearchAndReopenMinOption() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectTwoBedsMinimumFilter();
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.saveCurrentSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.clickOnPreviouslyCreatedSearch();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.check2BedsMinFilterSelected();
        user.atSearchPage.check2BathsMinFilterSelected();
    }
}
