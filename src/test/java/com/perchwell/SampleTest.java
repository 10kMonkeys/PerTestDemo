package com.perchwell;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.perchwell.steps.*;


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
    public void addClient() {

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
    @Ignore
    @Test
    public void createNewTagForListing() {

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

    @Ignore
    @Test
    public void deleteCreatedTag() {

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
        openedBuildingSteps .clickBackButton();
        perchwellSteps.clickOpenAccountButton();
        accountSteps.clickTagsLabel();
        tagsSteps.shouldNotSeeCreatedTagUpperCase();
    }
}