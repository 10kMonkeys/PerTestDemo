package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests"})
public class DTS4_SearchByClientNameTest extends SampleTest {

    @Test
    public void searchByClientName() {
        loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOnOpenAccountButton();
        accountSteps.clickOnClientsLabel();
        clientSteps.noteNumberClientsBeforeSearch();
        clientSteps.enterValueInSearchField("Tes");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
        clientSteps.clickOnDeleteIconNextToSearchText();
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldSearchBeCleared();
        clientSteps.enterValueInSearchField("st cl");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
        clientSteps.clickOnDeleteIconNextToSearchText();
        clientSteps.enterValueInSearchField(" client");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
    }
}
