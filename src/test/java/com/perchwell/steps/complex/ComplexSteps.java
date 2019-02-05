package com.perchwell.steps.complex;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.steps.*;
import com.perchwell.steps.analytics.AnalyticsSteps;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

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

    @Steps
    private AnalyticsSteps atAnalyticsPage;

    @Steps
    private SearchMenuSteps inSearchMenuSteps;

    @Steps
    private EditTagSteps atEditTagPage;

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
        atDiscussionPage.clickOnBackButtonFromDiscussion();
        atClientPage.clickOnCrossBackButtonFromClients();
    }

    @Step
    public void saveNewSearchAndStartNewSearch() {
        inSearchMenuSteps.openSearchPage();
        atSearchPage.selectBedroomsRangeOptionIfNotSelected();
        atSearchPage.selectFilter1Bed();
        atSearchPage.selectFilter4PlusBeds();
        atSearchPage.saveCurrentSearch();
        this.startNewSearch();
    }

    @Step
    public void startNewSearch() {
        inSearchMenuSteps.openSavedSearches();
        atSearchPage.createNewSearchClick();
//        atSearchPage.clickOnApplyButton(); //do not uncomment
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
        atDiscussionPage.clickOnBackButtonFromDiscussion();
        atClientPage.clickOnCrossBackButtonFromClients();
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

    @Step
    public void justSwipeForAndroid() {
        if(Config.isAndroid()) {
            WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
            WebDriver webDriver = webDriverFacade.getProxiedDriver();
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;

            Helper.swipeVerticalAndroid(appiumDriver, 0.8, 0.2, 0.5);
            atAnalyticsPage.doneMovingCharts();
        }

    }

    @Step
    public void removeTag(String tagName) {
        atTagsPage.swipeTag(tagName);
        atTagsPage.clickOnEditTagIcon();
        atEditTagPage.clickOnDeleteButton();
        atEditTagPage.confirmRemoving();
    }

    @Step
    public void changeTestClientsNameBack() {
        atTagsPage.searchRenamedTag();
        atTagsPage.swipeTag(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
        atEditTagPage.changeBackTestClientsName();
        atEditTagPage.clickOnSaveButton();
    }
}
