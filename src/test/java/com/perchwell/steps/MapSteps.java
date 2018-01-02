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
public void countItemsInListView() {
	mapPage.numberOfItemsInMapView = mapPage.countItemsInMapView();
}

@Step
public void countItemsInListAndMapViewIsSame(){
	System.out.print("In map "+mapPage.numberOfItemsInMapView);

		Assert.assertTrue(mapPage.numberOfItemsInMapView == perchwellPage.numberOfItemsInListView);
	System.out.print("Count before 4"+perchwellPage.numberOfItemsInListView);
}

public void zoomIn() {
	mapPage.zoomIn();
}
// System.out.print("Count before"+perchwellPage.numberOfItemsInListView);
}
