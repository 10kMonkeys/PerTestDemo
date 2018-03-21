package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST18_ApplyingFilterOnMapView extends SampleTest {

    @Ignore
    @Test
    public void applyingFilterOnMapViewTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickMap();
        mapSteps.clickNotNowButton();
        mapSteps.clickMyNewSearch();
        searchSteps.clickFilter1Bath();
        searchSteps.clickApplyButton();
        mapSteps.checkForChangesAfterApplyingTheFilter();
    }
}
