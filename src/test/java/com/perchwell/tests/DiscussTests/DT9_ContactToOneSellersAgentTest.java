package com.perchwell.tests.DiscussTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Ignore;
import org.junit.Test;

@WithTagValuesOf({"DiscussTests", "iOS_DiscContSavedSearch", "Android_DiscContSavedSearch", "DiscContSavedSearch", "Local_Android_Run"})
public class DT9_ContactToOneSellersAgentTest extends SampleTest {

//    @Ignore
    @Test
    public void sendEmailToOneSellersAgent() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atSellersAgentPage.findBuildingWithOneSellersAgent();
        user.atSellersAgentPage.swipeDownUntilSellersAgentSection();
        user.atSellersAgentPage.clickOnSellersAgentSection();
        user.atSellersAgentPage.updateSubject();
        user.atSellersAgentPage.updateMessage();
        user.atSellersAgentPage.getEmailData();
        user.atSellersAgentPage.clickOnSendEmailButton();
        user.atSellersAgentPage.selectConfirmOption();
        user.atSellersAgentPage.clickOnPositiveButton();
        user.atSellersAgentPage.shouldInterestEmailSentToAgent();
    }
}
