package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
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
        user.atClientPage.enterValueInSearchField("Tes");
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldSearchBeCleared();
        user.atClientPage.enterValueInSearchField("st cl");
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
        user.atClientPage.clickOnDeleteIconNextToSearchText();
        user.atClientPage.enterValueInSearchField(" client");
        user.atClientPage.clickOutsideSearchSection();
        user.atClientPage.shouldTestClientPresentInClientsList();
    }
}
