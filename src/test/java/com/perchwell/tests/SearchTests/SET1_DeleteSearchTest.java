package com.perchwell.tests.SearchTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SearchTests"})
public class SET1_DeleteSearchTest extends SampleTest {

    @Test
    public void deleteSearch() throws Exception {
        loginSteps.loginAsClient(AppProperties.INSTANCE.getProperty("client_test_email"),
                AppProperties.INSTANCE.getProperty("client_test_password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickMyNewSearch();
        searchSteps.saveCurrentSearch();
        perchwellSteps.clickMyNewSearch();
        searchSteps.clickLoadSavedSearchButton();
        searchSteps.swipeCreatedSearch();
        searchSteps.clickOnDeleteSearchButton();
        searchSteps.shouldDeleteSearch();
    }
}
