package com.perchwell.pages.perchwell;

import com.perchwell.pages.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

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

public void zoomIn(){

	WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
	WebDriver webDriver = webDriverFacade.getProxiedDriver();
	AppiumDriver driver = (AppiumDriver) webDriver;
//	int leftX = getLocation().getX();
//	int rightX = search.getSize().getWidth() + leftX;
//
//
//	int upperY = search.getLocation().getY();
//	int lowerY = search.getSize().getHeight() + upperY;

	Dimension size = driver.manage().window().getSize();
	int xx = (int) (size.height /2);
	int yy = (int) (size.width /2);
	TouchAction action1 =new TouchAction(driver);

	TouchAction action2 =new TouchAction(driver);
	action1.longPress(xx, yy).moveTo(0, 50).waitAction(Duration.ofSeconds(5000)).release();
	action2.longPress(xx, yy).moveTo(0, -50).waitAction(Duration.ofSeconds(5000)).release();
	new MultiTouchAction(driver).add(action1).add(action2).perform();



//
//	TouchAction a1 = new TouchAction(driver).press(211,274).waitAction(Duration.ofSeconds(2000)).moveTo(211,130).release();
//	TouchAction a2 = new TouchAction(driver).press(238,355).waitAction(Duration.ofSeconds(2000)).moveTo(0,446).release();;
//
//	//a1 = TouchAction.press(211,274).waitAction(2000).moveTo(211,130).release();
//	//a2 = TouchAction.press(238,355).waitAction(2000).moveTo(0,446).release();
//	MultiTouchAction  multiTouchAction = new MultiTouchAction(driver);
//
//
//	//multiTouchAction.add(new TouchAction(driver).press(211, 274).waitAction(2000)).moveTo(0,130).release().perform()).add(a2).perform();
//
////Dimension size = driver.manage().window().getSize();
////int anchor = (int) (size.height * anchorPercentage);
////int startPoint = (int) (size.width * startPercentage);
////int endPoint = (int) (size.width * finalPercentage*(-1));
//	new MultiTouchAction(driver).add(a1).add(a2).perform();
//


}
}
