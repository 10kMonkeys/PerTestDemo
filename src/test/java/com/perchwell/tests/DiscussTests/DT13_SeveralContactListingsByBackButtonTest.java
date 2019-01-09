package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT13_SeveralContactListingsByBackButtonTest extends SampleTest {

    @Test
    public void severalContactListingsByBackButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.selectThreeContactListings();
        user.atPerchwellPage.clickOnMultiselectOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentsPage.clickOnBackButton();
        user.atPerchwellPage.checkThatSelectionMenuIsShown();
        user.atPerchwellPage.checkThatThreeListingsAreSelected();
        user.atPerchwellPage.clickOnMultiselectOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentsPage.fillMessageField("Hello");
        user.atContactListingAgentsPage.clickOnSendEmailButton();

    }
}
