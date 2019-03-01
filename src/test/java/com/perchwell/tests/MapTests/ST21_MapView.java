package com.perchwell.tests.MapTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"MapTests", "iOS_Third", "Android_Third", "Third"})
public class ST21_MapView extends SampleTest {

    @Ignore
    @Test
    public void sortListingsOnMap() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMap();
        user.atMapPage.clickOnNotNowButton();
        user.atMapPage.selectPinOnMap();
        user.atMapPage.clickOnPinFirstListing();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atMapPage.checkFirstListingIsOpened();
    }
}
