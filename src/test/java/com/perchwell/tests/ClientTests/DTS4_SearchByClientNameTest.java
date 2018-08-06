package com.perchwell.tests.ClientTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SearchRequests;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "CompareTests", "DiscussionsContacts"})
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
        user.atClientPage.enterValueInSearchField(SearchRequests.TES);
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldSearchBeCleared();
        user.atClientPage.enterValueInSearchField(SearchRequests.ST_CL);
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.enterValueInSearchField(SearchRequests.CLIENT1);
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
    }
}
