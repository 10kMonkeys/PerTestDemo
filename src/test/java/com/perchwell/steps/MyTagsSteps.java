package com.perchwell.steps;

import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.tags.MyTagsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MyTagsSteps extends ScenarioSteps {

	MyTagsPage onPage;

	@Step
	public void clickOnTagSearchButton() {
		onPage.clickOnTagSearchButton();
	}

	@Step
	public void clickOnSeveralExistingTagLabel() {
		WebElement firstTag = onPage.findExistingTagLabel();
		if (firstTag != null) {
			firstTag.click();
		} else {
			Assert.assertFalse("Does not exist any tags", true);
		}
		WebElement secondTag = onPage.findExistingTagLabel();
		if (secondTag != null) {
			secondTag.click();
		} else {
			Assert.assertFalse("Does not exist several tags", true);
		}
	}

	@Step
	public void checkTwoJustCreatedTags() {
		onPage.checkJustCreatedTag(SessionVariables.getValueFromSessionVariable("First_tag"));
//		if(!Config.isAndroid()) {
//			onPage.clearSearchField();
//		}
		onPage.checkJustCreatedTag(SessionVariables.getValueFromSessionVariable("Second_tag"));
	}

	@Step
    public void clickOnSortedByButton() {
    	onPage.clickOnSortedByButton();
	}

	@Step
	public void clickOnMostExpensiveButton() {
		onPage.clickOnMostExpensiveButton();
	}

	@Step
	public void clickOnLeastExpensiveButton() {
		onPage.clickOnLeastExpensiveButton();
	}

	@Step
	public void checkListingAmount(int listingAmountToCheck) {
		onPage.checkListingAmount(listingAmountToCheck);
	}

	@Step
	public void shouldTaggedListingBeSortedByMostExpensive() {
		onPage.shouldTaggedListingBeSortedByMostExpensive();
	}

	@Step
	public void shouldTaggedListingBeSortedByLeastExpensive() {
		onPage.shouldTaggedListingBeSortedByLeastExpensive();
	}

	@Step
	public void shouldTaggedBuildingBeSortedByMostExpensive() {
		onPage.shouldTaggedBuildingBeSortedByMostExpensive();
	}

	@Step
	public void shouldTaggedBuildingBeSortedByLeastExpensive() {
		onPage.shouldTaggedBuildingBeSortedByLeastExpensive();
	}

	@Step
	public void checkIfFourListingsAndBuildingAreDisplayed() {
		onPage.checkIfFourListingsAndBuildingAreDisplayed();
	}

	@Step
	public void clickOnFirstTagsPill() {
		onPage.clickOnSpecificTagsPill(SessionVariables.getValueFromSessionVariable("First_tag"));
	}

	@Step
	public void checkIfTwoLastListingsAndBuildingAreDisplayed() {
		onPage.checkIfTwoLastListingsAndBuildingAreDisplayed();
	}

	@Step
	public void swipeDownSecondTagsPill() {
		onPage.swipeDownSecondTagsPill();
	}

	@Step
	public void checkTaggedListingsAmount(int listingsAmount) {
		onPage.checkTaggedListingsAmount(listingsAmount);
	}

	@Step
    public void checkListingsAreSelected(int value) {
		onPage.checkListingsAreSelected(value);
    }

    @Step
	public void checkThreeListingsAreSelected() {
		onPage.checkFirstListingsIsSelected();
		onPage.checkSecondListingsIsSelected();
		onPage.checkThirdListingsIsSelected();

	}

	@Step
	public void checkFirstListingsIsSelected() {
		onPage.checkFirstListingsIsSelected();
	}

	@Step
	public void shouldSeeTaggedBuilding() {
		onPage.shouldSeeTaggedBuilding();
	}

	@Step
	public void clickOnJustCreatedTagsPill() {
		onPage.clickOnSpecificTagsPill(SessionVariables.getValueFromSessionVariable("Just_Created_Tag"));
	}

	@Step
	public void checkListingIsRemovedFromTaggedItemsPage() {
		onPage.checkListingIsRemovedFromTaggedItemsPage();
	}

	@Step
	public void getItemsValue() {
		onPage.getItemsValue();
	}

	@Step
	public void checkItemsCountIsChanged(int value) {
		onPage.checkItemsCountIsChanged(value);
	}

	@Step
	public void getFirstBuildingAddress() {
		onPage.addBuildingAddressInSessionVariable("buildingAddress", onPage.getFistBuildingAddress());
	}

	@Step
	public void openFirstBuilding() {
		onPage.openFirstBuilding();
	}

	@Step
	public void closeTagsPage() {
		onPage.closeTagsPage();
	}
}
