package com.perchwell.steps.complex;

import com.perchwell.steps.ClientSteps;
import com.perchwell.steps.DiscussionSteps;
import com.perchwell.steps.OpenedBuildingSteps;
import com.perchwell.steps.PerchwellSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ComplexSteps extends ScenarioSteps{

    @Steps
    protected ClientSteps clientSteps;

    @Steps
    protected PerchwellSteps perchwellSteps;

    @Steps
    protected OpenedBuildingSteps openedBuildingSteps;

    @Steps
    protected DiscussionSteps discussionSteps;

    @Step
    private void openFirstBuildingSkipHintClickOnShareButton() {
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickOnDiscussWithMyClientHint();
        openedBuildingSteps.clickShareButton();
    }

    @Step
    public void startShareAndSendWithinPerchwellForFirstBuilding() {
        this.openFirstBuildingSkipHintClickOnShareButton();
        openedBuildingSteps.clickOnSendWithinPerchwell();
    }

    @Step
    public void startShareAndDiscussWithMyClientOptionForFirstBuilding() {
        this.openFirstBuildingSkipHintClickOnShareButton();
        openedBuildingSteps.clickOnDiscussWithMyClientOption();
    }

    @Step
    public void sendMessageToClientAndCloseDiscussion(String message) throws Exception {
        openedBuildingSteps.clickOnAddDiscusButton();
        clientSteps.clickOnExistingClient();
        discussionSteps.sendMessage(message);
        discussionSteps.clickOnBackButton();
        clientSteps.closePage();
    }

    @Step
    public void sendMessageToAgentAndCloseDiscussion(String message) throws Exception {
        openedBuildingSteps.clickOnAddDiscusButton();
        clientSteps.clickOnExistingAgent();
        discussionSteps.sendMessage(message);
        discussionSteps.clickOnBackButton();
        clientSteps.closePage();
    }
}
