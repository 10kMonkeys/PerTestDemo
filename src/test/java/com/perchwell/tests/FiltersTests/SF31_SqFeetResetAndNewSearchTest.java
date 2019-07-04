package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond", "Local_Android_Run"})
public class SF31_SqFeetResetAndNewSearchTest extends SampleTest {

    @Test
    public void sqFeetResetAndNewSearchTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.setSquareFeetMinFilter("1000");
        user.atSearchPage.setSquareFeetMaxFilter("5000");
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnResetFilter();
        user.atSearchPage.shouldSqFeetMinAndMaxFieldsCleared();
        user.atSearchPage.setSquareFeetMinFilter("1000");
        user.atSearchPage.setSquareFeetMaxFilter("5000");
        user.atSearchPage.clickOnApplyButton();
        user.inSearchMenu.openSavedSearches();
        user.atSearchPage.createNewSearchClick();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.shouldSqFeetMinAndMaxFieldsCleared();
    }
}
