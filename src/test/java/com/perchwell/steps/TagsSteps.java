package com.perchwell.steps;

import com.perchwell.entity.Tag;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
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
		this.onPage.fillInTagSearchField(tag.getUniqueTagName());
		this.onPage.clickOnCreateTagLabel();
	}

	@Step
	public void setRandomFirstTagAndSave() {
		tag.setUniqueTagName(RandomGenerator.getRandomString("TAGNAME"));
		SessionVariables.addValueInSessionVariable("First_tag", tag.getUniqueTagName());
		this.onPage.fillInTagSearchField(tag.getUniqueTagName());
		this.onPage.clickOnCreateTagLabel();
	}

	@Step
	public void setRandomSecondTagAndSave() {
		tag.setUniqueTagName(RandomGenerator.getRandomString("TAGNAME"));
		SessionVariables.addValueInSessionVariable("Second_tag", tag.getUniqueTagName());
		this.onPage.fillInTagSearchField(tag.getUniqueTagName());
		this.onPage.clickOnCreateTagLabel();
	}

	@Step
	public void shouldNotSeeCreatedTagUpperCase() {
//		Assert.assertFalse(onPage.isTagDisplayed(tag.getUniqueTagName().toUpperCase()));
		onPage.shouldNotSeeCreatedTagUpperCase(tag.getUniqueTagName().toUpperCase());
	}

	@Step
	public void shouldSeeCreatedTagUpperCase() {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getUniqueTagName().toUpperCase()));
	}

	@Step
	public void clickOnCreatedTag() {
		onPage.clickOnTagLabel(tag.getUniqueTagName());
	}

	@Step
	public void clickOnUsedTag() {
		onPage.clickOnTagLabel(tag.getExistingTagName());
	}

	@Step
	public void clickOnArrowBackFromTagsButton() {
		onPage.clickOnArrowBackFromTagsButton();
	}

	@Step
	public void clickOnSearchButton() {
		onPage.clickOnSearchButton();
	}

	@Step
	public void clickOnExistingTagLabel() {
		WebElement element = onPage.findExistingTagLabel();
		if (element == null) {
			this.setRandomTagAndSave();
			this.onPage.clickOnCreateTagLabel();
			element = onPage.findExistingTagLabel();
		}
		element.click();
		tag.setExistingTagName(element.getAttribute("name"));
	}

	@Step
	public void shouldSeeExistingTagUpperCase() {
		Assert.assertTrue(onPage.isTagDisplayedWithSwipe(tag.getExistingTagName().toUpperCase()));
	}

	@Step
	public void shouldSeeJustCreatedTag() {
		onPage.shouldSeeJustCreatedTagUpCaseWithSwipe(tag.getUniqueTagName().toUpperCase());
	}


	@Step
	public void justCreatedTagIsAddedToListing() {
		onPage.justCreatedTagIsAddedToListingWithRemoveAnotherTags(tag.getUniqueTagName().toUpperCase());
	}

	@Step
	public void shouldSeeTaggedListing() {
		onPage.shouldSeeTaggedListing(SessionVariables.getValueFromSessionVariable("First_building_address"));
	}

	@Step
	public void clickOnFirstTag() {
		onPage.clickOnFirstTag();
	}

	@Step
	public void closeTagsPage() {
		onPage.closeTagsPage();
	}

	@Step
	public void clickOnExistingTag() {
		onPage.clickOnExistingTag();
	}

	@Step
	public void searchRemovedTag() {
		this.onPage.fillInTagSearchField(tag.getUniqueTagName());
	}

	@Step
	public void setSpecificTagAndSave(String tagName) {
		this.fillInTagSearchField(tagName);
		SessionVariables.addValueInSessionVariable("Just_Created_Tag", tagName);
		onPage.clickOnCreateTagLabel();
	}

	@Step
	public void createAndSaveNewTag() {
		String newTagName = RandomGenerator.getRandomString("TAGNAME");
		this.fillInTagSearchField(newTagName);
		SessionVariables.addValueInSessionVariable("Just_Created_Tag", newTagName);
		onPage.clickOnCreateTagLabel();
	}

	@Step
	public void fillInTagSearchField(String value) {
		onPage.fillInTagSearchField(value);
	}

	@Step
	public void searchJustCreatedTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void clearTextField() {
		onPage.clearTextField();
	}

	@Step
	public void checkIfTagsPageIsReturnedToInitialState(int sizeToCheck) {
		onPage.checkIfTagsPageIsReturnedToInitialState(sizeToCheck);
	}

	@Step
	public void getTagsAmount() {
		onPage.getTagsAmount();
	}

	@Step
	public void shouldSeeOnlySearchedTags(String text, int numberTags) {
		onPage.shouldSeeOnlySearchedTags(text, numberTags);
	}

	@Step
	public void shouldSeeJustCreatedTag(int numberTags) {
		onPage.shouldSeeOnlySearchedTags(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"), numberTags);
	}

	@Step
	public void swipeTag(String tagName) {
		onPage.swipeTag(tagName);
	}

	@Step
	public void swipeJustCreatedTag() {
		onPage.swipeTag(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void clickOnEditTagIcon() {
		onPage.clickOnEditTagIcon();
	}

	@Step
	public void greenBellIconIsSHown() {
		onPage.checkJustTagHasGreenBellIcon();
	}

	@Step
	public void grayBellIconIsButton() {
		onPage.editAndGrayBellButtonIsShown();
	}

	@Step
	public void editIconIsShown() {
		onPage.editAndEditIconIsShown();
	}

	@Step
	public void clickOnGrayBellButton() {
		onPage.clickOnGrayBellButton();
	}

	@Step
	public void checkNoOneActiveBellDisplayed() {
		onPage.checkNoOneActiveBellDisplayed();
	}

	@Step
	public void clickOnGreenBellButton() {
		onPage.clickOnGreenBellButton();
	}
}
