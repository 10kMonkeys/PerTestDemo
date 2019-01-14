package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT13_SeveralContactListingsByBackButtonTest extends SampleTest {

    @Test
    public void severalContactListingsByBackButton() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
//        user.atPerchwellPage.clickOnMyNewSearch(); //search old
//        user.inSearchMenu.openSearchPage(); //search new
//        user.atSearchPage.clickOnSearchByAddressButton();
//        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
//        user.atSearchPage.clickOnListingByAddress(Addresses.EAST_35TH);
//        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
//        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListings(); //update
        user.atPerchwellPage.selectSecondListings(); //update
        user.atPerchwellPage.selectThirdListings(); //update
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clickOnBackButton();

        user.atPerchwellPage.checkSelectionMenuIsShown(); //update
        user.atPerchwellPage.checkThatThreeListingsAreSelected(); //update

        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnContactListingAgentsButton();
        user.atContactListingAgentPage.clearSubjectField();
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.fillInSubjectField(DiscussionMessages.CONTACT_AGENT_SUBJECT);
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.HELLO);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.shouldContactEmailSentToThreeMessage();

    }
}