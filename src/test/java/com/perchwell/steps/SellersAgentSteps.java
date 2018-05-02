package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import com.perchwell.pages.perchwell.SellersAgentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SellersAgentSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;
    OpenedBuildingPage openedBuildingPage;
    SellersAgentPage sellersAgentPage;

    @Step
    public void findBuildingWithOneSellersAgent() throws Exception {
        perchwellPage.openFirstBuilding();
        openedBuildingPage.clickOnDiscussWithMyClientHint();
        if (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickOnBackButton();
            perchwellPage.openSecondBuilding();
        }
        while (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickOnBackButton();
            perchwellPage.swipeDownUntillNextBuildingVisible();
            perchwellPage.clickLastVisibleBuilding();
        }
        SessionVariables.addValueInSessionVariable("building address", openedBuildingPage.getBuildingAddress());
    }

    @Step
    public void swipeDownUntilSellersAgentSection() throws Exception {
        openedBuildingPage.swipeDownUntilElementVisible(openedBuildingPage.getOneSellersAgentElement());
    }

    @Step
    public void clickOnSellersAgentSection() {
        openedBuildingPage.clickOnOneSellersAgentSection();
    }

    @Step
    public void clickSendEmailButton() {
        sellersAgentPage.clickSendEmailButton();
    }

    @Step
    public void selectConfirmOption() {
        sellersAgentPage.clickConfirmButton();
    }

    @Step
    public void shouldInterestEmailSentToAgent() {
        Assert.assertTrue(sellersAgentPage.shouldInterestEmailSentToOneAgent());
    }
}
