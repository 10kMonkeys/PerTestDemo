package com.perchwell.steps;

import com.perchwell.pages.perchwell.MapPage;
import com.perchwell.pages.perchwell.PerchwellPage;
import io.appium.java_client.TouchAction;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class MapSteps extends ScenarioSteps {
MapPage mapPage;
PerchwellPage perchwellPage;

@Step
public void ckickNotNowButton() {
	mapPage.clickNotNowButton();
}

@Step
public void countItemsInMapView() throws Exception {
	//ZoomIn and ZoomOut is used for display all points
	zoomIn();
	mapPage.swipeRight();
	zoomOut();
	mapPage.numberOfItemsInMapView = mapPage.countItemsInMapView();
}

@Step
public void itemsInListAndMapViewIsSame(){
	System.out.print("In map "+mapPage.numberOfItemsInMapView);
	System.out.print("Count = "+perchwellPage.numberOfItemsInListView);
	Assert.assertTrue(mapPage.numberOfItemsInMapView == perchwellPage.numberOfItemsInListView);

}

private void zoomIn() {
	mapPage.zoom("1.5","1.1");

}

private void zoomOut() {
	mapPage.zoom("0.5","-1.9");

}


}
