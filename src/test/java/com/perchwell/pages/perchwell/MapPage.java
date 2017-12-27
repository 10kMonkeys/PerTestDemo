package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MapPage extends BasePage {
public MapPage(WebDriver driver) {
	super(driver);
}
public Integer numberOfItemsInMapView;

@iOSXCUITFindBy(accessibility = "WANT TO SEE NEARBY HOMES?")
private WebElement seeNearbyHint;

@iOSXCUITFindBy(accessibility = "NOT NOW")
private WebElement notNowButton;

@iOSXCUITFindBy( className = "cluster")
private WebElement cluster;

public void clickNotNowButton() { element(notNowButton).click(); }

public Integer countItemsInMapView() {
	return getDriver().findElements(By.name("cluster")).size();

}

}
