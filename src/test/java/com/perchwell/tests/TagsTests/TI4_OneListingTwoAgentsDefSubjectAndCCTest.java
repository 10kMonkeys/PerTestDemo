package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.EmailAddresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"TagsTests", "iOS_TagsFirst", "Android_TagsFirst", "TagsFirst"})
public class TI4_OneListingTwoAgentsDefSubjectAndCCTest extends SampleTest {

    @Test
    public void oneListingTwoAgentsDefSubjectAndCCTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnListingByAddress(Addresses.EAST_35TH);
        user.atSearchPage.clickOnBackFromNeighborhoodsPage();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectTestListingWithTwoAgents();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnTagSelectedListingsOption();
        user.atTagsPage.createAndSaveNewTag();
        user.atTagsPage.clickOnArrowBackFromTagsButton();
        user.atPerchwellPage.clickOnOpenAccountButton();
        user.atAccountPage.clickOnTagsLabel();
        user.atTagsPage.searchJustCreatedTag();
        user.atTagsPage.clickOnFirstTagAndGetValue();
        user.atTagsPage.clickOnSearchButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.selectContactListingAgentsOption();
        user.atContactListingAgentPage.fillInMessageField(DiscussionMessages.MESSAGE);
        user.atContactListingAgentPage.clickOnCollapseIcon();
        user.atContactListingAgentPage.fillInEmailField(EmailAddresses.CLIENT0);
        user.atContactListingAgentPage.hideKeyboard();
        user.atContactListingAgentPage.checkIfEmailIsAdded(EmailAddresses.CLIENT0);
        user.atContactListingAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.shouldContactEmailSentToTwoAgents();
    }
}
