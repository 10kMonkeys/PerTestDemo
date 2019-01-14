package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class DT11_OneListingAgentMandatoryFieldsAndCustomSubjectTest extends SampleTest {

    @Test
    public void oneListingAgentMandatoryFieldsAndCustomSubject() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInAddressSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnListingByAddress(Addresses.EAST_35TH);
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectTestListingWithOneAgent();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atContactListingAgentPage.checkDefaultAgentCCAddress();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.MESSAGE);
        user.atContactListingAgentPage.clickOnCollapseIcon();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.clearSubjectField();
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsDisabled();
        user.atContactListingAgentPage.fillInSubjectField(DiscussionMessages.CONTACT_AGENT_SUBJECT);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfSendEmailButtonIsEnabled();
        user.atContactListingAgentPage.getCurrentSubject();
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.shouldContactEmailSentToOneAgent();
    }
}
