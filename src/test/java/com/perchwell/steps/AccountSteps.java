package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;

public class AccountSteps extends ScenarioSteps {

    AccountPage onPage;

    @Step
    public void clickOnClientsLabel() {
        onPage.clickOnClientsLabel();
    }

    @Step
    public void clickOnTagsLabel() {
        onPage.clickOnTagsLabel();
    }

    @Step
    public void clickOnCompareLabel() {
        onPage.clickOnCompareLabel();
    }

    @Step
    public void shouldSeeOptionClient() {
        onPage.optionClientsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionCompare() {
        onPage.optionCompareIsDisplayed();
    }

    @Step
    public void shouldSeeOptionDiscussions() {
        onPage.optionDiscussionsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionTags() {
        onPage.optionTagsIsDisplayed();
    }

    @Step
    public void shouldSeeOptionAgents() {
        onPage.optionAgentsIsDisplayed();
    }

    @Step
    public void clickOnDiscussionsLabel() {
        onPage.clickOnDiscussionsLabel();
    }

    @Step
    public void openSettingProfile() {
        onPage.clickOnSettingProfileButton();
    }
}
