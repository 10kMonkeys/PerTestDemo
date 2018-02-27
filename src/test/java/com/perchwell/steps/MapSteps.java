package com.perchwell.steps;

import com.perchwell.pages.perchwell.MapPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class MapSteps extends ScenarioSteps {
	MapPage onPage;
	PerchwellPage perchwellPage;

	@Step
	public void clickNotNowButton() {
		onPage.clickNotNowButton();
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
	public void itemsInListAndMapViewIsSame(){
		System.out.print("In map "+ onPage.numberOfItemsInMapView);
		System.out.print("Count = "+perchwellPage.numberOfItemsInListView);
		Assert.assertTrue(onPage.numberOfItemsInMapView == perchwellPage.numberOfItemsInListView);

	}

	private void zoomIn() {
		onPage.zoom("1.5","1.1");

	}

	private void zoomOut() {
		onPage.zoom("0.5","-1.9");

	}

	public void clickMyNewSearch() {
		onPage.clickMyNewSearch();
	}

	@Step
	public void checkForChangesAfterApplyingTheFilter(){
		Assert.assertTrue(onPage.checkForChangesAfterApplyingTheFilter());
	}
}
