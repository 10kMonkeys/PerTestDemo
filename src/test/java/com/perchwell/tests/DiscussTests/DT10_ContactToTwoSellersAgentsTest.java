package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch"})
public class DT10_ContactToTwoSellersAgentsTest extends SampleTest {

    @Test
    public void contactToTwoSellersAgents() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.setMaximumPriceFilter("13000000");
        user.atSearchPage.setMinimumPriceFilter("13000000");
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.selectFilter2Beds();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.clickOnApplyButtonWithoutKeyboard();
        user.atPerchwellPage.openTwoAgentListing();
        user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        user.atSellersAgentPage.swipeDownUntilSellersSeveralAgentsSection();
        user.atOpenedBuildingPage.clickOnSeveralSellersAgentSection();
        user.atSellersAgentPage.updateMessage();
        user.atSellersAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.selectConfirmOption();
        user.atSellersAgentPage.clickOnPositiveButton();
        user.atSellersAgentPage.shouldInterestEmailSentToTwoAgent();

    }
}