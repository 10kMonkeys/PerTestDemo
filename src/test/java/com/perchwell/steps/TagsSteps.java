package com.perchwell.steps;

import com.perchwell.entity.Tag;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.tags.TagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class TagsSteps extends ScenarioSteps {
    Tag tag = new Tag();
    TagsPage tagsPage;

    @Step
    public void setRandomTagAndSave() {
        tag.setUniqueTagName(RandomGenerator.getRandomString("TAGNAME"));
        this.tagsPage.setUniqueSearchTagTextBox(tag.getUniqueTagName());
        this.tagsPage.clickCreateTagLabel();
    }

    @Step
    public void shouldNotSeeCreatedTagUpperCase() {
        Assert.assertFalse(tagsPage.isTagDisplayed(tag.getUniqueTagName().toUpperCase()));
    }

    @Step
    public void shouldSeeCreatedTagUpperCase() throws Exception {
        Assert.assertTrue(tagsPage.isTagDisplayedWithSwipe(tag.getUniqueTagName().toUpperCase()));
    }

    @Step
    public void clickCreatedTag(){
        tagsPage.clickCreatedTagLabel(tag.getUniqueTagName());
    }

    @Step
    public void clickBackButton() {
        tagsPage.clickBackButton();
    }

    @Step
    public void clickSearchButton() {
        tagsPage.clickSearchButton();
    }
}
