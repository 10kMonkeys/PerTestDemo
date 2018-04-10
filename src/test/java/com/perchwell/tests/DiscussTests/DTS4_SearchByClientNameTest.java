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
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickClientsLabel();
        clientSteps.noteNumberClientsBeforeSearch();
        clientSteps.enterValueInSearchField("Te");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
        clientSteps.clickDeleteIconNextToSearchText();
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldSearchBeCleared();
        clientSteps.enterValueInSearchField("lie");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
        clientSteps.clickDeleteIconNextToSearchText();
        clientSteps.enterValueInSearchField("nt");
        clientSteps.clickOutsideSearchSection();
        clientSteps.shouldTestClientPresentInClientsList();
    }
}
