package com.perchwell.steps;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.pages.perchwell.MapPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class MapSteps extends ScenarioSteps {
	MapPage onPage;
	PerchwellPage perchwellPage;
	SearchPage searchPage;

	@Step
	public void clickOnNotNowButton() {
		if(!Config.isAndroid()) {
			onPage.clickOnNotNowButton();
		}
	}

	@Step
	public void countItemsInMapView() throws Exception {
		//ZoomIn and ZoomOut is used for display all points
		zoomIn();
		onPage.swipeRight();
		zoomOut();
		onPage.numberOfItemsInMapView = onPage.countItemsInMapView();
	}

	@Step
	public void itemsInListAndMapViewIsSame() {
		Assert.assertTrue(onPage.numberOfItemsInMapView == perchwellPage.numberOfItemsInListView);
	}

	private void zoomIn() {
		onPage.zoom("1.5","1.1");

	}

	private void zoomOut() {
		onPage.zoom("0.5","-1.9");

	}

	public void clickOnMyNewSearch() {
		onPage.clickOnMyNewSearch();
	}

	@Step
	public void checkForChangesAfterApplyingTheFilter() throws Exception {
		onPage.shouldFiltersBeApplied();
	}

	@Step
	public void selectPinOnMap() {
		onPage.clickOnSecondPin();
	}

	@Step
	public void clickOnSortingSectionButton() {
		onPage.clickOnSortingButton();
	}

	@Step
	public void selectLeastExpensiveOption() throws Exception {
		onPage.clickOnLeastExpensiveSection();
//		this.swipeBuilding();
	}

	@Step
	public void selectMostExpensiveOption() throws Exception {
		onPage.clickOnMostExpensiveSection();
		this.swipeBuilding();
	}

	@Step
	public void selectBedroomsOption() throws Exception {
		onPage.clickOnBedroomsSection();
		this.swipeBuilding();
	}

	@Step
	public void selectBathroomsOption() throws Exception {
		onPage.clickOnBathroomsSection();
		this.swipeBuilding();
	}

	@Step
	public void shouldListingBeSortedByLeastExpensive() {
		onPage.shouldListingBeSortedByLeastExpensive();
	}

	@Step
	public void shouldListingBeSortedByMostExpensive() {
		onPage.shouldListingBeSortedByMostExpensive();
	}

	@Step
	public void shouldListingBeSortedByBedrooms() {
		onPage.shouldListingBeSortedByBedrooms();
	}

	@Step
	public void shouldListingBeSortedByBathrooms() {
		onPage.shouldListingBeSortedByBathrooms();
	}

	private void swipeBuilding() throws Exception {
		onPage.swipeBuilding();
	}

	@Step
	public void checkSortLabel(String sortType) {
		onPage.checkSortLabel(sortType);
	}

	@Step
	public void checkListings() throws Exception {
		onPage.checkListings();
		this.swipeBuilding();
	}

	@Step
    public void clickOnPinFirstListing() {
		SessionVariables.addValueInSessionVariable("PinListingAddress", onPage.getPinFirstListingAddress());
		onPage.clickOnPinFirstListing(SessionVariables.getValueFromSessionVariable("PinListingAddress"));
    }

    @Step
	public void checkFirstListingIsOpened() {
		onPage.checkFirstListingIsOpened(SessionVariables.getValueFromSessionVariable("PinListingAddress"));
	}
}
