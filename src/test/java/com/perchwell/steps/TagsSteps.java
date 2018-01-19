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
	public void clickCreatedTag() {
		tagsPage.clickTagLabel(tag.getUniqueTagName());
	}

	@Step
	public void clickUsedTag() {
		tagsPage.clickTagLabel(tag.getExistingTagname());
	}

	@Step
	public void clickBackButton() {
		tagsPage.clickBackButton();
	}

	@Step
	public void clickSearchButton() {
		tagsPage.clickSearchButton();
	}

	@Step
	public void clickExistingTagLabel() {

		WebElement element = tagsPage.findExistingTagLabel();
		if (element == null) {
			this.setRandomTagAndSave();
			this.tagsPage.clickCreateTagLabel();
			element = tagsPage.findExistingTagLabel();
		}

		element.click();
		tag.setExistingTagname(element.getAttribute("name"));

	}

	@Step
	public void clickSeveralExistingTagLabel() {
		WebElement firstTag = tagsPage.findExistingTagLabel();
		if (firstTag != null) {
			firstTag.click();
		} else {
			Assert.assertFalse("Does not exist any tags", firstTag == null);
		}

		WebElement secondTag = tagsPage.findExistingTagLabel();
		if (secondTag != null && firstTag != null) {
			secondTag.click();
		} else {
			Assert.assertFalse("Does not exist several tags", secondTag == null);
		}
	}

	@Step
	public void clickShareButton() {
		tagsPage.clickShareButton();
	}

	@Step
	public void shouldSeeExistingTagUpperCase() throws Exception {
		Assert.assertTrue(tagsPage.isTagDisplayedWithSwipe(tag.getExistingTagname().toUpperCase()));
	}
}
