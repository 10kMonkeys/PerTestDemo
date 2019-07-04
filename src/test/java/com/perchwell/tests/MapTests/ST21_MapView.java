package com.perchwell.tests.MapTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"MapTests", "iOS_Third_IGNORED", "Android_Third", "Third", "Local_Android_Run"})
public class ST21_MapView extends SampleTest {

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
