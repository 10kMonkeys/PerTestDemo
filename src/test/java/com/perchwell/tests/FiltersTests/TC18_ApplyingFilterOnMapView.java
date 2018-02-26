package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class TC18_ApplyingFilterOnMapView extends SampleTest {

    @Test
    public void applyingFilterOnMapViewTest() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickMap();
        mapSteps.clickNotNowButton();
        mapSteps.checkForChangesAfterApplyingTheFilter();

    }
}
