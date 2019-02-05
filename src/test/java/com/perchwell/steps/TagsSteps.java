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
	public void clickOnFirstTagAndGetValue() {
		onPage.clickOnFirstTagAndGetValue();
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
	public void greenBellIconIsShown() {
		onPage.checkJustTagHasGreenBellIcon();
	}

	@Step
	public void grayBellButtonIsShown() {
		onPage.grayBellButtonIsShown();
	}

	@Step
	public void editIconIsShown() {
		onPage.editIconIsShown();
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

	@Step
	public void checkIfTagsItemsListIsChanged(int value) {
		onPage.checkIfTagsItemsListIsChanged(value);
	}

	@Step
	public void getFirstTagsItemsValue() {
		onPage.getFirstTagsItemsValue();
	}

	@Step
	public void clickOnTagPillInSearchField() {
		onPage.clickOnSpecificTagPillInSearchField(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void checkIfTagPillIsRemoved() {
		onPage.checkIfTagPillIsRemoved(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void getTestClientsItemsValue() {
		onPage.getTestClientsItemsValue();
	}

	@Step
	public void clickOnFirstClientTag() {
		onPage.clickOnFirstClientTag();
	}

	@Step
	public void checkIfClientTagsItemsListIsChanged(int value) {
		onPage.checkIfClientTagsItemsListIsChanged(value);
	}

	@Step
	public void checkIfTagsCheckMarIsNotSelected() {
		onPage.checkIfTagsCheckMarIsNotSelected();
	}

	@Step
	public void searchJustCreatedClientTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("User_name"));
	}

	@Step
	public void checkTagBelowOtherTagsLabel() {
		onPage.checkTagBelowOtherTagsLabel();
	}

	@Step
	public void checkClientTagBelowSharedWithClientLabel() {
		onPage.checkClientTagBelowSharedWithClientLabel();
	}

	@Step
	public void checkNoOneTagPillIsShown() {
		onPage.checkNoOneTagIsAdded();
	}

	@Step
	public void clickOnJustAddedTagPil() {
		onPage.clickOnFirstAddedTagPil(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void noOneTagWithItemIsShown() {
		onPage.noOneTagWithItemIsShown();

	}

	@Step
	public void allTagsAreDeselected(int amount) {
		onPage.allTagsAreDeselected(amount);
	}

	@Step
	public void oneItemForSearchedTagIsShown() {
		onPage.oneItemForSearchedTagIsShown();
	}

	@Step
	public void shouldSeeJustCreatedTagsPill() {
		onPage.shouldSeeSpecificTagsPill(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void shouldSeeFirstExistingTagsPill() {
		onPage.shouldSeeSpecificTagsPill(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void allTagsAreSelected(int amount) {
		onPage.allTagsAreSelected(amount);
	}

	@Step
	public void searchJustCreatedTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void searchFirstExistingTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void searchSecondCreatedTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("Second_tag"));
	}

	@Step
	public void searchFirstCreatedTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("First_tag"));
	}

	@Step
	public void checkIfAddTagTextIsVisible() {
		onPage.checkIfAddTagTextIsVisible();
	}

	@Step
	public void checkIfRenamedTagIsVisible() {
		onPage.checkIfSpecificTagIsVisible(SessionVariables.getValueFromSessionVariable("Renamed_Tag"));
	}

	@Step
	public void checkIfJustCreatedTagsPillIsRenamed() {
	}

	@Step
	public void checkIfJustCreatedTagIsNotVisible() {
		onPage.checkIfSpecificTagIsNotVisible(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void searchRenamedTag() {
		onPage.fillInTagSearchField(SessionVariables.getValueFromSessionVariable("Renamed_Tag"));
	}

	@Step
	public void checkIfRenamedTagsPillIsVisible() {
		onPage.shouldSeeSpecificTagsPill(SessionVariables.getValueFromSessionVariable("Renamed_Tag"));
	}

	@Step
	public void checkIfJustCreatedTagsPillIsNotVisible() {
		onPage.shouldNotSeeSpecificTagsPill(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void swipeFirstExistingTag() {
		onPage.swipeTag(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void checkIfFirstExistingTagIsNotVisible() {
		onPage.checkIfSpecificTagIsNotVisible(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void checkIfFirstExistingTagsPillIsNotVisible() {
		onPage.shouldNotSeeSpecificTagsPill(SessionVariables.getValueFromSessionVariable("First_Existing_Tag"));
	}

	@Step
	public void addClientsItemsAmountToSessionVariables() {
		onPage.addClientsItemsAmountToSessionVariables();
	}
}
