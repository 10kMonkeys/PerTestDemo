package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class DTS4_SearchByClientNameTest extends SampleTest {

    @Test
    public void searchByClientName() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnClientsLabel();
        user.atClientPage.noteNumberClientsBeforeSearch();
        user.atClientPage.enterValueInSearchField(SearchRequests.CLIENT_TEST);
        user.atClientPage.clickOutsideSearchSectionOnlyForIOS();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clearSearchField(); //temp fix for Android
        user.atClientPage.clickOutsideSearchSectionOnlyForIOS();
        user.atClientPage.shouldSearchBeCleared();
        user.atClientPage.enterValueInSearchField(SearchRequests.CLIENT);
        user.atClientPage.clickOutsideSearchSectionOnlyForIOS();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clearSearchField();
        user.atClientPage.enterValueInSearchField(SearchRequests.TH_CHARTS);
        user.atClientPage.clickOutsideSearchSectionOnlyForIOS();
        user.atClientPage.shouldTestClientPresentInClientsList();
    }
}
