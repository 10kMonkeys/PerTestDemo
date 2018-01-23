package com.perchwell.steps;

import com.perchwell.entity.Tag;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.pages.tags.TagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TagsSteps extends ScenarioSteps {
	Tag tag = new Tag();
	TagsPage onPage;

	@Step
	public void setRandomTagAndSave() {
		tag.setUniqueTagName(RandomGenerator.getRandomString("TAGNAME"));
		this.onPage.setUniqueSearchTagTextBox(tag.getUniqueTagName());
		this.onPage.clickCreateTagLabel();
	}

	@Step
	public void shouldNotSeeCreatedTagUpperCase() {
		Assert.assertFalse(onPage.isTagDisplayed(tag.getUniqueTagName().toUpperCase()));
	}

	@Step
	public void shouldSeeCreatedTagUpperCase() throws Exception {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getUniqueTagName().toUpperCase()));
	}

	@Step
	public void clickCreatedTag() {
		onPage.clickTagLabel(tag.getUniqueTagName());
	}

	@Step
	public void clickUsedTag() {
		onPage.clickTagLabel(tag.getExistingTagname());
	}

	@Step
	public void clickBackButton() {
		onPage.clickBackButton();
	}

	@Step
	public void clickSearchButton() {
		onPage.clickSearchButton();
	}

	@Step
	public void clickExistingTagLabel() {

		WebElement element = onPage.findExistingTagLabel();
		if (element == null) {
			this.setRandomTagAndSave();
			this.onPage.clickCreateTagLabel();
			element = onPage.findExistingTagLabel();
		}

		element.click();
		tag.setExistingTagname(element.getAttribute("name"));

	}

	@Step
	public void shouldSeeExistingTagUpperCase() throws Exception {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getExistingTagname().toUpperCase()));
	}
}
