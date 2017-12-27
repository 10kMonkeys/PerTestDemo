package com.perchwell.steps;

import com.perchwell.pages.perchwell.MapPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MapSteps extends ScenarioSteps {
MapPage mapPage;
PerchwellPage perchwellPage;
@Step
public void ckickNotNowButton() {
	mapPage.clickNotNowButton();
}
@Step
public void countItemsInListView() {
	mapPage.numberOfItemsInMapView = mapPage.countItemsInMapView();
}

@Step
public void countItemsInListAndMapViewIsSame(){
	System.out.print("In map "+mapPage.numberOfItemsInMapView);

		Assert.assertTrue(mapPage.numberOfItemsInMapView == perchwellPage.numberOfItemsInListView);

}
	// System.out.print("Count before"+perchwellPage.numberOfItemsInListView);
}
