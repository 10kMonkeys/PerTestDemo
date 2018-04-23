package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST18_ApplyingFilterOnMapView extends SampleTest {

    @Test
    public void applyingFilterOnMapViewTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickMap();
        mapSteps.clickOnNotNowButton();
        mapSteps.clickOnMyNewSearch();
        searchSteps.selectFilter1AndHalfBath();
        searchSteps.clickFilter1Bed();
        searchSteps.clickApplyButton();
        mapSteps.checkForChangesAfterApplyingTheFilter();
    }
}
