package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "FiltersTests", "Second"})
public class ST18_ApplyingFilterOnMapView extends SampleTest {

    @Test
    public void applyingFilterOnMapViewTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMap();
        user.atMapPage.clickOnNotNowButton();
        user.atMapPage.clickOnMyNewSearch();
        user.atSearchPage.selectFilter1AndHalfBath();
        user.atSearchPage.clickOnFilter1Bed();
        user.atSearchPage.clickOnApplyButton();
        user.atMapPage.checkForChangesAfterApplyingTheFilter();
    }
}
