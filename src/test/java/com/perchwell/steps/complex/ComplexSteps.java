package com.perchwell.steps.complex;

import com.perchwell.crossPlatform.Config;
import com.perchwell.steps.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ComplexSteps extends ScenarioSteps{

    @Steps
    private ClientSteps atClientPage;

    @Steps
    private PerchwellSteps atPerchwellPage;

    @Steps
    private OpenedBuildingSteps atOpenedBuildingPage;

    @Steps
    private DiscussionSteps atDiscussionPage;

    @Steps
    private SearchSteps atSearchPage;

    @Steps
    private TagsSteps atTagsPage;

    @Steps
    private PerchPopupSteps inPopup;

    @Steps
    private ResetPasswordSteps atResetPasswordPage;

    @Steps
    private SettingsProfileSteps atSettingsProfilePage;

    @Steps
    private AccountSteps atAccountPage;

    @Step
    private void openFirstBuildingSkipHintClickOnShareButton() {
        atPerchwellPage.openFirstBuilding();
        atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        atOpenedBuildingPage.getFirstBuildingAddress();
        atOpenedBuildingPage.clickShareButton();
    }

    @Step
    public void startShareAndSendWithinPerchwellForFirstBuilding() {
        this.openFirstBuildingSkipHintClickOnShareButton();
        atOpenedBuildingPage.clickOnSendWithinPerchwell();
    }

    @Step
    public void startShareAndDiscussWithMyClientOptionForFirstBuilding() {
        this.openFirstBuildingSkipHintClickOnShareButton();
        atOpenedBuildingPage.clickOnDiscussWithMyClientOption();
    }

    @Step
    public void sendMessageToClientAndCloseDiscussion(String message) throws Exception {
        atOpenedBuildingPage.clickOnAddDiscusButton();
        atClientPage.clickOnExistingClient();
        atDiscussionPage.sendMessage(message);
        atDiscussionPage.clickOnBackButtonFromDiscussion();
        atClientPage.clickOnCrossBackButtonFromClients();
        atOpenedBuildingPage.clickOnCancelButtonInDiscussWithClient();
        atOpenedBuildingPage.clickShareButton();
        atOpenedBuildingPage.clickOnDiscussWithMyClientOption();

    }

    @Step
    public void sendMessageToAgentAndCloseDiscussion(String message) throws Exception {
        atOpenedBuildingPage.clickOnAddDiscusButton();
        atClientPage.clickOnExistingAgent();
        atDiscussionPage.sendMessage(message);
        atDiscussionPage.clickOnBackButtonFromDiscussion(); //ai
        atClientPage.clickOnCrossBackButtonFromClients(); //ai
    }

    @Step
    public void saveNewSearchAndStartNewSearch() {
        atPerchwellPage.clickOnMyNewSearch();
        atSearchPage.selectFilter1Bed();
        atSearchPage.selectFilter4PlusBeds();
        atSearchPage.saveCurrentSearch();
        this.startNewSearch();
    }

    @Step
    public void startNewSearch() {
        atPerchwellPage.clickOnMyNewSearch();
        atSearchPage.clickOnLoadSavedSearchButton();
        atSearchPage.createNewSearchClick();
        atSearchPage.clickOnApplyButton();
    }

    @Step
    public void addTagToTheFirstListing() {
        atPerchwellPage.openFirstBuilding();
        atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
        atOpenedBuildingPage.getFirstBuildingAddress();
        atOpenedBuildingPage.clickOnMyTagsLabel();
        atTagsPage.setRandomFirstTagAndSave();
        atTagsPage.clickOnArrowBackFromTagsButton();
        atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
    }

    @Step
    public void addTagToTheSecondListing() {
        atPerchwellPage.openSecondBuilding();
        atOpenedBuildingPage.getSecondBuildingAddress();
        atOpenedBuildingPage.clickOnMyTagsLabel();
        atTagsPage.setRandomSecondTagAndSave();
        atTagsPage.clickOnArrowBackFromTagsButton();
        atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
    }

    @Step
    public void sendMessageToJustCreatedClientAndCloseDiscussion(String message) throws Exception {
        atOpenedBuildingPage.clickOnAddDiscusButton();
        atClientPage.clickOnExistingClientForRemoveMessage();
        atDiscussionPage.sendMessage(message);
        atDiscussionPage.clickOnBackButtonFromDiscussion(); //ia
        atClientPage.clickOnCrossBackButtonFromClients(); //ia
    }

    @Step
    public void returnOldPassword(){
        atPerchwellPage.clickOnOpenAccountButton();
        atAccountPage.openSettingProfile();
        atSettingsProfilePage.resetPasswordClick();
        atResetPasswordPage.resetPasswordButtonClick();
        atResetPasswordPage.shouldFindSentEmail();
        atResetPasswordPage.getResetToken();
        atResetPasswordPage.returnOldPassword();
    }
}
