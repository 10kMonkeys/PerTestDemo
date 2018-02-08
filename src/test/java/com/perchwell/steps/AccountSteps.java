package com.perchwell.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.perchwell.pages.account.AccountPage;
import org.junit.Assert;

public class AccountSteps extends ScenarioSteps{
    AccountPage onPage;

    @Step
    public void clickClientsLabel() {
        onPage.clickClientsLabel();
    }

    @Step
    public void clickTagsLabel() {
        onPage.clickTagsLabel();
    }

    @Step
    public void clickCompareLabel() {
        onPage.clickCompareLabel();
    }

    @Step
    public void shouldSeeOptionClient() throws Exception {
        Assert.assertTrue(onPage.optionClientsIsDispalyed());
    }

    @Step
    public void shouldSeeOptionCompare() throws Exception {
        Assert.assertTrue(onPage.optionCompareIsDispalyed());
    }
    @Step
    public void shouldSeeOptionDisscussions() throws Exception {
        Assert.assertTrue(onPage.optionDiscussionsIsDispalyed());
    }
    @Step
    public void shouldSeeOptionTags() throws Exception {
        Assert.assertTrue(onPage.optionTagsIsDispalyed());
    }

    @Step
    public void shouldSeeOptionAgents() throws Exception {
        Assert.assertTrue(onPage.optionAgentsIsDispalyed());
    }

    @Step
    public void clickDiscusionsLabel() { onPage.clickDiscussionsLabel();   }

    @Step
    public void openSettingsProfile(){
        onPage.settingProfileButtonClick();
    }
}
