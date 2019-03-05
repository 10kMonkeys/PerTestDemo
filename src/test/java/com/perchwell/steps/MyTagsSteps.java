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
    public void checkNumbersListingsEqualTagItems() {
		onPage.checkNumbersListingsEqualTagItems();
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
	public void checkFirstListingIsRemovedFromTaggedItemsPage() {
		onPage.checkListingIsRemovedFromTaggedItemsPage(SessionVariables.getValueFromSessionVariable("listingAddress1"));
	}

	@Step
	public void checkFirstBuildingIsRemovedFromTaggedItemsPage(String address) {
		onPage.checkListingIsRemovedFromTaggedItemsPage(address);
	}

	@Step
	public void checkItemsCountIsChanged(int value) {
		onPage.checkItemsCountIsChanged(value);
	}

	@Step
	public void getFirstBuildingAddress() {
		onPage.getFistBuildingAddress();
	}

	@Step
	public void openFirstBuilding() {
		onPage.openFirstBuilding();
	}

	@Step
	public void closeTagsPage() {
		onPage.closeTagsPage();
	}

	@Step
    public void selectFirstListing() {
		onPage.selectFirstListings();
	}

	@Step
	public void sortingMenuIsHidden() {
        onPage.sortingMenuIsHidden();
    }

    @Step
    public void clickOnDiscussionIconOnFirstListing() {
		onPage.clickOnDiscussionIconOnFirstListing();
    }

	@Step
	public void clickOnMoreOptionsButton() {
		onPage.clickOnMoreOptionsButton();
	}

	@Step
	public void clickOnContactListingAgentsButton() {
		onPage.clickOnContactListingAgentsButton();
	}

	@Step
	public void multiSelectMenuIsShown() {
		onPage.multiSelectMenuIsShown();
	}

	@Step
	public void clickOnSelectAll() {
		onPage.clickOnSelectAll();
	}

	@Step
	public void checkSavedListingNumberIsShown() {
		onPage.checkSavedListingNumberIsShown(SessionVariables.getValueFromSessionVariable("itemsAmount"));
	}

	@Step
	public void clickOnDeselectAll() {
		onPage.clickOnDeselectAll();
	}

	@Step
	public void checkSortLabel(String sortLabel) {
        onPage.checkSortLabel(sortLabel);
    }

	@Step
	public void clickOnTagSelectedListingsOption() {
		onPage.clickOnTagSelectedListingsOption();
	}

	@Step
	public void checkNoOneListingIsSelected() {
		onPage.checkNoOneListingIsSelected();
	}

	@Step
	public void multiSelectMenuIsHidden() {
		onPage.multiSelectMenuIsHidden();
	}

	@Step
	public void clickOnTagIconOnFirstListing() {
		onPage.clickOnTagIconOnFirstListing();
	}

	@Step
	public void swipeUpListViewToRefresh() {
		onPage.swipeUpListViewToRefresh();
	}
}
