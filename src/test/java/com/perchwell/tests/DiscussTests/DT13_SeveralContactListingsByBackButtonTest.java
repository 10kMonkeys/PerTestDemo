package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class DT13_SeveralContactListingsByBackButtonTest extends SampleTest {

    @Test
    public void severalContactListingsByBackButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.getListingsAddresses(3);
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.selectSecondListingAfterFirst();
        user.atPerchwellPage.selectThirdListingAfterSecond();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();
        user.atPerchwellPage.checkSelectionMenuIsShown();
        user.atPerchwellPage.checkThatThreeListingsAreSelected();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clearSubjectField();
        user.atContactListingAgentPage.fillInSubjectField(DiscussionMessages.CONTACT_AGENT_SUBJECT);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.HELLO);
        user.atContactListingAgentPage.clickOnCollapseIcon();
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.shouldContactEmailSentToThreeMessage();
    }
}