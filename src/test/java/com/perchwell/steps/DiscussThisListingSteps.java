package com.perchwell.steps;

import com.perchwell.pages.perchwell.DiscussThisListingPage;
import com.perchwell.pages.perchwell.OpenedBuildingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiscussThisListingSteps extends ScenarioSteps {

    DiscussThisListingPage discussThisListingPage;
    OpenedBuildingPage openedBuildingPage;

    @Step
    public void deleteDiscussionWithClientIfExist() throws Exception {
        if (openedBuildingPage.isClientWithDiscussionExist()) {
            openedBuildingPage.clickOnViewAllDiscussionsButton();
            discussThisListingPage.deleteClientsWithDiscussion();
            discussThisListingPage.clickOnClosePageButton();
            openedBuildingPage.clickOnShareButton();
            openedBuildingPage.clickOnSendWithinPerchwell();
        }
    }

    @Step
    public void deleteDiscussionWithAgentIfExist() throws Exception {
        if (openedBuildingPage.isAgentWithDiscussionExist()) {
            openedBuildingPage.clickOnViewAllDiscussionsButton();
            discussThisListingPage.deleteAgentsWithDiscussion();
            discussThisListingPage.clickOnClosePageButton();
            openedBuildingPage.clickOnShareButton();
            openedBuildingPage.clickOnSendWithinPerchwell();
        }
    }

    @Step
    public void checkIfSendEmailButtonIsDisabled() {
        discussThisListingPage.checkIfSendEmailButtonIsDisabled();
    }

    @Step
    public void fillInMessageField(String message) {
        discussThisListingPage.fillInMessageField(message);
    }

    @Step
    public void clickOnCollapseIcon() {
        discussThisListingPage.clickOnCollapseIcon();
    }

    @Step
    public void checkIfSendEmailButtonIsEnabled() {
        discussThisListingPage.checkIfSendEmailButtonIsEnabled();
    }

    @Step
    public void clearSubjectField() {
        discussThisListingPage.clearSubjectField();
    }

    @Step
    public void fillInSubjectField(String message) {
        discussThisListingPage.fillInSubjectField(message);
    }

    @Step
    public void clickOnSendEmailButton() {
        discussThisListingPage.clickOnSendEmailButton();
    }

    @Step
    public void fillInEmailField(String email) {
        discussThisListingPage.fillInEmailField(email);
    }

    @Step
    public void checkIfEmailIsAdded(String email) {
        discussThisListingPage.checkIfEmailIsAdded(email);
    }
}
