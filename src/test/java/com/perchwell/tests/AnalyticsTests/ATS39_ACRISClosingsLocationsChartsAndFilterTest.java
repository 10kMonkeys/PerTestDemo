package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class ATS39_ACRISClosingsLocationsChartsAndFilterTest extends SampleTest {

    @Test
    public void acrisClosingsLocationsChartsAndFilterTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.deleteDefaultLocationInFilter();
        user.atSearchPage.selectChelseaTag(); ////
    }
}
