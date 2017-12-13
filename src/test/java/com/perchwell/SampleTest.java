package com.perchwell;

import com.perchwell.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SampleTest {

    @Managed
    WebDriver driver;

    @Steps
    OpenedBuildingSteps openedBuildingSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ClientSteps clientSteps;

    @Steps
    TagsSteps tagsSteps;

    @Steps
    PerchwellSteps perchwellSteps;

    @Steps
    PerchPopupSteps perchPopupSteps;

    @Steps
    AccountSteps accountSteps;

    @Test
    public void addClient() throws Exception {

        loginSteps.login();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickClientsLabel();
        clientSteps.clickAddNewClientButton();
        clientSteps.setRundomClientData();
        clientSteps.clickGroupLabel();
        clientSteps.selectGroup("Actively Searching");
        clientSteps.clickInviteButton();
        clientSteps.shouldSeeRecentlyCreatedClient();

    }

    @Test
    public void createNewTagForListing() throws Exception {

        loginSteps.login();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickMyTagsLabel();
        tagsSteps.setRandomTagAndSave();
        tagsSteps.clickBackButton();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldSeeCreatedTagUpperCase();
        tagsSteps.clickCreatedTag();
        tagsSteps.clickSearchButton();
        tagsSteps.shouldSeeCreatedTagUpperCase();
    }
    @Test
    public void deleteCreatedTag() throws Exception {

        loginSteps.login();
        perchwellSteps.skipAllHints();
        perchPopupSteps.clickNotNowButton();
        perchwellSteps.openFirstBuilding();
        openedBuildingSteps.clickDiscussWithMyClientHint();
        openedBuildingSteps.clickMyTagsLabel();
        tagsSteps.setRandomTagAndSave();
        tagsSteps.clickBackButton();
        openedBuildingSteps.ckickDeleteTagButton();
        tagsSteps.shouldNotSeeCreatedTagUpperCase();
        openedBuildingSteps.clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldNotSeeCreatedTagUpperCase();
    }
}