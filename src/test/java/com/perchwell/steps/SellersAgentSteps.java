package com.perchwell.steps;

import com.perchwell.pages.perchwell.OpenedBuildingPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import com.perchwell.pages.perchwell.SellersAgentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SellersAgentSteps extends ScenarioSteps {
    PerchwellPage perchwellPage;
    OpenedBuildingPage openedBuildingPage;
    SellersAgentPage sellersAgentPage;

    @Step
    public void findBuildingWithOneSellersAgent() throws Exception {
        perchwellPage.openFirstBuilding();
        openedBuildingPage.clickDiscussWithMyClientHint();
        if (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickBackButton();
            perchwellPage.openSecondBuilding();
        }
        while (!openedBuildingPage.isOneSellersAgent()) {
            openedBuildingPage.clickBackButton();
            perchwellPage.swipeDownUntilNextBuildingVisible();
            perchwellPage.clickOnLastVisibleBuilding();
        }
        openedBuildingPage.addAddressInSessionVariable("building address", openedBuildingPage.getBuildingAddress());
    }

    @Step
    public void swipeDownUntilSellersAgentSection() throws Exception {
        openedBuildingPage.swipeDownUntilElementVisible(openedBuildingPage.getOneSellersAgentElement());
    }

    @Step
    public void clickOnSellersAgentSection() {
        openedBuildingPage.clickOneSellersAgentSection();
    }

    @Step
    public void clickOnSendEmailButton() {
        sellersAgentPage.clickOnSendEmailButton();
    }

    @Step
    public void selectConfirmOption() {
        sellersAgentPage.clickOnConfirmButton();
    }

    @Step
    public void shouldInterestEmailSentToAgent() {
        sellersAgentPage.shouldInterestEmailSentToOneAgent();
    }
}
