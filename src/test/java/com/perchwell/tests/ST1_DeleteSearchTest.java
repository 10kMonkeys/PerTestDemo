package com.perchwell.tests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class ST1_DeleteSearchTest extends SampleTest {

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
