package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond"})
public class SF30_SqFeetApplyTest extends SampleTest {

    @Test
    public void sqFeetApplyTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.setSquareFeetMinFilter("1000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingWithSqFeetEqualAndMore("1000");
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clearSquareFeetMinFilter();
        user.atSearchPage.setSquareFeetMaxFilter("5000");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingWithSqFeetEqualAndLess("5000");
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.setSquareFeetMinFilter("500");
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.shouldSeeListingWithSqFeetEqualAndBetween("500", "5000");
    }
}
