package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch", "Local_Android_Run"})
public class DT10_ContactToTwoSellersAgentsTest extends SampleTest {

//    @Ignore
    @Test
    public void contactToTwoSellersAgents() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
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
        user.atOpenedBuildingPage.getBuildingAddress();
        user.atSellersAgentPage.swipeDownUntilSellersSeveralAgentsSection();
        user.atOpenedBuildingPage.clickOnSeveralSellersAgentSection();
        user.atSellersAgentPage.updateMessage();
        user.atSellersAgentPage.updateSubject();
        user.atSellersAgentPage.getEmailData();
        user.atSellersAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.selectConfirmOption();
        user.atSellersAgentPage.clickOnPositiveButton();
        user.atSellersAgentPage.shouldInterestEmailSentToTwoAgent();

    }
}