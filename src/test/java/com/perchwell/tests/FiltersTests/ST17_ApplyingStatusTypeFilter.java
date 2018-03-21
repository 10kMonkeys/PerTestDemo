package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST17_ApplyingStatusTypeFilter extends SampleTest {
        @Ignore
    @Test
    public void applyingStatusTypeFilter() throws Exception{
            loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                    AppProperties.INSTANCE.getProperty("password"));
            perchwellSteps.skipAllHints();
            perchPopupSteps.clickNotNowButton();
            perchwellSteps.clickMyNewSearch();
            searchSteps.clickActiveFilter();
            searchSteps.setUpFilterContract();
            searchSteps.clickApplyButton();
            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter();
            perchwellSteps.clickMyNewSearch();
            searchSteps.setUpFilterContract();
            searchSteps.setUpFilterOffMkt();
            searchSteps.clickApplyButton();
            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter();
            perchwellSteps.clickMyNewSearch();
            searchSteps.setUpFilterOffMkt();
            searchSteps.setUpFilterSold();
            searchSteps.clickApplyButton();
            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter();
            perchwellSteps.clickMyNewSearch();
            searchSteps.setUpFilterRented();
            searchSteps.clickApplyButton();
            searchSteps.isBuildingsFilteredAfterApplyingStatusFilter();
            perchwellSteps.clickMyNewSearch();
            searchSteps.clickTapToSaveChanges();
            searchSteps.setSearchName();
            searchSteps.clickSaveButton();
            perchwellSteps.clickMyNewSearch();
            searchSteps.clickLoadSavedSearchButton();
            searchSteps.createNewSearchClick();
            searchSteps.clickApplyButton();


    }
}
